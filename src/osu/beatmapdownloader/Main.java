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

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {
 public static void main(String args[]) {
  try {
   UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
  } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
   System.out.println("Unable to load Windows look and feel");
  }

  JFrame frame = new JFrame();
  frame.setTitle("Osu! Masive Beatmap Downloader");
  frame.setLocationRelativeTo(null);
  frame.pack();
  frame.setVisible(true);
 }
 

}