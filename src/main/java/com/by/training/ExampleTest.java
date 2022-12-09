package com.by.training;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExampleTest {


    @Test
    public void test1() {
        Assert.assertEquals(1, 0+1);
    }


    @Test
    public void test2() {
        Assert.assertEquals(2, 1+1);
    }
}
