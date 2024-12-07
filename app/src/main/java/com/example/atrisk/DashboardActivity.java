package com.example.atrisk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dashboard);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });




        TextView textViewRedirect = findViewById(R.id.textView14);
        textViewRedirect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoReport = new Intent(DashboardActivity.this, ReportActivity.class);
                startActivity(gotoReport);
            }
        });

        TextView textViewRedirect2 = findViewById(R.id.textView13);
        textViewRedirect2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoPrepare = new Intent(DashboardActivity.this, PrepareActivity.class);
                startActivity(gotoPrepare);
            }
        });

        TextView textViewRedirect3 = findViewById(R.id.textView15);
        textViewRedirect3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoNewsFeed = new Intent(DashboardActivity.this, NewsFeedActivity.class);
                startActivity(gotoNewsFeed);
            }
        });

        TextView textViewRedirect4 = findViewById(R.id.textView16);
        textViewRedirect4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoProfile = new Intent(DashboardActivity.this, Profile.class);
                startActivity(gotoProfile);
            }
        });
    }
}
