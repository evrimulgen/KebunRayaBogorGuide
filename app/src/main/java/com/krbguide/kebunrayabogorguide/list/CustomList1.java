package com.krbguide.kebunrayabogorguide.list;

import android.graphics.Bitmap;

public class CustomList1 {

    Bitmap mIcon;
    String mLabel;

    public CustomList1(Bitmap icon, String label) {

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
