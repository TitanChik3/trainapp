package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView dataMainActivity;
    private Button button;
    private User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        dataMainActivity= findViewById(R.id.dataMainActivity);
        button = findViewById(R.id.button);

        Bundle bundleIntent = getIntent().getExtras();
        if (bundleIntent != null){
            user = (User) bundleIntent.getSerializable(User.class.getSimpleName());
            dataMainActivity.setText("Имя пользователя " + user.getIDIn() + "\n"
                    + "Маршрут "+ user.getRouteIn() + "\n"
                    + "Дата и вермя отправления "+ user.getTimeStartIn() + "\n"
                    + "Дата и время прибытия "+ user.getTimeEndIn() + "\n"
                    + "Вагон "+ user.getTrainCarIn() + "\n"
                    + "Место "+ user.getPlaceIn() + "\n"
                    +  "Стоимость билета 110 рублей ");
        }
        button.setOnClickListener(listener);
    }
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            startActivity(intent);
        }
    };
}