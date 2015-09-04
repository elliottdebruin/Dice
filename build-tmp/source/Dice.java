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
	size(400,400);
	noLoop();
}
public void draw()
{
	background(0);
	for(int x = 10; x < 400; x = x +20){
	Die bob = new Die(x,100);
	bob.show();
	
	}
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

	}
	public void show()
	{
		fill(255);
		rect(myX, myY, 20,20);
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
