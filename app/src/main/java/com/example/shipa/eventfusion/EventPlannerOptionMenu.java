package com.example.shipa.eventfusion;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class EventPlannerOptionMenu extends AppCompatActivity {

    private DrawerLayout mDrawerLayout1;
    private ActionBarDrawerToggle mToggle1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_planner_option_menu);

        mDrawerLayout1 = (DrawerLayout) findViewById(R.id.drawerLayout1);
        mToggle1 = new ActionBarDrawerToggle(this, mDrawerLayout1, R.string.open1, R.string.close1);

        mDrawerLayout1.addDrawerListener(mToggle1);
        mToggle1.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (mToggle1.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
