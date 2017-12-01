package br.usjt.ftce.arqdesis.phoneworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    public static final String PHONEWORLD = "br.usjt.ftce.arqdesis.phoneworld.phone";
    EditText phoneWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phoneWorld = (EditText)findViewById(R.id.phoneworld);
    }

    public void converter(View view) {
        String phone = phoneWorld.getText().toString();
        Intent intent = new Intent(this, PhoneActivity.class);
        intent.putExtra(PHONEWORLD, phone);
        startActivity(intent);
    }
}
