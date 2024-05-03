package com.example.clase_vr_5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Spinner;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    FrameLayout frm_inicio;
    BottomNavigationView btn_navigation;

    InicioFragment iniciofragment = new InicioFragment();
    NudoFragment nudofragment = new NudoFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frm_inicio = findViewById(R.id.frm_inicio);
        btn_navigation = findViewById(R.id.btn_navigation);
        btn_navigation.setOnItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.nav_inicio) {
                    loadFragment(iniciofragment);
                    return true;
                } else if (item.getItemId() == R.id.nav_nudo) {
                    loadFragment(nudofragment);
                    return true;
                }
                return false;
            }

        });
    }

    public void loadFragment(Fragment fr){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frm_inicio, fr);
        transaction.commit();
    }



}
