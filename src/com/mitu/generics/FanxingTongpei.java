package com.mitu.generics;

import java.util.ArrayList;

/**
 * 泛型
 */
public class FanxingTongpei {
    public static void main(String[] args) {

        ArrayList<byd> byds = new ArrayList<>();
        byds.add(new byd());
        byds.add(new byd());
        byds.add(new byd());
        go(byds);

        ArrayList<wey> weys = new ArrayList<>();
        weys.add(new wey());
        weys.add(new wey());
        weys.add(new wey());
        go(weys);

        ArrayList<dog> dogs = new ArrayList<>();
        dogs.add(new dog());
        dogs.add(new dog());
        dogs.add(new dog());
//        go(dogs);

    }

    /**
     * ? 通配符  指的任意参数类型
     * ? extends car 规定上限   意思是必须是car类或其子类
     * ? super   car 规定下限   意思是必须是car类或其父类
     * @param cars
     */
    public static void go(ArrayList<? extends car> cars){}
}

class car{}
class byd extends car{}
class wey extends car{}
class dog{}

