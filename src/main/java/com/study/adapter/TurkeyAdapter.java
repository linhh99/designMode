package com.study.adapter;

import com.study.adapter.duck.Duck;
import com.study.adapter.turkey.Turkey;

/**
 * 对象的适配器
 */
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
