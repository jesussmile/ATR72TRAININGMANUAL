package com.example.pannam.atr72trainingmanual.ATA00;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.pannam.atr72trainingmanual.R;

/**
 * Created by pannam on 3/19/2016.
 */
public class ProductionChart extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final RelativeLayout relativeLayout = new RelativeLayout(getActivity());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);
        relativeLayout.setLayoutParams(layoutParams);

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);

        final ImageView productionChartImage = new ImageView(getActivity());
        productionChartImage.setId(R.id.productionChartImage);
        productionChartImage.setImageResource(R.drawable.production_chart);
        productionChartImage.setAnimation(AnimationUtils.loadAnimation(this.getContext(), android.R.anim.slide_out_right));


        productionChartImage.setPadding(10, 10, 10, 10);

        final TextView productionChartText = new TextView(getActivity());
        productionChartText.setText(R.string.productionChart);
        // introText.setTextAppearance(android.R.style.TextAppearance_Medium);
        productionChartText.setTextSize(20);
        productionChartText.setPadding(25,25,25,25);
        productionChartText.setTextColor(ContextCompat.getColor(this.getContext(), R.color.colorPrimary));
        params.addRule(RelativeLayout.BELOW, productionChartImage.getId());
        productionChartText.setAnimation(AnimationUtils.loadAnimation(this.getContext(),android.R.anim.slide_in_left));
        relativeLayout.addView(productionChartText,params);
        relativeLayout.addView(productionChartImage);

        return relativeLayout;


    }
}
