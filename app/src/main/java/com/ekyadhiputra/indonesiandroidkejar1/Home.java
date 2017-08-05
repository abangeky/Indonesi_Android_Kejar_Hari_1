package com.ekyadhiputra.indonesiandroidkejar1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void birthday(View view){
        Intent pindah = new Intent(Home.this, BelajarBirthday.class);
        pindah.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // MISAL ADA 2 ACTIVITY, 1 -> 2, lalu di back, jadi actovity 1, lalu di back, langsung exit
        startActivity(pindah);
    }

    public void weight(View view){
        Intent pindah = new Intent(Home.this, BelajarWeight.class);
        pindah.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // MISAL ADA 2 ACTIVITY, 1 -> 2, lalu di back, jadi actovity 1, lalu di back, langsung exit
        startActivity(pindah);
    }

    public void scroll(View view){
        Intent pindah = new Intent(Home.this, BelajarScroll.class);
        pindah.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // MISAL ADA 2 ACTIVITY, 1 -> 2, lalu di back, jadi actovity 1, lalu di back, langsung exit
        startActivity(pindah);
    }

    public void transparent(View view){
        Intent pindah = new Intent(Home.this, BelajarTransparent.class);
        pindah.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // MISAL ADA 2 ACTIVITY, 1 -> 2, lalu di back, jadi actovity 1, lalu di back, langsung exit
        startActivity(pindah);
    }
}
