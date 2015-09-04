void setup()
{
	size(400,400);
	noLoop();
}
void draw()
{
	background(0);
	for(int x = 10; x < 400; x = x +20){
	Die bob = new Die(x,100);
	bob.show();
	
	}
}
void mousePressed()
{
	redraw();
}
class Die //models one single dice cube
{
	int numSide, myX, myY;
	Die(int x, int y) 
	{
 		myX = x;
 		myY = y;
 		numSide = (int)(Math.random()*6+1);
 	}
	void roll()
	{

	}
	void show()
	{
		fill(255);
		rect(myX, myY, 20,20);
	}
}
