package edu.up.cs371.epp.photofunpattern;

import android.graphics.Color;

/**
 *  class BrightFilter changes the image manipulation behavior of its parent
 *  PhotoFilter to increase an image brightness by value of 100.
 *
 *  @author Edward C. Epp
 *  @version November 2017
 *  https://github.com/edcepp/PhotoFunPattern
 */

public class BrightnessFilter extends PhotoFilter {

    private final int ADJUSTMENT = 100;

    /*
    * tranformPixel This method overrides the transformPixel in the parent
    * class. It adds 100 to each RGB color component. The maxium value of each
    * component is limited to 255
    *
    * @param inPixel is a 32 bit pixel that contains RGB color values
    * @return a new Pixel in which each of the RGB components has been increased
    */
    public int transformPixel(int inPixel) {
        int brightness = SeekBarState.getInstance().getBrightnessDelta();
        int red = constrain(Color.red(inPixel) + brightness);
        int green = constrain(Color.green(inPixel) + brightness);
        int blue = constrain(Color.blue(inPixel) + brightness);
        int outPixel = Color.argb(Color.alpha(inPixel), red, green, blue);
        return outPixel;
    }

}
