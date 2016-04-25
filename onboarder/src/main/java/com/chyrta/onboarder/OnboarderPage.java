package com.chyrta.onboarder;

import android.graphics.drawable.Drawable;
import android.support.annotation.AnyRes;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.IdRes;
import android.support.annotation.IntegerRes;
import android.support.annotation.RawRes;
import android.support.annotation.StringRes;

public class OnboarderPage {

    public String title;
    public String description;
    public Drawable imageResource;
    @StringRes public int titleResourceId;
    @StringRes public int descriptionResourceId;
    @DrawableRes public int imageResourceId;
    @ColorRes public int titleColor;
    @ColorRes public int descriptionColor;
    @AnyRes public int background;

    public OnboarderPage(String title, String description) {
        this.title = title;
        this.description = description;
        this.background = R.color.black_transparent;
    }

    public OnboarderPage(String title, String description, @DrawableRes int imageResourceId) {
        this.title = title;
        this.description = description;
        this.imageResourceId = imageResourceId;
        this.background = R.color.black_transparent;
    }

    public OnboarderPage(String title, String description, Drawable imageResource) {
        this.title = title;
        this.description = description;
        this.imageResource = imageResource;
        this.background = R.color.black_transparent;
    }

    public OnboarderPage(@StringRes int title, @StringRes int description) {
        this.titleResourceId = title;
        this.descriptionResourceId = description;
        this.background = R.color.black_transparent;
    }

    public OnboarderPage(int title, int description, int imageResourceId) {
        this.titleResourceId = title;
        this.descriptionResourceId = description;
        this.imageResourceId = imageResourceId;
        this.background = R.color.black_transparent;
    }

    public OnboarderPage(@StringRes int title, @StringRes int description, Drawable imageResource) {
        this.titleResourceId = title;
        this.descriptionResourceId = description;
        this.imageResource = imageResource;
        this.background = R.color.black_transparent;
    }

    public String getTitle() {
        return title;
    }

    public int getTitleResourceId() {
        return titleResourceId;
    }

    public String getDescription() {
        return description;
    }

    public @StringRes int getDescriptionResourceId() {
        return descriptionResourceId;
    }

    public @ColorRes int getTitleColor() {
        return titleColor;
    }

    public @ColorRes int getDescriptionColor() {
        return descriptionColor;
    }

    public void setTitleColor(@ColorRes int color) {
        this.titleColor = color;
    }

    public void setDescriptionColor(@ColorRes int color) {
        this.descriptionColor = color;
    }

    public void setImageResourceId(@DrawableRes int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public @DrawableRes int getImageResourceId() {
        return imageResourceId;
    }

    public void setBackground(@AnyRes int background) {
        this.background = background;
    }

    public @AnyRes int getBackground() {
        return background;
    }
}
