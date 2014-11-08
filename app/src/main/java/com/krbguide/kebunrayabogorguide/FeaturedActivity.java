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

import com.krbguide.kebunrayabogorguide.adapter.DrawerListAdapter;
import com.krbguide.kebunrayabogorguide.adapter.DrawerSimpleListAdapter;
import com.krbguide.kebunrayabogorguide.adapter.list.DrawerList;
import com.krbguide.kebunrayabogorguide.adapter.list.DrawerSimpleList;

import java.util.ArrayList;
import java.util.List;


public class FeaturedActivity extends ActionBarActivity {

    // Toolbar
    private Toolbar mToolbar;
    int mTitle = R.string.title_activity_featured;

    // Navigation Drawer
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle drawerToggle;

    private static long back_pressed;

    // ListViewFeatured
    protected ListView listView;
    protected ListAdapter listAdapter;
    SQLiteDatabase db;
    Cursor mCursor;

    @SuppressWarnings("deprecation")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_featured);

        initToolbar();
        initDrawer();
        initDrawerList();
        initDrawerSimpleList();
        initDatabaseList();

    }

    private void initToolbar() {
        mToolbar = (Toolbar) findViewById(R.id.util_toolbar);

        if (mToolbar != null) {
            mToolbar.setTitle(mTitle);
            setSupportActionBar(mToolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    private void initDrawer() {

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

    }

    private void initDrawerList() {

        ListView drawerListView = (ListView) findViewById(R.id.drawerListFeatured);

        List<DrawerList> drawerList = new ArrayList<DrawerList>();

        drawerList.add(new DrawerList(BitmapFactory.decodeResource(getResources(),
                R.drawable.ic_maps), "Peta Lokasi"));
        drawerList.add(new DrawerList(BitmapFactory.decodeResource(getResources(),
                R.drawable.ic_featured), "Situs Favorit"));

        DrawerListAdapter adapter = new DrawerListAdapter(this, drawerList);
        drawerListView.setAdapter(adapter);

        // Primary Drawer ListView onClickListener
        drawerListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                TextView textView = (TextView) view.findViewById(R.id.mLabel);
                String mLabel = textView.getText().toString();
                if (mLabel.equals("Peta Lokasi")) {
                    Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
                    startActivity(intent);
                    finish();
                }
                else if (mLabel.equals("Situs Favorit")) {
                    Toast.makeText(getApplicationContext(), "Anda sudah berada di menu " + mLabel, Toast.LENGTH_LONG).show();
                    drawerLayout.closeDrawers();
                }

            }

        });

    }

    private void initDrawerSimpleList() {

        ListView drawerSimpleListView = (ListView) findViewById(R.id.drawerListFeaturedSecondary);

        List<DrawerSimpleList> drawerSimpleList = new ArrayList<DrawerSimpleList>();

        drawerSimpleList.add(new DrawerSimpleList("Pengaturan"));
        drawerSimpleList.add(new DrawerSimpleList("Bantuan"));
        drawerSimpleList.add(new DrawerSimpleList("Tentang"));

        DrawerSimpleListAdapter adapter = new DrawerSimpleListAdapter(this, drawerSimpleList);
        drawerSimpleListView.setAdapter(adapter);

        // Secondary Drawer ListView onClickListener
        drawerSimpleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                TextView textView = (TextView) view.findViewById(R.id.mLabel);
                String mLabel = textView.getText().toString();
                if (mLabel.equals("Pengaturan")) {
                    Toast.makeText(getApplicationContext(), "Coming Soon", Toast.LENGTH_LONG).show();
                    drawerLayout.closeDrawers();
                }
                else if (mLabel.equals("Bantuan")) {
                    Toast.makeText(getApplicationContext(), "Coming Soon", Toast.LENGTH_LONG).show();
                    drawerLayout.closeDrawers();
                }
                else if (mLabel.equals("Tentang")) {
                    Intent intent = new Intent(getApplicationContext(), AboutActivity.class);
                    startActivity(intent);
                }

            }

        });

    }

    @SuppressWarnings("deprecation")
    protected void initDatabaseList() {

        db = (new Database(this)).getWritableDatabase();
        listView = (ListView) findViewById(R.id.listViewFeatured);

        try {
            mCursor = db.rawQuery("SELECT * FROM detail ORDER BY db_name ASC", null);
            listAdapter =
                    new SimpleCursorAdapter(this, R.layout.row_custom_contentlist_1, mCursor,
                    new String[] { "db_img", "db_name", "db_subname" },
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

    public void detail(int position) {

        int img = 0;
        String name = "";
        String subname = "";
        String description = "";
        String coordinate = "";

        if(mCursor.moveToFirst()) {
            mCursor.moveToPosition(position);
            img = mCursor.getInt(mCursor.getColumnIndex("db_img"));
            name = mCursor.getString(mCursor.getColumnIndex("db_name"));
            subname = mCursor.getString(mCursor.getColumnIndex("db_subname"));
            description = mCursor.getString(mCursor.getColumnIndex("db_description"));
            coordinate = mCursor.getString(mCursor.getColumnIndex("db_coordinate"));
        }

        Intent mIntent = new Intent(this, DetailActivity.class);
        mIntent.putExtra("dataImg", img);
        mIntent.putExtra("dataName", name);
        mIntent.putExtra("dataSubName", subname);
        mIntent.putExtra("dataDescription", description);
        mIntent.putExtra("dataCoordinate", coordinate);
        setResult(RESULT_OK, mIntent);
        startActivityForResult(mIntent, 99);

    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        drawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        drawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public void onBackPressed()
    {
        if (back_pressed + 2000 > System.currentTimeMillis()) super.onBackPressed();
        else Toast.makeText(getBaseContext(), "Tekan tombol kembali sekali lagi untuk keluar!", Toast.LENGTH_SHORT).show();
        back_pressed = System.currentTimeMillis();
    }

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
