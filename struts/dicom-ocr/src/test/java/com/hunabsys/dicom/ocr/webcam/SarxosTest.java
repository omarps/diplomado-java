/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hunabsys.dicom.ocr.webcam;

import com.github.sarxos.webcam.Webcam;
import java.io.File;
import javax.imageio.ImageIO;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Omar
 */
public class SarxosTest {
    
    private static final String HELLO_WORLD_PNG = "hello-world.png";
    
    @Before
    public void setup() {
        File png = new File(HELLO_WORLD_PNG);
        if (png.exists()) {
            png.delete();
        }
    }
    
    @After
    public void cleanup() {
        File png = new File(HELLO_WORLD_PNG);
        if (png.exists()) {
            png.delete();
        }
    }
    
    @Test
    public void testSarxos() throws Exception {
        Webcam webcam = Webcam.getDefault();
        webcam.open();
        ImageIO.write(webcam.getImage(), "PNG", new File(HELLO_WORLD_PNG));
        webcam.close();
    }
    
}
