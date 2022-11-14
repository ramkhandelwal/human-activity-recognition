package myapp.sensor_based_har;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class StatsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);

//          Intent intent1 = getIntent();
//        String message = intent1.getStringExtra(MainActivity.MSG);
//        TextView textView = findViewById(R.id.predicted_state);
//        textView.setText(message);
        //ShowStats();
    }

    public void ShowStats (View view){
        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);
        //Intent intent1 = getIntent();
    }




}





























