Die d;

void setup()
{
	size(500, 600);
	noLoop();
}
void draw()
{
	int sum = 0;
	background(204, 255, 204);
	for(int y = 10; y <= 345; y += 165)
	{
		for(int x = 10; x <= 345; x += 165)
		{
			d = new Die(x, y);
			d.roll();
			d.show();
			fill(204, 255, 204);
			noStroke();
			rect(0, 510, 500, 90);
			fill(0);
			textSize(35);
			sum = sum + d.num;
			text("Total: " + sum, 10, 550);
		}
	}			
}
void mousePressed()
{
	redraw();
}
class Die //models one single dice cube
{
	int num, myX, myY, siz;
	Die(int x, int y) //constructor
	{
		myX = x;
		myY = y;
		siz = 35;
	}
	void roll()
	{
		num = (int)(Math.random()*6)+1;
	}
	void show()
	{
		fill(255);
		stroke(0);
		rect(myX, myY, 150, 150);
		fill(0);
		if (num == 1)
		{
			ellipse(myX + 75, myY + 75, siz, siz);
		}
		else if (num == 2)
		{
			ellipse(myX + 37.5, myY + 37.5, siz, siz);
			ellipse(myX + 112.5, myY + 112.5, siz, siz);
		}
		else if (num == 3)
		{
			ellipse(myX + 37.5, myY + 37.5, siz, siz);
			ellipse(myX + 112.5, myY + 112.5, siz, siz);
			ellipse(myX + 75, myY + 75, siz, siz);
		}
		else if (num == 4)
		{
			ellipse(myX + 37.5, myY + 37.5, siz, siz);
			ellipse(myX + 112.5, myY + 112.5, siz, siz);
			ellipse(myX + 112.5, myY + 37.5, siz, siz);
			ellipse(myX + 37.5, myY + 112.5, siz, siz);
		}
		else if (num == 5)
		{
			ellipse(myX + 37.5, myY + 37.5, siz, siz);
			ellipse(myX + 112.5, myY + 112.5, siz, siz);
			ellipse(myX + 112.5, myY + 37.5, siz, siz);
			ellipse(myX + 37.5, myY + 112.5, siz, siz);
			ellipse(myX + 75, myY + 75, siz, siz);
		}
		else if (num == 6)
		{
			ellipse(myX + 37.5, myY + 37.5, siz, siz);
			ellipse(myX + 112.5, myY + 112.5, siz, siz);
			ellipse(myX + 112.5, myY + 37.5, siz, siz);
			ellipse(myX + 37.5, myY + 112.5, siz, siz);
			ellipse(myX + 37.5, myY + 75, siz, siz);
			ellipse(myX + 112.5, myY + 75, siz, siz);
		}
	}
}
