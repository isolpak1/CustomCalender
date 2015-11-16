package com.sayoneTech.customCalender.calender;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;

/**
 * Created by rahul on 16/11/15.
 */
public class MainActivity extends ActionBarActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HashSet<Date> events = new HashSet<>();
        events.add(new Date());

        CalendarView calendarView = ((CalendarView)findViewById(R.id.calendar_view));
        calendarView.updateCalendar(events);

        calendarView.setmEventHandler(new CalendarView.EventHandler() {
            @Override
            public void onDayLongPress(Date date) {
                DateFormat dateFormat = SimpleDateFormat.getDateInstance();
                Toast.makeText(MainActivity.this, dateFormat.format(date), Toast.LENGTH_SHORT).show();
            }
        });
    }
}