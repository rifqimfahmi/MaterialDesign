package com.renotekno.app1.materialdesign;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class SecondDesign extends AppCompatActivity {

    private CollapsingToolbarLayout collapsingToolbar;
    private FloatingActionButton fabCatStare;
    private Toast catStareToast;
    private Toolbar catStareToolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_design);
        initView();

        setSupportActionBar(catStareToolBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        collapsingToolbar.setTitle("Cats");
        collapsingToolbar.setExpandedTitleColor(ContextCompat.getColor(this, android.R.color.transparent));

        fabCatStare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (catStareToast != null) {
                    catStareToast.cancel();
                }

                catStareToast = Toast.makeText(SecondDesign.this, "Meow!", Toast.LENGTH_SHORT);
                catStareToast.show();
            }
        });
    }

    private void initView() {
        collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        fabCatStare = (FloatingActionButton) findViewById(R.id.fab_cat_stare);
        catStareToolBar = (Toolbar) findViewById(R.id.catStareToolBar);
    }
}
