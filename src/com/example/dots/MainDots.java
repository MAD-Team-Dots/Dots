package com.example.dots;

import sofia.graphics.Color;
import sofia.graphics.OvalShape;
import sofia.graphics.LineShape;
import sofia.graphics.RectangleShape;
import sofia.app.*;

// -------------------------------------------------------------------------
/**
 * The main class for the Dots game. This contains the commands for the main
 * dots screen.
 *
 * @author Jonathan Downs
 * @author Matthew Gross
 * @author Jason Hall
 * @version 0.1
 */
public class MainDots
    extends ShapeScreen
{
    private OvalShape dot;
    private LineShape line;
    private RectangleShape rect;
    private float     startX;
    private float     startY;
    private int       numPixels;
    private int       squareSize;


    /**
     * Sets up elements of the class when this screen first pops up.
     */
    public void initialize()
    {
        float x = this.getWidth() / 4; // x and y find the coordinates of
        float y = this.getHeight() / 4; // the dots.
        float addX = this.getWidth() / 8; // addX and addY make it so the
        float addY = this.getHeight() / 8; // coordinates are in the appropriate
        x = Math.min(x, y); // position.
        addX = Math.min(addX, addY);

        for (int i = 0; i < 4; i++)
        {
            float xCoor = (i * x) + addX;

            for (int j = 0; j < 4; j++)
            {
                float yCoor = (j * x) + addX;
                dot = new OvalShape(xCoor, yCoor, 4);
                dot.setFilled(true);
                dot.setColor(Color.black);
                dot.setFillColor(Color.black);
                this.add(dot);
            }
        }

        numPixels = (int)Math.min(this.getWidth(), this.getHeight());
        squareSize = numPixels / 4;
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                rect =
                    new RectangleShape(i * squareSize, j * squareSize, i * squareSize
                        + squareSize, j * squareSize + squareSize);
                rect.setColor(Color.clear);
                this.add(rect);
            }
        }
    }


    /**
     * What happens when the "Quit to Menu" button is clicked.
     */
    public void quitClicked()
    {
        finish();
    }


    /**
     * What happens when the "Reset" button is clicked.
     */
    public void resetClicked()
    {
        // To be implemented.
    }


    /**
     * What happens when the screen is touched.
     *
     * @param x
     *            The x coordinate of where the screen is touched.
     * @param y
     *            The y coordinate of where the screen is touched.
     */
    public void onTouchDown(float x, float y)
    {
        startX = x;
        startY = y;
    }


    /**
     * What happens when the screen is dragged.
     *
     * @param x
     *            The x coordinate of where the screen is dragged to.
     * @param y
     *            The y coordinate of where the screen is dragged to.
     */
    public void onTouchMove(float x, float y)
    {
        line = new LineShape(startX, startY, x, y);
        this.add(line);
    }
}
