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

public void setup()
{
	size(800,800);
	noLoop();
}
public void draw()
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
public void mousePressed()
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
	public void roll()
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
	public void show()
	{
		fill(0,(int)(Math.random()*206+50),(int)(Math.random()*206+50));
		rect(myX, myY, 20,20,5);
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
