package com.example.sehh3165group2_readera;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    public static final String tag = "ReadEra";
    NavigationView navigationView;
    public DrawerLayout drawerLayout;
    public ActionBarDrawerToggle actionBarDrawerToggle;
    public Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.DrawerLayout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.drawer_open, R.string.drawer_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        navigationView = findViewById(R.id.NavigationView);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setItemIconTintList(null);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        switch (item.getItemId())
        {
            case R.id.menu_ClearList:

                break;
            case R.id.menu_SortBy:

                break;
            case R.id.menu_Filter:

                break;
            case R.id.menu_ShareTheReader:

                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.drawer_ReadingNow:
                Log.d(tag, "You have chosen Reading Now");
                Toast.makeText(this, item.getTitle().toString(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.drawer_BooksAndDocuments:
                Log.d(tag, "You have chosen Books & documents");
                Toast.makeText(this, item.getTitle().toString(), Toast.LENGTH_SHORT).show();
            case R.id.drawer_Favorites:
                Log.d(tag, "You have chosen Favorites");
                Toast.makeText(this, item.getTitle().toString(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.drawer_ToRead:
                Log.d(tag, "You have chosen To Read");
                Toast.makeText(this, item.getTitle().toString(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.drawer_HaveRead:
                Log.d(tag, "You have chosen Have Read");
                Toast.makeText(this, item.getTitle().toString(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.drawer_Collections:
                Log.d(tag, "You have chosen Collections");
                Toast.makeText(this, item.getTitle().toString(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.drawer_Trash:
                Log.d(tag, "You have chosen Trash");
                Toast.makeText(this, item.getTitle().toString(), Toast.LENGTH_SHORT).show();
                break;
        }
        return false;
    }
}