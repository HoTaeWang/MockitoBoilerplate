package com.yunsoft;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainAppTest {

    @Test
    public void getGreeting() {
        MainApp classUnderTest = new MainApp();
        assertNotNull("MainApp has been started...", classUnderTest.getGreeting());
    }
}