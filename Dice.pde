void setup()
{
	size(800,800);
	noLoop();
}
void draw()
{
	background(0);
	int sum = 0;
	for(int y = 102; y < 800; y = y + 25){
		for(int x = 2; x < 800; x = x + 25){
		Die bob = new Die(x,y);
		bob.show();
		bob.roll();
	
		sum = sum + bob.numSide;

		}
	}
	fill(255);
	textSize(40);
	text("Total of all Dice:", 260,30);
	text(sum, 350,70);

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
		if(numSide == 1){
			fill(0);
			ellipse(myX + 10, myY + 10, 2, 2);
		} else if(numSide == 2){
			fill(0);
			ellipse(myX + 5, myY + 5, 2, 2);
			ellipse(myX + 15, myY + 15, 2, 2);
		} else if(numSide == 3){
			fill(0);
			ellipse(myX + 5, myY + 5, 2, 2);
			ellipse(myX + 10, myY + 10, 2, 2);
			ellipse(myX + 15, myY + 15, 2, 2);
		} else if(numSide == 4){
			fill(0);
			ellipse(myX + 5, myY + 5, 2, 2);
			ellipse(myX + 5, myY + 15, 2, 2);
			ellipse(myX + 15, myY + 5, 2, 2);
			ellipse(myX + 15, myY + 15, 2, 2);
		} else if(numSide == 5){
			fill(0);
			ellipse(myX + 5, myY + 5, 2, 2);
			ellipse(myX + 5, myY + 15, 2, 2);
			ellipse(myX + 15, myY + 5, 2, 2);
			ellipse(myX + 15, myY + 15, 2, 2);
			ellipse(myX + 10, myY + 10, 2, 2);			
		} else {
			fill(0);
			ellipse(myX + 5, myY + 5, 2, 2);
			ellipse(myX + 5, myY + 10, 2, 2);
			ellipse(myX + 5, myY + 15, 2, 2);
			ellipse(myX + 15, myY + 5, 2, 2);
			ellipse(myX + 15, myY + 10, 2, 2);
			ellipse(myX + 15, myY + 15, 2, 2);
		}
	}
	void show()
	{
		fill(0,(int)(Math.random()*206+50),(int)(Math.random()*206+50));
		rect(myX, myY, 20,20,5);
	}
}
