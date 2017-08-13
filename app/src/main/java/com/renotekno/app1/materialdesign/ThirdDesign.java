package com.renotekno.app1.materialdesign;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class ThirdDesign extends AppCompatActivity {

    private DrawerLayout navigationDrawer;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private Toolbar toolbarNavigationDrawer;
    private NavigationView navView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_design);

        initView();

        toolbarNavigationDrawer.setTitle("Hooman Lord");

        actionBarDrawerToggle = new ActionBarDrawerToggle(this, navigationDrawer, toolbarNavigationDrawer, R.string.drawer_open, R.string.drawer_close);
        navigationDrawer.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                navigationDrawer.closeDrawer(GravityCompat.START);
                return true;
            }
        });
    }

    private void initView() {
        navigationDrawer = (DrawerLayout) findViewById(R.id.navigationDrawer);
        toolbarNavigationDrawer = (Toolbar) findViewById(R.id.toolbarNavigationDrawer);
        navView = (NavigationView) findViewById(R.id.nav_view);
    }

    public class MyBroadcastReceiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {

        }
    }
}
