package com.chyrta.onboarder.utils;

import android.content.Context;
import android.support.v4.content.ContextCompat;

import com.chyrta.onboarder.OnboarderPage;

import java.util.ArrayList;
import java.util.List;

public class BackgroundArrayBuilder {

    public static Integer[] getPageBackgrounds(List<OnboarderPage> pages) {
        List<Integer> backgroundList = new ArrayList<>();
        for (OnboarderPage page : pages) {
            backgroundList.add(page.getBackground());
        }
        return backgroundList.toArray(new Integer[pages.size()]);
    }

}
