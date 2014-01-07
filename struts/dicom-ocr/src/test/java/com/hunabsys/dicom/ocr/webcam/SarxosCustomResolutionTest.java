/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hunabsys.dicom.ocr.webcam;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamResolution;
import java.awt.Dimension;
import java.io.File;
import javax.imageio.ImageIO;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * https://github.com/sarxos/webcam-capture/blob/master/webcam-capture/src/example/java/CustomResolutionExample.java
 *
 * @author Omar
 */
public class SarxosCustomResolutionTest {
    
    private static final String HELLO_WORLD_720_PNG = "hello-world-720.png";
    
    @Before
    public void setup() {
        File png = new File(HELLO_WORLD_720_PNG);
        if (png.exists()) {
            png.delete();
        }
    }
    
    @After
    public void cleanup() {
        File png = new File(HELLO_WORLD_720_PNG);
        if (png.exists()) {
            png.delete();
        }
    }

    @Test
    public void testResolution() throws Exception {
        Dimension[] nonStandardResolutions = new Dimension[]{
            WebcamResolution.PAL.getSize(),
            WebcamResolution.HD720.getSize(),
            new Dimension(2000, 1000),
            new Dimension(1000, 500)
        };
        
        Webcam webcam = Webcam.getDefault();
        webcam.setCustomViewSizes(nonStandardResolutions);
        webcam.setViewSize(WebcamResolution.HD720.getSize());
        webcam.open();
        
        ImageIO.write(webcam.getImage(), "PNG", new File(HELLO_WORLD_720_PNG));
        
        webcam.close();
    }

}
