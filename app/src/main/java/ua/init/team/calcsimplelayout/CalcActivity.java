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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        mTvResult = (TextView)findViewById(R.id.tv_result);


        mBt01 = (Button)findViewById(R.id.bt_1);
        mBt02 = (Button)findViewById(R.id.bt_2);
        mBt03 = (Button)findViewById(R.id.bt_3);
        mBt04 = (Button)findViewById(R.id.bt_4);
        mBt05 = (Button)findViewById(R.id.bt_5);
        mBt06 = (Button)findViewById(R.id.bt_6);
        mBtClear = (Button)findViewById(R.id.bt_clear);
        mBtPlus = (Button)findViewById(R.id.bt_plus);
        mBtResult = (Button)findViewById(R.id.bt_result);

        mBt01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Date date = new Date();
                Toast.makeText(getApplicationContext(), "Вы нажали кнопку 1", Toast.LENGTH_SHORT).show();
                mTvResult.setText("Нажата кнопка 1 " + date);
            }
        });

        mBt02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Вы нажали кнопку 2", Toast.LENGTH_SHORT).show();
                mTvResult.setText("Нажата кнопка 2");
            }
        });



    }

//    private void method(){
//
//        Toast.makeText(getApplicationContext(), "Вы нажали кнопку 1", Toast.LENGTH_SHORT).show();
//        mTvResult.setText("Нажата кнопка 1 " + date);
//    }


}
