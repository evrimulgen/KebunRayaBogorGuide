package com.krbguide.kebunrayabogorguide;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.Theme;

import de.psdev.licensesdialog.LicensesDialog;
import de.psdev.licensesdialog.licenses.ApacheSoftwareLicense20;
import de.psdev.licensesdialog.licenses.GnuLesserGeneralPublicLicense21;
import de.psdev.licensesdialog.licenses.MITLicense;
import de.psdev.licensesdialog.model.Notice;
import de.psdev.licensesdialog.model.Notices;


public class AboutActivity extends ActionBarActivity {

    /* AppCompat Toolbar */
    private Toolbar mToolbar;
    int mTitle = R.string.title_activity_about;

    /* Activity onCreate Method */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        initToolbar();

    }

    /* AppCompat Toolbar */
    private void initToolbar() {
        mToolbar = (Toolbar) findViewById(R.id.util_toolbar);

        if (mToolbar != null) {
            mToolbar.setTitle(mTitle);
            setSupportActionBar(mToolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    /* Toolbar onCreateOptionMenu Method */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_about, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /* Toolbar onOptionsItemSelected Method */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpTo(this,
                        new Intent(this, MapsActivity.class));
                return true;
            case R.id.action_opensource_license:
                final Notices notices = new Notices();
                notices.addNotice(new Notice("AOSP", "https://source.android.com/", "", new ApacheSoftwareLicense20()));
                notices.addNotice(new Notice("material-dialogs", "https://github.com/afollestad/material-dialogs", "Copyright (c) 2014 Aidan Michael Follestad", new MITLicense()));

                new LicensesDialog.Builder(this).setNotices(notices).setIncludeOwnLicense(true).build().show();
                return true;
            case R.id.action_about_developer:
                new MaterialDialog.Builder(this)
                        .title(R.string.action_about_developer)
                        .positiveText(R.string.action_positive)
                        .content(Html.fromHtml(getString(R.string.action_about_developer_body)))
                        .contentLineSpacing(1.6f)
                        .callback(new MaterialDialog.SimpleCallback() {
                            @Override
                            public void onPositive(MaterialDialog dialog) {
                            }
                        })
                        .build()
                        .show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
