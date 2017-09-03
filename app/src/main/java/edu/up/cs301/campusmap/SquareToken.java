package edu.up.cs301.campusmap;

/**
 * Created by coxco19 on 9/3/2017.
 */


        import android.graphics.Canvas;
        import android.graphics.Color;
        import android.graphics.Paint;
        import java.util.Random;

public class SquareToken extends SimpleMapToken {
    protected float left; // my x coordinate
    protected float top; // my y coordinate
    protected float diameter; //my diameter
    protected Paint paint;  //my color

    public SquareToken(float xCoord, float yCoord) {
        // initialize the instance variables
        super(xCoord,yCoord);
        left = xCoord; // x-coordinate
        top = yCoord; // y-coordinate
        diameter = 30; // diameter of square
        Random rand= new Random();

        int r = rand.nextInt(256); //red int
        int g = rand.nextInt(256); //green int
        int b = rand.nextInt(256); //blue int

        paint = new Paint(); // paint object
        paint.setARGB(255, r,g,b); //random color
    }
    public void drawOn(Canvas canvas) {
        // paint the dot on the canvas
        canvas.drawRect(left, top, diameter + left, diameter + top, paint);
    }//drawOn

}
