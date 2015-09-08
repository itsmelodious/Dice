Die one;

void setup()
{
	size(500, 500);
	noLoop();
}
void draw()
{
	background(204, 255, 204);
	one = new Die(10, 10);
	one.show();
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
		//num = (int)(Math.random()*6)+1;
		num = 2;
		myX = x;
		myY = y;
		siz = 35;
	}
	void roll()
	{
		//your code here
	}
	void show()
	{
		fill(255);
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
			// code here
		}
		else if (num == 4)
		{
			// code here
		}
		else if (num == 5)
		{
			// code here
		}
		else if (num == 6)
		{
			// code here
		}
	}
}
