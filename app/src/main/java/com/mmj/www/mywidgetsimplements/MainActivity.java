package com.mmj.www.mywidgetsimplements;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnKeyListener, RadioGroup.OnCheckedChangeListener {
    String text1;
    String text2;
    String textviewresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText etname = (EditText)findViewById(R.id.edittextname);
        etname.setOnKeyListener(this);
        EditText etage = (EditText)findViewById(R.id.edittextage);
        etage.setOnKeyListener(this);
        Button btnr = (Button) findViewById(R.id.btnresult);
        btnr.setOnClickListener(this);
        RadioGroup radioGroupsex = (RadioGroup)findViewById(R.id.rgroupsex);
        RadioGroup radioGroupjob = (RadioGroup)findViewById(R.id.rgroupjob);
        RadioButton rbtnfemale = (RadioButton)findViewById(R.id.rbtn1);


//        EditText etname = (EditText)findViewById(R.id.edittextname);
//        EditText etage = (EditText)findViewById(R.id.edittextage);
//        text2 = etage.getText().toString();

    }

    @Override
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) && (i == KeyEvent.KEYCODE_ENTER)) {
            EditText etname = (EditText) findViewById(R.id.edittextname);
            text1 = etname.getText().toString();
            EditText etage = (EditText)findViewById(R.id.edittextage);
            text2 = etage.getText().toString();
            return true;
        }

        return false;
    }

    @Override
    public void onClick(View view) {
//       int id = view.getId();
        if (view.getId() == R.id.btnresult) {
            String text = "이름은" + text1 + ", 나이는" + text2 + "세, 성별은 ";
            TextView textviewresult = (TextView) findViewById(R.id.textviewresult);
            textviewresult.setText(text);
        }
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {

    }
}

