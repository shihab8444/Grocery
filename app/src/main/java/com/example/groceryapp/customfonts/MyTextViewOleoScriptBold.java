package com.example.groceryapp.customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Grocery App
 * https://github.com/quintuslabs/GroceryStore
 * Created on 18-Feb-2019.
 * Created by : Santosh Kumar Dash:- http://santoshdash.epizy.com
 */

public class MyTextViewOleoScriptBold extends androidx.appcompat.widget.AppCompatTextView {

    public MyTextViewOleoScriptBold(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public MyTextViewOleoScriptBold(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyTextViewOleoScriptBold(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/OleoScript-Bold.ttf");
            setTypeface(tf);
        }
    }

}