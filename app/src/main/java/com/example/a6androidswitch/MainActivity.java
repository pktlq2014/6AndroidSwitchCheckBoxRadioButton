package com.example.a6androidswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    Switch sWitch1;
    Button butTon1, butTon2;
    RadioGroup radioGroup;
    RadioButton radioButton1, radioButton2;
    CheckBox checkBox1, checkBox2, checkBox3;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sWitch1 = findViewById(R.id.sWitch1);
        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        radioGroup = findViewById(R.id.radioGroup);
        butTon1 = findViewById(R.id.butTon1);
        radioButton1 = findViewById(R.id.radioButton1);
        radioButton2 = findViewById(R.id.radioButton2);
        butTon2 = findViewById(R.id.butTon2);
        butTon2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(radioButton1.isChecked())
                {
                    Toast.makeText(MainActivity.this, "Bạn Chọn Trưa", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Bạn Chọn Sáng", Toast.LENGTH_SHORT).show();
                }
            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                switch (checkedId)
                {
                    case R.id.radioButton1:
                    {
                        Toast.makeText(MainActivity.this, "Bạn Chọn Trưa", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.radioButton2:
                    {
                        Toast.makeText(MainActivity.this, "Bạn Chọn Sáng", Toast.LENGTH_SHORT).show();
                        break;
                    }
                }
            }
        });
        butTon1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String a = "";
                if(checkBox1.isChecked() == true)
                {
                    a += checkBox1.getText();
                }
                Toast.makeText(MainActivity.this, a, Toast.LENGTH_SHORT).show();
            }
        });
        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if(isChecked == true)
                {
                    Toast.makeText(MainActivity.this, "Bạn Chọn Android", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Bạn Bỏ Android", Toast.LENGTH_SHORT).show();
                }
            }
        });
        sWitch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if(isChecked == true)
                {
                    Toast.makeText(MainActivity.this, "Bạn Mở", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Bạn Tắt", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
