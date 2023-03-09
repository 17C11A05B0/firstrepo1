package org.example;

import org.testng.annotations.*;

public class testng1 {

    @BeforeClass
    void setup()
    {
        System.out.println("before class");
    }
    @BeforeMethod
    void BM()

    {
        System.out.println("Before AM");
    }
    @Test(priority=0)
    void test()
    {
        System.out.println("in test 1");
    }
    @Test(priority=1)
    void test2()
    {
        System.out.println("in a test 2");
    }
    @AfterMethod
    void Am()
    {
        System.out.println("After Am");
    }
    @AfterClass

    void Ac()
    {
        System.out.println("After class");
    }





}
