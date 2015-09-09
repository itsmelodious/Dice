import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {

Die d;

public void setup()
{
	size(500, 500);
	noLoop();
}
public void draw()
{
	background(204, 255, 204);
	d = new Die(10, 10);
	d.show();			
}
public void mousePressed()
{
	redraw();
}
class Die //models one single dice cube
{
	int num, myX, myY, siz;
	Die(int x, int y) //constructor
	{
		num = (int)(Math.random()*6)+1;
		myX = x;
		myY = y;
		siz = 35;
	}
	public void roll()
	{
		//your code here
	}
	public void show()
	{
		fill(255);
		rect(myX, myY, 150, 150);
		fill(0);
		if (num == 1)
		{
			ellipse(myX + 75, myY + 75, siz, siz);
		}
		else if (num == 2 || num == 3 || num == 4 || num == 5 || num == 6)
		{
			ellipse(myX + 37.5f, myY + 37.5f, siz, siz);
			ellipse(myX + 112.5f, myY + 112.5f, siz, siz);
			if (num == 3)
			{
				ellipse(myX + 75, myY + 75, siz, siz);
			}
			else if (num == 4 || num == 5 || num == 6)
			{
				ellipse(myX + 112.5f, myY + 37.5f, siz, siz);
				ellipse(myX + 37.5f, myY + 112.5f, siz, siz);
				if (num == 5)
				{
					ellipse(myX + 75, myY + 75, siz, siz);
				}
				else if (num == 6)
				{
					ellipse(myX + 37.5f, myY + 75, siz, siz);
					ellipse(myX + 112.5f, myY + 75, siz, siz);
				}
			}
		}
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
