package com.udacity.gradle.builditbigger;

/**
 * Created by pisoo on 8/12/2017.
 */

import org.junit.Assert;
import org.junit.Test;

 public class EndPointResonse {
    @Test
    public void testResponse() {
        String joke = String.valueOf(new EndpointsAsyncTask(null).doInBackground());
        Assert.assertNotNull (joke.isEmpty());
     }
}