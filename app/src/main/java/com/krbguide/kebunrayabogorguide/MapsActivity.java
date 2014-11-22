package com.krbguide.kebunrayabogorguide;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.Theme;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.krbguide.kebunrayabogorguide.adapter.CustomList1Adapter;
import com.krbguide.kebunrayabogorguide.adapter.CustomList2Adapter;
import com.krbguide.kebunrayabogorguide.list.CustomList1;
import com.krbguide.kebunrayabogorguide.list.CustomList2;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MapsActivity extends ActionBarActivity {

    /* AppCompat Toolbar */
    private Toolbar mToolbar;
    int mTitle = R.string.title_activity_maps;

    /* AppCompat Navigation Drawer */
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle drawerToggle;

    /* Navigation Key */
    private static long back_pressed;

    /* Google Maps */
    private GoogleMap mMap;

    /* Koordinat Lokasi */
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
    private LatLng GARDENSHOP = new LatLng(-6.60196, 106.79791);
    private LatLng LABTREUB = new LatLng(-6.60236, 106.79702);
    private LatLng LABKULTURJARINGAN = new LatLng(-6.59448, 106.80307);
    private LatLng PUSATKONSERVASIKRB = new LatLng(-6.59881, 106.79566);
    private LatLng MUSEUMZOOLOGI = new LatLng(-6.60340, 106.7970);
    private LatLng PEMBIBITAN = new LatLng(-6.60185, 106.79735);
    private LatLng LAPANGANTENNIS = new LatLng(-6.59422, 106.80247);
    private LatLng AREAOUTBOND = new LatLng(-6.59628, 106.80341);


    /* Activity onCreate Method */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        setUpMapIfNeeded();

        initToolbar();
        initDrawer();

    }

    /* Activity onResume Method */
    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();
    }

    /* AppCompat Toolbar */
    private void initToolbar() {
        mToolbar = (Toolbar) findViewById(R.id.util_toolbar);

        if (mToolbar != null) {
            mToolbar.setTitle(mTitle);
            setSupportActionBar(mToolbar);
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
        ListView lvDrawer1 = (ListView) findViewById(R.id.lv_maps_drawer1);

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
                    view.setSelected(true);
                } else if (mLabel.equals("Situs Favorit")) {
                    Intent intent = new Intent(getApplicationContext(), FeaturedActivity.class);
                    startActivity(intent);
                    // finish();
                } else if (mLabel.equals("Fasilitas Umum")) {
                    Intent intent = new Intent(getApplicationContext(), FacilitiesActivity.class);
                    startActivity(intent);
                    // finish();
                }

            }

        });


        /* AppCompat Drawer SecondaryMenu using ListView */
        ListView lvDrawer2 = (ListView) findViewById(R.id.lv_maps_drawer2);

        List<CustomList2> lvDrawerItem2 = new ArrayList<CustomList2>();

//        lvDrawerItem2.add(new CustomList2("Pengaturan"));
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
//                if (mLabel.equals("Pengaturan")) {
//                    Toast.makeText(getApplicationContext(), "Coming Soon", Toast.LENGTH_LONG).show();
//                    drawerLayout.closeDrawers();
                if (mLabel.equals("Bantuan")) {
                    Intent intent = new Intent(getApplicationContext(), HelpActivity.class);
                    startActivity(intent);
                } else if (mLabel.equals("Tentang")) {
                    Intent intent = new Intent(getApplicationContext(), AboutActivity.class);
                    startActivity(intent);
                }

            }

        });

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

    /* Naviation onBackPressed Method */
    @Override
    public void onBackPressed() {

        /* Using double backpressed to exit */
//        if (back_pressed + 2000 > System.currentTimeMillis()) super.onBackPressed();
//        else Toast.makeText(getBaseContext(), "Tekan tombol kembali sekali lagi untuk keluar!", Toast.LENGTH_SHORT).show();
//        back_pressed = System.currentTimeMillis();

        /* Using dialog box to exit */
        new MaterialDialog.Builder(this)
                .content("Anda yakin ingin keluar?")
                .positiveText(R.string.action_positive)
                .negativeText(R.string.action_negative)
                .callback(new MaterialDialog.Callback() {
                    @Override
                    public void onPositive(MaterialDialog dialog) {
                        finish();
                    }

                    @Override
                    public void onNegative(MaterialDialog dialog) {
                        return;
                    }
                })
                .build()
                .show();
    }

    /* SetUp Google Maps Marker */
    private void setUpMap() {

        // Kebun Raya Bogor
        final Marker mMarkerMain = mMap.addMarker(new MarkerOptions().position(kebunRayaBogor).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)).title("Kebun Raya Bogor").visible(false));

        // Pintu Utama
        final Marker mMarkerMainGate1 = mMap.addMarker(new MarkerOptions().position(PINTU1).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Pintu Masuk 1").visible(false));
        final Marker mMarkerMainGate2 = mMap.addMarker(new MarkerOptions().position(PINTU2).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Pintu Masuk 2").visible(false));
        final Marker mMarkerMainGate3 = mMap.addMarker(new MarkerOptions().position(PINTU3).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Pintu Masuk 3").visible(false));
        final Marker mMarkerMainGate4 = mMap.addMarker(new MarkerOptions().position(PINTU4).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Pintu Masuk 4").visible(false));

        // Situs Menarik
        final Marker mMarkerFeatured1 = mMap.addMarker(new MarkerOptions().position(TAMANTEIZMANN).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Taman Teizmann").visible(false));
        final Marker mMarkerFeatured2 = mMap.addMarker(new MarkerOptions().position(KOLAMGUNTING).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Kolam Gunting").visible(false));
        final Marker mMarkerFeatured3 = mMap.addMarker(new MarkerOptions().position(MONUMENDRJJSMITH).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Monumen Dr. JJ. Smith").visible(false));
        final Marker mMarkerFeatured4 = mMap.addMarker(new MarkerOptions().position(MAKAMBELANDA).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Makam Belanda").visible(false));
        final Marker mMarkerFeatured5 = mMap.addMarker(new MarkerOptions().position(TAMANMEXICO).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Taman Mexico").visible(false));
        final Marker mMarkerFeatured6 = mMap.addMarker(new MarkerOptions().position(AREAKELAPASAWIT).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Area Kelapa Sawit").visible(false));
        final Marker mMarkerFeatured7 = mMap.addMarker(new MarkerOptions().position(TAMANKOLEKSITUMBUHANAIR).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Taman Koleksi Tumbuhan Air").visible(false));
        final Marker mMarkerFeatured8 = mMap.addMarker(new MarkerOptions().position(MAKAMKRAMAT).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Makam Keramat").visible(false));
        final Marker mMarkerFeatured9 = mMap.addMarker(new MarkerOptions().position(JEMBATANGANTUNG).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Jembatan Gantung").visible(false));
        final Marker mMarkerFeatured10 = mMap.addMarker(new MarkerOptions().position(JEMBATANSURYALEMBAYUNG).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Jembatan Surya Lembayung").visible(false));
        final Marker mMarkerFeatured11 = mMap.addMarker(new MarkerOptions().position(RUMAHANGGREK).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Rumah Anggrek").visible(false));
        final Marker mMarkerFeatured12 = mMap.addMarker(new MarkerOptions().position(KOLAMTERATAIRAKSASA).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Kolam Teratai Raksasa").visible(false));
        final Marker mMarkerFeatured13 = mMap.addMarker(new MarkerOptions().position(TAMANLEBAKSUDJANA).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Taman Lebak Sudjana").visible(false));
        final Marker mMarkerFeatured14 = mMap.addMarker(new MarkerOptions().position(TAMANKOLEKSITUMBUHANOBAT).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Taman Koleksi Tumbuhan Obat").visible(false));
        final Marker mMarkerFeatured15 = mMap.addMarker(new MarkerOptions().position(GARDENSHOP).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Garden Shop").visible(false));
        final Marker mMarkerFeatured16 = mMap.addMarker(new MarkerOptions().position(LABTREUB).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Laboratorium Treub").visible(false));
        final Marker mMarkerFeatured17 = mMap.addMarker(new MarkerOptions().position(LABKULTURJARINGAN).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Laboratorium Kultur Jaringan").visible(false));
        final Marker mMarkerFeatured18 = mMap.addMarker(new MarkerOptions().position(PUSATKONSERVASIKRB).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Pusat Konservasi Kebun Raya Bogor (LIPI)").visible(false));
        final Marker mMarkerFeatured19 = mMap.addMarker(new MarkerOptions().position(MUSEUMZOOLOGI).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Museum Zoologi").visible(false));
        final Marker mMarkerFeatured20 = mMap.addMarker(new MarkerOptions().position(PEMBIBITAN).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Pembibitan").visible(false));
        final Marker mMarkerFeatured21 = mMap.addMarker(new MarkerOptions().position(LAPANGANTENNIS).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Lapangan Tennis").visible(false));
        final Marker mMarkerFeatured22 = mMap.addMarker(new MarkerOptions().position(AREAOUTBOND).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Area Outbond").visible(false));

        // Wisma
        final Marker mMarkerWisma1 = mMap.addMarker(new MarkerOptions().position(WISMA1).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Wisma Tamu Nusa Indah").visible(false));
        final Marker mMarkerWisma2 = mMap.addMarker(new MarkerOptions().position(WISMA2).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Wisma Tamu").visible(false));

        // Cafe
        final Marker mMarkerCafe1 = mMap.addMarker(new MarkerOptions().position(KANTINDWP).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Kantin DWP").visible(false));
        final Marker mMarkerCafe2 = mMap.addMarker(new MarkerOptions().position(KANTINMZB).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Kantin Museum Zoologi Bogor").visible(false));
        final Marker mMarkerCafe3 = mMap.addMarker(new MarkerOptions().position(KANTINDED).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Cafe Dedaunan").visible(false));

        // Toilet
        final Marker mMarkerToilet1 = mMap.addMarker(new MarkerOptions().position(TOILET1).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Toilet").visible(false));
        final Marker mMarkerToilet2 = mMap.addMarker(new MarkerOptions().position(TOILET2).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Toilet").visible(false));
        final Marker mMarkerToilet3 = mMap.addMarker(new MarkerOptions().position(TOILET3).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Toilet").visible(false));
        final Marker mMarkerToilet4 = mMap.addMarker(new MarkerOptions().position(TOILET4).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Toilet").visible(false));
        final Marker mMarkerToilet5 = mMap.addMarker(new MarkerOptions().position(TOILET5).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Toilet").visible(false));
        final Marker mMarkerToilet6 = mMap.addMarker(new MarkerOptions().position(TOILET6).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Toilet").visible(false));
        final Marker mMarkerToilet7 = mMap.addMarker(new MarkerOptions().position(TOILET7).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Toilet").visible(false));
        final Marker mMarkerToilet8 = mMap.addMarker(new MarkerOptions().position(TOILET8).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Toilet").visible(false));
        final Marker mMarkerToilet9 = mMap.addMarker(new MarkerOptions().position(TOILET9).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Toilet").visible(false));

        // Mosque
        final Marker mMarkerMosque1 = mMap.addMarker(new MarkerOptions().position(MOSQUE1).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Musholla").visible(false));
        final Marker mMarkerMosque2 = mMap.addMarker(new MarkerOptions().position(MOSQUE2).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Musholla").visible(false));
        final Marker mMarkerMosque3 = mMap.addMarker(new MarkerOptions().position(MOSQUE3).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Musholla").visible(false));
        final Marker mMarkerMosque4 = mMap.addMarker(new MarkerOptions().position(MOSQUE4).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)).title("Musholla").visible(false));

        /* AppCompat Drawer ThirdMenu using ListView */
        final String[] mPin = { "Kebun Raya Bogor", "Pintu Masuk", "Situs Favorit", "Wisma", "Cafe", "Toilet", "Musholla" };

        final ListView lvDrawer3 = (ListView) findViewById(R.id.lv_maps_drawer3);

        ArrayAdapter<String> adapterDrawer3 = new ArrayAdapter<String>(this, R.layout.simple_list_item_multiple_choice, mPin);
        lvDrawer3.setAdapter(adapterDrawer3);
        lvDrawer3.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

        lvDrawer3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                for (int i = 0; i < 6; i++) {
                    ListView lv = (ListView) parent;
                    if (lv.isItemChecked(position)) {
                        // Toast.makeText(getBaseContext(), "You checked " + mPin[position], Toast.LENGTH_SHORT).show();
                        if (mPin[position].equals("Kebun Raya Bogor")) {
                            mMarkerMain.setVisible(true);
                        } else if (mPin[position].equals("Pintu Masuk")) {
                            mMarkerMainGate1.setVisible(true);
                            mMarkerMainGate2.setVisible(true);
                            mMarkerMainGate3.setVisible(true);
                            mMarkerMainGate4.setVisible(true);
                        } else if (mPin[position].equals("Situs Favorit")) {
                            mMarkerFeatured1.setVisible(true);
                            mMarkerFeatured2.setVisible(true);
                            mMarkerFeatured3.setVisible(true);
                            mMarkerFeatured4.setVisible(true);
                            mMarkerFeatured5.setVisible(true);
                            mMarkerFeatured6.setVisible(true);
                            mMarkerFeatured7.setVisible(true);
                            mMarkerFeatured8.setVisible(true);
                            mMarkerFeatured9.setVisible(true);
                            mMarkerFeatured10.setVisible(true);
                            mMarkerFeatured11.setVisible(true);
                            mMarkerFeatured12.setVisible(true);
                            mMarkerFeatured13.setVisible(true);
                            mMarkerFeatured14.setVisible(true);
                            mMarkerFeatured15.setVisible(true);
                            mMarkerFeatured16.setVisible(true);
                            mMarkerFeatured17.setVisible(true);
                            mMarkerFeatured18.setVisible(true);
                            mMarkerFeatured19.setVisible(true);
                            mMarkerFeatured20.setVisible(true);
                            mMarkerFeatured21.setVisible(true);
                            mMarkerFeatured22.setVisible(true);
                        } else if (mPin[position].equals("Wisma")) {
                            mMarkerWisma1.setVisible(true);
                            mMarkerWisma2.setVisible(true);
                        } else if (mPin[position].equals("Cafe")) {
                            mMarkerCafe1.setVisible(true);
                            mMarkerCafe2.setVisible(true);
                            mMarkerCafe3.setVisible(true);
                        } else if (mPin[position].equals("Toilet")) {
                            mMarkerToilet1.setVisible(true);
                            mMarkerToilet2.setVisible(true);
                            mMarkerToilet3.setVisible(true);
                            mMarkerToilet4.setVisible(true);
                            mMarkerToilet5.setVisible(true);
                            mMarkerToilet6.setVisible(true);
                            mMarkerToilet7.setVisible(true);
                            mMarkerToilet8.setVisible(true);
                            mMarkerToilet9.setVisible(true);
                        } else if (mPin[position].equals("Musholla")) {
                            mMarkerMosque1.setVisible(true);
                            mMarkerMosque2.setVisible(true);
                            mMarkerMosque3.setVisible(true);
                            mMarkerMosque4.setVisible(true);
                        }
                    } else {
                        // Toast.makeText(getBaseContext(), "You unchecked " + mPin[position], Toast.LENGTH_SHORT).show();
                        if (mPin[position].equals("Kebun Raya Bogor")) {
                            mMarkerMain.setVisible(false);
                        } else if (mPin[position].equals("Pintu Masuk")) {
                            mMarkerMainGate1.setVisible(false);
                            mMarkerMainGate2.setVisible(false);
                            mMarkerMainGate3.setVisible(false);
                            mMarkerMainGate4.setVisible(false);
                        } else if (mPin[position].equals("Situs Favorit")) {
                            mMarkerFeatured1.setVisible(false);
                            mMarkerFeatured2.setVisible(false);
                            mMarkerFeatured3.setVisible(false);
                            mMarkerFeatured4.setVisible(false);
                            mMarkerFeatured5.setVisible(false);
                            mMarkerFeatured6.setVisible(false);
                            mMarkerFeatured7.setVisible(false);
                            mMarkerFeatured8.setVisible(false);
                            mMarkerFeatured9.setVisible(false);
                            mMarkerFeatured10.setVisible(false);
                            mMarkerFeatured11.setVisible(false);
                            mMarkerFeatured12.setVisible(false);
                            mMarkerFeatured13.setVisible(false);
                            mMarkerFeatured14.setVisible(false);
                            mMarkerFeatured15.setVisible(false);
                            mMarkerFeatured16.setVisible(false);
                            mMarkerFeatured17.setVisible(false);
                            mMarkerFeatured18.setVisible(false);
                            mMarkerFeatured19.setVisible(false);
                            mMarkerFeatured20.setVisible(false);
                            mMarkerFeatured21.setVisible(false);
                            mMarkerFeatured22.setVisible(false);
                        } else if (mPin[position].equals("Wisma")) {
                            mMarkerWisma1.setVisible(false);
                            mMarkerWisma2.setVisible(false);
                        } else if (mPin[position].equals("Cafe")) {
                            mMarkerCafe1.setVisible(false);
                            mMarkerCafe2.setVisible(false);
                            mMarkerCafe3.setVisible(false);
                        } else if (mPin[position].equals("Toilet")) {
                            mMarkerToilet1.setVisible(false);
                            mMarkerToilet2.setVisible(false);
                            mMarkerToilet3.setVisible(false);
                            mMarkerToilet4.setVisible(false);
                            mMarkerToilet5.setVisible(false);
                            mMarkerToilet6.setVisible(false);
                            mMarkerToilet7.setVisible(false);
                            mMarkerToilet8.setVisible(false);
                            mMarkerToilet9.setVisible(false);
                        } else if (mPin[position].equals("Musholla")) {
                            mMarkerMosque1.setVisible(false);
                            mMarkerMosque2.setVisible(false);
                            mMarkerMosque3.setVisible(false);
                            mMarkerMosque4.setVisible(false);
                        }
                    }
                }
            }
        });

    }

    /* SetUp Google Maps If Needed */
    private void setUpMapIfNeeded() {

        if (mMap == null) {

            mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mMap)).getMap();
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(kebunRayaBogor, 15));

            // Set User Location
            SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mMap);
            mMap = mapFragment.getMap();
            mMap.setMyLocationEnabled(true);

            // Marker InfoWindowListener
            mMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
                @Override
                public void onInfoWindowClick(Marker marker) {
                    try {
                        StringBuilder urlString = new StringBuilder();
                        String daddr = (String.valueOf(marker.getPosition().latitude)+","+String.valueOf(marker.getPosition().longitude));
                        urlString.append("http://maps.google.com/maps?f=d&hl=en");
                        urlString.append("&saddr="+String.valueOf(mMap.getMyLocation().getLatitude())+","+String.valueOf(mMap.getMyLocation().getLongitude()));
                        urlString.append("&daddr="+daddr);
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlString.toString()));
                        startActivity(intent);
                    } catch (Exception ee) {

                    }
                    return;
                }

            });

            if (mMap != null) {
                setUpMap();
            }

        }

    }

}
