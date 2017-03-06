package hk.com.sunnyng.androidluckydraw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void drawNextLuckyNumber(View v) {
        Random random = new Random();
        int luckcyNumber = random.nextInt(100) + 1;
        TextView luckyNumberTextView = (TextView) findViewById(R.id.lucky_number);
        luckyNumberTextView.setText(String.valueOf(luckcyNumber));

    }
}
