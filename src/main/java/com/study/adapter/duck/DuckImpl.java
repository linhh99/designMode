package com.study.adapter.duck;

public class DuckImpl implements Duck {
    @Override
    public void quack() {
        System.out.println("duckImpl ---- quack");
    }

    @Override
    public void fly() {
        System.out.println("duckImpl ---- fly");
    }
}
