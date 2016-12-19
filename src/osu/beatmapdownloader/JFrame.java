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


/*
http://osu.ppy.sh/api/get_beatmaps?k=b453cff95a1119dbc887e61b58a50e63f04ee3b8&b=1031519

*/

package osu.beatmapdownloader;


import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import models.Song;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import models.Beatmap;
import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONException;
import static osu.beatmapdownloader.Browser.Address;


public class JFrame extends javax.swing.JFrame {
 DefaultListModel model = new DefaultListModel();
 String Directory = "D:/osu!/Songs";
 Runnable runnable;
 Thread start;
 int prio = 0, errorConection = 0, Errors = 0, downloaded = 0;
 Double _ARmin, _ARmax;
 Double _CSmin, _CSmax;
 Double _HPmin, _HPmax;
 Double _BPMmin, _BPMmax;
 Double _Timemin, _Timemax;
 Double _ODmin, _ODmax;
 Double _STARmin, _STARmax;
 
 static String Cookie;

 public JFrame() {
     
  initComponents();
  goWebsite();
  model.addElement("Osu! Server");
  model.addElement("Bloodcat Server");
  List_prio.setModel(model);
 }

 public static void goWebsite() {
	String text="NewKey";
        L_madeBy.setText("<html>Made by player: <a href=\"\">"+text+"</a></html>");
        L_madeBy.setCursor(new Cursor(Cursor.HAND_CURSOR));
        L_madeBy.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                    try {
                            Desktop.getDesktop().browse(new URI("https://osu.ppy.sh/u/637668"));
                    } catch (URISyntaxException | IOException ex) {}
            }
        });
    }
 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JFrame_Error = new javax.swing.JFrame();
        Separetor = new javax.swing.JSeparator();
        L_Title = new javax.swing.JLabel();
        Sc_Error = new javax.swing.JScrollPane();
        T_Error = new javax.swing.JTextPane();
        P_ServerPrio = new javax.swing.JPanel();
        B_Down = new javax.swing.JButton();
        B_Up = new javax.swing.JButton();
        L_Prio = new javax.swing.JLabel();
        Sc_Prio = new javax.swing.JScrollPane();
        List_prio = new javax.swing.JList<>();
        jLabel13 = new javax.swing.JLabel();
        P_OsuPanel = new javax.swing.JPanel();
        T_Directory = new javax.swing.JTextField();
        C_OsuServer = new javax.swing.JCheckBox();
        L_AccountAcept = new javax.swing.JLabel();
        B_Login = new javax.swing.JToggleButton();
        B_Directory = new javax.swing.JToggleButton();
        L_OsuAccount = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        T_Password = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        P_Options = new javax.swing.JPanel();
        P_AvanSearch = new javax.swing.JPanel();
        L_Others = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        L_AR = new javax.swing.JLabel();
        T_AR = new javax.swing.JTextField();
        T_CS = new javax.swing.JTextField();
        L_CS = new javax.swing.JLabel();
        L_BPM = new javax.swing.JLabel();
        T_BPM = new javax.swing.JTextField();
        L_Time = new javax.swing.JLabel();
        T_Time = new javax.swing.JTextField();
        T_HP = new javax.swing.JTextField();
        L_HP = new javax.swing.JLabel();
        L_OD = new javax.swing.JLabel();
        T_OD = new javax.swing.JTextField();
        T_STAR = new javax.swing.JTextField();
        L_AR1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        C_Genre = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        C_Lang = new javax.swing.JComboBox<>();
        T_SearchTerm = new javax.swing.JTextField();
        L_SearchTerm = new javax.swing.JLabel();
        L_Modes = new javax.swing.JLabel();
        C_STD = new javax.swing.JCheckBox();
        C_MANIA = new javax.swing.JCheckBox();
        C_CTB = new javax.swing.JCheckBox();
        C_TAIKO = new javax.swing.JCheckBox();
        C_Qualified = new javax.swing.JCheckBox();
        C_Unraked = new javax.swing.JCheckBox();
        C_Aprove = new javax.swing.JCheckBox();
        C_Ranked = new javax.swing.JCheckBox();
        L_Type = new javax.swing.JLabel();
        P_SearchDate = new javax.swing.JPanel();
        Ca_toYear = new com.toedter.calendar.JYearChooser();
        Ca_toMonth = new com.toedter.calendar.JMonthChooser();
        Ca_fromMonth = new com.toedter.calendar.JMonthChooser();
        Ca_fromYear = new com.toedter.calendar.JYearChooser();
        C_CalendarEnabled = new javax.swing.JCheckBox();
        L_From = new javax.swing.JLabel();
        L_To = new javax.swing.JLabel();
        L_SearchTerm1 = new javax.swing.JLabel();
        T_Mapper = new javax.swing.JTextField();
        L_SearchTerm2 = new javax.swing.JLabel();
        T_Difi = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        P_PreAna = new javax.swing.JPanel();
        L_inFinded = new javax.swing.JLabel();
        L_inPages = new javax.swing.JLabel();
        L_AnaPage = new javax.swing.JLabel();
        L_Finded = new javax.swing.JLabel();
        L_Already = new javax.swing.JLabel();
        L_inAlready = new javax.swing.JLabel();
        L_AnaPage1 = new javax.swing.JLabel();
        L_Downloaded = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jCheckBox1 = new javax.swing.JCheckBox();
        P_LoadDown = new javax.swing.JPanel();
        B_ShowErrors = new javax.swing.JToggleButton();
        B_2Download = new javax.swing.JToggleButton();
        L_fileValue = new javax.swing.JLabel();
        L_totalSize = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        B_Pause = new javax.swing.JButton();
        L_File = new javax.swing.JLabel();
        L_FileName = new javax.swing.JLabel();
        L_Try = new javax.swing.JLabel();
        L_Trying = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        L_Errors = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        L_server = new javax.swing.JLabel();
        Pro_ProgressBar = new javax.swing.JProgressBar();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        L_seconds = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        L_madeBy = new javax.swing.JLabel();

        JFrame_Error.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        JFrame_Error.setIconImage(getIconImage());

        L_Title.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        L_Title.setText("Here will show your errors.");

        Sc_Error.setViewportView(T_Error);

        javax.swing.GroupLayout JFrame_ErrorLayout = new javax.swing.GroupLayout(JFrame_Error.getContentPane());
        JFrame_Error.getContentPane().setLayout(JFrame_ErrorLayout);
        JFrame_ErrorLayout.setHorizontalGroup(
            JFrame_ErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Separetor)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JFrame_ErrorLayout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addComponent(L_Title)
                .addGap(135, 135, 135))
            .addGroup(JFrame_ErrorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Sc_Error)
                .addContainerGap())
        );
        JFrame_ErrorLayout.setVerticalGroup(
            JFrame_ErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JFrame_ErrorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(L_Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separetor, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sc_Error, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);

        P_ServerPrio.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        B_Down.setText("-");
        B_Down.setFocusable(false);
        B_Down.setMargin(new java.awt.Insets(0, 0, 0, 0));
        B_Down.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_DownActionPerformed(evt);
            }
        });

        B_Up.setText("+");
        B_Up.setFocusable(false);
        B_Up.setMargin(new java.awt.Insets(0, 0, 0, 0));
        B_Up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_UpActionPerformed(evt);
            }
        });

        L_Prio.setText("Server Priority:");

        List_prio.setFocusable(false);
        Sc_Prio.setViewportView(List_prio);

        jLabel13.setText("<html>If the Download Fail, <br>it will take the next, looping</html>");

        javax.swing.GroupLayout P_ServerPrioLayout = new javax.swing.GroupLayout(P_ServerPrio);
        P_ServerPrio.setLayout(P_ServerPrioLayout);
        P_ServerPrioLayout.setHorizontalGroup(
            P_ServerPrioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_ServerPrioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_ServerPrioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L_Prio)
                    .addGroup(P_ServerPrioLayout.createSequentialGroup()
                        .addComponent(Sc_Prio, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(P_ServerPrioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B_Up, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B_Down, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        P_ServerPrioLayout.setVerticalGroup(
            P_ServerPrioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_ServerPrioLayout.createSequentialGroup()
                .addGroup(P_ServerPrioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_ServerPrioLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(B_Up)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B_Down))
                    .addGroup(P_ServerPrioLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(L_Prio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Sc_Prio, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        P_OsuPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        T_Directory.setEditable(false);
        T_Directory.setFocusable(false);

        C_OsuServer.setSelected(true);
        C_OsuServer.setText("Osu! Server");
        C_OsuServer.setFocusable(false);
        C_OsuServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_OsuServerActionPerformed(evt);
            }
        });

        L_AccountAcept.setText("_______");

        B_Login.setText("Login");
        B_Login.setFocusable(false);
        B_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_LoginActionPerformed(evt);
            }
        });

        B_Directory.setText("<html>Open Osu! <br>Your Directory</html>");
        B_Directory.setFocusable(false);
        B_Directory.setMargin(new java.awt.Insets(0, 0, 0, 0));
        B_Directory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_DirectoryActionPerformed(evt);
            }
        });

        L_OsuAccount.setText("Osu! Account: ");

        jLabel12.setText("Enter Your Api Code to inprove The Advance Filter:");

        jLabel14.setText("More Info");

        javax.swing.GroupLayout P_OsuPanelLayout = new javax.swing.GroupLayout(P_OsuPanel);
        P_OsuPanel.setLayout(P_OsuPanelLayout);
        P_OsuPanelLayout.setHorizontalGroup(
            P_OsuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_OsuPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(P_OsuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(C_OsuServer)
                    .addGroup(P_OsuPanelLayout.createSequentialGroup()
                        .addComponent(T_Directory, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B_Directory, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P_OsuPanelLayout.createSequentialGroup()
                        .addGroup(P_OsuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, P_OsuPanelLayout.createSequentialGroup()
                                .addComponent(L_OsuAccount)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(L_AccountAcept)
                                .addGap(36, 36, 36)
                                .addComponent(B_Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(T_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)))
                .addGap(62, 62, 62))
        );
        P_OsuPanelLayout.setVerticalGroup(
            P_OsuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_OsuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(C_OsuServer)
                .addGap(4, 4, 4)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_OsuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(0, 0, 0)
                .addGroup(P_OsuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B_Login, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_OsuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(L_OsuAccount)
                        .addComponent(L_AccountAcept)))
                .addGap(0, 0, 0)
                .addGroup(P_OsuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B_Directory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(P_OsuPanelLayout.createSequentialGroup()
                        .addComponent(T_Directory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        P_AvanSearch.setBorder(javax.swing.BorderFactory.createTitledBorder("Advance Filter"));

        L_Others.setText("Others:");

        jLabel1.setText("(min-max) eg.(7.15-8.15)");

        L_AR.setText("AR: ");

        L_CS.setText("CS: ");

        L_BPM.setText("BPM:");

        L_Time.setText("Time(sg):");

        L_HP.setText("HP:");

        L_OD.setText("OD: ");

        L_AR1.setText("Stars:");

        jLabel2.setText("Genre:");

        C_Genre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Any", "Unspecified", "Video game", "Anime", "Rock", "Pop", "Other", "-", "Novelty", "Hip hop", "Electronic" }));
        C_Genre.setFocusable(false);
        C_Genre.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                C_GenreItemStateChanged(evt);
            }
        });

        jLabel9.setText("Language:");

        C_Lang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Any", "Other", "English", "Japanese", "Chinese", "Instrumental", "Korean", "French", "German", "Swedish", "Spanish", "Italian" }));
        C_Lang.setFocusable(false);

        javax.swing.GroupLayout P_AvanSearchLayout = new javax.swing.GroupLayout(P_AvanSearch);
        P_AvanSearch.setLayout(P_AvanSearchLayout);
        P_AvanSearchLayout.setHorizontalGroup(
            P_AvanSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_AvanSearchLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(P_AvanSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_AvanSearchLayout.createSequentialGroup()
                        .addGroup(P_AvanSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(T_STAR, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                            .addComponent(L_AR1)
                            .addComponent(L_AR)
                            .addComponent(T_AR)
                            .addComponent(L_BPM)
                            .addComponent(T_BPM))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(P_AvanSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(P_AvanSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(T_OD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                .addComponent(T_CS, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(L_CS, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(L_HP, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(T_HP, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(L_OD))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(P_AvanSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(L_Time)
                            .addComponent(jLabel2)
                            .addComponent(T_Time, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C_Genre, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(C_Lang, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(P_AvanSearchLayout.createSequentialGroup()
                        .addComponent(L_Others)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        P_AvanSearchLayout.setVerticalGroup(
            P_AvanSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_AvanSearchLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(P_AvanSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_Others)
                    .addComponent(jLabel1))
                .addGroup(P_AvanSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(P_AvanSearchLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(P_AvanSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(T_CS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C_Genre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(P_AvanSearchLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(P_AvanSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(L_AR1)
                            .addComponent(L_CS)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(T_STAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(P_AvanSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_AvanSearchLayout.createSequentialGroup()
                        .addGroup(P_AvanSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(L_AR)
                            .addComponent(L_HP))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(P_AvanSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(T_AR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T_HP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(P_AvanSearchLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(P_AvanSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(C_Lang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(P_AvanSearchLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(26, 26, 26)))))
                .addGap(5, 5, 5)
                .addGroup(P_AvanSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_AvanSearchLayout.createSequentialGroup()
                        .addComponent(L_Time)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(T_Time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P_AvanSearchLayout.createSequentialGroup()
                        .addComponent(L_BPM)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(T_BPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P_AvanSearchLayout.createSequentialGroup()
                        .addComponent(L_OD)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(T_OD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        L_SearchTerm.setText("Search Terms:");

        L_Modes.setText("Modes:");

        C_STD.setText("STD");
        C_STD.setFocusable(false);

        C_MANIA.setText("Mania");
        C_MANIA.setFocusable(false);

        C_CTB.setText("CTB");
        C_CTB.setFocusable(false);

        C_TAIKO.setText("Taiko");
        C_TAIKO.setFocusable(false);

        C_Qualified.setText("Qualified");
        C_Qualified.setFocusable(false);

        C_Unraked.setText("UnRanked");
        C_Unraked.setFocusable(false);

        C_Aprove.setText("Aprove");
        C_Aprove.setFocusable(false);

        C_Ranked.setText("Ranked");
        C_Ranked.setFocusable(false);

        L_Type.setText("Type:");

        P_SearchDate.setBorder(javax.swing.BorderFactory.createTitledBorder("Search by date"));

        Ca_toYear.setEnabled(false);

        Ca_toMonth.setEnabled(false);

        Ca_fromMonth.setEnabled(false);

        Ca_fromYear.setEnabled(false);

        C_CalendarEnabled.setText("Enabled");
        C_CalendarEnabled.setFocusable(false);
        C_CalendarEnabled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_CalendarEnabledActionPerformed(evt);
            }
        });

        L_From.setText("From");

        L_To.setText("To");

        javax.swing.GroupLayout P_SearchDateLayout = new javax.swing.GroupLayout(P_SearchDate);
        P_SearchDate.setLayout(P_SearchDateLayout);
        P_SearchDateLayout.setHorizontalGroup(
            P_SearchDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_SearchDateLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(P_SearchDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_SearchDateLayout.createSequentialGroup()
                        .addComponent(Ca_fromMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ca_fromYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P_SearchDateLayout.createSequentialGroup()
                        .addComponent(Ca_toMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ca_toYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(C_CalendarEnabled)
                    .addComponent(L_From)
                    .addComponent(L_To)))
        );
        P_SearchDateLayout.setVerticalGroup(
            P_SearchDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_SearchDateLayout.createSequentialGroup()
                .addComponent(C_CalendarEnabled)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(L_From)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_SearchDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ca_fromMonth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ca_fromYear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(L_To)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_SearchDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ca_toMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ca_toYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        L_SearchTerm1.setText("Mapper:");

        L_SearchTerm2.setText("Dificult name:");

        jLabel11.setText("More Info");

        P_PreAna.setBorder(javax.swing.BorderFactory.createTitledBorder("Stadistics"));

        L_inFinded.setText("0");

        L_inPages.setText("0");

        L_AnaPage.setText("Analysed Pages");

        L_Finded.setText("Found");

        L_Already.setText("Already Taken");

        L_inAlready.setText("0");

        L_AnaPage1.setText("Downloaded");

        L_Downloaded.setText("0");

        javax.swing.GroupLayout P_PreAnaLayout = new javax.swing.GroupLayout(P_PreAna);
        P_PreAna.setLayout(P_PreAnaLayout);
        P_PreAnaLayout.setHorizontalGroup(
            P_PreAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_PreAnaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_PreAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_PreAnaLayout.createSequentialGroup()
                        .addComponent(L_inPages, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L_AnaPage)
                        .addGap(56, 56, 56))
                    .addGroup(P_PreAnaLayout.createSequentialGroup()
                        .addGroup(P_PreAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(L_Downloaded, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                            .addComponent(L_inFinded, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(L_inAlready, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(P_PreAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(L_Finded)
                            .addComponent(L_Already, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(L_AnaPage1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jSeparator1)
        );
        P_PreAnaLayout.setVerticalGroup(
            P_PreAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_PreAnaLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(P_PreAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_inFinded)
                    .addComponent(L_Finded))
                .addGap(5, 5, 5)
                .addGroup(P_PreAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_inAlready)
                    .addComponent(L_Already))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_PreAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_Downloaded)
                    .addComponent(L_AnaPage1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(P_PreAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_inPages)
                    .addComponent(L_AnaPage))
                .addContainerGap())
        );

        jCheckBox1.setText("<html>Download Without Video <br> (Only Osu! Server)</html>");
        jCheckBox1.setFocusable(false);

        javax.swing.GroupLayout P_OptionsLayout = new javax.swing.GroupLayout(P_Options);
        P_Options.setLayout(P_OptionsLayout);
        P_OptionsLayout.setHorizontalGroup(
            P_OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_OptionsLayout.createSequentialGroup()
                .addGroup(P_OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_OptionsLayout.createSequentialGroup()
                        .addGroup(P_OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(P_OptionsLayout.createSequentialGroup()
                                .addComponent(P_AvanSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(1, 1, 1))
                            .addGroup(P_OptionsLayout.createSequentialGroup()
                                .addGroup(P_OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(P_OptionsLayout.createSequentialGroup()
                                        .addComponent(L_Type)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(C_Ranked)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C_Aprove)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C_Unraked)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C_Qualified))
                                    .addGroup(P_OptionsLayout.createSequentialGroup()
                                        .addComponent(L_Modes)
                                        .addGap(2, 2, 2)
                                        .addComponent(C_STD)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C_MANIA)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C_CTB)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C_TAIKO))
                                    .addGroup(P_OptionsLayout.createSequentialGroup()
                                        .addComponent(L_SearchTerm1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(T_Mapper, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(P_OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(P_SearchDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(P_PreAna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(P_OptionsLayout.createSequentialGroup()
                        .addComponent(L_SearchTerm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T_SearchTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L_SearchTerm2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T_Difi, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        P_OptionsLayout.setVerticalGroup(
            P_OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_OptionsLayout.createSequentialGroup()
                .addGroup(P_OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T_SearchTerm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_SearchTerm)
                    .addComponent(L_SearchTerm2)
                    .addComponent(T_Difi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_OptionsLayout.createSequentialGroup()
                        .addGroup(P_OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(P_OptionsLayout.createSequentialGroup()
                                .addGroup(P_OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(L_SearchTerm1)
                                    .addComponent(T_Mapper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, Short.MAX_VALUE)
                        .addGroup(P_OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(L_Modes)
                            .addComponent(C_STD)
                            .addComponent(C_MANIA)
                            .addComponent(C_CTB)
                            .addComponent(C_TAIKO))
                        .addGroup(P_OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(P_OptionsLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(P_OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(L_Type)
                                    .addComponent(C_Ranked)))
                            .addGroup(P_OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(C_Aprove)
                                .addComponent(C_Unraked)
                                .addComponent(C_Qualified)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P_AvanSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P_OptionsLayout.createSequentialGroup()
                        .addComponent(P_SearchDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P_PreAna, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        B_ShowErrors.setText("Show Errors");
        B_ShowErrors.setFocusable(false);
        B_ShowErrors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ShowErrorsActionPerformed(evt);
            }
        });

        B_2Download.setText("Search & Download");
        B_2Download.setFocusable(false);
        B_2Download.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_2DownloadActionPerformed(evt);
            }
        });

        L_fileValue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_fileValue.setText("0");

        L_totalSize.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        L_totalSize.setText("0");

        jLabel3.setText("/");

        B_Pause.setText("||");
        B_Pause.setFocusable(false);
        B_Pause.setMargin(new java.awt.Insets(0, 0, 0, 0));
        B_Pause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_PauseActionPerformed(evt);
            }
        });

        L_File.setText("File:");

        L_FileName.setText("_____");

        L_Try.setText("Attempts:");

        L_Trying.setText("0");

        jLabel4.setText("Errors:");

        L_Errors.setText("0");

        jLabel5.setText("Server:");

        L_server.setText("_");

        jLabel6.setText("Kb/sg");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("0");

        jLabel8.setText("Finishing on:");

        L_seconds.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_seconds.setText("0");

        jLabel10.setText("Seconds");

        L_madeBy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_madeBy.setText("Made by player: NewKey");

        javax.swing.GroupLayout P_LoadDownLayout = new javax.swing.GroupLayout(P_LoadDown);
        P_LoadDown.setLayout(P_LoadDownLayout);
        P_LoadDownLayout.setHorizontalGroup(
            P_LoadDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pro_ProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(P_LoadDownLayout.createSequentialGroup()
                .addComponent(L_Try)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L_Trying)
                .addGroup(P_LoadDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_LoadDownLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(B_Pause, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P_LoadDownLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(B_2Download, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(L_madeBy, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(P_LoadDownLayout.createSequentialGroup()
                .addGroup(P_LoadDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_LoadDownLayout.createSequentialGroup()
                        .addGroup(P_LoadDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(P_LoadDownLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(L_seconds, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10))
                            .addGroup(P_LoadDownLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(L_server, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(L_fileValue, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(L_totalSize, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel6))
                    .addGroup(P_LoadDownLayout.createSequentialGroup()
                        .addComponent(L_File)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(L_FileName, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(P_LoadDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B_ShowErrors)
                    .addGroup(P_LoadDownLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L_Errors, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        P_LoadDownLayout.setVerticalGroup(
            P_LoadDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_LoadDownLayout.createSequentialGroup()
                .addGroup(P_LoadDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(P_LoadDownLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(P_LoadDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(L_fileValue)
                            .addComponent(L_totalSize)
                            .addComponent(jLabel3))
                        .addGap(5, 5, 5)
                        .addGroup(P_LoadDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(L_seconds)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)))
                    .addGroup(P_LoadDownLayout.createSequentialGroup()
                        .addGroup(P_LoadDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(P_LoadDownLayout.createSequentialGroup()
                                .addGroup(P_LoadDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(B_2Download)
                                    .addComponent(L_madeBy))
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_LoadDownLayout.createSequentialGroup()
                                .addGroup(P_LoadDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(L_Try)
                                    .addComponent(L_Trying)
                                    .addComponent(B_Pause, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(P_LoadDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(P_LoadDownLayout.createSequentialGroup()
                                .addGroup(P_LoadDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(L_File)
                                    .addComponent(L_FileName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(P_LoadDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(L_server)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_LoadDownLayout.createSequentialGroup()
                                .addGroup(P_LoadDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(L_Errors))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B_ShowErrors)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pro_ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P_Options, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(P_ServerPrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P_OsuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(P_LoadDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(P_ServerPrio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P_OsuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(P_Options, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(P_LoadDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


 private void B_UpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_UpActionPerformed
   try {
    int posc = List_prio.getSelectedIndex();
    Object aux = model.get(posc);
    model.remove(posc);
    model.add(0, aux);
   } catch (Exception e) {}
  }//GEN-LAST:event_B_UpActionPerformed



 private void B_DownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_DownActionPerformed
   try {
    int posc = List_prio.getSelectedIndex();
    Object aux = model.get(posc);
    model.remove(posc);
    model.add(1, aux);
   } catch (Exception e) {}
  }//GEN-LAST:event_B_DownActionPerformed


 private void C_OsuServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_OsuServerActionPerformed
   if (C_OsuServer.isSelected()) {
    model.add(model.size(), "Osu! Server");
    jCheckBox1.setEnabled(true);
   } else {
       jCheckBox1.setSelected(false);
       jCheckBox1.setEnabled(false);
    for (int i = 0; i < model.size(); i++) {
     if (model.get(i).equals("Osu! Server"))
      model.remove(i);
    }
   }
  }//GEN-LAST:event_C_OsuServerActionPerformed

 private void B_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_LoginActionPerformed
   int dialogResult = JOptionPane.showConfirmDialog(null, "It will Open a Web Browser \nAnd after you log in, it will take your cookies in order to Download on Osu! Server \nLike if you actually log in. Clicking YES you agree with this.", "Warning", JOptionPane.YES_NO_OPTION);
   if (dialogResult == JOptionPane.YES_OPTION) {
    Runnable runnable = new Runnable() {
     public void run() {
      String[] args = null;
      Address = "https://osu.ppy.sh/forum/ucp.php?mode=login";
      Browser.main(args);
     }
    };
    Thread aux = new Thread(runnable);
    aux.start();
   }
  }//GEN-LAST:event_B_LoginActionPerformed

 private void B_DirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_DirectoryActionPerformed
   JFileChooser chooser;
   chooser = new JFileChooser();
   chooser.setCurrentDirectory(new java.io.File("."));
   chooser.setDialogTitle("Open Osu! Installation Directory");
   chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
   chooser.setAcceptAllFileFilterUsed(false);
   if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
    File route = chooser.getSelectedFile();
    if (route.toString().endsWith("Songs")) {
     Directory = route.getAbsolutePath();
     T_Directory.setText(Directory);
    } else {
     if (route.isDirectory()) {
      String[] Files = route.list();
      boolean found = false;
      for (String f: Files)
       if (f.contains("Songs")) {
        Directory = route + File.separator + f;
        T_Directory.setText(Directory);
        found = true;
        break;
       }
      if (found == false) Alert("Incorrect Osu! Directory");
     }
    }
   }
  }//GEN-LAST:event_B_DirectoryActionPerformed

 private void C_CalendarEnabledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_CalendarEnabledActionPerformed
   if (C_CalendarEnabled.isSelected()) {
    Ca_fromMonth.setEnabled(true);
    Ca_fromYear.setEnabled(true);
    Ca_toMonth.setEnabled(true);
    Ca_toYear.setEnabled(true);
   } else {
    Ca_fromMonth.setEnabled(false);
    Ca_fromYear.setEnabled(false);
    Ca_toMonth.setEnabled(false);
    Ca_toYear.setEnabled(false);
   }
  }//GEN-LAST:event_C_CalendarEnabledActionPerformed

 private void B_2DownloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_2DownloadActionPerformed
   if (Validate()) {
    if (B_2Download.getText().contains("Search & Download")) {
     B_2Download.setText("STOP");
     B_Pause.setText("||");
     runnable = new Runnable() {
      public void run() {
       try {
        String osuSongFolder = T_Directory.getText();
        File SongFolder = new File(osuSongFolder);
        File[] Songs = SongFolder.listFiles();
        String APIcode = Arrays.toString(T_Password.getPassword()).
                replaceAll(", ", "").replaceAll("\\[", "").replaceAll("]", "");
        String mapper = T_Mapper.getText().trim();
        boolean modeSTD = C_STD.isSelected();
        boolean modeMANIA = C_MANIA.isSelected();
        boolean modeTAIKO = C_TAIKO.isSelected();
        boolean modeCTB = C_CTB.isSelected();
        boolean Ranked = C_Ranked.isSelected();
        boolean Aprove = C_Aprove.isSelected();
        boolean UnRanked = C_Unraked.isSelected();
        boolean Qualified = C_Qualified.isSelected();
        boolean Mapper = T_Mapper.getText().isEmpty();
        boolean Star = T_STAR.getText().isEmpty();
        Double ARmin = _ARmin, ARmax = _ARmax, CSmin = _CSmin, CSmax = _CSmax;
        Double HPmin = _HPmin, HPmax = _HPmax, BPMmin = _BPMmin, BPMmax = _BPMmax;
        Double Timemin = _Timemin, Timemax = _Timemax, ODmin = _ODmin, ODmax = _ODmax;
        Double STARmin = _STARmin, STARmax= _STARmax;
        int toMonth = Ca_toMonth.getMonth() + 1;
        int fromMonth = Ca_fromMonth.getMonth() + 1;
        int toYear = Ca_toYear.getYear();
        int fromYear = Ca_toYear.getYear();
        double Genre= C_Genre.getSelectedIndex();
        double Lang= C_Lang.getSelectedIndex();
        
        String modes = "";
        if (modeSTD)
         modes += "0,";
        if (modeTAIKO)
         modes += "1,";
        if (modeCTB)
         modes += "2,";
        if (modeMANIA)
         modes += "3,";
        if (modes.length() == 0)
         modes = "";
        else
         modes = modes.substring(0, modes.length() - 1);
        String status = "";
        if (Ranked)
         status += "1,";
        if (Aprove)
         status += "2,";
        if (UnRanked)
         status += "0,";
        if (Qualified)
         status += "3,";
        if (status.length() == 0)
         status = "";
        else
         status = status.substring(0, status.length() - 1);
        String SearchTerm = T_SearchTerm.getText();
        int page = 1;
        Song Song = null;
        boolean Search = false;
        do {
         L_inPages.setText(page + "");
         JSONArray json;
         JSONArray jsonOsu = null;
         try {
          json = readJsonFromUrl("http://bloodcat.com/osu/?mod=json&m=" + modes + "&s=" + status + "&q=" + SearchTerm + "&p=" + page);
          L_inFinded.setText(json.length() + "");
          if (json.length() == 0) {
           break;
          }
         } catch (Exception e) {
          Search = false;
          continue;
         }
         ArrayList < String > ID = new ArrayList < > ();
         ArrayList < String > stat = new ArrayList < > ();
         ArrayList < String > date = new ArrayList < > ();
         ArrayList < String > creator = new ArrayList < > ();
         ArrayList < ArrayList < Beatmap >> Beatmaps = new ArrayList < ArrayList < Beatmap >> ();
         for (int i = 0; i < json.length(); i++) {
          String idMap = "", name = "", mode = "", hp = "", cs = "",genre = "";
          String od = "", ar = "", bpm = "", length = "",star = "",lang = "";
          String idbm= (String) json.getJSONObject(i).get("id");
          ID.add(idbm);
          stat.add((String) json.getJSONObject(i).get("status"));
          date.add((String) json.getJSONObject(i).get("synced"));
          creator.add((String) json.getJSONObject(i).get("creator"));
          jsonOsu = readJsonFromUrl("http://osu.ppy.sh/api/get_beatmaps?k="+APIcode+"&s="+idbm);
          ArrayList < Beatmap > beatmap = new ArrayList < Beatmap > ();
          for (int j = 0; j < jsonOsu.length(); j++) {
           idMap = jsonOsu.getJSONObject(j).getString("beatmap_id");
           name = jsonOsu.getJSONObject(j).getString("version"); 
           mode = jsonOsu.getJSONObject(j).getString("mode");
           hp = jsonOsu.getJSONObject(j).getString("diff_drain");
           cs = jsonOsu.getJSONObject(j).getString("diff_size");
           od = jsonOsu.getJSONObject(j).getString("diff_overall");
           ar = jsonOsu.getJSONObject(j).getString("diff_approach");
           bpm = jsonOsu.getJSONObject(j).getString("bpm");
           length = jsonOsu.getJSONObject(j).getString("total_length");
           star = jsonOsu.getJSONObject(j).getString("difficultyrating");
           genre = jsonOsu.getJSONObject(j).getString("genre_id");
           lang = jsonOsu.getJSONObject(j).getString("language_id");
           beatmap.add(new Beatmap(idMap, name, mode, hp, cs, od, ar, bpm, star, length, genre, lang));
          }
          Beatmaps.add(beatmap);
         }
         Song = new Song(ID, stat, date, creator, Beatmaps);
         int alreadyTaken = 0;
         boolean toDownload = false;
         for (int i = 0; i < Song.getID().size(); i++) {
          toDownload = false;
          errorConection = 0;
          L_Trying.setText(errorConection + "");
          for (int j = 0; j < Songs.length; j++) {
           String aux = Songs[j].toString();
           String IDSongFolder = aux.substring(aux.lastIndexOf(File.separator) + 1, aux.indexOf(" "));
           if (Song.getID().get(i).equals(IDSongFolder)) {
            alreadyTaken++;
            toDownload = true;
            L_inAlready.setText(alreadyTaken + "");
            break;
           }
          }
          if (toDownload == false) {
           for (int j = 0; j < Song.getBeatmap().get(i).size(); j++) {
            String dateSong = (String) Song.getDate().get(i);
            dateSong = dateSong.substring(0, dateSong.indexOf(" "));
            int SongYear = Integer.parseInt(dateSong.substring(0, dateSong.indexOf("-")));
            String mo = dateSong.substring(dateSong.indexOf("-") + 1, dateSong.lastIndexOf("-"));
            int SongMonth = Integer.parseInt(mo);
            String CREATOR = Song.getCreator().get(i).toString();
            Double HP = Double.parseDouble(Song.getBeatmap().get(i).get(j).getHp());
            Double CS = Double.parseDouble(Song.getBeatmap().get(i).get(j).getCs());
            Double OD = Double.parseDouble(Song.getBeatmap().get(i).get(j).getOd());
            Double AR = Double.parseDouble(Song.getBeatmap().get(i).get(j).getAr());
            Double BPM = Double.parseDouble(Song.getBeatmap().get(i).get(j).getBpm());
            Double LEN = Double.parseDouble(Song.getBeatmap().get(i).get(j).getLength());
            Double STAR = Double.parseDouble(Song.getBeatmap().get(i).get(j).getStar());
            Double GENRE = Double.parseDouble(Song.getBeatmap().get(i).get(j).getGenre());
            Double LANG = Double.parseDouble(Song.getBeatmap().get(i).get(j).getLang());
            if (
             (((C_CalendarEnabled.isSelected()) ? (fromMonth <= SongMonth && SongMonth <= toMonth)
                                && (fromYear <= SongYear && SongYear <= toYear) : true) != false) ? 
                (((HPmax!=99999.0) ? (HPmin <= HP && HP <= HPmax) : (HPmin >= HP && HP <= HPmax)) 
                && ((CSmax!=99999.0) ? (CSmin <= CS && CS <= CSmax) : (CSmin >= CS && CS <= CSmax)) 
                && ((ODmax!=99999.0) ? (ODmin <= OD && OD <= ODmax) : (ODmin >= OD && OD <= ODmax)) 
                && ((ARmax!=99999.0) ? (ARmin <= AR && AR <= ARmax) : (ARmin >= AR && AR <= ODmax)) 
                && ((BPMmax!=99999.0) ? (BPMmin <= BPM && BPM <= ARmax) : (BPMmin >= BPM && BPM <= BPMmax)) 
                && ((Timemax!=99999.0) ? (Timemin <= LEN && LEN <= Timemax) : (Timemin >= LEN && LEN <= Timemax))
                && ((!Star)?(STARmin <= STAR && STAR <= STARmax):true)
                && ((!Mapper)?mapper.contains(CREATOR):true)
                && ((Genre==0)?true:GENRE==Genre)
                && ((Lang==0)?true:LANG==Lang)
                    ) : false
            ) {
             if (downloadSong((String) Song.getID().get(i), prio) == true) {
              downloaded++;
              L_Downloaded.setText(downloaded + "");
              break;
             } else {
              break;
             }
            }
           }
          }
         }
         page++;
        } while (Search == false);

       } catch (Exception e) {
        e.printStackTrace();
       }
      }
     };
     start = new Thread(runnable);
     start.start();
    } else {
     start.stop();
     B_2Download.setText("Search & Download");
    }
   }
  }//GEN-LAST:event_B_2DownloadActionPerformed

 public boolean downloadSong(String idMap, int prio) {
  String fileName = null;
  try {
   String url = "";
   if (model.get(prio).toString().contains("Blood")) {
    url = "http://bloodcat.com/osu/d/" + idMap;
    L_server.setText("Bloodcat Server");
   } else {
    if (C_OsuServer.isSelected() && model.get(0).toString().contains("Osu")) {
     url = "http://osu.ppy.sh/d/" + idMap;
     L_server.setText("Osu! Server");
    }
   }
   long start = System.nanoTime();
   long totalRead = 0;
   final double NANOS_PER_SECOND = 1000000000.0;
   final double BYTES_PER_MIB = 1024 * 1024;
   URLConnection request = null;
   request = new URL(url).openConnection();
   request.setRequestProperty("Cookie", url.contains("ppy") ? Cookie : "");
   request.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
   InputStream in = request.getInputStream();
   String raw = request.getHeaderField("Content-Disposition");
   fileName = raw.split("=")[1].replaceAll("\"", "").replaceAll("; filename*", "");
   request.getContentLength();
   double size = request.getContentLength();
   File aux = File.createTempFile(fileName.replaceAll("\\*", "").replaceAll(";", ""), ".osz");
   L_FileName.setText(fileName.replaceAll("\\*", "").replaceAll(";", ""));
   FileOutputStream out = new FileOutputStream(aux);
   byte[] buffer = new byte[1024];
   int len = in .read(buffer);
   L_totalSize.setText((String) new DecimalFormat("#.##").format(size * 0.000001) + " Mb");
   int bytes = 0;
   Pro_ProgressBar.setMinimum(0);
   Pro_ProgressBar.setMaximum((int)(size / 1000));
   long acu = 0;
   while (len != -1) {
    bytes++;
    out.write(buffer, 0, len);
    len = in .read(buffer);
    if (len == 1024) {
     acu += len;
     L_fileValue.setText(new DecimalFormat("#.##").format(acu * 0.000001));
    }
    Pro_ProgressBar.setValue(bytes);
    totalRead += len;
    String speed = new DecimalFormat("#.##").format(((NANOS_PER_SECOND / BYTES_PER_MIB * totalRead / (System.nanoTime() - start + 1)) * 1000));
    jLabel7.setText(speed + "");
    L_seconds.setText(new DecimalFormat("#.##").format(((Double.parseDouble(new DecimalFormat("#.##").format(size * 0.000001)) - Double.parseDouble(new DecimalFormat("#.##").format(acu * 0.000001))) * 0.1 / (Double.parseDouble(speed)) * 10000)));
    if (Thread.interrupted()) { in .close();
     out.close();
     aux.deleteOnExit();
     throw new InterruptedException();
    }
   } in .close();
   out.close();
   FileUtils.copyFile(aux, new File(Directory + File.separator + fileName.replaceAll("\\*", "").replaceAll(";", "")));
   aux.deleteOnExit();
   return true;
  } catch (Exception e) {
   e.printStackTrace();
   prio++;
   errorConection++;
   L_Trying.setText(errorConection + "");
   int limitTry = 3;
   if (errorConection >= limitTry) {
    Errors++;
    L_Errors.setText(Errors + "");
    errorDownload("-The connection to this Beatmap was failed, '" + errorConection + "' times, it was skipped.");
    errorDownload("--The filename is '" + fileName + "', with the id '" + idMap + "'. ");
    errorDownload("----------------------");
   } else {
    if (model.getSize() == prio)
     prio = 0;
    downloadSong(idMap, prio);
   }
   return false;
  }
 }
 

 private void B_ShowErrorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ShowErrorsActionPerformed
   JFrame_Error.pack();
   JFrame_Error.setLocationRelativeTo(null);
   JFrame_Error.setVisible(true);
  }//GEN-LAST:event_B_ShowErrorsActionPerformed

 private void B_PauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_PauseActionPerformed
   try {
    start.isAlive();
    if (B_Pause.getText().equals("||")) {
     try {
      start.suspend();
     } catch (Exception e) {}
     B_Pause.setText(">");
    } else {
     try {
      start.resume();
     } catch (Exception e) {}
     B_Pause.setText("||");
    }
   } catch (Exception e) {
    B_Pause.setText("||");
   }
  }//GEN-LAST:event_B_PauseActionPerformed

    private void C_GenreItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_C_GenreItemStateChanged
        if(C_Genre.getSelectedIndex()==7)
            C_Genre.setSelectedIndex(8);
    }//GEN-LAST:event_C_GenreItemStateChanged

 private void Alert(String Content) {
  JOptionPane.showMessageDialog(null, Content, "Alert!", JOptionPane.ERROR_MESSAGE);
 }

 private void errorDownload(String Content) {
  T_Error.setText(T_Error.getText() + Content + " \n");
  int len = T_Error.getDocument().getLength();
  T_Error.setCaretPosition(len);
 }


 private boolean Validate() {
  try {
        String aux="";
        if (T_AR.getText().length() != 0 && T_AR.getText().contains("-")){
            aux = T_AR.getText();
            _ARmin = Double.parseDouble(aux.substring(0,aux.indexOf("-")));
            _ARmax = Double.parseDouble(aux.substring(aux.lastIndexOf("-")+1));
        }else{
            _ARmin=(T_AR.getText().length()==0)? 99999.0:Double.parseDouble(T_AR.getText());
            _ARmax = 99999.0;
        }
        
        if (T_CS.getText().length() != 0 && T_CS.getText().contains("-")){
            aux = T_CS.getText();
            _CSmin = Double.parseDouble(aux.substring(0,aux.indexOf("-")));
            _CSmax = Double.parseDouble(aux.substring(aux.lastIndexOf("-")+1));
        }else{
            _CSmin=(T_CS.getText().length()==0)? 99999.0:Double.parseDouble(T_CS.getText());
            _CSmax = 99999.0;
        }
        
        if (T_HP.getText().length() != 0 && T_HP.getText().contains("-")){
            aux = T_HP.getText();
            _HPmin = Double.parseDouble(aux.substring(0,aux.indexOf("-")));
            _HPmax = Double.parseDouble(aux.substring(aux.lastIndexOf("-")+1));
        }else{
            _HPmin=(T_HP.getText().length()==0)? 99999.0:Double.parseDouble(T_HP.getText());
            _HPmax = 99999.0;
        }
        
        if (T_BPM.getText().length() != 0 && T_BPM.getText().contains("-")){
            aux = T_BPM.getText();
            _BPMmin = Double.parseDouble(aux.substring(0,aux.indexOf("-")));
            _BPMmax = Double.parseDouble(aux.substring(aux.lastIndexOf("-")+1));
        }else{
            _BPMmin=(T_BPM.getText().length()==0)? 99999.0:Double.parseDouble(T_BPM.getText());
            _BPMmax = 99999.0;
        }
        
        if (T_Time.getText().length() != 0 && T_Time.getText().contains("-")){
            aux = T_Time.getText();
            _Timemin = Double.parseDouble(aux.substring(0,aux.indexOf("-")));
            _Timemax = Double.parseDouble(aux.substring(aux.lastIndexOf("-")+1));
        }else{
            _Timemin=(T_Time.getText().length()==0)? 99999.0:Double.parseDouble(T_Time.getText());
            _Timemax = 99999.0;
        }
        
        if (T_OD.getText().length() != 0 && T_OD.getText().contains("-")){
            aux = T_OD.getText();
            _ODmin = Double.parseDouble(aux.substring(0,aux.indexOf("-")));
            _ODmax = Double.parseDouble(aux.substring(aux.lastIndexOf("-")+1));
        }else{
            _ODmin=(T_OD.getText().length()==0)? 99999.0:Double.parseDouble(T_OD.getText());
            _ODmax = 99999.0;
        }
        
        if (T_STAR.getText().length() != 0 && T_STAR.getText().contains("-")){
            aux = T_STAR.getText();
            _STARmin = Double.parseDouble(aux.substring(0,aux.indexOf("-")));
            _STARmax = Double.parseDouble(aux.substring(aux.lastIndexOf("-")+1));
            if(_STARmin>_STARmax) throw new Exception("Bigger");
        }else{
            _STARmin=(T_STAR.getText().length()==0)? 99999.0:Double.parseDouble(T_STAR.getText());
            _STARmax = 99999.0;
        }

   if (T_Directory.getText().length()==0)
    throw new Exception("Directory");
   if (C_OsuServer.isSelected())
    if (L_AccountAcept.getText().contains("_"))
     throw new Exception("Osu Account");
   if (T_Password.getPassword().length==0)
       throw new Exception("Password");
   return true;
  } catch (Exception e) {
   if (e.toString().contains("Directory")) {
    Alert("Open a correct Song Directory.");
   } else {
    if (e.toString().contains("Osu Account")) {
     Alert("You selected Osu! Server, Ingress a Correct Osu! Account, Click Login.");
    } else {
        if (e.toString().contains("Bigger")) {
            Alert("A Minium value is bigger than the Maximun value.");
        }else{
            if (e.toString().contains("Password")) {
                Alert("Enter the Osu API code.");
            }else
                Alert("Only Numbers.");
       }
   }
  }
   return false;
 }
 }

 private static String readAll(Reader rd) throws IOException {
  StringBuilder sb = new StringBuilder();
  int cp;
  while ((cp = rd.read()) != -1) {
   sb.append((char) cp);
  }
  return sb.toString();
 }

 public static JSONArray readJsonFromUrl(String url) throws Exception, JSONException {
  InputStream is = null;
  try {
   is = new URL(url).openStream();
   BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
   String jsonText = readAll(rd);
   JSONArray json = new JSONArray(jsonText);
   return json;
  } finally {
   is.close();
  }
 }


 static void accountReady(String allCookieString) {
  L_AccountAcept.setText("Account Ready");
  Cookie = allCookieString;
 }
 
 @Override public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Icon.png"));
        return retValue;
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton B_2Download;
    private javax.swing.JToggleButton B_Directory;
    private javax.swing.JButton B_Down;
    private javax.swing.JToggleButton B_Login;
    private javax.swing.JButton B_Pause;
    private javax.swing.JToggleButton B_ShowErrors;
    private javax.swing.JButton B_Up;
    private javax.swing.JCheckBox C_Aprove;
    private javax.swing.JCheckBox C_CTB;
    private javax.swing.JCheckBox C_CalendarEnabled;
    private javax.swing.JComboBox<String> C_Genre;
    private javax.swing.JComboBox<String> C_Lang;
    private javax.swing.JCheckBox C_MANIA;
    private javax.swing.JCheckBox C_OsuServer;
    private javax.swing.JCheckBox C_Qualified;
    private javax.swing.JCheckBox C_Ranked;
    private javax.swing.JCheckBox C_STD;
    private javax.swing.JCheckBox C_TAIKO;
    private javax.swing.JCheckBox C_Unraked;
    private com.toedter.calendar.JMonthChooser Ca_fromMonth;
    private com.toedter.calendar.JYearChooser Ca_fromYear;
    private com.toedter.calendar.JMonthChooser Ca_toMonth;
    private com.toedter.calendar.JYearChooser Ca_toYear;
    private javax.swing.JFrame JFrame_Error;
    private javax.swing.JLabel L_AR;
    private javax.swing.JLabel L_AR1;
    public static javax.swing.JLabel L_AccountAcept;
    private javax.swing.JLabel L_Already;
    private javax.swing.JLabel L_AnaPage;
    private javax.swing.JLabel L_AnaPage1;
    private javax.swing.JLabel L_BPM;
    private javax.swing.JLabel L_CS;
    private javax.swing.JLabel L_Downloaded;
    private javax.swing.JLabel L_Errors;
    private javax.swing.JLabel L_File;
    private javax.swing.JLabel L_FileName;
    private javax.swing.JLabel L_Finded;
    private javax.swing.JLabel L_From;
    private javax.swing.JLabel L_HP;
    private javax.swing.JLabel L_Modes;
    private javax.swing.JLabel L_OD;
    private javax.swing.JLabel L_OsuAccount;
    private javax.swing.JLabel L_Others;
    private javax.swing.JLabel L_Prio;
    private javax.swing.JLabel L_SearchTerm;
    private javax.swing.JLabel L_SearchTerm1;
    private javax.swing.JLabel L_SearchTerm2;
    private javax.swing.JLabel L_Time;
    private javax.swing.JLabel L_Title;
    private javax.swing.JLabel L_To;
    private javax.swing.JLabel L_Try;
    private javax.swing.JLabel L_Trying;
    private javax.swing.JLabel L_Type;
    private javax.swing.JLabel L_fileValue;
    private javax.swing.JLabel L_inAlready;
    private javax.swing.JLabel L_inFinded;
    private javax.swing.JLabel L_inPages;
    private static javax.swing.JLabel L_madeBy;
    private javax.swing.JLabel L_seconds;
    private javax.swing.JLabel L_server;
    private javax.swing.JLabel L_totalSize;
    private javax.swing.JList<String> List_prio;
    private javax.swing.JPanel P_AvanSearch;
    private javax.swing.JPanel P_LoadDown;
    private javax.swing.JPanel P_Options;
    private javax.swing.JPanel P_OsuPanel;
    private javax.swing.JPanel P_PreAna;
    private javax.swing.JPanel P_SearchDate;
    private javax.swing.JPanel P_ServerPrio;
    private javax.swing.JProgressBar Pro_ProgressBar;
    private javax.swing.JScrollPane Sc_Error;
    private javax.swing.JScrollPane Sc_Prio;
    private javax.swing.JSeparator Separetor;
    private javax.swing.JTextField T_AR;
    private javax.swing.JTextField T_BPM;
    private javax.swing.JTextField T_CS;
    private javax.swing.JTextField T_Difi;
    private javax.swing.JTextField T_Directory;
    private javax.swing.JTextPane T_Error;
    private javax.swing.JTextField T_HP;
    private javax.swing.JTextField T_Mapper;
    private javax.swing.JTextField T_OD;
    private javax.swing.JPasswordField T_Password;
    private javax.swing.JTextField T_STAR;
    private javax.swing.JTextField T_SearchTerm;
    private javax.swing.JTextField T_Time;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables


}