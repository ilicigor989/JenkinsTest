package com.example.myfirsttest;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {

    @Test
    public void summ() {

        MainActivity ma=new MainActivity();
        int rez=ma.summ(5,9);
        assertEquals(14,rez);

    }
}