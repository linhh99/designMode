package com.study.adapter2;

import com.study.adapter2.duck.Duck;
import com.study.adapter2.turkey.Turkey;

/**
 * 类适配器
 */
public class Adapter {
    public static void main(String[] args) {
        Duck duck = new Duck();

        Turkey turkey = new Turkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        test(duck);
        test(turkey);

        System.out.println("-------------");
        test(turkeyAdapter);
    }

    static void test(Duck duck){
        duck.fly();
        duck.quack();
    }
}
