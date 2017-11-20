package org.davidscanlon.tipcalculator;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
/*
        Button btn15 = (Button) findViewById(R.id.button_15);
        Button btn20 = (Button) findViewById(R.id.button_20);
        Button btn25 = (Button) findViewById(R.id.button_25);

        btn15.setEnabled(false);
        btn20.setEnabled(false);
        btn25.setEnabled(false);
*/
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void percentButtonClicked(View view) {

        // create objects to get control of what is inputted into the total field
        // and what is outputted to the tip output
        TextView tip_output = (TextView) findViewById(R.id.tip_text);
        EditText total_input = (EditText) findViewById(R.id.total_field);
        double total = Double.parseDouble(total_input.getText().toString());
        double tip;
        // getId returns an int, so we need to compare the int to the ids
        // of the buttons
        int id = view.getId();
        total_input.getText();


        if (id == R.id.button_15) {
            if (total_input.getText() != null) {
                tip = total * .15;
                tip_output.setText("$" + String.format("%.2f", tip));
            }
        } else if (id == R.id.button_20) {
            if (total_input.getText() != null) {
                tip = total * .20;
                tip_output.setText("$" + String.format("%.2f", tip));
            }
        } else if (id == R.id.button_25) {
            if (total_input.getText() != null) {
                tip = total * .25;
                tip_output.setText("$" + String.format("%.2f", tip));
            }
        }


    }
}

/*



*/