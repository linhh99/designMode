package com.study.adapter.turkey;

public class TurkeyImpl implements Turkey {
    @Override
    public void gobble() {
        System.out.println("turkeyImpl ---- gobble");
    }

    @Override
    public void fly() {
        System.out.println("turkeyImpl ---- fly");
    }
}
