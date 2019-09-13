package com.study.adapter;

import com.study.adapter.duck.Duck;
import com.study.adapter.duck.DuckImpl;
import com.study.adapter.turkey.Turkey;
import com.study.adapter.turkey.TurkeyImpl;

/**
 * 设计模式  -  适配器模式
 */
public class Adapter {

    public static void main(String[] args) {
        Duck duckImpl = new DuckImpl();
        Turkey turkeyImpl = new TurkeyImpl();
        Duck turkeyAdapter = new TurkeyAdapter(turkeyImpl);

        testDuck(duckImpl);
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck){
        duck.fly();
        duck.quack();
    }
}
