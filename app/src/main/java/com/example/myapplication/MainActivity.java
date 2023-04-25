package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.io.Serializable;
public class MainActivity extends AppCompatActivity {
    private EditText ID;
    private EditText route;
    private EditText timeStart;
    private EditText timeEnd;
    private EditText trainCar;
    private Button button;
    private EditText place;
    private String IDIn;
    private String routeIn;
    private String timeStartIn;
    private String timeEndIn;
    private String trainCarIn;
    private String placeIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ID=findViewById(R.id.ID);
        route=findViewById(R.id.route);
        timeStart=findViewById(R.id.timeStart);
        timeEnd=findViewById(R.id.timeEnd);
        trainCar=findViewById(R.id.trainCar);
        place=findViewById(R.id.place);
        button=findViewById(R.id.button);
        button.setOnClickListener(listener);
    }
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            IDIn = ID.getText().toString();
            routeIn = route.getText().toString();
            timeStartIn = timeStart.getText().toString();
            timeEndIn = timeEnd.getText().toString();
            trainCarIn = trainCar.getText().toString();
            placeIn = place.getText().toString();
            User user =new User(IDIn, routeIn, timeStartIn, timeEndIn, trainCarIn, placeIn);
            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
            intent.putExtra(User.class.getSimpleName(), user);
            startActivity(intent);
        }
    };
}