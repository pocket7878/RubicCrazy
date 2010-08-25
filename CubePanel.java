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

public class CubePanel extends JPanel implements KeyListener{
	private Cube cube;

	public CubePanel() {
		this.setPreferredSize(new Dimension(408,282));
		cube = new Cube();
		addKeyListener(this);
		setFocusable(true);
		System.out.println(AnswerString.Reverse(cube.makeRandomState(30)));
	}

	public void paintComponent(Graphics g) {
		//Super Class's paintComponent
		super.paintComponent(g);
		cube.draw(g);
	}

	public void keyTyped(KeyEvent e) {
	}

	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_A) {
			cube.A();
			
		} else if(e.getKeyCode() == KeyEvent.VK_B) {
			cube.B();
			
		} else if(e.getKeyCode() == KeyEvent.VK_C) {
			cube.C();
			
		} else if(e.getKeyCode() == KeyEvent.VK_D) {
			cube.D();
			
		} else if(e.getKeyCode() == KeyEvent.VK_E) {
			cube.E();
			
		} else if(e.getKeyCode() == KeyEvent.VK_F) {
			cube.F();
			
		} else if(e.getKeyCode() == KeyEvent.VK_G) {
			cube.G();
			
		} else if(e.getKeyCode() == KeyEvent.VK_H) {
			cube.H();
			
		} else if(e.getKeyCode() == KeyEvent.VK_I) {
			cube.I();
			
		} else if(e.getKeyCode() == KeyEvent.VK_J) {
			cube.J();
			
		} else if(e.getKeyCode() == KeyEvent.VK_K) {
			cube.K();
			
		} else if(e.getKeyCode() == KeyEvent.VK_L) {
			cube.L();
			
		} else if(e.getKeyCode() == KeyEvent.VK_M) {
			cube.M();
			
		} else if(e.getKeyCode() == KeyEvent.VK_N) {
			cube.N();
			
		} else if(e.getKeyCode() == KeyEvent.VK_O) {
			cube.O();
			
		} else if(e.getKeyCode() == KeyEvent.VK_P) {
			cube.P();
			
		} else if(e.getKeyCode() == KeyEvent.VK_Q) {
			cube.Q();
			
		} else if(e.getKeyCode() == KeyEvent.VK_R) {
			cube.R();
			
		}
		repaint();
	}

	public void keyReleased(KeyEvent e) {
	}
}
