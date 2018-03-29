package com.example.a13_da.albom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private int num1 = 0;
    private int num2 = 0;

    private ImageView image1;
    private ImageView image2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);

        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                num1 = (num1 + 1) % 5;
                switch (num1){
                    case 0:
                        image1.setImageResource(R.drawable.dog1);
                        break;
                    case 1:
                        image1.setImageResource(R.drawable.dog2);
                        break;
                    case 2:
                        image1.setImageResource(R.drawable.dog3);
                        break;
                    case 3:
                        image1.setImageResource(R.drawable.dog4);
                        break;
                    case 4:
                        image1.setImageResource(R.drawable.dog5);
                        break;
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                num2 = (num2 + 1) % 5;
                switch (num2){
                    case 0:
                        image2.setImageResource(R.drawable.kot1);
                        break;
                    case 1:
                        image2.setImageResource(R.drawable.kot2);
                        break;
                    case 2:
                        image2.setImageResource(R.drawable.kot3);
                        break;
                    case 3:
                        image2.setImageResource(R.drawable.kot4);
                        break;
                    case 4:
                        image2.setImageResource(R.drawable.kot5);
                        break;
                }
            }
        });
    }
}
