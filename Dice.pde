Die d;

void setup()
{
	size(500, 500);
	noLoop();
}
void draw()
{
	background(204, 255, 204);
	d = new Die(10, 10);
	d.show();			
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
		num = (int)(Math.random()*6)+1;
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
		else if (num == 2 || num == 3 || num == 4 || num == 5 || num == 6)
		{
			ellipse(myX + 37.5, myY + 37.5, siz, siz);
			ellipse(myX + 112.5, myY + 112.5, siz, siz);
			if (num == 3)
			{
				ellipse(myX + 75, myY + 75, siz, siz);
			}
			else if (num == 4 || num == 5 || num == 6)
			{
				ellipse(myX + 112.5, myY + 37.5, siz, siz);
				ellipse(myX + 37.5, myY + 112.5, siz, siz);
				if (num == 5)
				{
					ellipse(myX + 75, myY + 75, siz, siz);
				}
				else if (num == 6)
				{
					ellipse(myX + 37.5, myY + 75, siz, siz);
					ellipse(myX + 112.5, myY + 75, siz, siz);
				}
			}
		}
	}
}
