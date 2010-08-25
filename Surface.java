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

public class Surface {
	private int data1[][];
	private int data2[][];
	private boolean UsingData2 = false;

	private int OffSetX;
	private int OffSetY;	

	public static enum color{
		RED,
		ORANGE,
		GREEN,
		BLUE,
		WHITE,
		YELLOW
	};

	/*
	 *  X1    X2   X3
	 * -----------------
	 * |    |    |    | Y1
	 * |    |    |    | 
	 * ----------------
	 * |    |    |    | Y2
	 * |    |    |    |
	 * ----------------
	 * |    |    |    | Y3
	 * |    |    |    |
	 * ----------------
	 */
	public static enum line {
		X1,X2,X3,
		Y1,Y2,Y3
	}
	
	public Surface(color type) {
		data1 = new int[3][3];
		data2 = new int[3][3];
		int color = 0;
		switch(type) {
			case BLUE:
				break;
			case ORANGE:
				color = 1;
				break;
			case YELLOW:
				color = 2;
				break;
			case GREEN:
				color = 3;
				break;
			case RED:
				color = 4;
				break;
			case WHITE:
				color = 5;
				break;
		}

		//set surface color
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				data1[i][j] = color;
				data2[i][j] = color;
			}
		}
	}

	public int[] getLine(line type,boolean reverse) {
		int lineData[] = new int[3];
		int lineDataTmp[] = new int[3];
		if(!UsingData2) {
			switch(type) {
				case X1:
					for(int i = 0; i < 3; i++) {
						lineData[i] = data1[0][i];
					}
					break;
				case X2:
					for(int i = 0; i < 3; i++) {
						lineData[i] = data1[1][i];
					}
					break;
				case X3:
					for(int i = 0; i < 3; i++) {
						lineData[i] = data1[2][i];
					}
					break;
				case Y1:
					for(int i = 0; i < 3; i++) {
						lineData[i] = data1[i][0];
					}
					break;
				case Y2:
					for(int i = 0; i < 3; i++) {
						lineData[i] = data1[i][1];
					}
					break;
				case Y3:
					for(int i = 0; i < 3; i++) {
						lineData[i] = data1[i][2];
					}
					break;
			}
		} else {
			switch(type) {
				case X1:
					for(int i = 0; i < 3; i++) {
						lineData[i] = data2[0][i];
					}
					break;
				case X2:
					for(int i = 0; i < 3; i++) {
						lineData[i] = data2[1][i];
					}
					break;
				case X3:
					for(int i = 0; i < 3; i++) {
						lineData[i] = data2[2][i];
					}
					break;
				case Y1:
					for(int i = 0; i < 3; i++) {
						lineData[i] = data2[i][0];
					}
					break;
				case Y2:
					for(int i = 0; i < 3; i++) {
						lineData[i] = data2[i][1];
					}
					break;
				case Y3:
					for(int i = 0; i < 3; i++) {
						lineData[i] = data2[i][2];
					}
					break;
			}
		}
		if(!reverse) {
			return lineData;
		} else {
			for(int i = 2; i >= 0; i--) {
				lineDataTmp[i] = lineData[2 - i];
			}
			return lineDataTmp;
		}
	}

	public void setLine(int[] newData,line type) {
		if(!UsingData2) {
			switch(type){
				case X1:
					for(int i = 0; i < 3; i++) {
						data1[0][i] = newData[i];
					}
					break;
				case X2:
					for(int i = 0; i < 3; i++) {
						data1[1][i] = newData[i];
					}
					break;
				case X3:
					for(int i = 0; i < 3; i++) {
						data1[2][i] = newData[i];
					}
					break;
				case Y1:
					for(int i = 0; i < 3; i++) {
						data1[i][0] = newData[i];
					}
					break;
				case Y2:
					for(int i = 0; i < 3; i++) {
						data1[i][1] = newData[i];
					}
					break;
				case Y3:
					for(int i = 0; i < 3; i++) {
						data1[i][2] = newData[i];
					}
					break;
			}
		} else {
			switch(type){
				case X1:
					for(int i = 0; i < 3; i++) {
						data2[0][i] = newData[i];
					}
					break;
				case X2:
					for(int i = 0; i < 3; i++) {
						data2[1][i] = newData[i];
					}
					break;
				case X3:
					for(int i = 0; i < 3; i++) {
						data2[2][i] = newData[i];
					}
					break;
				case Y1:
					for(int i = 0; i < 3; i++) {
						data2[i][0] = newData[i];
					}
					break;
				case Y2:
					for(int i = 0; i < 3; i++) {
						data2[i][1] = newData[i];
					}
					break;
				case Y3:
					for(int i = 0; i < 3; i++) {
						data2[i][2] = newData[i];
					}
					break;
			}
		}
//		UsingData2 = !UsingData2;
	}

	public void turnRight()
	{
		int new_x, new_y;
		//X
		for(int i = 0; i < 3; i++) {
			//Y
			for(int j = 0; j < 3; j++){
				new_x = 3 - j - 1;
				new_y = i;
				if(!UsingData2) {
					//マップのデータを回転させて
					data2[new_x][new_y] = data1[i][j];
				} else {
					//マップのデータを回転させる
					data1[new_x][new_y] = data2[i][j];
				}
			}
		}
		UsingData2 = !UsingData2;
	}

	public void turnLeft()
	{
		int new_x, new_y;
		//X
		for(int i = 0; i < 3; i++)
		{
			//Y
			for(int j = 0; j < 3; j++) 
			{
				new_x = j;
				new_y = 3 - i - 1;
				if(!UsingData2) {
					//マップのデータを回転させて
					data2[new_x][new_y] = data1[i][j];
				} else {
					//マップのデータを回転させる
					data1[new_x][new_y] = data2[i][j];
				}
			}
		}

		UsingData2 = !UsingData2; 
	}

	public void draw(Graphics g) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(!UsingData2) {
					switch(data1[i][j]) {
						case 0:
							g.setColor(Color.BLUE);
							break;
						case 1:
							g.setColor(Color.ORANGE);
							break;
						case 2:
							g.setColor(Color.YELLOW);
							break;
						case 3:
							g.setColor(Color.GREEN);
							break;
						case 4:
							g.setColor(Color.RED);
							break;
						case 5:
							g.setColor(Color.WHITE);
							break;
					}
					g.fillRect(OffSetX + i * 32, OffSetY + j * 32, 32, 32);
				} else {
					switch(data2[i][j]) {
						case 0:
							g.setColor(Color.BLUE);
							break;
						case 1:
							g.setColor(Color.ORANGE);
							break;
						case 2:
							g.setColor(Color.YELLOW);
							break;
						case 3:
							g.setColor(Color.GREEN);
							break;
						case 4:
							g.setColor(Color.RED);
							break;
						case 5:
							g.setColor(Color.WHITE);
							break;
					}
					g.fillRect(OffSetX + i * 32, OffSetY + j * 32, 32, 32);
				}
			}
		}
	}

	public void setOffset(int OffX, int OffY) {
		this.OffSetX = OffX;
		this.OffSetY = OffY;
	}
	
	//Return copy of surface(not pointer!!)
	public Surface copy() {
		//Ignoreable colore....
		Surface newSurf = new Surface(Surface.color.BLUE);
		//Copy AllData
		newSurf.setLine(this.getLine(Surface.line.X1,false), Surface.line.X1);
		newSurf.setLine(this.getLine(Surface.line.X2,false), Surface.line.X2);
		newSurf.setLine(this.getLine(Surface.line.X3,false), Surface.line.X3);
		//return new surface
		return newSurf;
	}
}
