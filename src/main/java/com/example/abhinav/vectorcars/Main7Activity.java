package com.example.abhinav.vectorcars;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class Main7Activity extends Activity {
    String[] vendors= {"ABC Cars", "ATS Rentals", "VOGO", "F1 Rentals", "MAHE Autos", "Swift Cars"};
    Integer[] logos= {R.drawable.img1,R.drawable.img1,R.drawable.img1,R.drawable.img1,R.drawable.img1};
    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,vendors);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
    }
}
