package ua.init.team.calcsimplelayout;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CalcActivity extends Activity {

    private Button mBt01;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);



        mBt01 = (Button)findViewById(R.id.bt_1);
        mBt01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Вы нажали кнопку 1", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
