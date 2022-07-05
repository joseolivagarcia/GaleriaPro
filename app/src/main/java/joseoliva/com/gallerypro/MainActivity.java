package joseoliva.com.gallerypro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabs; //referencio el tab de opciones

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabs = findViewById(R.id.tabs);
        //añado las opciones que quiero al navegador tabs
        tabs.addTab(tabs.newTab().setText("Casa Real"));
        tabs.addTab(tabs.newTab().setText("Photocall"));
        tabs.addTab(tabs.newTab().setText("Deportes"));
        tabs.addTab(tabs.newTab().setText("Viajes"));
        tabs.addTab(tabs.newTab().setText("Editorial"));
        //si en lugar de texto queremos poner iconos seria con
        /*
        tabs.addTab(tabs.newTab().setIcon(R.drawable.ic_phone));
        tabs.addTab(tabs.newTab().setIcon(R.drawable.ic_phone));
        tabs.addTab(tabs.newTab().setIcon(R.drawable.ic_phone));
        tabs.addTab(tabs.newTab().setIcon(R.drawable.ic_phone));

         */
        tabs.setTabMode(TabLayout.MODE_SCROLLABLE); //con MODE_FIXED si tienes pocos tabs

        //para la escucha de los tabs (cuando los seleccionas)
        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Toast.makeText(MainActivity.this, "Has seleccionado: " + tabs.getSelectedTabPosition(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                
            }
        });
    }
}