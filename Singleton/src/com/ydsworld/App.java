package com.ydsworld;

/**
 * Created by Arun on 1/2/16.
 */
public class App {
    public static void main(String[] args){
        PerformanceStage stage = PerformanceStage.getPerormanceStage();

        System.out.println(stage.getCount());
    }
}
