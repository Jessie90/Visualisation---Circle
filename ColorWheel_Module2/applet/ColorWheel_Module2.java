import processing.core.*; 
import processing.xml.*; 

import java.applet.*; 
import java.awt.Dimension; 
import java.awt.Frame; 
import java.awt.event.MouseEvent; 
import java.awt.event.KeyEvent; 
import java.awt.event.FocusEvent; 
import java.awt.Image; 
import java.io.*; 
import java.net.*; 
import java.text.*; 
import java.util.*; 
import java.util.zip.*; 
import java.util.regex.*; 

public class ColorWheel_Module2 extends PApplet {

/**
 * Subtractive Color Wheel 
 * by Ira Greenberg. 
 * 
 * The primaries are red, yellow, and blue. The secondaries are green, 
 * purple, and orange. The tertiaries are  yellow-orange, red-orange, 
 * red-purple, blue-purple, blue-green, and yellow-green.
 * 
 * Create a shade or tint of the subtractive color wheel using
 * SHADE or TINT parameters.
 *
 * Updated 26 February 2010.
 */

int segs = 24;
int steps = 2;
float rotAdjust = TWO_PI / segs / 2;
float radius;
float segWidth;
float interval = TWO_PI / segs;


public void setup() {
  size(200, 200);
  background(127);
  smooth();
  ellipseMode(RADIUS);
  noStroke();
  // make the diameter 90% of the sketch area
  radius = min(width, height) * 0.45f;
  segWidth = radius / steps;
  
  // swap which line is commented out to draw the other version
  //drawTintWheel();
  drawShadeWheel();
}


public void drawShadeWheel() {
  for (int j = 0; j < steps; j++) {
    int[] cols = { 
      color(255-(255/steps)*j, 255-(255/steps)*j, 0), 
      color(255-(255/steps)*j, 255-(255/steps)*j, 0), 
      color(255-(255/steps)*j, 255-(255/steps)*j, 0), 
      color(255-(255/steps)*j, 255-(255/steps)*j, 0), 
      color(255-(255/steps)*j, 255-(255/steps)*j, 0), 
      color(255-(255/steps)*j, 255-(255/steps)*j, 0), 
      color(255-(255/steps)*j, 255-(255/steps)*j, 0), 
      color(255-(255/steps)*j, 255-(255/steps)*j, 0), 
      color(255-(255/steps)*j, 255-(255/steps)*j, 0), 
      color(255-(255/steps)*j, 255-(255/steps)*j, 0), 
      color(255-(255/steps)*j, 255-(255/steps)*j, 0), 
      color(255-(255/steps)*j, 255-(255/steps)*j, 0),
      color(255-(255/steps)*j, 255-(255/steps)*j, 0), 
      color(255-(255/steps)*j, 255-(255/steps)*j, 0), 
      color(255-(255/steps)*j, 255-(255/steps)*j, 0), 
      color(255-(255/steps)*j, 255-(255/steps)*j, 0), 
      color(255-(255/steps)*j, 255-(255/steps)*j, 0), 
      color(255-(255/steps)*j, 255-(255/steps)*j, 0), 
      color(255-(255/steps)*j, 255-(255/steps)*j, 0), 
      color(255-(255/steps)*j, 255-(255/steps)*j, 0), 
      color(255-(255/steps)*j, 255-(255/steps)*j, 0), 
      color(255-(255/steps)*j, 255-(255/steps)*j, 0), 
      color(255-(255/steps)*j, 255-(255/steps)*j, 0), 
      color(255-(255/steps)*j, 255-(255/steps)*j, 0), 

    };
    for (int i = 0; i < segs; i++) {
      fill(cols[i]);
      arc(width/2, height/2, radius, radius, 
          interval*i+rotAdjust, interval*(i+1)+rotAdjust);
    }
    radius -= segWidth;
  }
}


public void drawTintWheel() {
  for (int j = 0; j < steps; j++) {
    int[] cols = { 
      color((255/steps)*j, (255/steps)*j, 0), 
      color((255/steps)*j, (255/steps)*j, 0),
      color((255/steps)*j, (255/steps)*j, 0),
      color((255/steps)*j, (255/steps)*j, 0),
      color((255/steps)*j, (255/steps)*j, 0),
      color((255/steps)*j, (255/steps)*j, 0),
      color((255/steps)*j, (255/steps)*j, 0),
      color((255/steps)*j, (255/steps)*j, 0),
      color((255/steps)*j, (255/steps)*j, 0),
      color((255/steps)*j, (255/steps)*j, 0),
      color((255/steps)*j, (255/steps)*j, 0),
      color((255/steps)*j, (255/steps)*j, 0),
      color((255/steps)*j, (255/steps)*j, 0), 
      color((255/steps)*j, (255/steps)*j, 0),
      color((255/steps)*j, (255/steps)*j, 0),
      color((255/steps)*j, (255/steps)*j, 0),
      color((255/steps)*j, (255/steps)*j, 0),
      color((255/steps)*j, (255/steps)*j, 0),
      color((255/steps)*j, (255/steps)*j, 0),
      color((255/steps)*j, (255/steps)*j, 0),
      color((255/steps)*j, (255/steps)*j, 0),
      color((255/steps)*j, (255/steps)*j, 0),
      color((255/steps)*j, (255/steps)*j, 0),
      color((255/steps)*j, (255/steps)*j, 0),
    };
    for (int i = 0; i < segs; i++) {
      fill(cols[i]);
      arc(width/2, height/2, radius, radius, 
          interval*i+rotAdjust, interval*(i+1)+rotAdjust);
    }
    radius -= segWidth;
  }
}
  static public void main(String args[]) {
    PApplet.main(new String[] { "--bgcolor=#FFFFFF", "ColorWheel_Module2" });
  }
}
