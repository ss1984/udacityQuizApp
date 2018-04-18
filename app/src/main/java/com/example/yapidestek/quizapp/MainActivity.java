package com.example.yapidestek.quizapp;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.view.View;
import android.widget.EditText;
import android.widget.CheckBox;
import android.widget.Button;
public class MainActivity extends AppCompatActivity
{
    int result;
    Button submitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
  public void onRadioButtonClicked1(View view)
    {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.radio_1:
                if (checked)
                    result++;
                    break;
            case R.id.radio_2:
                if (checked)
                    result--;
                    break;
        }
    }
    public void onRadioButtonClicked2(View view)
    {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.radio_1:
                if (checked)
                    result++;
                break;
            case R.id.radio_2:
                if (checked)
                    result--;
                break;
        }
    }
    public void onEditTextInput(View view)
    {
        EditText editText = (EditText) findViewById(R.id.plain_text_input);
        String editTextValue = editText.getText().toString();
        if(editTextValue.equalsIgnoreCase("ate"))
         result++;
        else result--;

        EditText editText1 = (EditText) findViewById(R.id.plain_text_input1);
        String editTextValue1 = editText1.getText().toString();
        if(editTextValue1.equalsIgnoreCase("at"))
            result++;
        else result--;
    }
    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch(view.getId()) {
            case R.id.cb1:
                if (checked)
                    result++;
            case R.id.cb2:
                if (checked)
                    result++;
            case R.id.cb3:
                if (checked)
                    result--;
            case R.id.cb4:
                if (checked)
                    result--;
                break;
        }
    }
    public void onSubmitButtonClicked(View view)
    {
        String message = "your score out of 5 is: " + result;
        submitButton = (Button) findViewById(R.id.submitButton);
        submitButton.setText(message);

    }
}

