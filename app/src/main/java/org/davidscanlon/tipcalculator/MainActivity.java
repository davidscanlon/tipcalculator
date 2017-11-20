package org.davidscanlon.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText total_input;
    private Button btn15, btn20, btn25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get control of the three tip buttons
        btn15 = (Button) findViewById(R.id.button_15);
        btn20 = (Button) findViewById(R.id.button_20);
        btn25 = (Button) findViewById(R.id.button_25);

        btn15.setEnabled(false);
        btn20.setEnabled(false);
        btn25.setEnabled(false);

        total_input = (EditText) findViewById(R.id.total_field);

        // add an event listener to activate percent buttons once a number is inputted
        total_input.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().trim().length() == 0) {
                    btn15.setEnabled(false);
                    btn20.setEnabled(false);
                    btn25.setEnabled(false);
                } else {
                    btn15.setEnabled(true);
                    btn20.setEnabled(true);
                    btn25.setEnabled(true);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    public void percentButtonClicked(View view) {

        // create objects to get control of what is inputted into the total field
        // and what is outputted to the tip output
        TextView tip_output = (TextView) findViewById(R.id.tip_text);
        TextView final_output = (TextView) findViewById(R.id.total_final_text);

        double total = Double.parseDouble(total_input.getText().toString());
        double tip;
        double finalAmount;

        // getId returns an int, so we need to compare the int to the ids
        // of the buttons
        int id = view.getId();
        total_input.getText();

        if (id == R.id.button_15) {

            tip = total * .15;
            finalAmount = total + tip;
            tip_output.setText("Tip: $" + String.format("%.2f", tip));
            final_output.setText("Final Amount: $" + String.format("%.2f", finalAmount));

        } else if (id == R.id.button_20) {

            tip = total * .20;
            finalAmount = total + tip;
            tip_output.setText("Tip: $" + String.format("%.2f", tip));
            final_output.setText("Final Amount: $" + String.format("%.2f", finalAmount));

        } else if (id == R.id.button_25) {

            tip = total * .25;
            finalAmount = total + tip;
            tip_output.setText("Tip: $" + String.format("%.2f", tip));
            final_output.setText("Final Amount: $" + String.format("%.2f", finalAmount));

        }
    }
}