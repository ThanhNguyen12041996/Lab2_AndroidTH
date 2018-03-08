package com.example.minhthanh.clicklistener;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity3 extends AppCompatActivity {


    String url = "";
    @BindView(R.id.imageView1) ImageView img1;
    @BindView(R.id.imageView2) ImageView img2;
    @BindView(R.id.imageView3) ImageView img3;

    @BindView(R.id.imageView4) ImageView img4;
    @BindView(R.id.imageView5) ImageView img5;
    @BindView(R.id.imageView6) ImageView img6;
    @BindView(R.id.button)     Button btn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ButterKnife.bind(this);


        Picasso.with(getApplicationContext()).load("https://uphinhnhanh.com/images/2018/03/07/shutterstock_280897220_huge.th.jpg").into(img1);
        Picasso.with(getApplicationContext()).load("https://uphinhnhanh.com/images/2018/03/07/shutterstock_316465280_huge.th.jpg").into(img2);
        Picasso.with(getApplicationContext()).load("http://sv1.upsieutoc.com/2018/03/07/MtPlus.md.jpg").into(img3);

        Picasso.with(getApplicationContext()).load("http://sv1.upsieutoc.com/2018/03/08/shutterstock_333376544_huge.md.jpg").into(img4);
        Picasso.with(getApplicationContext()).load("http://sv1.upsieutoc.com/2018/03/08/shutterstock_248651677_supersize.md.jpg").into(img5);
        Picasso.with(getApplicationContext()).load("http://sv1.upsieutoc.com/2018/03/08/shutterstock_390660301_huge.md.jpg").into(img6);

    }

    @OnClick(R.id.imageView1)
    public void iv1( View view) {
        url =  "https://uphinhnhanh.com/images/2018/03/07/shutterstock_280897220_huge.th.jpg" ;
    }

    @OnClick(R.id.imageView2)
    public void iv2( View view) {
        url =  "https://uphinhnhanh.com/images/2018/03/07/shutterstock_316465280_huge.th.jpg" ;
    }

    @OnClick(R.id.imageView3)
    public void iv3( View view) {
        url =  "http://sv1.upsieutoc.com/2018/03/07/MtPlus.md.jpg" ;
    }

    @OnClick(R.id.imageView4)
    public void iv4( View view) {
        url =  "http://sv1.upsieutoc.com/2018/03/08/shutterstock_333376544_huge.md.jpg" ;
    }

    @OnClick(R.id.imageView5)
    public void iv5( View view) {
        url =  "http://sv1.upsieutoc.com/2018/03/08/shutterstock_248651677_supersize.md.jpg" ;
    }

    @OnClick(R.id.imageView6)
    public void iv6( View view) {
        url =  "http://sv1.upsieutoc.com/2018/03/08/shutterstock_390660301_huge.md.jpg" ;
    }

    @OnClick(R.id.button)
    public void btn4( View view) {

        Intent i = new Intent();
        i.putExtra("URL", url);
        setResult(RESULT_OK, i);
        finish();
    }
    }

