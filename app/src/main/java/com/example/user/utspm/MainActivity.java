package com.example.user.utspm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    Intent i;
    String title;
    int image[] = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e};

    String nama[] = {"Persegi", "Lingkaran", "Segitiga", "Persegi Panjang",
            "Trapesium"};

    String detail[] = {"deskripsi",
            "The Nintendo)",
            " more. It was the first)",
            "built into the system. (1996)",
            "was the first Nintendo home"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listview = (ListView) findViewById(R.id.Listview);
        Customadapter customadapter = new Customadapter();
        listview.setAdapter(customadapter);
        listview.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                i = new Intent(this, pindah_activity.class);
                title = "Color TV Game series";
                i.putExtra("title", "Color TV Game series");
                i.putExtra("gambar", R.drawable.a);
                i.putExtra("detail", "The Color TV Game series includes five different pieces of hardware, each one with a unique game. Color TV Game systems did not have interchangeable cartridges, so each console could only play a single title. (1977-1979)");
                startActivity(i);
                break;

            case 1:
                i = new Intent(this, pindah_activity.class);
                title = "Nintendo Entertainment System";
                i.putExtra("title", "Nintendo Entertainment System");
                i.putExtra("gambar", R.drawable.b);
                i.putExtra("detail", "The Nintendo Entertainment System, an 8-bit system, was one of Nintendo's largest successes. Unlike the Color TV Games, the NES could play different titles that could be purchased at the store. (1985)");
                startActivity(i);
                break;

            case 2:
                i = new Intent(this, pindah_activity.class);
                title = "Super Nintendo Entertainment System";
                i.putExtra("title", "Super Nintendo Entertainment System");
                i.putExtra("gambar", R.drawable.c);
                i.putExtra("detail", "The Super Nintendo Entertainment System featured enhanced graphics, a brand new controller, and more. It was the first 16-bit console by Nintendo. (1991)");
                startActivity(i);
                break;

            case 3:
                i = new Intent(this, pindah_activity.class);
                title = "Nintendo 64";
                i.putExtra("title", "Nintendo 64");
                i.putExtra("gambar", R.drawable.d);
                i.putExtra("detail", "The Nintendo 64 featured greatly improved 3D graphics and a new controller that introduced the modern joystick. It was also the first home console to have four controller ports built into the system. (1996)");
                startActivity(i);
                break;

            case 4:
                i = new Intent(this, pindah_activity.class);
                title = "GameCube";
                i.putExtra("title", "GameCube");
                i.putExtra("gambar", R.drawable.e);
                i.putExtra("detail", "The GameCube featured enhanced graphics and a new controller. The games came on mini-discs. It was the first Nintendo home console to solely use a disc format for games. (2001)");
                startActivity(i);
                break;

        }
    }
    class Customadapter extends BaseAdapter {

        @Override
        public int getCount() {
            return image.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup parent) {
            view = getLayoutInflater().inflate(R.layout.customlayout, null);
            ImageView imageView = (ImageView) view.findViewById(R.id.imgv);
            TextView names = (TextView) view.findViewById(R.id.tv1);
            TextView detailss = (TextView) view.findViewById(R.id.tv2);

            imageView.setImageResource(image[i]);
            names.setText(nama[i]);
            detailss.setText(detail[i]);

            return view;
        }
    }
}
