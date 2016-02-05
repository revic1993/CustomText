package com.woofyapp.customtext;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by rujul on 2/5/2016.
 */
public class TypeFactory {

    final String LATO_REGULAR="fonts/Lato-Regular.ttf";
    final String LATO_SEMIBOLD="fonts/Lato-Semibold.ttf";
    final String LATO_BOLD="fonts/Lato-Bold.ttf";
    final String LATO_HEAVY="fonts/Lato-Heavy.ttf";

    Typeface regular;
    Typeface bold;
    Typeface heavy;
    Typeface semibold;

    public TypeFactory(Context context){
        regular = Typeface.createFromAsset(context.getAssets(),LATO_REGULAR);
        bold = Typeface.createFromAsset(context.getAssets(),LATO_BOLD);
        heavy = Typeface.createFromAsset(context.getAssets(),LATO_HEAVY);
        semibold = Typeface.createFromAsset(context.getAssets(),LATO_SEMIBOLD);
    }

    public Typeface getRegular(){
        return regular;
    }

    public Typeface getBold() {
        return bold;
    }

    public Typeface getHeavy() {
        return heavy;
    }

    public Typeface getSemibold() {
        return semibold;
    }
}
