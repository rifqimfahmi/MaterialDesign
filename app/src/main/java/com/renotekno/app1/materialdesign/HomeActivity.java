package com.renotekno.app1.materialdesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    private Button firstDesign;
    private Button secondDesign;
    private Button thirdDesign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initView();

        firstDesign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startChosenDesignActivity(FirstDesign.class);
            }
        });

        secondDesign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startChosenDesignActivity(SecondDesign.class);
            }
        });

        thirdDesign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startChosenDesignActivity(ThirdDesign.class);
            }
        });

    }

    private void startChosenDesignActivity(Class<?> cls) {
        Intent intent = new Intent(HomeActivity.this, cls);
        startActivity(intent);
    }

    private void initView() {
        firstDesign = (Button) findViewById(R.id.firstDesign);
        secondDesign = (Button) findViewById(R.id.secondDesign);
        thirdDesign = (Button) findViewById(R.id.thirdDesign);
    }
}
