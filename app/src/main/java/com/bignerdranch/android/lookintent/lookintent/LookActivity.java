package com.bignerdranch.android.lookintent.lookintent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LookActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_look);

        FragmentManager fm = getSupportFragmentManager(); // с учетом совместимости предыдущих устройств
        // передача объекта дя управления
        Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);
        if (fragment == null) {
            fragment = new LookFragment();
            fm.beginTransaction() // добавление в список фрагментов
                    .add(R.id.fragmentContainer, fragment)
                    .commit();
        }
    }
}
