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
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.text.DecimalFormat;
import java.util.ArrayList;
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
        P_OsuPanel = new javax.swing.JPanel();
        T_Directory = new javax.swing.JTextField();
        C_OsuServer = new javax.swing.JCheckBox();
        L_AccountAcept = new javax.swing.JLabel();
        B_Login = new javax.swing.JToggleButton();
        B_Directory = new javax.swing.JToggleButton();
        L_OsuAccount = new javax.swing.JLabel();
        P_Options = new javax.swing.JPanel();
        P_SearchDate = new javax.swing.JPanel();
        Ca_toYear = new com.toedter.calendar.JYearChooser();
        Ca_toMonth = new com.toedter.calendar.JMonthChooser();
        Ca_fromMonth = new com.toedter.calendar.JMonthChooser();
        Ca_fromYear = new com.toedter.calendar.JYearChooser();
        C_CalendarEnabled = new javax.swing.JCheckBox();
        L_From = new javax.swing.JLabel();
        L_To = new javax.swing.JLabel();
        P_AvanSearch = new javax.swing.JPanel();
        P_AR = new javax.swing.JPanel();
        L_AR = new javax.swing.JLabel();
        T_ARmin = new javax.swing.JTextField();
        T_ARmax = new javax.swing.JTextField();
        C_ARrange = new javax.swing.JCheckBox();
        L_max = new javax.swing.JLabel();
        L_Modes = new javax.swing.JLabel();
        P_TIME = new javax.swing.JPanel();
        L_Time = new javax.swing.JLabel();
        T_Timemin = new javax.swing.JTextField();
        T_Timemax = new javax.swing.JTextField();
        C_Timerange = new javax.swing.JCheckBox();
        L_Type = new javax.swing.JLabel();
        P_HP = new javax.swing.JPanel();
        L_HP = new javax.swing.JLabel();
        T_HPmin = new javax.swing.JTextField();
        T_HPmax = new javax.swing.JTextField();
        C_HPrange = new javax.swing.JCheckBox();
        C_CTB = new javax.swing.JCheckBox();
        C_STD = new javax.swing.JCheckBox();
        C_Ranked = new javax.swing.JCheckBox();
        C_Aprove = new javax.swing.JCheckBox();
        C_TAIKO = new javax.swing.JCheckBox();
        P_BPM = new javax.swing.JPanel();
        L_BPM = new javax.swing.JLabel();
        T_BPMmin = new javax.swing.JTextField();
        T_BPMmax = new javax.swing.JTextField();
        C_BPMrange = new javax.swing.JCheckBox();
        L_Others = new javax.swing.JLabel();
        C_Unraked = new javax.swing.JCheckBox();
        C_MANIA = new javax.swing.JCheckBox();
        C_Qualified = new javax.swing.JCheckBox();
        P_OD = new javax.swing.JPanel();
        L_OD = new javax.swing.JLabel();
        T_ODmin = new javax.swing.JTextField();
        T_ODmax = new javax.swing.JTextField();
        C_ODrange = new javax.swing.JCheckBox();
        P_CS = new javax.swing.JPanel();
        L_CS = new javax.swing.JLabel();
        T_CSmin = new javax.swing.JTextField();
        T_CSmax = new javax.swing.JTextField();
        C_CSrange = new javax.swing.JCheckBox();
        L_max1 = new javax.swing.JLabel();
        T_SearchTerm = new javax.swing.JTextField();
        L_SearchTerm = new javax.swing.JLabel();
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

        T_Error.setEditable(false);
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
                            .addComponent(B_Down, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        P_OsuPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        T_Directory.setEditable(false);
        T_Directory.setText("_______________________________________________________");
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

        B_Directory.setText("Open Osu! Directory");
        B_Directory.setFocusable(false);
        B_Directory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_DirectoryActionPerformed(evt);
            }
        });

        L_OsuAccount.setText("Osu! Account: ");

        javax.swing.GroupLayout P_OsuPanelLayout = new javax.swing.GroupLayout(P_OsuPanel);
        P_OsuPanel.setLayout(P_OsuPanelLayout);
        P_OsuPanelLayout.setHorizontalGroup(
            P_OsuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_OsuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_OsuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_OsuPanelLayout.createSequentialGroup()
                        .addComponent(T_Directory, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B_Directory, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P_OsuPanelLayout.createSequentialGroup()
                        .addGroup(P_OsuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(P_OsuPanelLayout.createSequentialGroup()
                                .addComponent(L_OsuAccount)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(L_AccountAcept))
                            .addGroup(P_OsuPanelLayout.createSequentialGroup()
                                .addComponent(C_OsuServer)
                                .addGap(81, 81, 81)
                                .addComponent(B_Login)))
                        .addGap(0, 238, Short.MAX_VALUE)))
                .addContainerGap())
        );
        P_OsuPanelLayout.setVerticalGroup(
            P_OsuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_OsuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(C_OsuServer)
                .addGroup(P_OsuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_OsuPanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(P_OsuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(L_OsuAccount)
                            .addComponent(L_AccountAcept)))
                    .addComponent(B_Login, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_OsuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T_Directory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_Directory))
                .addContainerGap())
        );

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
                .addContainerGap()
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
                    .addComponent(L_To))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap())
        );

        P_AvanSearch.setBorder(javax.swing.BorderFactory.createTitledBorder("Advance Filter"));

        P_AR.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        L_AR.setText("AR: ");

        T_ARmax.setEnabled(false);

        C_ARrange.setText("Interval");
        C_ARrange.setFocusable(false);
        C_ARrange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_ARrangeActionPerformed(evt);
            }
        });

        L_max.setText("Max");

        javax.swing.GroupLayout P_ARLayout = new javax.swing.GroupLayout(P_AR);
        P_AR.setLayout(P_ARLayout);
        P_ARLayout.setHorizontalGroup(
            P_ARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_ARLayout.createSequentialGroup()
                .addGroup(P_ARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L_AR)
                    .addComponent(L_max))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_ARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(T_ARmax, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T_ARmin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(C_ARrange)
                .addContainerGap())
        );
        P_ARLayout.setVerticalGroup(
            P_ARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_ARLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(P_ARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(C_ARrange)
                    .addGroup(P_ARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(T_ARmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(L_AR)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(P_ARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T_ARmax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_max)))
        );

        L_Modes.setText("Modes:");

        P_TIME.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        L_Time.setText("Time(sg)");

        T_Timemax.setEnabled(false);

        C_Timerange.setText("Interval");
        C_Timerange.setFocusable(false);
        C_Timerange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_TimerangeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout P_TIMELayout = new javax.swing.GroupLayout(P_TIME);
        P_TIME.setLayout(P_TIMELayout);
        P_TIMELayout.setHorizontalGroup(
            P_TIMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_TIMELayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(P_TIMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(T_Timemax, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(P_TIMELayout.createSequentialGroup()
                        .addComponent(L_Time)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T_Timemin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(C_Timerange)
                .addContainerGap())
        );
        P_TIMELayout.setVerticalGroup(
            P_TIMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_TIMELayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(P_TIMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_Time)
                    .addComponent(T_Timemin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C_Timerange))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(T_Timemax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        L_Type.setText("Type:");

        P_HP.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        L_HP.setText("HP:");

        T_HPmax.setEnabled(false);

        C_HPrange.setText("Interval");
        C_HPrange.setFocusable(false);
        C_HPrange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_HPrangeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout P_HPLayout = new javax.swing.GroupLayout(P_HP);
        P_HP.setLayout(P_HPLayout);
        P_HPLayout.setHorizontalGroup(
            P_HPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_HPLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(P_HPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(T_HPmax, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(P_HPLayout.createSequentialGroup()
                        .addComponent(L_HP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T_HPmin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(C_HPrange)
                .addContainerGap())
        );
        P_HPLayout.setVerticalGroup(
            P_HPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_HPLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(P_HPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_HP)
                    .addComponent(T_HPmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C_HPrange))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(T_HPmax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        C_CTB.setText("Catch The Beat");
        C_CTB.setFocusable(false);

        C_STD.setText("Standard");
        C_STD.setFocusable(false);

        C_Ranked.setText("Ranked");
        C_Ranked.setFocusable(false);

        C_Aprove.setText("Aprove");
        C_Aprove.setFocusable(false);

        C_TAIKO.setText("Taiko");
        C_TAIKO.setFocusable(false);

        P_BPM.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        L_BPM.setText("BPM:");

        T_BPMmax.setEnabled(false);

        C_BPMrange.setText("Interval");
        C_BPMrange.setFocusable(false);
        C_BPMrange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_BPMrangeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout P_BPMLayout = new javax.swing.GroupLayout(P_BPM);
        P_BPM.setLayout(P_BPMLayout);
        P_BPMLayout.setHorizontalGroup(
            P_BPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_BPMLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(P_BPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(T_BPMmax, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(P_BPMLayout.createSequentialGroup()
                        .addComponent(L_BPM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T_BPMmin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(C_BPMrange)
                .addContainerGap())
        );
        P_BPMLayout.setVerticalGroup(
            P_BPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_BPMLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(P_BPMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_BPM)
                    .addComponent(T_BPMmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C_BPMrange))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(T_BPMmax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        L_Others.setText("Others:");

        C_Unraked.setText("UnRanked");
        C_Unraked.setFocusable(false);

        C_MANIA.setText("Mania");
        C_MANIA.setFocusable(false);

        C_Qualified.setText("Qualified");
        C_Qualified.setFocusable(false);

        P_OD.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        L_OD.setText("OD: ");

        T_ODmax.setEnabled(false);

        C_ODrange.setText("Interval");
        C_ODrange.setFocusable(false);
        C_ODrange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_ODrangeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout P_ODLayout = new javax.swing.GroupLayout(P_OD);
        P_OD.setLayout(P_ODLayout);
        P_ODLayout.setHorizontalGroup(
            P_ODLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_ODLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(P_ODLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(T_ODmax, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(P_ODLayout.createSequentialGroup()
                        .addComponent(L_OD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T_ODmin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(C_ODrange)
                .addContainerGap())
        );
        P_ODLayout.setVerticalGroup(
            P_ODLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_ODLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(P_ODLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_OD)
                    .addComponent(T_ODmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C_ODrange))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(T_ODmax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        P_CS.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        P_CS.setPreferredSize(new java.awt.Dimension(120, 50));

        L_CS.setText("CS: ");

        T_CSmax.setEnabled(false);

        C_CSrange.setText("Interval");
        C_CSrange.setFocusable(false);
        C_CSrange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_CSrangeActionPerformed(evt);
            }
        });

        L_max1.setText("Max");

        javax.swing.GroupLayout P_CSLayout = new javax.swing.GroupLayout(P_CS);
        P_CS.setLayout(P_CSLayout);
        P_CSLayout.setHorizontalGroup(
            P_CSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_CSLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(P_CSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(P_CSLayout.createSequentialGroup()
                        .addComponent(L_max1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T_CSmax, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P_CSLayout.createSequentialGroup()
                        .addComponent(L_CS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T_CSmin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(C_CSrange)
                .addContainerGap())
        );
        P_CSLayout.setVerticalGroup(
            P_CSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_CSLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(P_CSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_CS)
                    .addComponent(T_CSmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C_CSrange))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_CSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T_CSmax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_max1)))
        );

        javax.swing.GroupLayout P_AvanSearchLayout = new javax.swing.GroupLayout(P_AvanSearch);
        P_AvanSearch.setLayout(P_AvanSearchLayout);
        P_AvanSearchLayout.setHorizontalGroup(
            P_AvanSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_AvanSearchLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(P_AvanSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_AvanSearchLayout.createSequentialGroup()
                        .addGroup(P_AvanSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(L_Modes)
                            .addComponent(L_Type))
                        .addGap(18, 18, 18)
                        .addGroup(P_AvanSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(P_AvanSearchLayout.createSequentialGroup()
                                .addComponent(C_STD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(C_MANIA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(C_TAIKO)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(C_CTB))
                            .addGroup(P_AvanSearchLayout.createSequentialGroup()
                                .addComponent(C_Ranked)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(C_Aprove)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(C_Unraked)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(C_Qualified))))
                    .addGroup(P_AvanSearchLayout.createSequentialGroup()
                        .addComponent(L_Others)
                        .addGap(10, 10, 10)
                        .addComponent(P_AR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P_CS, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P_HP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_AvanSearchLayout.createSequentialGroup()
                        .addComponent(P_BPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P_TIME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P_OD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );

        P_AvanSearchLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {P_AR, P_CS});

        P_AvanSearchLayout.setVerticalGroup(
            P_AvanSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_AvanSearchLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(P_AvanSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_Modes)
                    .addComponent(C_STD)
                    .addComponent(C_MANIA)
                    .addComponent(C_TAIKO)
                    .addComponent(C_CTB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_AvanSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_Type)
                    .addComponent(C_Ranked)
                    .addComponent(C_Aprove)
                    .addComponent(C_Unraked)
                    .addComponent(C_Qualified))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(P_AvanSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L_Others)
                    .addGroup(P_AvanSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(P_AR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(P_CS, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                        .addComponent(P_HP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(P_AvanSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P_TIME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P_BPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P_OD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        L_SearchTerm.setText("Search Terms:");

        javax.swing.GroupLayout P_OptionsLayout = new javax.swing.GroupLayout(P_Options);
        P_Options.setLayout(P_OptionsLayout);
        P_OptionsLayout.setHorizontalGroup(
            P_OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_OptionsLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(P_AvanSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(P_OptionsLayout.createSequentialGroup()
                        .addComponent(L_SearchTerm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T_SearchTerm))
                    .addComponent(P_SearchDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        P_OptionsLayout.setVerticalGroup(
            P_OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_OptionsLayout.createSequentialGroup()
                .addGroup(P_OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(P_AvanSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(P_OptionsLayout.createSequentialGroup()
                        .addGroup(P_OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(T_SearchTerm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(L_SearchTerm))
                        .addGap(18, 18, 18)
                        .addComponent(P_SearchDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

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
                        .addComponent(L_inPages, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L_AnaPage)
                        .addGap(20, 20, 20))
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
                .addGap(34, 34, 34))
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

        javax.swing.GroupLayout P_LoadDownLayout = new javax.swing.GroupLayout(P_LoadDown);
        P_LoadDown.setLayout(P_LoadDownLayout);
        P_LoadDownLayout.setHorizontalGroup(
            P_LoadDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_LoadDownLayout.createSequentialGroup()
                .addGroup(P_LoadDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_LoadDownLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Pro_ProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(P_LoadDownLayout.createSequentialGroup()
                        .addComponent(L_File)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(L_FileName, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L_Errors, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                    .addGroup(P_LoadDownLayout.createSequentialGroup()
                        .addGroup(P_LoadDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(P_LoadDownLayout.createSequentialGroup()
                                .addComponent(L_Try)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(L_Trying)
                                .addGroup(P_LoadDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(P_LoadDownLayout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addComponent(B_2Download, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(P_LoadDownLayout.createSequentialGroup()
                                        .addGap(148, 148, 148)
                                        .addComponent(B_Pause, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(P_LoadDownLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(L_server, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(L_fileValue, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(P_LoadDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(P_LoadDownLayout.createSequentialGroup()
                                        .addComponent(L_totalSize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(P_LoadDownLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(L_seconds, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(P_LoadDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addComponent(B_ShowErrors)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
        P_LoadDownLayout.setVerticalGroup(
            P_LoadDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_LoadDownLayout.createSequentialGroup()
                .addGroup(P_LoadDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_LoadDownLayout.createSequentialGroup()
                        .addComponent(B_2Download)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_LoadDownLayout.createSequentialGroup()
                        .addGroup(P_LoadDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(L_Try)
                            .addComponent(L_Trying)
                            .addComponent(B_Pause, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(P_LoadDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_File)
                    .addComponent(L_FileName)
                    .addComponent(jLabel4)
                    .addComponent(L_Errors))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_LoadDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(P_LoadDownLayout.createSequentialGroup()
                        .addComponent(B_ShowErrors)
                        .addGap(19, 19, 19))
                    .addGroup(P_LoadDownLayout.createSequentialGroup()
                        .addGroup(P_LoadDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(L_server)
                            .addComponent(L_fileValue)
                            .addComponent(L_totalSize)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(P_LoadDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(L_seconds)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(Pro_ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        L_madeBy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_madeBy.setText("Made by player: NewKey");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(P_ServerPrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P_OsuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(P_PreAna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(L_madeBy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P_LoadDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(P_Options, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(P_OsuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P_ServerPrio, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P_Options, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(P_LoadDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(P_PreAna, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(L_madeBy, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
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
   } else {
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

 private void C_ARrangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_ARrangeActionPerformed
   if (C_ARrange.isSelected())
    T_ARmax.setEnabled(true);
   else
    T_ARmax.setEnabled(false);
  }//GEN-LAST:event_C_ARrangeActionPerformed

 private void C_CSrangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_CSrangeActionPerformed
   if (C_CSrange.isSelected())
    T_CSmax.setEnabled(true);
   else
    T_CSmax.setEnabled(false);
  }//GEN-LAST:event_C_CSrangeActionPerformed

 private void C_HPrangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_HPrangeActionPerformed
   if (C_HPrange.isSelected())
    T_HPmax.setEnabled(true);
   else
    T_HPmax.setEnabled(false);
  }//GEN-LAST:event_C_HPrangeActionPerformed

 private void C_ODrangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_ODrangeActionPerformed
   if (C_ODrange.isSelected())
    T_ODmax.setEnabled(true);
   else
    T_ODmax.setEnabled(false);
  }//GEN-LAST:event_C_ODrangeActionPerformed

 private void C_BPMrangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_BPMrangeActionPerformed
   if (C_BPMrange.isSelected())
    T_BPMmax.setEnabled(true);
   else
    T_BPMmax.setEnabled(false);
  }//GEN-LAST:event_C_BPMrangeActionPerformed

 private void C_TimerangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_TimerangeActionPerformed
   if (C_Timerange.isSelected())
    T_Timemax.setEnabled(true);
   else
    T_Timemax.setEnabled(false);
  }//GEN-LAST:event_C_TimerangeActionPerformed

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
        boolean modeSTD = C_STD.isSelected();
        boolean modeMANIA = C_MANIA.isSelected();
        boolean modeTAIKO = C_TAIKO.isSelected();
        boolean modeCTB = C_CTB.isSelected();
        boolean Ranked = C_Ranked.isSelected();
        boolean Aprove = C_Aprove.isSelected();
        boolean UnRanked = C_Unraked.isSelected();
        boolean Qualified = C_Qualified.isSelected();
        Double ARmin = _ARmin, ARmax = _ARmax, CSmin = _CSmin, CSmax = _CSmax;
        Double HPmin = _HPmin, HPmax = _HPmax, BPMmin = _BPMmin, BPMmax = _BPMmax;
        Double Timemin = _Timemin, Timemax = _Timemax, ODmin = _ODmin, ODmax = _ODmax;
        int toMonth = Ca_toMonth.getMonth() + 1;
        int fromMonth = Ca_fromMonth.getMonth() + 1;
        int toYear = Ca_toYear.getYear();
        int fromYear = Ca_toYear.getYear();
        String modes = "";
        if (modeSTD)
         modes += "0,";
        if (modeTAIKO)
         modes += "1,";
        if (modeCTB)
         modes += "3,";
        if (modeMANIA)
         modes += "4,";
        if (modes.length() == 0)
         modes = "";
        else
         modes = modes.substring(0, modes.length() - 1);
        String status = "";
        if (Ranked)
         status += "0,";
        if (Aprove)
         status += "1,";
        if (UnRanked)
         status += "3,";
        if (Qualified)
         status += "4,";
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
          String idMap = "", name1 = "", mode = "", hp = "", cs = "";
          String od = "", ar = "", bpm = "", length = "";
          ID.add((String) json.getJSONObject(i).get("id"));
          stat.add((String) json.getJSONObject(i).get("status"));
          date.add((String) json.getJSONObject(i).get("synced"));
          creator.add((String) json.getJSONObject(i).get("creator"));
          JSONArray objbeatmaps = json.getJSONObject(i).getJSONArray("beatmaps");
          ArrayList < Beatmap > beatmap = new ArrayList < Beatmap > ();
          for (int j = 0; j < objbeatmaps.length(); j++) {
           idMap = objbeatmaps.getJSONObject(j).getString("id");
           name1 = objbeatmaps.getJSONObject(j).getString("name");
           mode = objbeatmaps.getJSONObject(j).getString("mode");
           hp = objbeatmaps.getJSONObject(j).getString("hp");
           cs = objbeatmaps.getJSONObject(j).getString("cs");
           od = objbeatmaps.getJSONObject(j).getString("od");
           ar = objbeatmaps.getJSONObject(j).getString("ar");
           bpm = objbeatmaps.getJSONObject(j).getString("bpm");
           length = objbeatmaps.getJSONObject(j).getString("length");
           beatmap.add(new Beatmap(idMap, name1, mode, hp, cs, od, ar, bpm, length));
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
            Double HP = Double.parseDouble(Song.getBeatmap().get(i).get(j).getHp());
            Double CS = Double.parseDouble(Song.getBeatmap().get(i).get(j).getCs());
            Double OD = Double.parseDouble(Song.getBeatmap().get(i).get(j).getOd());
            Double AR = Double.parseDouble(Song.getBeatmap().get(i).get(j).getAr());
            Double BPM = Double.parseDouble(Song.getBeatmap().get(i).get(j).getBpm());
            Double LEN = Double.parseDouble(Song.getBeatmap().get(i).get(j).getLength());
            if (
             (((C_CalendarEnabled.isSelected()) ? (fromMonth <= SongMonth && SongMonth <= toMonth) && (fromYear <= SongYear && SongYear <= toYear) : true) != false) ? (((C_HPrange.isSelected()) ? (HPmin <= HP && HP <= HPmax) : (HPmin >= HP && HP <= HPmax)) && ((C_CSrange.isSelected()) ? (CSmin <= CS && CS <= CSmax) : (CSmin >= CS && CS <= CSmax)) && ((C_ODrange.isSelected()) ? (ODmin <= OD && OD <= ODmax) : (ODmin >= OD && OD <= ODmax)) && ((C_ARrange.isSelected()) ? (ARmin <= AR && AR <= ARmax) : (ARmin >= AR && AR <= ODmax)) && ((C_BPMrange.isSelected()) ? (BPMmin <= BPM && BPM <= ARmax) : (BPMmin >= BPM && BPM <= BPMmax)) && ((C_Timerange.isSelected()) ? (Timemin <= LEN && LEN <= Timemax) : (Timemin >= LEN && LEN <= Timemax))) : false
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
   if (T_ARmin.getText().length() != 0)
    _ARmin = Double.parseDouble(T_ARmin.getText());
   else
    _ARmin = 9999.0;
   if (T_ARmax.getText().length() != 0 && C_ARrange.isSelected())
    _ARmax = Double.parseDouble(T_ARmax.getText());
   else
    _ARmax = 99999.0;
   if (T_CSmin.getText().length() != 0)
    _CSmin = Double.parseDouble(T_CSmin.getText());
   else
    _CSmin = 9999.0;
   if (T_CSmax.getText().length() != 0 && C_CSrange.isSelected())
    _CSmax = Double.parseDouble(T_CSmax.getText());
   else
    _CSmax = 99999.0;
   if (T_HPmin.getText().length() != 0)
    _HPmin = Double.parseDouble(T_HPmin.getText());
   else
    _HPmin = 9999.0;
   if (T_HPmax.getText().length() != 0 && C_HPrange.isSelected())
    _HPmax = Double.parseDouble(T_HPmax.getText());
   else
    _HPmax = 9999.0;
   if (T_BPMmin.getText().length() != 0)
    _BPMmin = Double.parseDouble(T_BPMmin.getText());
   else
    _BPMmin = 9999.0;
   if (T_BPMmax.getText().length() != 0 && C_BPMrange.isSelected())
    _BPMmax = Double.parseDouble(T_BPMmax.getText());
   else
    _BPMmax = 99999.0;
   if (T_Timemin.getText().length() != 0)
    _Timemin = Double.parseDouble(T_Timemin.getText());
   else
    _Timemin = 9999.0;
   if (T_Timemax.getText().length() != 0 && C_Timerange.isSelected())
    _Timemax = Double.parseDouble(T_Timemax.getText());
   else
    _Timemax = 99999.0;
   if (T_ODmin.getText().length() != 0)
    _ODmin = Double.parseDouble(T_ODmin.getText());
   else
    _ODmin = 9999.0;
   if (T_ODmax.getText().length() != 0 && C_ODrange.isSelected())
    _ODmax = Double.parseDouble(T_ODmax.getText());
   else
    _ODmax = 99999.0;
   if (T_Directory.getText().contains("_"))
    throw new Exception("Directory");
   if (C_OsuServer.isSelected())
    if (L_AccountAcept.getText().contains("_"))
     throw new Exception("Osu Account");
   return true;
  } catch (Exception e) {
   if (e.toString().contains("Directory")) {
    Alert("Open a correct Song Directory.");
   } else {
    if (e.toString().contains("Osu Account")) {
     Alert("You selected Osu! Server, Ingress a Correct Osu! Account, Click Login.");
    } else {
     Alert("Only Numbers.");
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
    private javax.swing.JCheckBox C_ARrange;
    private javax.swing.JCheckBox C_Aprove;
    private javax.swing.JCheckBox C_BPMrange;
    private javax.swing.JCheckBox C_CSrange;
    private javax.swing.JCheckBox C_CTB;
    private javax.swing.JCheckBox C_CalendarEnabled;
    private javax.swing.JCheckBox C_HPrange;
    private javax.swing.JCheckBox C_MANIA;
    private javax.swing.JCheckBox C_ODrange;
    private javax.swing.JCheckBox C_OsuServer;
    private javax.swing.JCheckBox C_Qualified;
    private javax.swing.JCheckBox C_Ranked;
    private javax.swing.JCheckBox C_STD;
    private javax.swing.JCheckBox C_TAIKO;
    private javax.swing.JCheckBox C_Timerange;
    private javax.swing.JCheckBox C_Unraked;
    private com.toedter.calendar.JMonthChooser Ca_fromMonth;
    private com.toedter.calendar.JYearChooser Ca_fromYear;
    private com.toedter.calendar.JMonthChooser Ca_toMonth;
    private com.toedter.calendar.JYearChooser Ca_toYear;
    private javax.swing.JFrame JFrame_Error;
    private javax.swing.JLabel L_AR;
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
    private javax.swing.JLabel L_max;
    private javax.swing.JLabel L_max1;
    private javax.swing.JLabel L_seconds;
    private javax.swing.JLabel L_server;
    private javax.swing.JLabel L_totalSize;
    private javax.swing.JList<String> List_prio;
    private javax.swing.JPanel P_AR;
    private javax.swing.JPanel P_AvanSearch;
    private javax.swing.JPanel P_BPM;
    private javax.swing.JPanel P_CS;
    private javax.swing.JPanel P_HP;
    private javax.swing.JPanel P_LoadDown;
    private javax.swing.JPanel P_OD;
    private javax.swing.JPanel P_Options;
    private javax.swing.JPanel P_OsuPanel;
    private javax.swing.JPanel P_PreAna;
    private javax.swing.JPanel P_SearchDate;
    private javax.swing.JPanel P_ServerPrio;
    private javax.swing.JPanel P_TIME;
    private javax.swing.JProgressBar Pro_ProgressBar;
    private javax.swing.JScrollPane Sc_Error;
    private javax.swing.JScrollPane Sc_Prio;
    private javax.swing.JSeparator Separetor;
    private javax.swing.JTextField T_ARmax;
    private javax.swing.JTextField T_ARmin;
    private javax.swing.JTextField T_BPMmax;
    private javax.swing.JTextField T_BPMmin;
    private javax.swing.JTextField T_CSmax;
    private javax.swing.JTextField T_CSmin;
    private javax.swing.JTextField T_Directory;
    private javax.swing.JTextPane T_Error;
    private javax.swing.JTextField T_HPmax;
    private javax.swing.JTextField T_HPmin;
    private javax.swing.JTextField T_ODmax;
    private javax.swing.JTextField T_ODmin;
    private javax.swing.JTextField T_SearchTerm;
    private javax.swing.JTextField T_Timemax;
    private javax.swing.JTextField T_Timemin;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables


}