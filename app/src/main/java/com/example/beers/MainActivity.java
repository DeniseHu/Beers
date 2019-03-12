package com.example.beers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.beers.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

        /** Called when the user taps the Send button */
        public void sendMessage(View view) {
            // Do something in response to button
            Intent intent = new Intent(this, GuinnessGenerousAle.class);
            String message = "Hello from DetailActivity";
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);

        }
}
