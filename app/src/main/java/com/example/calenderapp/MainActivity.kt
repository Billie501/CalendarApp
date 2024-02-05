package com.example.calenderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

public class MainActivity extends AppCompatActivity
{
    private TextView monthYearText;
    private RecyclerView calendarRecyclerView;
    private LocalDate selectedDate;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initWidgets();
    }

    private void initWidgets()
    {
        calendarRecyclerView = findViewById(R.id.calendarRecyclerView);
    }

    fun previousMonthAction(view: View) {}
}