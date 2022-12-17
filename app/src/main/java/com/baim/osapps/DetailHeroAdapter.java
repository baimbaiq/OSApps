package com.baim.osapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailHeroAdapter extends AppCompatActivity {
    TextView name, detail, link;
    String n_name, n_detail, n_link;
    int n_photo;
    ImageView photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_hero_adapter);

        Bundle bundle = getIntent().getExtras();
        n_name = bundle.getString("name");
        n_detail = bundle.getString("detail");
        n_photo = bundle.getInt("photo");
        n_link = bundle.getString("link");

        name = (TextView) findViewById(R.id.detail_name);
        detail = (TextView) findViewById(R.id.detail_detail);
        photo = (ImageView) findViewById(R.id.img_item_photo);
        link = (TextView) findViewById(R.id.text_view_url);

        name.setText(""+n_name);
        detail.setText(""+n_detail);
        link.setText(""+n_link);

        Glide.with(DetailHeroAdapter.this)
                .load(n_photo)
                .apply(new RequestOptions().override(370, 370))
                .into(photo);
    }
}