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
import java.util.*;

public class Cube {
	//SixSurface
	private Surface surf0;
	private Surface surf1;
	private Surface surf2;
	private Surface surf3;
	private Surface surf4;
	private Surface surf5;
	private Surface tmpSurf;

	public Cube() {
		surf0 = new Surface(Surface.color.BLUE);
		surf1 = new Surface(Surface.color.ORANGE);
		surf2 = new Surface(Surface.color.YELLOW);
		surf3 = new Surface(Surface.color.GREEN);
		surf4 = new Surface(Surface.color.RED);
		surf5 = new Surface(Surface.color.WHITE);

		surf0.setOffset(30,30);
		surf1.setOffset(156,30);
		surf2.setOffset(282,30);
		surf3.setOffset(30,156);
		surf4.setOffset(156,156);
		surf5.setOffset(282,156);
	}

	public void A() {
		//turn side
		tmpSurf = surf0.copy();
		surf0.setLine(surf3.getLine(Surface.line.X3,false), Surface.line.X3);
		surf3.setLine(surf5.getLine(Surface.line.X1,true), Surface.line.X3);
		surf5.setLine(surf2.getLine(Surface.line.X3,true),Surface.line.X1);
		surf2.setLine(tmpSurf.getLine(Surface.line.X3,false),Surface.line.X3);
		//turn surf
		surf4.turnLeft();
	}

	public void B() {
		//turn side
		tmpSurf = surf0.copy();
		surf0.setLine(surf3.getLine(Surface.line.X2,false), Surface.line.X2);
		surf3.setLine(surf5.getLine(Surface.line.X2,true), Surface.line.X2);
		surf5.setLine(surf2.getLine(Surface.line.X2,true),Surface.line.X2);
		surf2.setLine(tmpSurf.getLine(Surface.line.X2,false),Surface.line.X2);
	}
	public void C() { 
		//turn side
		tmpSurf = surf0.copy();
		surf0.setLine(surf3.getLine(Surface.line.X1,false), Surface.line.X1);
		surf3.setLine(surf5.getLine(Surface.line.X3,true), Surface.line.X1);
		surf5.setLine(surf2.getLine(Surface.line.X1,true),Surface.line.X3);
		surf2.setLine(tmpSurf.getLine(Surface.line.X1,false),Surface.line.X1);
		//turn surf
		surf1.turnRight();
	}


	public void D() {
		//turn side
		tmpSurf = surf0.copy();
		surf0.setLine(surf2.getLine(Surface.line.X3,false), Surface.line.X3);
		surf2.setLine(surf5.getLine(Surface.line.X1,true), Surface.line.X3);
		surf5.setLine(surf3.getLine(Surface.line.X3,true),Surface.line.X1);
		surf3.setLine(tmpSurf.getLine(Surface.line.X3,false),Surface.line.X3);
		//turn surf
		surf4.turnRight();
	}

	public void E() {
		//turn side
		tmpSurf = surf0.copy();
		surf0.setLine(surf2.getLine(Surface.line.X2,false), Surface.line.X2);
		surf2.setLine(surf5.getLine(Surface.line.X2,true), Surface.line.X2);
		surf5.setLine(surf3.getLine(Surface.line.X2,true),Surface.line.X2);
		surf3.setLine(tmpSurf.getLine(Surface.line.X2,false),Surface.line.X2);
	}

	public void F() {
		//turn side
		tmpSurf = surf0.copy();
		surf0.setLine(surf2.getLine(Surface.line.X1,false), Surface.line.X1);
		surf2.setLine(surf5.getLine(Surface.line.X3,true), Surface.line.X1);
		surf5.setLine(surf3.getLine(Surface.line.X1,true),Surface.line.X3);
		surf3.setLine(tmpSurf.getLine(Surface.line.X1,false),Surface.line.X1);
		//turn surf
		surf1.turnLeft();
	}


	//Right Side
	public void G() {
		//turn side
		tmpSurf = surf4.copy();
		surf4.setLine(surf3.getLine(Surface.line.Y1,false), Surface.line.X3);
		surf3.setLine(surf1.getLine(Surface.line.X1,true), Surface.line.Y1);
		surf1.setLine(surf2.getLine(Surface.line.Y3,false),Surface.line.X1);
		surf2.setLine(tmpSurf.getLine(Surface.line.X3,true),Surface.line.Y3);
		//turn surf
		surf5.turnLeft();
	}

	public void H() {
		//turn side
		tmpSurf = surf4.copy();
		surf4.setLine(surf3.getLine(Surface.line.Y2,false), Surface.line.X2);
		surf3.setLine(surf1.getLine(Surface.line.X2,true), Surface.line.Y2);
		surf1.setLine(surf2.getLine(Surface.line.Y2,false),Surface.line.X2);
		surf2.setLine(tmpSurf.getLine(Surface.line.X2,true),Surface.line.Y2);
	}

	public void I() {
		//turn side
		tmpSurf = surf4.copy();
		surf4.setLine(surf3.getLine(Surface.line.Y3,false), Surface.line.X1);
		surf3.setLine(surf1.getLine(Surface.line.X3,true), Surface.line.Y3);
		surf1.setLine(surf2.getLine(Surface.line.Y1,false),Surface.line.X3);
		surf2.setLine(tmpSurf.getLine(Surface.line.X1,true),Surface.line.Y1);
		//turn surf
		surf0.turnRight();
	}


	public void J() {
		//turn side
		tmpSurf = surf4.copy();
		surf4.setLine(surf2.getLine(Surface.line.Y3,true), Surface.line.X3);
		surf2.setLine(surf1.getLine(Surface.line.X1,false),Surface.line.Y3);
		surf1.setLine(surf3.getLine(Surface.line.Y1,true),Surface.line.X1);
		surf3.setLine(tmpSurf.getLine(Surface.line.X3,false), Surface.line.Y1);
		//turn surf
		surf5.turnRight();
	}

	public void K() {
		//turn side
		tmpSurf = surf4.copy();
		surf4.setLine(surf2.getLine(Surface.line.Y2,true), Surface.line.X2);
		surf2.setLine(surf1.getLine(Surface.line.X2,false),Surface.line.Y2);
		surf1.setLine(surf3.getLine(Surface.line.Y2,true),Surface.line.X2);
		surf3.setLine(tmpSurf.getLine(Surface.line.X2,false), Surface.line.Y2);
	}

	public void L() {
		//turn side
		tmpSurf = surf4.copy();
		surf4.setLine(surf2.getLine(Surface.line.Y1,true), Surface.line.X1);
		surf2.setLine(surf1.getLine(Surface.line.X3,false),Surface.line.Y1);
		surf1.setLine(surf3.getLine(Surface.line.Y3,true),Surface.line.X3);
		surf3.setLine(tmpSurf.getLine(Surface.line.X1,false), Surface.line.Y3);
		//turn surf
		surf0.turnLeft();
	}

	//TopSide
	public void M() {
		//turn side
		tmpSurf = surf0.copy();
		surf0.setLine(surf1.getLine(Surface.line.Y1,false), Surface.line.Y1);
		surf1.setLine(surf5.getLine(Surface.line.Y1,false), Surface.line.Y1);
		surf5.setLine(surf4.getLine(Surface.line.Y1,false), Surface.line.Y1);
		surf4.setLine(tmpSurf.getLine(Surface.line.Y1,false), Surface.line.Y1);
		//turn surf
		surf3.turnLeft();
	}

	public void N() {
		//turn side
		tmpSurf = surf0.copy();
		surf0.setLine(surf1.getLine(Surface.line.Y2,false), Surface.line.Y2);
		surf1.setLine(surf5.getLine(Surface.line.Y2,false), Surface.line.Y2);
		surf5.setLine(surf4.getLine(Surface.line.Y2,false), Surface.line.Y2);
		surf4.setLine(tmpSurf.getLine(Surface.line.Y2,false), Surface.line.Y2);
	}

	public void O() {
		//turn side
		tmpSurf = surf0.copy();
		surf0.setLine(surf1.getLine(Surface.line.Y3,false), Surface.line.Y3);
		surf1.setLine(surf5.getLine(Surface.line.Y3,false), Surface.line.Y3);
		surf5.setLine(surf4.getLine(Surface.line.Y3,false), Surface.line.Y3);
		surf4.setLine(tmpSurf.getLine(Surface.line.Y3,false), Surface.line.Y3);
		//turn surf
		surf2.turnRight();
	}


	public void P() {
		//turn side
		tmpSurf = surf0.copy();
		surf0.setLine(surf4.getLine(Surface.line.Y1,false), Surface.line.Y1);
		surf4.setLine(surf5.getLine(Surface.line.Y1,false), Surface.line.Y1);
		surf5.setLine(surf1.getLine(Surface.line.Y1,false), Surface.line.Y1);
		surf1.setLine(tmpSurf.getLine(Surface.line.Y1,false), Surface.line.Y1);
		//turn surf
		surf3.turnRight();
	}

	public void Q() {
		//turn side
		tmpSurf = surf0.copy();
		surf0.setLine(surf4.getLine(Surface.line.Y2,false), Surface.line.Y2);
		surf4.setLine(surf5.getLine(Surface.line.Y2,false), Surface.line.Y2);
		surf5.setLine(surf1.getLine(Surface.line.Y2,false), Surface.line.Y2);
		surf1.setLine(tmpSurf.getLine(Surface.line.Y2,false), Surface.line.Y2);
	}

	public void R() {
		//turn side
		tmpSurf = surf0.copy();
		surf0.setLine(surf4.getLine(Surface.line.Y3,false), Surface.line.Y3);
		surf4.setLine(surf5.getLine(Surface.line.Y3,false), Surface.line.Y3);
		surf5.setLine(surf1.getLine(Surface.line.Y3,false), Surface.line.Y3);
		surf1.setLine(tmpSurf.getLine(Surface.line.Y3,false), Surface.line.Y3);
		//turn surf
		surf2.turnLeft();
	}

	//daraw method
	public void draw(Graphics g) {
		surf0.draw(g);
		surf1.draw(g);
		surf2.draw(g);
		surf3.draw(g);
		surf4.draw(g);
		surf5.draw(g);
	}

	public String makeRandomState(int n) {
		Random rnd = new Random();
		String answer = "";
		int m;
		for(int i = 0; i < n; i++) {
			m = rnd.nextInt(18);
			switch(m) {
				case 0:
					this.A();
					answer = answer + "D";
					break;
				case 1:
					this.B();
					answer = answer + "E";
					break;
				case 2:
					this.C();
					answer = answer + "F";
					break;
				case 3:
					this.D();
					answer = answer + "A";
					break;
				case 4:
					this.E();
					answer = answer + "B";
					break;
				case 5:
					this.F();
					answer = answer + "C";
					break;
				case 6:
					this.G();
					answer = answer + "J";
					break;
				case 7:
					this.H();
					answer = answer + "K";
					break;
				case 8:
					this.I();
					answer = answer + "L";
					break;
				case 9:
					this.J();
					answer = answer + "G";
					break;
				case 10:
					this.K();
					answer = answer + "H";
					break;
				case 11:
					this.L();
					answer = answer + "I";
					break;
				case 12:
					this.M();
					answer = answer + "P";
					break;
				case 13:
					this.N();
					answer = answer + "Q";
					break;
				case 14:
					this.O();
					answer = answer + "R";
					break;
				case 15:
					this.P();
					answer = answer + "M";
					break;
				case 16:
					this.Q();
					answer = answer + "N";
					break;
				case 17:
					this.R();
					answer = answer + "O";
					break;
				default:
					break;
			}
		}
		return answer;
	}
}
