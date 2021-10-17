package com.masalagames.myplugin;

import android.util.Log;

public class MyPlugin {
    private static  final MyPlugin ourInstance = new MyPlugin();
    private static final String LOGTAG = "MasalaGame";
    public static  MyPlugin getInstance(){ return ourInstance; }

    private long startTime;

    private MyPlugin(){
        Log.i(LOGTAG,"CreatedMyPlugin");
        startTime = System.currentTimeMillis();
    }

    private void OnButton(){}

    public double getElapsedTime(){
        return (System.currentTimeMillis()-startTime)/100.0f;
    }
}
