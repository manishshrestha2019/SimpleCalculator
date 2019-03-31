package com.example.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnZero,btnSum,btnDiv,btnMul,btnSub;
    TextView tvOut;
    private Button btnDot,btnC,btnEquals;


    boolean addBoolean, subBoolean, divBoolean, mulBoolean;
    float value1, value2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btnZero=findViewById(R.id.btnZero);
        btnC=findViewById(R.id.btnC);
        btnSum=findViewById(R.id.btnSum);
        btnDiv=findViewById(R.id.btnDiv);
        btnSub=findViewById(R.id.btnSub);
        btnMul=findViewById(R.id.btnMul);
        btnDot=findViewById(R.id.btnDot_);
        btnEquals=findViewById(R.id.btnEquals);
        tvOut=findViewById(R.id.tvOut);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnZero.setOnClickListener(this);
        btnDot.setOnClickListener(this);
        btnSum.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnC.setOnClickListener(this);
        btnEquals.setOnClickListener(this);
        tvOut.setOnClickListener(this);



    }
    public void onClick(View v){

        switch (v.getId())
        {
            case R.id.btn1:
                tvOut.setText(tvOut.getText().toString()+"1");
                break;

            case R.id.btn2:
                tvOut.setText(tvOut.getText().toString()+"2");
                break;

            case R.id.btn3:
                tvOut.setText(tvOut.getText().toString()+"3");
                break;
            case R.id.btn4:
                tvOut.setText(tvOut.getText().toString()+"4");
                break;
            case R.id.btn5:
                tvOut.setText(tvOut.getText().toString()+"5");
                break;
            case R.id.btn6:
                tvOut.setText(tvOut.getText().toString()+"6");
                break;
            case R.id.btn7:
                tvOut.setText(tvOut.getText().toString()+"7");
                break;
            case R.id.btn8:
                tvOut.setText(tvOut.getText().toString()+"8");
                break;
            case R.id.btn9:
                tvOut.setText(tvOut.getText().toString()+"9");
                break;
            case R.id.btnZero:
                tvOut.setText(tvOut.getText().toString()+"0");
                break;
            case R.id.btnDot_:
                tvOut.setText(tvOut.getText().toString()+".");
                break;


            case R.id.btnSum:
                if(tvOut==null)
                {
                    tvOut.setText("");
                }
                else{
                    value1=Float.parseFloat(tvOut.getText().toString());
                    addBoolean=true;
                    tvOut.setText("");
                }
                break;
            case R.id.btnSub:
            if(tvOut==null){
                tvOut.setText("");
            }
            else {
                value1=Float.parseFloat(tvOut.getText().toString());
                subBoolean=true;
                tvOut.setText("");
            }
            break;
            case R.id.btnDiv:
                if(tvOut==null){
                    tvOut.setText("");
                }
                else{
                    value1=Float.parseFloat(tvOut.getText().toString());
                    divBoolean=true;
                    tvOut.setText("");
                }
                break;

            case R.id.btnMul:
                if(tvOut==null){
                    tvOut.setText("");
                }
                else{
                    value1=Float.parseFloat(tvOut.getText().toString());
                    mulBoolean=true;
                    tvOut.setText("");
                }
                break;

            case R.id.btnEquals:
                value2=Float.parseFloat(tvOut.getText().toString());
                if(addBoolean)
                {
                    tvOut.setText((value1+value2)+"");
                }
                else if(subBoolean)
                {
                    tvOut.setText((value1-value2)+"");
                }
                else if(mulBoolean)
                {
                    tvOut.setText((value1*value2)+"");
                }
                else if(divBoolean)
                {
                    tvOut.setText((value1/value2)+"");
                }
                break;
            case R.id.btnC:
                tvOut.setText("");

        }

    }
}
