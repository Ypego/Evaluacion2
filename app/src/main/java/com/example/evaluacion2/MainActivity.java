package com.example.evaluacion2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioButton domicilio;
    CheckBox op1,op2,op3,op4;
    Button bcalcular, bpagar;
    TextView tpagar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        domicilio=findViewById(R.id.domicilio);
        op1=findViewById(R.id.cbd1);
        op2=findViewById(R.id.cbd2);
        op3=findViewById(R.id.cbd3);
        op4=findViewById(R.id.cbd4);
        tpagar=findViewById(R.id.total);
    }

    public void calcular (View view)
    {
        int total=0;
        if (domicilio.isChecked())
            total=total+2500;
        if (op1.isChecked())
            total=total+2900;
        if (op2.isChecked())
            total=total+3500;
        if (op3.isChecked())
            total=total+3500;
        if (op4.isChecked())
            total=total+2600;

        tpagar.setText("Total: "+ total);

    }

    public void pagar (View view)
    {
        domicilio.setChecked(false);
        op1.setChecked(false);
        op2.setChecked(false);
        op3.setChecked(false);
        op4.setChecked(false);
        tpagar.setText("Total: 0");
    }

}