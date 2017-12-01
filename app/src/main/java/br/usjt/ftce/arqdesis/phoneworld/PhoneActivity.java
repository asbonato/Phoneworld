package br.usjt.ftce.arqdesis.phoneworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PhoneActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);
        TextView phone = (TextView)findViewById(R.id.phonenumber);
        Intent intent = getIntent();
        String valor = intent.getStringExtra(MainActivity.PHONEWORLD);
        phone.setText(Conversor.converter(valor));
    }
}
