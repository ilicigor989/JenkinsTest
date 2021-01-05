package com.example.myfirsttest;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {

    @Test
    public void summ() {

        MainActivity ma=new MainActivity();
        int rez=ma.summ(5,6);
        assertEquals(11,rez);


    }
}