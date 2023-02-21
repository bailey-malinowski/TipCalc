package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    Button calcbutton;
    TextView total;
    TextView tip;
    RadioButton split;
    RadioButton one;
    EditText numppl;
    EditText subtotal;
    SeekBar seekbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calcbutton = findViewById(R.id.calculatebutton);
        total = findViewById(R.id.total);
        tip = findViewById(R.id.tiptext);
        split = findViewById(R.id.splitcost);
        one = findViewById(R.id.onecheck);
        numppl = findViewById(R.id.enternumber);
        subtotal = findViewById(R.id.entersubtotal);
        seekbar = findViewById(R.id.tipbar);

        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                tip.setText(i+"");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        double tipnum;
      //  tipnum = Double.valueOf(tip);
        double tippercent;
       // tippercent = tipnum.getDouble();
       // tippercent *= subtotal;
        //tippercent += subtotal;
        //double tipcalc;
        //tipcalc = subtotal + tippercent;
        calcbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ;
                ///formula do math here
                //if onecheck cliced, dvide by numppl
                // total.setText(n);
            }
        });

    }


}