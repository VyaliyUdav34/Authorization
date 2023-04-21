package com.example.authorization;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {
    int start_x = 0; // координата X при нажатии
     int end_x = 0; // кордината X при отпуске
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//Функция определения свайпа
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) { // определение метода
            case MotionEvent.ACTION_UP: // если нажатие
                start_x = (int) event.getX(); // определяем координату X
                break; // конец
            case MotionEvent.ACTION_DOWN: // если отжатие
                end_x = (int) event.getX(); // определяем координату X
                break;
        }
        if (start_x != 0 && end_x != 0) { // если координаты не 0
            if (start_x > end_x) { // если начальная координата больше конечной // свайп влево
                setContentView(R.layout.activity_main); // меняем экран
            } else if (start_x < end_x) { // если начальная координата меньше последн // свайп вправо
                setContentView(R.layout.reg); // меняем экран

            }
            start_x = 0; // обнуляем координаты
            end_x = 0; // обнуляем координаты
        }
        return false;
    }
}


