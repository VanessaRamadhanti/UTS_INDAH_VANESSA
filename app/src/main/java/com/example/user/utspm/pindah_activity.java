package com.example.user.utspm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class pindah_activity extends AppCompatActivity {
    ImageView imgv;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pindah_activity);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String txtTitle = getIntent().getStringExtra("title");//manggil nama label
        this.setTitle(txtTitle);//manggil nama label
        tv1=(TextView) findViewById(R.id.tv);
        Intent i=this.getIntent();
        tv1.setText(getIntent().getExtras().getString("detail"));
        imgv = (ImageView) findViewById(R.id.imgv);
        int image_link = i.getIntExtra("gambar",0);
        imgv.setImageResource(image_link);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()== android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
