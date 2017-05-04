package ua.init.team.calcsimplelayout;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class CalcActivity extends Activity {

    private Button mBt01;
    private Button mBt02;
    private Button mBt03;
    private Button mBt04;
    private Button mBt05;
    private Button mBt06;
    private Button mBtClear;
    private Button mBtPlus;
    private Button mBtResult;

    private TextView mTvResult;

    private String res = "";
//    String[] numbers;

//    public String getRes() {
//        return res;
//    }
//
//    public void setRes(String res) {
//        this.res = res;
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        mTvResult = (TextView) findViewById(R.id.tv_result);


        mBt01 = (Button) findViewById(R.id.bt_1);
        mBt02 = (Button) findViewById(R.id.bt_2);
        mBt03 = (Button) findViewById(R.id.bt_3);
        mBt04 = (Button) findViewById(R.id.bt_4);
        mBt05 = (Button) findViewById(R.id.bt_5);
        mBt06 = (Button) findViewById(R.id.bt_6);
        mBtClear = (Button) findViewById(R.id.bt_clear);
        mBtPlus = (Button) findViewById(R.id.bt_plus);
        mBtResult = (Button) findViewById(R.id.bt_result);


        mBt01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Date date = new Date();
//                Toast.makeText(getApplicationContext(), "Вы нажали кнопку 1", Toast.LENGTH_SHORT).show();
//                mTvResult.setText("Нажата кнопка 1 " + date);
                method("1");
            }
        });

        mBt02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "Вы нажали кнопку 2", Toast.LENGTH_SHORT).show();
//                mTvResult.setText("Нажата кнопка 2");
                method("2");
            }
        });

        mBt03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                method("3");
            }
        });

        mBt04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                method("4");
            }
        });

        mBt05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                method("5");
            }
        });

        mBt06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                method("6");
            }
        });

        mBtClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res = "";
                mTvResult.setText("");
            }
        });

        mBtPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                method("+");  //prohibit several pluses in a row and like first sign


                if (!(res.isEmpty() || res.charAt(res.length() - 1) == 43)) {
                    method("+");
                }

////                if (!("" + res.charAt(res.length() - 1)).equals("+") &&
////                        !(res.equals(null)
////                        /*"" + mTvResult.getText().charAt(mTvResult.getText().length() - 1) != ""*/)) {
////                    method("+", res);
////                } else method("");
            }
        });

        mBtResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String[] numbers = res.split("\\+");

//                for (int i = 0; i < numbers.length; i++) {
//                    mTvResult.setText(numbers[i]);
//                }
//                res = "";
                int resInt = 0;
                try {
                    for (int i = 0; i < numbers.length; i++) {
                        resInt += Integer.parseInt(numbers[i]);
                    }
                    mTvResult.setText("" + resInt);
                    res = "" + resInt;
                }catch(Exception e){
//                    String couse = String.valueOf(e.getCause());
//                    Toast.makeText(getApplicationContext(), String.valueOf(e.getMessage())/*"Exception!"*/, Toast.LENGTH_SHORT).show();
                    mTvResult.setText(e.getMessage());

                }

//                for (String number : numbers) {
//                    try{
//                        resInt += Integer.parseInt(number);
//                    }catch (Exception e){
//                        Toast.makeText(getApplicationContext(), "Exception!", Toast.LENGTH_SHORT).show();
//                    }
//                }
//                res = String.valueOf(resInt);
//                mTvResult.setText(resInt);
//                res = "";
            }
        });


    }

//    void method(String s) {
////        Toast.makeText(getApplicationContext(), "Вы нажали кнопку 1", Toast.LENGTH_SHORT).show();
//        mTvResult.setText(mTvResult.getText() + s);
//    }

    void method(String s) {
        this.res += s;
        mTvResult.setText(this.res/*mTvResult.getText() + s*/);
        Toast.makeText(getApplicationContext(), this.res, Toast.LENGTH_SHORT).show();

    }


}
