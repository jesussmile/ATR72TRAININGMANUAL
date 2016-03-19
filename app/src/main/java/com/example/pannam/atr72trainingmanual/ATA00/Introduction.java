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
 * Created by pannam on 3/2/2016.
 */

public class Introduction extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        final RelativeLayout relativeLayout = new RelativeLayout(getActivity());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);
        relativeLayout.setLayoutParams(layoutParams);

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);

        final ImageView introImage = new ImageView(getActivity());
        introImage.setId(R.id.introImageId);
        introImage.setImageResource(R.drawable.introduction);

        introImage.setAnimation(AnimationUtils.loadAnimation(this.getContext(), android.R.anim.slide_out_right));

        introImage.setPadding(100, 100, 100, 100);

        final TextView introText = new TextView(getActivity());
        introText.setText(R.string.introduction_text);
       // introText.setTextAppearance(android.R.style.TextAppearance_Medium);
        introText.setTextSize(20);
        introText.setPadding(25,25,25,25);
        introText.setTextColor(ContextCompat.getColor(this.getContext(), R.color.colorPrimary));
        params.addRule(RelativeLayout.BELOW, introImage.getId());
        introText.setAnimation(AnimationUtils.loadAnimation(this.getContext(),android.R.anim.slide_in_left));
        relativeLayout.addView(introText,params);
        relativeLayout.addView(introImage);


        return relativeLayout;

    }

}
