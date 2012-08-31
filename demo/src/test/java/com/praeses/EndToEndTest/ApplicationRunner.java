/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.praeses.EndToEndTest;

import com.praeses.HelloAndroidActivity;
import com.praeses.R;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 *
 * @author dculpepper
 */
public class ApplicationRunner {

    private HelloAndroidActivity helloActivity = new HelloAndroidActivity();
    
    public ApplicationRunner() {
    }
    
    public void isNamed(String expectedName) {
        String actualName = helloActivity.getResources().getString(R.string.app_name);
        assertThat(actualName, equalTo(expectedName));
    }
}
