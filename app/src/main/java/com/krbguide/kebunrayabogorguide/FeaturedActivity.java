package com.krbguide.kebunrayabogorguide;

import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.krbguide.kebunrayabogorguide.adapter.CustomList1Adapter;
import com.krbguide.kebunrayabogorguide.adapter.CustomList2Adapter;
import com.krbguide.kebunrayabogorguide.list.CustomList1;
import com.krbguide.kebunrayabogorguide.list.CustomList2;

import java.util.ArrayList;
import java.util.List;


public class FeaturedActivity extends ActionBarActivity {

    /* AppCompat Toolbar */
    private Toolbar mToolbar;
    int mTitle = R.string.title_activity_featured;

    /* AppCompat Navigation Drawer */
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle drawerToggle;

    /* Navigation Key */
    private static long back_pressed;

    /* ListView Featured */
    protected ListView listView;
    protected ListAdapter listAdapter;
    SQLiteDatabase db;
    Cursor mCursor;

    /* Activity onCreate Method */
    @SuppressWarnings("deprecation")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_featured);

        initToolbar();
        initDrawer();
        initDatabaseList();

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

    /* AppCompat Drawer */
    private void initDrawer() {

        /* Create AppCompat Drawer */
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, mToolbar, R.string.drawer_open, R.string.drawer_close) {
            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                mToolbar.setTitle(mTitle);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                mToolbar.setTitle(mTitle);
            }
        };

        drawerLayout.setDrawerListener(drawerToggle);


        /* Set AppCompat Drawer MainMenu using ListView */
        ListView lvDrawer1 = (ListView) findViewById(R.id.lv_featured_drawer1);

        List<CustomList1> lvDrawerItem1 = new ArrayList<CustomList1>();

        lvDrawerItem1.add(new CustomList1(BitmapFactory.decodeResource(getResources(),
                R.drawable.ic_maps), "Peta Lokasi"));
        lvDrawerItem1.add(new CustomList1(BitmapFactory.decodeResource(getResources(),
                R.drawable.ic_featured), "Situs Favorit"));
        lvDrawerItem1.add(new CustomList1(BitmapFactory.decodeResource(getResources(),
                R.drawable.ic_facility), "Fasilitas Umum"));

        CustomList1Adapter adapterDrawer1 = new CustomList1Adapter(this, lvDrawerItem1);
        lvDrawer1.setAdapter(adapterDrawer1);

        // Set MainMenu Listener
        lvDrawer1.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                TextView textView = (TextView) view.findViewById(R.id.mLabel);
                String mLabel = textView.getText().toString();
                if (mLabel.equals("Peta Lokasi")) {
                    /* create new activity */
                    // Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
                    // startActivity(intent);

                    /* just finish this activity and go back to previous (MapsActivity) */
                    finish();
                } else if (mLabel.equals("Situs Favorit")) {
                    view.setSelected(true);
                } else if (mLabel.equals("Fasilitas Umum")) {
                    Intent intent = new Intent(getApplicationContext(), FacilitiesActivity.class);
                    startActivity(intent);
                    finish();
                }

            }

        });


        /* AppCompat Drawer SecondaryMenu using ListView */
        ListView lvDrawer2 = (ListView) findViewById(R.id.lv_featured_drawer2);

        List<CustomList2> lvDrawerItem2 = new ArrayList<CustomList2>();

        lvDrawerItem2.add(new CustomList2("Bantuan"));
        lvDrawerItem2.add(new CustomList2("Tentang"));

        CustomList2Adapter adapterDrawer2 = new CustomList2Adapter(this, lvDrawerItem2);
        lvDrawer2.setAdapter(adapterDrawer2);

        // Secondary Drawer ListView onClickListener
        lvDrawer2.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                TextView textView = (TextView) view.findViewById(R.id.mLabel);
                String mLabel = textView.getText().toString();
                if (mLabel.equals("Bantuan")) {
                    Toast.makeText(getApplicationContext(), "Coming Soon", Toast.LENGTH_LONG).show();
                    drawerLayout.closeDrawers();
                } else if (mLabel.equals("Tentang")) {
                    Intent intent = new Intent(getApplicationContext(), AboutActivity.class);
                    startActivity(intent);
                }

            }

        });

    }

    /* Featured Database ListView */
    @SuppressWarnings("deprecation")
    protected void initDatabaseList() {

        db = (new DatabaseFeatured(this)).getWritableDatabase();
        listView = (ListView) findViewById(R.id.listViewFeatured);

        try {

            mCursor = db.rawQuery("SELECT * FROM detail_featured ORDER BY db_name ASC", null);
            listAdapter =
                    new SimpleCursorAdapter(this, R.layout.row_customcontentlist1, mCursor,
                    new String[] { "db_ico", "db_name", "db_subname" },
                    new int[] { R.id.mContentIcon, R.id.mContentLabel, R.id.mContentSublabel });
            listView.setAdapter(listAdapter);
            listView.setTextFilterEnabled(true);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                    detail(position);
                }

            });

        }

        catch (Exception e) {
            e.printStackTrace();
        }

    }

    /* Featured Database ListView Listener */
    public void detail(int position) {

        int img = 0;
        int ico = 0;
        String name = "";
        String subname = "";
        String description = "";
        String coordinate = "";

        if(mCursor.moveToFirst()) {
            mCursor.moveToPosition(position);
            img = mCursor.getInt(mCursor.getColumnIndex("db_img"));
            ico = mCursor.getInt(mCursor.getColumnIndex("db_ico"));
            name = mCursor.getString(mCursor.getColumnIndex("db_name"));
            subname = mCursor.getString(mCursor.getColumnIndex("db_subname"));
            description = mCursor.getString(mCursor.getColumnIndex("db_description"));
            coordinate = mCursor.getString(mCursor.getColumnIndex("db_coordinate"));
        }

        Intent mIntent = new Intent(this, DetailActivity.class);
        mIntent.putExtra("dataImg", img);
        mIntent.putExtra("dataIco", ico);
        mIntent.putExtra("dataName", name);
        mIntent.putExtra("dataSubName", subname);
        mIntent.putExtra("dataDescription", description);
        mIntent.putExtra("dataCoordinate", coordinate);
        setResult(RESULT_OK, mIntent);
        startActivityForResult(mIntent, 99);

    }

    /* Drawer onPostCreate Method */
    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        drawerToggle.syncState();
    }

    /* Drawer onConfigurationChanged Method */
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        drawerToggle.onConfigurationChanged(newConfig);
    }

    /* Navigation onBackPressed Method */
    @Override
    public void onBackPressed()
    {
        /* create new activity */
        // Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
        // startActivity(intent);

        /* just finish this activity and go back to previous (MapsActivity) */
        finish();
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
