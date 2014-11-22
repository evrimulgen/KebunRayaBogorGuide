package com.krbguide.kebunrayabogorguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.afollestad.materialdialogs.MaterialDialog;

import de.psdev.licensesdialog.LicensesDialog;
import de.psdev.licensesdialog.licenses.MITLicense;
import de.psdev.licensesdialog.model.Notice;
import de.psdev.licensesdialog.model.Notices;


public class HelpActivity extends ActionBarActivity {

    /* AppCompat Toolbar */
    private Toolbar mToolbar;
    int mTitle = R.string.title_activity_help;

    /* Activity onCreate Method */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

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

    /* Toolbar onOptionsItemSelected Method */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpTo(this,
                        new Intent(this, MapsActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
