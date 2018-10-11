package com.example.sanzarouth.gitpractice;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);

        final int first = getResources().getColor(R.color.colorAccent);
        final int second = getResources().getColor(R.color.colorPrimary);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ColorDrawable buttonColor = (ColorDrawable) view.getBackground();
                int colorId = buttonColor.getColor();

                if (colorId == first) {
                   view.setBackgroundColor(second);
                } else {
                    view.setBackgroundColor(first);
                }
            }
        });
    }
}
