package com.study.adapter2;

import com.study.adapter2.duck.Duck;
import com.study.adapter2.turkey.Turkey;

public class TurkeyAdapter extends Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void fly() {
        turkey.fly();
    }

    @Override
    public void quack() {
        turkey.gobble();
    }
}
