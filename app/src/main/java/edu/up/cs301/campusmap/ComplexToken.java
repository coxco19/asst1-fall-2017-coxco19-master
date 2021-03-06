package edu.up.cs301.campusmap;

/**
 * Created by coxco19 on 9/3/2017.
 */

import android.graphics.Canvas;
import android.graphics.Paint;

import java.util.Random;

public class ComplexToken extends SimpleMapToken {



    protected float left; // my x coordinate
    protected float top; // my y coordinate
    protected float diameter = 36; //my diameter
    protected Paint paint;  //my color

    public ComplexToken(float xCoord, float yCoord) {
        // initialize the instance variables
        super(xCoord, yCoord);
        left = xCoord; // x-coordinate
        top = yCoord; // y-coordinate

        Random rand = new Random();

        int r = rand.nextInt(256); //red int
        int g = rand.nextInt(256); //green int
        int b = rand.nextInt(256); //blue int

        paint = new Paint(); // paint object
        paint.setARGB(255, r, g, b); //random color
    }

    @Override
    public void drawOn(Canvas canvas) {

        //Save and rotate canvas
        canvas.save();
        canvas.rotate(45, left, top);

        //Drawing a heart
        canvas.drawRect(left, top, diameter + left, diameter + top, paint);
        canvas.drawCircle(left, top + 18, 18, paint);
        canvas.drawCircle(left + 18, top , 18, paint);

        canvas.restore(); //restore canvas
    }//drawOn

}

