package com.example.minhthanh.clicklistener;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    View imgShow;

    @BindView(R.id.iv1) ImageView  img1;
    @BindView(R.id.iv2) ImageView  img2;
    @BindView(R.id.iv3) ImageView  img3;
    @BindView(R.id.iv4) ImageView  img4;
    @BindView(R.id.iv5) ImageView  img5;
    @BindView(R.id.iv6) ImageView  img6;
    @BindView(R.id.btnSave) Button btnSave;
    @BindView(R.id.edt) EditText editText;
    String color;
    String Content, Color;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imgShow = (View) findViewById(R.id.viewSample);
        ButterKnife.bind(this);
        Bundle bundle = getIntent().getExtras();

        if( bundle != null) {
             Content = bundle.getString("Content");
             Color   = bundle.getString("Color");
        }


        editText.setText(Content);
        if( Color.equalsIgnoreCase("pink")) {
            editText.setTextColor(getResources().getColor(R.color.pink));
            imgShow.setBackgroundResource(R.color.pink);
        }
        else if( Color.equalsIgnoreCase("purple")){
            editText.setTextColor(getResources().getColor(R.color.purple));
            imgShow.setBackgroundResource(R.color.purple);
        }
        else if( Color.equalsIgnoreCase("indigo")) {
            editText.setTextColor(getResources().getColor(R.color.indigo));
            imgShow.setBackgroundResource(R.color.indigo);
        }
        else if( Color.equalsIgnoreCase("blue")){
            editText.setTextColor(getResources().getColor(R.color.blue));
            imgShow.setBackgroundResource(R.color.blue);
        }
        else if( Color.equalsIgnoreCase("teal")){
            editText.setTextColor(getResources().getColor(R.color.teal));
            imgShow.setBackgroundResource(R.color.teal);
        }
        else if( Color.equalsIgnoreCase("green")) {
            editText.setTextColor(getResources().getColor(R.color.green));
            imgShow.setBackgroundResource(R.color.green);
        }
    }

    @OnClick(R.id.iv1)
    public void iv1( View view)
    {
        imgShow.setBackgroundResource(R.color.pink);
        color = "pink";
    }

    @OnClick(R.id.iv2)
    public void iv2( View view)
    {
        imgShow.setBackgroundResource(R.color.purple);
        color = "purple";
    }

    @OnClick(R.id.iv3)
    public void iv3( View view)
    {
        imgShow.setBackgroundResource(R.color.indigo);
        color = "indigo";
    }

    @OnClick(R.id.iv4)
    public void iv4( View view)
    {
        imgShow.setBackgroundResource(R.color.blue);
        color = "blue";
    }

    @OnClick(R.id.iv5)
    public void iv5(View view)
    {
        imgShow.setBackgroundResource(R.color.teal);
        color = "teal";
    }

    @OnClick(R.id.iv6)
    public void iv6( View view)
    {
        imgShow.setBackgroundResource(R.color.green);
        color = "green";
    }

    @Override
    public void onClick(View view) {

        Intent i = new Intent();
        i.putExtra("Content", editText.getText().toString());
        i.putExtra("Color", color);
        setResult(RESULT_OK, i);
        finish();
    }
}
