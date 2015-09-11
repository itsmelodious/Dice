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
	size(500, 600);
	noLoop();
}
public void draw()
{
	background(204, 255, 204);
	for(int y = 10; y <= 345; y += 165)
	{
		for(int x = 10; x <= 345; x += 165)
		{
			d = new Die(x, y);
			d.show();
			fill(204, 255, 204);
			noStroke();
			rect(0, 510, 500, 90);
			fill(0);
			textSize(35);
			text("Total: " + d.sum, 10, 550);
		}
	}			
}
public void mousePressed()
{
	redraw();
}
class Die //models one single dice cube
{
	int num, myX, myY, siz, sum;
	Die(int x, int y) //constructor
	{
		num = (int)(Math.random()*6)+1;
		myX = x;
		myY = y;
		siz = 35;
		sum = 0;
	}
	public void show()
	{
		fill(255);
		stroke(0);
		rect(myX, myY, 150, 150);
		fill(0);
		if (num == 1)
		{
			ellipse(myX + 75, myY + 75, siz, siz);
			sum += 1;
		}
		else if (num == 2)
		{
			ellipse(myX + 37.5f, myY + 37.5f, siz, siz);
			ellipse(myX + 112.5f, myY + 112.5f, siz, siz);
			sum += 2;
		}
		else if (num == 3)
		{
			ellipse(myX + 37.5f, myY + 37.5f, siz, siz);
			ellipse(myX + 112.5f, myY + 112.5f, siz, siz);
			ellipse(myX + 75, myY + 75, siz, siz);
			sum += 3;
		}
		else if (num == 4)
		{
			ellipse(myX + 37.5f, myY + 37.5f, siz, siz);
			ellipse(myX + 112.5f, myY + 112.5f, siz, siz);
			ellipse(myX + 112.5f, myY + 37.5f, siz, siz);
			ellipse(myX + 37.5f, myY + 112.5f, siz, siz);
			sum += 4;
		}
		else if (num == 5)
		{
			ellipse(myX + 37.5f, myY + 37.5f, siz, siz);
			ellipse(myX + 112.5f, myY + 112.5f, siz, siz);
			ellipse(myX + 112.5f, myY + 37.5f, siz, siz);
			ellipse(myX + 37.5f, myY + 112.5f, siz, siz);
			ellipse(myX + 75, myY + 75, siz, siz);
			sum += 5;
		}
		else if (num == 6)
		{
			ellipse(myX + 37.5f, myY + 37.5f, siz, siz);
			ellipse(myX + 112.5f, myY + 112.5f, siz, siz);
			ellipse(myX + 112.5f, myY + 37.5f, siz, siz);
			ellipse(myX + 37.5f, myY + 112.5f, siz, siz);
			ellipse(myX + 37.5f, myY + 75, siz, siz);
			ellipse(myX + 112.5f, myY + 75, siz, siz);
			sum += 6;
		}
		// else if (num == 2 || num == 3 || num == 4 || num == 5 || num == 6)
		// {
		// 	ellipse(myX + 37.5, myY + 37.5, siz, siz);
		// 	ellipse(myX + 112.5, myY + 112.5, siz, siz);
		// 	sum+=2;
		// 	if (num == 3)
		// 	{
		// 		ellipse(myX + 75, myY + 75, siz, siz);
		// 		sum+=3;
		// 	}
		// 	else if (num == 4 || num == 5 || num == 6)
		// 	{
		// 		ellipse(myX + 112.5, myY + 37.5, siz, siz);
		// 		ellipse(myX + 37.5, myY + 112.5, siz, siz);
		// 		if (num == 5)
		// 		{
		// 			ellipse(myX + 75, myY + 75, siz, siz);
		// 		}
		// 		else if (num == 6)
		// 		{
		// 			ellipse(myX + 37.5, myY + 75, siz, siz);
		// 			ellipse(myX + 112.5, myY + 75, siz, siz);
		// 		}
		// 	}
		// }
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
