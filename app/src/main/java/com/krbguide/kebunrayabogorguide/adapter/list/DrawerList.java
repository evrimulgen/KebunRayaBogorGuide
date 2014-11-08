package com.krbguide.kebunrayabogorguide.adapter.list;

import android.graphics.Bitmap;

public class DrawerList {

    private Bitmap mIcon;

    String mLabel;

    public DrawerList(Bitmap icon, String label) {

        mIcon = icon;
        mLabel = label;

    }

    public Bitmap getIcon() {
        return mIcon;
    }

    public void setIcon(Bitmap mIcon) {
        this.mIcon = mIcon;
    }

    public String getLabel() {
        return mLabel;
    }

    public void setLabel(String mLabel) {
        this.mLabel = mLabel;
    }

}
