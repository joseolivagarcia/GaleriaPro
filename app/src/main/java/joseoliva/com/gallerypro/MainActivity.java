package joseoliva.com.gallerypro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;
import android.view.Menu;
import android.view.MenuItem;

import joseoliva.com.gallerypro.Fragments.CasaRealFragment;
import joseoliva.com.gallerypro.Fragments.CurriFragment;
import joseoliva.com.gallerypro.Fragments.DeportesFragment;
import joseoliva.com.gallerypro.Fragments.EditorialFragment;
import joseoliva.com.gallerypro.Fragments.PhotocallFragment;
import joseoliva.com.gallerypro.Fragments.SobremiFragment;
import joseoliva.com.gallerypro.Fragments.ViajesFragment;

public class MainActivity extends AppCompatActivity {

    TabLayout tabs; //referencio el tab de opciones

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //para usar la toolbar que yo he creado
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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

        //cargamos el fragment principal (el de casa real que es el primer tab)
        openFragment(new CasaRealFragment());

        //para la escucha de los tabs (cuando los seleccionas)
        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tabs.getSelectedTabPosition();
                switch (position){
                    case 0:
                        openFragment(new CasaRealFragment());
                        return;
                    case 1:
                        openFragment(new PhotocallFragment());
                        return;
                    case 2:
                        openFragment(new DeportesFragment());
                        return;
                    case 3:
                        openFragment(new ViajesFragment());
                        return;
                    case 4:
                        openFragment(new EditorialFragment());
                        return;
                    default:
                        break;

                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                
            }
        });

    }

    //para poner menus en el toolbar sobreescribo estos dos metodos
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.mimenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        switch (item.getItemId()){
            case R.id.quiensoy:
                openFragment(new SobremiFragment());
                return true;
            case R.id.curriculum:
                openFragment(new CurriFragment());
                return true;
            case R.id.twitter:
                Toast.makeText(this, "teitter", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.instagram:
                Toast.makeText(this, "instagram", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.whatsapp:
                Toast.makeText(this, "whatsapp", Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void openFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}