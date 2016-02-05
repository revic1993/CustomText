package com.woofyapp.customtext;

import android.app.Application;
import android.graphics.Typeface;

/**
 * Created by rujul on 2/5/2016.
 */
public class CustomApp extends Application {

    private static CustomApp mInstance;
    private TypeFactory mFontFactory;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }

    public static synchronized CustomApp getApp(){
        return mInstance;
    }

    public Typeface getTypeFace(int type){
        if(mFontFactory==null)
            mFontFactory = new TypeFactory(this);

        switch (type){
            case Constants.REGULAR : return mFontFactory.getRegular();

            case Constants.BOLD: return mFontFactory.getBold();

            case Constants.HEAVY: return mFontFactory.getHeavy();

            case Constants.SEMIBOLD: return mFontFactory.getSemibold();

            default: return mFontFactory.getRegular();
        }
    }

    public interface Constants {
        int REGULAR = 1,
                BOLD = 2,
                SEMIBOLD = 3,
                HEAVY=4;
    }
}
