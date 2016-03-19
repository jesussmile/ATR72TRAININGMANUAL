package com.example.pannam.atr72trainingmanual;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.pannam.atr72trainingmanual.ATA00.Introduction;
import com.example.pannam.atr72trainingmanual.ATA00.ProductionChart;

/**
 * Created by pannam on 3/2/2016.
 */
public class TabPagerAdapter extends FragmentPagerAdapter {

    int tabCount;


    public TabPagerAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.tabCount=numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                Introduction tab1= new Introduction();
                return tab1;

            case 1:

                ProductionChart tab2 = new ProductionChart();
                return tab2;

            case 2:
                TabThreeFragment tab3 = new TabThreeFragment();
                return tab3;

            case 3:
                TabThreeFragment tab4 = new TabThreeFragment();
                return tab4;

            default:
                return null;

        }


    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
