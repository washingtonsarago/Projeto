package br.com.ccfacil.ccfacil;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

import Model.Item;
import Model.ListaAdapterItem;


public class MainActivity extends Activity
        implements NavigationView.OnNavigationItemSelectedListener {

    private ListView listaNavigation;
    private String [] consultasDisponiveis = {
            "Completa CNPJ", "Monitoramento de CPF", "Monitoramento de CNPJ",
            "Cheques", "Pendências", "Cheques + Pendências", "Cheques + Pendências + Protestos",
            "Telefones por CPF", "Endereços por CPF/CNPJ", "Endereço por Telefone", "Negativação de Devedores"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        ///
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ArrayList<Item> lista = new ArrayList<>();
        Item a = new Item(R.drawable.ic_atings_filled_50, "Completa CNPJ", "Serasa Experian");
        Item b = new Item(R.drawable.ic_atings_filled_50, "Monitoramento de CPF", "Serasa Experian");
        Item c = new Item(R.drawable.ic_atings_filled_50, "Monitoramento de CNPJ", "Serasa Experian");
        Item d = new Item(R.drawable.ic_atings_filled_50, "Cheques", "Serasa Experian");
        Item e = new Item(R.drawable.ic_atings_filled_50, "Pendências", "Serasa Experian");
        Item f = new Item(R.drawable.ic_atings_filled_50, "Cheques + Pendências", "Serasa Experian");
        Item g = new Item(R.drawable.ic_atings_filled_50, "Cheques + Pendências + Protestos", "Serasa Experian");
        Item h = new Item(R.drawable.ic_atings_filled_50, "Telefones por CPF", "Serasa Experian");
        Item i = new Item(R.drawable.ic_atings_filled_50, "Endereços por CPF/CNPJ", "Serasa Experian");
        Item j = new Item(R.drawable.ic_atings_filled_50, "Endereço por Telefone", "Serasa Experian");
        Item k = new Item(R.drawable.ic_atings_filled_50, "CNegativação de Devedores", "Serasa Experian");



        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);
        lista.add(e);
        lista.add(f);
        lista.add(g);
        lista.add(h);
        lista.add(i);
        lista.add(j);
        lista.add(k);

        ListaAdapterItem adapterItem = new ListaAdapterItem(this, lista);

        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapterItem);
//
//            listaNavigation = (ListView) findViewById(R.id.listView);
//            ArrayAdapter<String> adapter = new ArrayAdapter<String>(
//                    getApplicationContext(),
//                    android.R.layout.simple_list_item_1,
//                    android.R.id.text1,
//                    consultasDisponiveis
//            );
//
//          //  listaNavigation.setAdapter(adapter);



//        TextView txt = (TextView)findViewById(R.id.texto);
//        String resultado = "Resultado"; //TODO criar chamada para metodo Async
//        txt.setText(resultado);


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_alterar_senha) {
        }
        else if (id == R.id.nav_assinaturasativas) {

        } else if (id == R.id.nav_cadastro) {

        } else if (id == R.id.nav_cartoesdecredito) {

        } else if (id == R.id.nav_econsultasefetuadas) {

        } else if (id == R.id.nav_entrar) {
            startActivities(new Intent[]{new Intent(MainActivity.this, LoginActivity.class)});
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
