package com.example.kalkulator_beneran;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer player;
    EditText angka1, angka2;
    TextView lbanga, lboperan;
    private Button tombol0;
    private Button tombol1;
    private Button tombol2;
    private Button tombol3;
    private Button tombol4;
    private Button tombol5;
    private Button tombol6;
    private Button tombol7;
    private Button tombol8;
    private Button tombol9;
    private Button tomboltambah;
    private Button tombolkurang;
    private Button tombolkali;
    private Button tombolbagi;
    private Button tombolsamadengan;
    private Button tombolclear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        angka1 = (EditText) findViewById(R.id.txtangka1);
        angka2 = (EditText) findViewById(R.id.txtangka2);
        tombol0 = findViewById(R.id.btn0);
        tombol1 = findViewById(R.id.btn1);
        tombol2 = findViewById(R.id.btn2);
        tombol3 = findViewById(R.id.btn3);
        tombol4 = findViewById(R.id.btn4);
        tombol5 = findViewById(R.id.btn5);
        tombol6 = findViewById(R.id.btn6);
        tombol7 = findViewById(R.id.btn7);
        tombol8 = findViewById(R.id.btn8);
        tombol9 = findViewById(R.id.btn9);
        tomboltambah = findViewById(R.id.btntambah);
        tombolkurang = findViewById(R.id.btnkurang);
        tombolkali = findViewById(R.id.btnkali);
        tombolbagi = findViewById(R.id.btnbagi);
        tombolsamadengan = findViewById(R.id.btnsamadengan);
        tombolclear = findViewById(R.id.btnclear);
        lbanga = findViewById(R.id.lblangka);
        lboperan = findViewById(R.id.lbloperan);
        player = new MediaPlayer();

        tombol0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angka2.setText(angka2.getText() + "0");

            }
        });
        tombol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angka2.setText(angka2.getText() + "1");

            }
        });
        tombol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angka2.setText(angka2.getText() + "2");

            }
        });
        tombol3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angka2.setText(angka2.getText() + "3");

            }
        });
        tombol4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angka2.setText(angka2.getText() + "4");

            }
        });
        tombol5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angka2.setText(angka2.getText() + "5");

            }
        });
        tombol6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angka2.setText(angka2.getText() + "6");

            }
        });
        tombol7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angka2.setText(angka2.getText() + "7");

            }
        });
        tombol8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angka2.setText(angka2.getText() + "8");

            }
        });
        tombol9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angka2.setText(angka2.getText() + "9");

            }
        });
        tombolclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angka2.setText("");
                angka1.setText("");

            }
        });
        tomboltambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lboperan.setText("+");
                angka1.setText(angka2.getText() + " " + lboperan.getText() + " ");
                lbanga.setText(angka2.getText());
                angka2.setText("");


            }
        });
        tombolkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lboperan.setText("-");
                angka1.setText(angka2.getText() + " " + lboperan.getText() + " ");
                lbanga.setText(angka2.getText());
                angka2.setText("");


            }
        });
        tombolkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lboperan.setText("x");
                angka1.setText(angka2.getText() + " " + lboperan.getText() + " ");
                lbanga.setText(angka2.getText());
                angka2.setText("");


            }
        });

        tombolbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lboperan.setText("/");
                angka1.setText(angka2.getText() + " " + lboperan.getText() + " ");
                lbanga.setText(angka2.getText());
                angka2.setText("");


            }
        });
        tombolsamadengan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angka1.setText(lbanga.getText() + " " + lboperan.getText() + " " + angka2.getText());

                if (lboperan.getText().toString().equals("+")) {
                    int ang1 = Integer.parseInt(lbanga.getText().toString());
                    int ang2 = Integer.parseInt(angka2.getText().toString());
                    int hasil = ang1 + ang2;

                    angka2.setText("= " + hasil);

                } else if (lboperan.getText().toString().equals("-")) {
                    int ang1 = Integer.parseInt(lbanga.getText().toString());
                    int ang2 = Integer.parseInt(angka2.getText().toString());
                    int hasil = ang1 - ang2;

                    angka2.setText("= " + hasil);

                } else if (lboperan.getText().toString().equals("x")) {
                    int ang1 = Integer.parseInt(lbanga.getText().toString());
                    int ang2 = Integer.parseInt(angka2.getText().toString());
                    int hasil = ang1 * ang2;

                    angka2.setText("= " + hasil);

                } else {
                    int ang1 = Integer.parseInt(lbanga.getText().toString());
                    int ang2 = Integer.parseInt(angka2.getText().toString());
                    int hasil = ang1 / ang2;

                    angka2.setText("= " + hasil);

                }
            }
        });
    }
}