package com.example.krestikinoliki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    TextView txt;

    static int player = 0;
    public void Rez()
    {
        if(player == 0) {
            player = 1;
            txt.setText("Ход: Нолики");
        }
        else {
            player = 0;
            txt.setText("Ход: Крестики");
        }
        if((btn1.getText() == "X" && btn2.getText() == "X" && btn3.getText() == "X") || (btn4.getText() == "X" && btn5.getText() == "X" && btn6.getText() == "X") || (btn7.getText() == "X" && btn8.getText() == "X" && btn9.getText() == "X" || (btn1.getText() == "X" && btn4.getText() == "X" && btn7.getText() == "X") ||(btn2.getText() == "X" && btn5.getText() == "X" && btn8.getText() == "X") ||(btn3.getText() == "X" && btn6.getText() == "X" && btn9.getText() == "X") ||(btn1.getText() == "X" && btn5.getText() == "X" && btn9.getText() == "X") ||(btn3.getText() == "X" && btn5.getText() == "X" && btn7.getText() == "X")))
        {
            Intent intent = new Intent(MainActivity.this,MainActivity2.class);
            intent.putExtra("Value","Победили");
            intent.putExtra("Value2","Крестики!");
            startActivity(intent);
        }
        else if((btn1.getText() == "O" && btn2.getText() == "O" && btn3.getText() == "O") || (btn4.getText() == "O" && btn5.getText() == "O" && btn6.getText() == "O") || (btn7.getText() == "O" && btn8.getText() == "O" && btn9.getText() == "O" || (btn1.getText() == "O" && btn4.getText() == "O" && btn7.getText() == "O") ||(btn2.getText() == "O" && btn5.getText() == "O" && btn8.getText() == "O") ||(btn3.getText() == "O" && btn6.getText() == "O" && btn9.getText() == "O") ||(btn1.getText() == "O" && btn5.getText() == "O" && btn9.getText() == "O") ||(btn3.getText() == "O" && btn5.getText() == "O" && btn7.getText() == "O")))
        {
            Intent intent = new Intent(MainActivity.this,MainActivity2.class);
            intent.putExtra("Value","Победили");
            intent.putExtra("Value2","Нолики!");
            startActivity(intent);
        }
        else if((btn1.getText() != "" && btn2.getText() != "" && btn3.getText() != "" && btn4.getText() != "" && btn5.getText() != "" && btn6.getText() != "" && btn7.getText() != "" && btn8.getText() != "" && btn9.getText() != ""))
        {
            Intent intent = new Intent(MainActivity.this,MainActivity2.class);
            intent.putExtra("Value","Ничья!");
            intent.putExtra("Value2","");
            startActivity(intent);
        }
        else{}

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1Click);
        btn2 = findViewById(R.id.btn2Click);
        btn3 = findViewById(R.id.btn3Click);
        btn4 = findViewById(R.id.btn4Click);
        btn5 = findViewById(R.id.btn5Click);
        btn6 = findViewById(R.id.btn6Click);
        btn7 = findViewById(R.id.btn7Click);
        btn8 = findViewById(R.id.btn8Click);
        btn9 = findViewById(R.id.btn9Click);
        txt = findViewById(R.id.textView2);
        txt.setText("Ход: Крестики");
        player = 0;
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(player == 0)
                    btn1.setText("X");
                else
                    btn1.setText("O");
                btn1.setClickable(false);
                Rez();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(player == 0)
                    btn2.setText("X");
                else
                    btn2.setText("O");
                btn2.setClickable(false);
                Rez();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(player == 0)
                    btn3.setText("X");
                else
                    btn3.setText("O");
                btn3.setClickable(false);
                Rez();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(player == 0)
                    btn4.setText("X");
                else
                    btn4.setText("O");
                btn4.setClickable(false);
                Rez();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(player == 0)
                    btn5.setText("X");
                else
                    btn5.setText("O");
                btn5.setClickable(false);
                Rez();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(player == 0)
                    btn6.setText("X");
                else
                    btn6.setText("O");
                btn6.setClickable(false);
                Rez();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(player == 0)
                    btn7.setText("X");
                else
                    btn7.setText("O");
                btn7.setClickable(false);
                Rez();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(player == 0)
                    btn8.setText("X");
                else
                    btn8.setText("O");
                btn8.setClickable(false);
                Rez();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(player == 0)
                    btn9.setText("X");
                else
                    btn9.setText("O");
                btn9.setClickable(false);
                Rez();
            }
        });
    }
}