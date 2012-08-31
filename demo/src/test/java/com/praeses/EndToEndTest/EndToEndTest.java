/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.praeses.EndToEndTest;

import com.xtremelabs.robolectric.RobolectricTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 *
 * @author dculpepper
 */
@RunWith(RobolectricTestRunner.class)
public class EndToEndTest {
    
    private ApplicationRunner application = new ApplicationRunner();
    
    public EndToEndTest() {
    }
    
    @Test
    public void applicationHasCorrectName() {
        application.isNamed("demo");
    }
}
