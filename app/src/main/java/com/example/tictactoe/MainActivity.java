package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button but1, but2, but3, but4, but5, but6, but7, but8, but9, butre;
String b1, b2, b3, b4, b5, b6, b7, b8, b9;
int flag = 0;
int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        butre.setOnClickListener(view -> newgame());


    }

    private void init(){
        but1 = findViewById(R.id.but1);
        but1.setOnClickListener(onClickListener);

        but2 = findViewById(R.id.but2);
        but2.setOnClickListener(onClickListener);

        but3 = findViewById(R.id.but3);
        but3.setOnClickListener(onClickListener);

        but4 = findViewById(R.id.but4);
        but4.setOnClickListener(onClickListener);

        but5 = findViewById(R.id.but5);
        but5.setOnClickListener(onClickListener);

        but6 = findViewById(R.id.but6);
        but6.setOnClickListener(onClickListener);

        but7 = findViewById(R.id.but7);
        but7.setOnClickListener(onClickListener);

        but8 = findViewById(R.id.but8);
        but8.setOnClickListener(onClickListener);

        but9 = findViewById(R.id.but9);
        but9.setOnClickListener(onClickListener);

        butre = findViewById(R.id.butre);
    }

    private final View.OnClickListener onClickListener = this::Check;

    public void Check(View v){
        Button curbtn = (Button) v;
        if(curbtn.getText().toString().equals("")) {
            count++;
            if (flag == 0) {
                curbtn.setText("X");
                flag = 1;
            } else {
                curbtn.setText("O");
                flag = 0;
            }

            if (count > 4) {
                b1 = but1.getText().toString();
                b2 = but2.getText().toString();
                b3 = but3.getText().toString();
                b4 = but4.getText().toString();
                b5 = but5.getText().toString();
                b6 = but6.getText().toString();
                b7 = but7.getText().toString();
                b8 = but8.getText().toString();
                b9 = but9.getText().toString();

                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                    Toast.makeText(this, "Winner is : " + b1, Toast.LENGTH_SHORT).show();
                    delay();
                } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                    Toast.makeText(this, "Winner is : " + b4, Toast.LENGTH_SHORT).show();
                    delay();
                } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                    Toast.makeText(this, "Winner is : " + b7, Toast.LENGTH_SHORT).show();
                    delay();
                } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
                    Toast.makeText(this, "Winner is : " + b1, Toast.LENGTH_SHORT).show();
                    delay();
                } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                    Toast.makeText(this, "Winner is : " + b2, Toast.LENGTH_SHORT).show();
                    delay();
                } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                    Toast.makeText(this, "Winner is : " + b3, Toast.LENGTH_SHORT).show();
                    delay();
                } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                    Toast.makeText(this, "Winner is : " + b1, Toast.LENGTH_SHORT).show();
                    delay();
                } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                    Toast.makeText(this, "Winner is : " + b3, Toast.LENGTH_SHORT).show();
                    delay();
                }else if(count == 9){
                    Toast.makeText(this, "Game is Draw", Toast.LENGTH_SHORT).show();
                    delay();
                }
            }
        }
    }


    public void newgame(){
        but1.setText("");
        but2.setText("");
        but3.setText("");
        but4.setText("");
        but5.setText("");
        but6.setText("");
        but7.setText("");
        but8.setText("");
        but9.setText("");
        flag = 0;
        count = 0;
    }

    public void delay(){
        new Handler().postDelayed(this::newgame, 3000);
    }
}