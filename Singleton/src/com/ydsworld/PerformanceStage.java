package com.ydsworld;

/**
 * Created by Arun on 1/2/16.
 */
public class PerformanceStage {
    private static PerformanceStage INSTANCE = null;
    private int count;

    private PerformanceStage(){
        count++;
    }

    public static PerformanceStage getPerormanceStage(){
        if (INSTANCE==null){
            INSTANCE = new PerformanceStage();
        }
        return INSTANCE;
    }

    public int getCount(){
        return count;
    }
}
