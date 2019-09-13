package com.study.adapter2.turkey;

import com.study.adapter2.duck.Duck;

public class Turkey extends Duck{
    public void fly(){
        System.out.println("turkey --- fly");
    }

    public void gobble(){
        System.out.println("turkey --- gobble");
    }
}
