package com.vytrack.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp() {
        System.out.println("\tThis is coming from BEFORE.");
    }

    @After
    public void tearDown() {
        System.out.println("\tThis is coming from AFTER.");

    }

    @Before("@db")
    public void setUpdb() {
        System.out.println("\tThis is coming from BEFORE.");
    }

    @After("@db")
    public void closedb() {
        System.out.println("\tThis is coming from AFTER.");

    }

}
