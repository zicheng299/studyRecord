package com.demo;

import org.junit.Test;
import io.vavr.control.Option;

public class VAVR {


    @Test
    public void test(){
        Object orElse = Option.of(null).getOrElse(-1);
        System.out.println(orElse);
    }
}
