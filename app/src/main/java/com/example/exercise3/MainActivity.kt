package com.example.exercise3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.buttonCalculate).setOnClickListener{
            val spinnerInput = findViewById<Spinner>(R.id.spinnerAge)
            val radioInput = findViewById<RadioGroup>(R.id.radioGroupGender)
            val checkboxInput = findViewById<CheckBox>(R.id.checkBoxSmoker)
            val ans = findViewById<TextView>(R.id.textViewPremium)

            var result: Int
            result = 0

            if(spinnerInput.getSelectedItem().toString().equals("Less than 17")){
                result = result + 60

            }else if(spinnerInput.getSelectedItem().toString().equals("17 to 25")){
                result = result + 70
                var value = radioInput.checkedRadioButtonId
                var rb = findViewById<RadioButton>(value)
                if(rb.text.equals("Male")){
                    result = result + 50
                }
                if(checkboxInput.isChecked){
                    result = result + 100
                }

            }else if(spinnerInput.getSelectedItem().toString().equals("26 to 30")){
                result = result + 90
                var value = radioInput.checkedRadioButtonId
                var rb = findViewById<RadioButton>(value)
                if(rb.text.equals("Male")){
                    result = result + 100
                }
                if(checkboxInput.isChecked){
                    result = result + 150
                }

            }else if(spinnerInput.getSelectedItem().toString().equals("31 to 40")){
                result = result + 120
                var value = radioInput.checkedRadioButtonId
                var rb = findViewById<RadioButton>(value)
                if(rb.text.equals("Male")){
                    result = result + 150
                }
                if(checkboxInput.isChecked){
                    result = result + 200
                }

            }else if(spinnerInput.getSelectedItem().toString().equals("41 to 55")){
                result = result + 150
                var value = radioInput.checkedRadioButtonId
                var rb = findViewById<RadioButton>(value)
                if(rb.text.equals("Male")){
                    result = result + 200
                }
                if(checkboxInput.isChecked){
                    result = result + 250
                }

            }else if(spinnerInput.getSelectedItem().toString().equals("More than 55")){
                result = result + 150
                var value = radioInput.checkedRadioButtonId
                var rb = findViewById<RadioButton>(value)
                if(rb.text.equals("Male")){
                    result = result + 200
                }
                if(checkboxInput.isChecked){
                    result = result + 300
                }

            }




            ans.setText(String.format("Insurance Premium : RM%d", result))
        }

        findViewById<Button>(R.id.buttonReset).setOnClickListener {
            val spinnerInput = findViewById<Spinner>(R.id.spinnerAge)
            val radioInput = findViewById<RadioGroup>(R.id.radioGroupGender)
            val checkboxInput = findViewById<CheckBox>(R.id.checkBoxSmoker)
            val ans = findViewById<TextView>(R.id.textViewPremium)

            spinnerInput.setSelection(0);
            radioInput.clearCheck();
            checkboxInput.setChecked(false);
            ans.setText("Insurance Premium :")
        }
    }
}
