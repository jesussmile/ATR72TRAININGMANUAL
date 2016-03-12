package com.example.pannam.atr72trainingmanual;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by pannam on 3/11/2016.
 */
public class ProductionChart extends AppCompatActivity {
    private RelativeLayout relativeLayout;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        relativeLayout = new RelativeLayout(this);
        RelativeLayout.LayoutParams relativeParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT

        );

        relativeLayout.setLayoutParams(relativeParams);
        setContentView(relativeLayout);

        addTextView();
    }

    private void addTextView() {
        TextView textView = new TextView(this);
        RelativeLayout.LayoutParams textViewParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT
        );

        textViewParams.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        textViewParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
        textViewParams.setMargins(32,82,22,12);
        textView.setText("INTRODUCTION CHART !!!!!!!!!!!");
        relativeLayout.addView(textView);
    }
}
