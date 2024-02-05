package com.example.calenderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.time.LocalDate
import java.time.format.DateTimeFormatter

public class MainActivity extends AppCompatActivity

{
    private TextView monthYearText;
    private RecyclerView calendarRecyclerView;
    private LocalDate selectedDate;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    initWidgets();
    selectedDate = LocalDate.now();
    setMonthView();
    }

    private void initWidgets()
    {
       calendarRecyclerView = findViewbyId(R.id.calendarRecyclerView);
        monthYearText = findViewById(R.id.monthYearTV);
    }

    private void setMonthView()
    {
        monthYearText.setText(monthYearFromDate(selectedDate));
        ArrayList<String> daysInMonth = daysInMonthArray(selectedDate);
    }

    private String monthYearFromDate(LocalDate date)
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM yyyy");
        return date.format(formatter);
    }

    public void previousMonthAction(View view)
    {

    }

    public void nextMonthAction(View view)
    {

    }
}
