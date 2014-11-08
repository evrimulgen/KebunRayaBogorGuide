package com.krbguide.kebunrayabogorguide.adapter.list;

import android.graphics.Bitmap;

public class ContentList {

    private Bitmap mIcon;

    String mLabel;
    String mSublabel;

    public ContentList(Bitmap icon, String label, String sublabel) {

        mIcon = icon;
        mLabel = label;
        mSublabel = sublabel;

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

    public String getSublabel() {
        return mSublabel;
    }

    public void setSublabel(String mSublabel) {
        this.mSublabel = mSublabel;
    }

}
