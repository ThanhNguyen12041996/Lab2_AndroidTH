package com.example.minhthanh.clicklistener;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final int REQUEST_ACT_MainActivity2 =  1000;
    private static final int REQUEST_ACT_MainActivity3 =  2000;

    TextView textview;
    ImageView img;
    String url;
    String ContentReturn, ColorReturn = "pink";


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textview = (TextView)findViewById(R.id.textview);
        textview.setText("KHTN-DTVT");
        textview.setTextColor(getResources().getColor(R.color.pink));
        img = (ImageView)findViewById(R.id.imageView);
        Picasso.with(getApplicationContext()).load(url).into(img);

        Button button1 = (Button)findViewById(R.id.button1);
        Button button2 = (Button)findViewById(R.id.button2);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

}

    private void StartBActivity()
    {

        Intent i = new Intent(MainActivity.this,MainActivity2.class);
        i.putExtra("Content", textview.getText().toString());
        i.putExtra("Color"  , ColorReturn);
        startActivityForResult(i,REQUEST_ACT_MainActivity2);

    }

    private void StartCActivity()
    {
        Intent Main3 = new Intent(MainActivity.this, MainActivity3.class);
        startActivityForResult(Main3,REQUEST_ACT_MainActivity3);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if( requestCode == REQUEST_ACT_MainActivity2) {
            if (resultCode == RESULT_OK) {

                ContentReturn = data.getStringExtra("Content");
                ColorReturn = data.getStringExtra("Color");
                GotoSetup(ContentReturn, ColorReturn);
            }
        }

        else if(requestCode == REQUEST_ACT_MainActivity3)
        {
            if(resultCode == RESULT_OK)
            {
                String url = data.getStringExtra("URL");
                Picasso.with(getApplicationContext()).load(url).into(img);
            }
        }
    }

    public void GotoSetup(String content, String color)
    {
        textview.setText(content);
        if( color.equalsIgnoreCase("pink"))
            textview.setTextColor(getResources().getColor(R.color.pink));

        else if( color.equalsIgnoreCase("purple"))
            textview.setTextColor(getResources().getColor(R.color.purple));

        else if( color.equalsIgnoreCase("indigo"))
            textview.setTextColor(getResources().getColor(R.color.indigo));

        else if( color.equalsIgnoreCase("blue"))
            textview.setTextColor(getResources().getColor(R.color.blue));

        else if( color.equalsIgnoreCase("teal"))
            textview.setTextColor(getResources().getColor(R.color.teal));

        else if( color.equalsIgnoreCase("green"))
                textview.setTextColor(getResources().getColor(R.color.green));

    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.button1)
                StartBActivity();
        else
                StartCActivity();

    }
}
