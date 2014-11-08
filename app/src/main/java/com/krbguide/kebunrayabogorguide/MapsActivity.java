package com.krbguide.kebunrayabogorguide;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.krbguide.kebunrayabogorguide.adapter.DrawerListAdapter;
import com.krbguide.kebunrayabogorguide.adapter.DrawerSimpleListAdapter;
import com.krbguide.kebunrayabogorguide.adapter.list.DrawerList;
import com.krbguide.kebunrayabogorguide.adapter.list.DrawerSimpleList;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MapsActivity extends ActionBarActivity {

    // toolbar
    private Toolbar mToolbar;
    int mTitle = R.string.app_name;

    // navigation drawer
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle drawerToggle;

    // navigation
    private static long back_pressed;

    // google maps
    private GoogleMap mMap;

    // Koordinat Lokasi
    // Kebun Raya Bogor
    private LatLng kebunRayaBogor = new LatLng(-6.597629, 106.79957);
    // Pintu Masuk
    private LatLng PINTU1 = new LatLng(-6.60293, 106.7989);
    private LatLng PINTU2 = new LatLng(-6.59969, 106.7947);
    private LatLng PINTU3 = new LatLng(-6.5955, 106.80394);
    private LatLng PINTU4 = new LatLng(-6.59977, 106.80459);
    // Toilet
    private LatLng TOILET1 = new LatLng(-6.60257, 106.79586);
    private LatLng TOILET2 = new LatLng(-6.60134, 106.79734);
    private LatLng TOILET3 = new LatLng(-6.60359, 106.79679);
    private LatLng TOILET4 = new LatLng(-6.60031, 106.7959);
    private LatLng TOILET5 = new LatLng(-6.60042, 106.80077);
    private LatLng TOILET6 = new LatLng(-6.5983, 106.79993);
    private LatLng TOILET7 = new LatLng(-6.59503, 106.80278);
    private LatLng TOILET8 = new LatLng(-6.59808, 106.80248);
    private LatLng TOILET9 = new LatLng(-6.59936, 106.80467);
    // Cafe
    private LatLng KANTINDWP = new LatLng(-6.60242, 106.79861);
    private LatLng KANTINMZB = new LatLng(-6.6033, 106.79695);
    private LatLng KANTINDED = new LatLng(-6.59871, 106.8035);
    // Musholla
    private LatLng MOSQUE1 = new LatLng(-6.60257, 106.79578);
    private LatLng MOSQUE2 = new LatLng(-6.60370, 106.79679);
    private LatLng MOSQUE3 = new LatLng(-6.59936, 106.80467);
    private LatLng MOSQUE4 = new LatLng(-6.59811, 106.80231);
    // Wisma Tamu
    private LatLng WISMA1 = new LatLng(-6.60238, 106.79644);
    private LatLng WISMA2 = new LatLng(-6.59688, 106.80371);
    // Tempat Menarik
    private LatLng TAMANTEIZMANN = new LatLng(-6.60123, 106.79532);
    private LatLng KOLAMGUNTING = new LatLng(-6.60039, 106.79809);
    private LatLng MONUMENDRJJSMITH = new LatLng(-6.6016, 106.79963);
    private LatLng MAKAMBELANDA = new LatLng(-6.59943, 106.79627);
    private LatLng TAMANMEXICO = new LatLng(-6.60223, 106.80063);
    private LatLng AREAKELAPASAWIT = new LatLng(-6.59943, 106.80045);
    private LatLng TAMANKOLEKSITUMBUHANAIR = new LatLng(-6.6009, 106.80091);
    private LatLng MAKAMKRAMAT = new LatLng(-6.59583, 106.79979);
    private LatLng JEMBATANGANTUNG = new LatLng(-6.59621, 106.80087);
    private LatLng JEMBATANSURYALEMBAYUNG = new LatLng(-6.59363, 106.80032);
    private LatLng RUMAHANGGREK = new LatLng(-6.59531, 106.8036);
    private LatLng KOLAMTERATAIRAKSASA = new LatLng(-6.59916, 106.80275);
    private LatLng TAMANLEBAKSUDJANA = new LatLng(-6.5929, 106.80115);
    private LatLng TAMANKOLEKSITUMBUHANOBAT = new LatLng(-6.59344, 106.80174);
    // Lain-lain
    private LatLng GARDENSHOP = new LatLng(-6.60196, 106.79791);
    private LatLng LABTREUB = new LatLng(-6.60236, 106.79702);
    private LatLng LABKULTURJARINGAN = new LatLng(-6.59448, 106.80307);
    private LatLng PUSATKONSERVASIKRB = new LatLng(-6.59881, 106.79566);
    private LatLng MUSEUMZOOLOGI = new LatLng(-6.60340, 106.7970);
    private LatLng PEMBIBITAN = new LatLng(-6.60185, 106.79735);
    private LatLng LAPANGANTENNIS = new LatLng(-6.59422, 106.80247);
    private LatLng AREAOUTBOND = new LatLng(-6.59628, 106.80341);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        setUpMapIfNeeded();

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mMap);
        mMap = mapFragment.getMap();
        mMap.setMyLocationEnabled(true);

        initToolbar();
        initDrawer();
        initDrawerList();
        initDrawerSimpleList();
        initDrawerListOption();

    }

    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();
    }

    private void initToolbar() {
        mToolbar = (Toolbar) findViewById(R.id.util_toolbar);

        if (mToolbar != null) {
            mToolbar.setTitle(mTitle);
            setSupportActionBar(mToolbar);
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

        ListView drawerListView = (ListView) findViewById(R.id.drawerListMaps);

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
                    Toast.makeText(getApplicationContext(), "Anda sudah berada di menu " + mLabel, Toast.LENGTH_LONG).show();
                    drawerLayout.closeDrawers();
                }
                else if (mLabel.equals("Situs Favorit")) {
                    Intent intent = new Intent(getApplicationContext(), FeaturedActivity.class);
                    startActivity(intent);
                    finish();
                }

            }

        });

    }

    private void initDrawerSimpleList() {

        ListView drawerSimpleListView = (ListView) findViewById(R.id.drawerListMapsSecondary);

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

    private void initDrawerListOption() {

        CheckBox checkBox1 = (CheckBox) findViewById(R.id.mCheckBox1); // Kebun Raya Bogor
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.mCheckBox2); // Pintu Masuk
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.mCheckBox3); // Tempat Menarik
        CheckBox checkBox4 = (CheckBox) findViewById(R.id.mCheckBox4); // Wisma
        CheckBox checkBox5 = (CheckBox) findViewById(R.id.mCheckBox5); // Cafe
        CheckBox checkBox6 = (CheckBox) findViewById(R.id.mCheckBox6); // Toilet
        CheckBox checkBox7 = (CheckBox) findViewById(R.id.mCheckBox7); // Musholla

        // Kebun Raya Bogor
        checkBox1.setOnClickListener(new View.OnClickListener() {
            Marker markerMain = mMap.addMarker(new MarkerOptions().position(kebunRayaBogor).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)).title("Kebun Raya Bogor").visible(true));
            @Override
            public void onClick(View view) {
                if (((CheckBox) view).isChecked()) {
                    markerMain.setVisible(true);
                }
                else {
                    markerMain.setVisible(false);

                }
            }
        });

        // Pintu Masuk
        checkBox2.setOnClickListener(new View.OnClickListener() {
            Marker markerPintu1 = mMap.addMarker(new MarkerOptions().position(PINTU1).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Pintu").visible(false));
            Marker markerPintu2 = mMap.addMarker(new MarkerOptions().position(PINTU2).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Pintu").visible(false));
            Marker markerPintu3 = mMap.addMarker(new MarkerOptions().position(PINTU3).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Pintu").visible(false));
            Marker markerPintu4 = mMap.addMarker(new MarkerOptions().position(PINTU4).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Pintu").visible(false));
            @Override
            public void onClick(View view) {
                if (((CheckBox) view).isChecked()) {
                    markerPintu1.setVisible(true);
                    markerPintu2.setVisible(true);
                    markerPintu3.setVisible(true);
                    markerPintu4.setVisible(true);
                }
                else {
                    markerPintu1.setVisible(false);
                    markerPintu2.setVisible(false);
                    markerPintu3.setVisible(false);
                    markerPintu4.setVisible(false);
                }
            }
        });

        // Tempat Menarik
        checkBox3.setOnClickListener(new View.OnClickListener() {
            Marker markerFeatured1 = mMap.addMarker(new MarkerOptions().position(TAMANTEIZMANN).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Taman Teizmann").visible(false));
            Marker markerFeatured2 = mMap.addMarker(new MarkerOptions().position(KOLAMGUNTING).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Kolam Gunting").visible(false));
            Marker markerFeatured3 = mMap.addMarker(new MarkerOptions().position(MONUMENDRJJSMITH).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Monumen Dr. JJ. Smith").visible(false));
            Marker markerFeatured4 = mMap.addMarker(new MarkerOptions().position(MAKAMBELANDA).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Makam Belanda").visible(false));
            Marker markerFeatured5 = mMap.addMarker(new MarkerOptions().position(TAMANMEXICO).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Taman Mexico").visible(false));
            Marker markerFeatured6 = mMap.addMarker(new MarkerOptions().position(AREAKELAPASAWIT).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Area Kelapa Sawit").visible(false));
            Marker markerFeatured7 = mMap.addMarker(new MarkerOptions().position(TAMANKOLEKSITUMBUHANAIR).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Taman Koleksi Tumbuhan Air").visible(false));
            Marker markerFeatured8 = mMap.addMarker(new MarkerOptions().position(MAKAMKRAMAT).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Makam Keramat").visible(false));
            Marker markerFeatured9 = mMap.addMarker(new MarkerOptions().position(JEMBATANGANTUNG).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Jembatan Gantung").visible(false));
            Marker markerFeatured10 = mMap.addMarker(new MarkerOptions().position(JEMBATANSURYALEMBAYUNG).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Jembatan Surya Lembayung").visible(false));
            Marker markerFeatured11 = mMap.addMarker(new MarkerOptions().position(RUMAHANGGREK).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Rumah Anggrek").visible(false));
            Marker markerFeatured12 = mMap.addMarker(new MarkerOptions().position(KOLAMTERATAIRAKSASA).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Kolam Teratai Raksasa").visible(false));
            Marker markerFeatured13 = mMap.addMarker(new MarkerOptions().position(TAMANLEBAKSUDJANA).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Taman Lebak Sudjana").visible(false));
            Marker markerFeatured14 = mMap.addMarker(new MarkerOptions().position(TAMANKOLEKSITUMBUHANOBAT).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Taman Koleksi Tumbuhan Obat").visible(false));
            Marker markerFeatured15 = mMap.addMarker(new MarkerOptions().position(GARDENSHOP).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Garden Shop").visible(false));
            Marker markerFeatured16 = mMap.addMarker(new MarkerOptions().position(LABTREUB).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Laboratorium Treub").visible(false));
            Marker markerFeatured17 = mMap.addMarker(new MarkerOptions().position(LABKULTURJARINGAN).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Laboratorium Kultur Jaringan").visible(false));
            Marker markerFeatured18 = mMap.addMarker(new MarkerOptions().position(PUSATKONSERVASIKRB).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Pusat Konservasi Kebun Raya Bogor (LIPI)").visible(false));
            Marker markerFeatured19 = mMap.addMarker(new MarkerOptions().position(MUSEUMZOOLOGI).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Museum Zoologi").visible(false));
            Marker markerFeatured20 = mMap.addMarker(new MarkerOptions().position(PEMBIBITAN).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Pembibitan").visible(false));
            Marker markerFeatured21 = mMap.addMarker(new MarkerOptions().position(LAPANGANTENNIS).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Lapangan Tennis").visible(false));
            Marker markerFeatured22 = mMap.addMarker(new MarkerOptions().position(AREAOUTBOND).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Area Outbond").visible(false));
            @Override
            public void onClick(View view) {
                if (((CheckBox) view).isChecked()) {
                    markerFeatured1.setVisible(true);
                    markerFeatured2.setVisible(true);
                    markerFeatured3.setVisible(true);
                    markerFeatured4.setVisible(true);
                    markerFeatured5.setVisible(true);
                    markerFeatured6.setVisible(true);
                    markerFeatured7.setVisible(true);
                    markerFeatured8.setVisible(true);
                    markerFeatured9.setVisible(true);
                    markerFeatured10.setVisible(true);
                    markerFeatured11.setVisible(true);
                    markerFeatured12.setVisible(true);
                    markerFeatured13.setVisible(true);
                    markerFeatured14.setVisible(true);
                    markerFeatured15.setVisible(true);
                    markerFeatured16.setVisible(true);
                    markerFeatured17.setVisible(true);
                    markerFeatured18.setVisible(true);
                    markerFeatured19.setVisible(true);
                    markerFeatured20.setVisible(true);
                    markerFeatured21.setVisible(true);
                    markerFeatured22.setVisible(true);
                }
                else {
                    markerFeatured1.setVisible(false);
                    markerFeatured2.setVisible(false);
                    markerFeatured3.setVisible(false);
                    markerFeatured4.setVisible(false);
                    markerFeatured5.setVisible(false);
                    markerFeatured6.setVisible(false);
                    markerFeatured7.setVisible(false);
                    markerFeatured8.setVisible(false);
                    markerFeatured9.setVisible(false);
                    markerFeatured10.setVisible(false);
                    markerFeatured11.setVisible(false);
                    markerFeatured12.setVisible(false);
                    markerFeatured13.setVisible(false);
                    markerFeatured14.setVisible(false);
                    markerFeatured15.setVisible(false);
                    markerFeatured16.setVisible(false);
                    markerFeatured17.setVisible(false);
                    markerFeatured18.setVisible(false);
                    markerFeatured19.setVisible(false);
                    markerFeatured20.setVisible(false);
                    markerFeatured21.setVisible(false);
                    markerFeatured22.setVisible(false);
                }
            }
        });

        // Wisma
        checkBox4.setOnClickListener(new View.OnClickListener() {
            Marker markerWisma1 = mMap.addMarker(new MarkerOptions().position(WISMA1).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Wisma Tamu Nusa Indah").visible(false));
            Marker markerWisma2 = mMap.addMarker(new MarkerOptions().position(WISMA2).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Wisma Tamu").visible(false));
            @Override
            public void onClick(View view) {
                if (((CheckBox) view).isChecked()) {
                    markerWisma1.setVisible(true);
                    markerWisma2.setVisible(true);
                }
                else {
                    markerWisma1.setVisible(false);
                    markerWisma2.setVisible(false);

                }
            }
        });

        // Cafe
        checkBox5.setOnClickListener(new View.OnClickListener() {
            Marker markerCafe1 = mMap.addMarker(new MarkerOptions().position(KANTINDWP).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Kantin DWP").visible(false));
            Marker markerCafe2 = mMap.addMarker(new MarkerOptions().position(KANTINMZB).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Kantin Museum Zoologi Bogor").visible(false));
            Marker markerCafe3 = mMap.addMarker(new MarkerOptions().position(KANTINDED).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Cafe Dedaunan").visible(false));
            @Override
            public void onClick(View view) {
                if (((CheckBox) view).isChecked()) {
                    markerCafe1.setVisible(true);
                    markerCafe2.setVisible(true);
                    markerCafe3.setVisible(true);
                }
                else {
                    markerCafe1.setVisible(false);
                    markerCafe2.setVisible(false);
                    markerCafe3.setVisible(false);

                }
            }
        });

        // Toilet
        checkBox6.setOnClickListener(new View.OnClickListener() {
            Marker markerToilet1 = mMap.addMarker(new MarkerOptions().position(TOILET1).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Toilet").visible(false));
            Marker markerToilet2 = mMap.addMarker(new MarkerOptions().position(TOILET2).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Toilet").visible(false));
            Marker markerToilet3 = mMap.addMarker(new MarkerOptions().position(TOILET3).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Toilet").visible(false));
            Marker markerToilet4 = mMap.addMarker(new MarkerOptions().position(TOILET4).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Toilet").visible(false));
            Marker markerToilet5 = mMap.addMarker(new MarkerOptions().position(TOILET5).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Toilet").visible(false));
            Marker markerToilet6 = mMap.addMarker(new MarkerOptions().position(TOILET6).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Toilet").visible(false));
            Marker markerToilet7 = mMap.addMarker(new MarkerOptions().position(TOILET7).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Toilet").visible(false));
            Marker markerToilet8 = mMap.addMarker(new MarkerOptions().position(TOILET8).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Toilet").visible(false));
            Marker markerToilet9 = mMap.addMarker(new MarkerOptions().position(TOILET9).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Toilet").visible(false));
            @Override
            public void onClick(View view) {
                if (((CheckBox) view).isChecked()) {
                    markerToilet1.setVisible(true);
                    markerToilet2.setVisible(true);
                    markerToilet3.setVisible(true);
                    markerToilet4.setVisible(true);
                    markerToilet5.setVisible(true);
                    markerToilet6.setVisible(true);
                    markerToilet7.setVisible(true);
                    markerToilet8.setVisible(true);
                    markerToilet9.setVisible(true);
                }
                else {
                    markerToilet1.setVisible(false);
                    markerToilet2.setVisible(false);
                    markerToilet3.setVisible(false);
                    markerToilet4.setVisible(false);
                    markerToilet5.setVisible(false);
                    markerToilet6.setVisible(false);
                    markerToilet7.setVisible(false);
                    markerToilet8.setVisible(false);
                    markerToilet9.setVisible(false);
                }
            }
        });

        // Musholla
        checkBox7.setOnClickListener(new View.OnClickListener() {
            Marker markerMosque1 = mMap.addMarker(new MarkerOptions().position(MOSQUE1).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Musholla").visible(false));
            Marker markerMosque2 = mMap.addMarker(new MarkerOptions().position(MOSQUE2).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Musholla").visible(false));
            Marker markerMosque3 = mMap.addMarker(new MarkerOptions().position(MOSQUE3).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Musholla").visible(false));
            Marker markerMosque4 = mMap.addMarker(new MarkerOptions().position(MOSQUE4).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Musholla").visible(false));
            @Override
            public void onClick(View view) {
                if (((CheckBox) view).isChecked()) {
                    markerMosque1.setVisible(true);
                    markerMosque2.setVisible(true);
                    markerMosque3.setVisible(true);
                    markerMosque4.setVisible(true);
                }
                else {
                    markerMosque1.setVisible(false);
                    markerMosque2.setVisible(false);
                    markerMosque3.setVisible(false);
                    markerMosque4.setVisible(false);

                }
            }
        });

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

    private void setUpMap() {

    }

    private void setUpMapIfNeeded() {

        if (mMap == null) {
            mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mMap)).getMap();
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(kebunRayaBogor, 15));
            if (mMap != null) {
                setUpMap();
            }

        }

    }

}
