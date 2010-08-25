/*
    Copyright (C) 2010  Masato Sogame
 
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
 * You can contact me by sending e-mail to < poketo7878@yahoo.co.jp >
 */ 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {
	private CubePanel cPanel;

	public Main() {
		cPanel = new CubePanel();
		getContentPane().add(cPanel);
		this.pack();
		this.setTitle("Rubics Crazy!!");
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.setVisible(true);
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
