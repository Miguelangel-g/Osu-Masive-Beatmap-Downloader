/*
    [Osu! Masive Beatmap Downloader]
    Copyright (C) 2016  NewKey

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.

*/

package osu.beatmapdownloader;



import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.beans.property.*;
import javafx.beans.value.*;
import javafx.concurrent.Worker;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.web.*;
import javafx.scene.layout.VBox;
import javafx.stage.WindowEvent;
import java.net.CookieHandler;
import java.net.URI;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javafx.scene.control.Alert.AlertType;
//
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Browser extends Application {

 static String Address;
 WebView webview = new WebView();
 Stage stage1;
 Runnable runnable;
 Thread asd;


 @Override
 public void start(final Stage stage) {
  webview = new WebView();
  stage1 = new Stage();
  Platform.setImplicitExit(false);
  webview = new WebView();
  VBox layout = new VBox();
  layout.getChildren().setAll(
   createProgressReport(webview.getEngine()),
   webview
  );
  stage1.setScene(new Scene(layout));
  stage1.getIcons().add(new Image("/Icon.png"));
  Image applicationIcon = new Image(getClass().getResourceAsStream("/Icon.png"));
  stage1.getIcons().add(applicationIcon);
  stage1.setTitle("Browser - Osu! Masive Beatmap Downloader");
  stage1.setResizable(false);
  stage1.show();
  webview.getEngine().load(Address);

  stage1.setOnCloseRequest(
   (WindowEvent we) -> {
    System.exit(0);
   });
 }


 public static void main(String[] args) {
     try {
         launch(args);
     } catch (Exception e) {
         JFrame.errorFatal("Launch");
         JFrame.errorFatal(e.toString());
         JFrame.errorFatal("--------------------------------------");  
     }
 }

 private HBox createProgressReport(WebEngine engine) {
  final LongProperty startTime = new SimpleLongProperty();
  final LongProperty endTime = new SimpleLongProperty();
  final LongProperty elapsedTime = new SimpleLongProperty();
  final ProgressBar loadProgress = new ProgressBar();
  loadProgress.progressProperty().bind(engine.getLoadWorker().progressProperty());
  final Label loadTimeLabel = new Label();
  loadTimeLabel.textProperty().bind(
   Bindings.when(
    elapsedTime.greaterThan(0))
   .then(
    Bindings.concat("Already loaded, please ingress.")
   )
   .otherwise(
    "Please wait until the page is already loaded."
   )
  );

  elapsedTime.bind(Bindings.subtract(endTime, startTime));
  engine.getLoadWorker().stateProperty().addListener(new ChangeListener < Worker.State > () {
   @Override
   public void changed(ObservableValue < ? extends Worker.State > observableValue, Worker.State oldState, Worker.State state) {
       try {
           switch (state) {
               case RUNNING:
                   startTime.set(System.nanoTime());
                   String url = "https://osu.ppy.sh/forum/ucp.php?mode=login";
                   if (!webview.getEngine().getLocation().equals(url)) {
                       webview.getEngine().load(url);
                   }
                   break;
               case SUCCEEDED:
                   endTime.set(System.nanoTime());
                   if (Credentials()) {
                       Alert alert = new Alert(AlertType.NONE, "Correct login \nClick Ok to continue.", ButtonType.OK);
                       Stage stages = (Stage) alert.getDialogPane().getScene().getWindow();
                       stages.setTitle("Success");
                       stage1.setAlwaysOnTop(true);
                       stages.setAlwaysOnTop(true);
                       stage1.setAlwaysOnTop(false);
                       stages.setAlwaysOnTop(false);
                       //alert.showAndWait();
                       JFrame.accountReady(allCookieString);
                       stage1.close();
                   } else {
                       url = "https://osu.ppy.sh/forum/ucp.php?mode=login";
                       if (!webview.getEngine().getLocation().equals(url)) {
                           webview.getEngine().load(url);
                       }
                   }
                   break;
           }
       } catch (Exception e) {
           JFrame.errorFatal("Loading");
           JFrame.errorFatal(e.toString());
           JFrame.errorFatal("--------------------------------------");  
       }
   }
  });

  HBox progressReport = new HBox(10);
  progressReport.getChildren().setAll(
   loadProgress,
   loadTimeLabel
  );
  progressReport.setPadding(new Insets(5));
  progressReport.setAlignment(Pos.CENTER_LEFT);
  return progressReport;
 }



 public String allCookieString;
 boolean paso = false;
 public boolean Credentials() {
  try {
   CookieHandler cookieHandler = CookieHandler.getDefault();
   Map < String, List < String >> map = cookieHandler.get(
    new URI(webview.getEngine().getLocation()),
    new LinkedHashMap < String, List < String >> ()
   );
   allCookieString = map.get("Cookie").get(0);
   if (allCookieString.contains("last_login")) return true;
   else return false;

  } catch (Exception e) {
      JFrame.errorFatal("Credentials");
      JFrame.errorFatal(e.toString());
      JFrame.errorFatal("--------------------------------------");  
      
   return false;
  }
 }
}