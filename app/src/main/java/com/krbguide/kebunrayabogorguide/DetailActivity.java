package com.krbguide.kebunrayabogorguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


public class DetailActivity extends ActionBarActivity {

    // Toolbar
    private Toolbar mToolbar;
    int mTitle = R.string.title_activity_detail;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        initToolbar();
        initDetail();

    }

    private void initToolbar() {
        mToolbar = (Toolbar) findViewById(R.id.util_toolbar);

        if (mToolbar != null) {
            mToolbar.setTitle(mTitle);
            setSupportActionBar(mToolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    public void initDetail() {

        Intent mId = getIntent();

        int msg_img = mId.getIntExtra("dataImg", 0);
        ImageView img = (ImageView) findViewById(R.id.isi_image);
        img.setImageResource(msg_img);

        String msg_name = mId.getStringExtra("dataName");
        TextView isi_name = (TextView) findViewById(R.id.isi_name);
        isi_name.setText(msg_name);

        String msg_subname = mId.getStringExtra("dataSubName");
        TextView isi_subname = (TextView) findViewById(R.id.isi_subname);
        isi_subname.setText(msg_subname);

        String msg_description = mId.getStringExtra("dataDescription");
        TextView isi_description = (TextView) findViewById(R.id.isi_description);
        isi_description.setText(msg_description);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_detail, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Intent mId = getIntent();

        String msg_coordinate = mId.getStringExtra("dataCoordinate");

        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpTo(this,
                        new Intent(this, FeaturedActivity.class));
                return true;
            case R.id.action_navigate:
                Intent navigation = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=" + msg_coordinate));
                startActivity(navigation);
        }
        return super.onOptionsItemSelected(item);
    }

}
