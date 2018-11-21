package com.huawei.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProject8czj {

        Project8czjDelegate project8czjDelegate = new Project8czjDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = project8czjDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}