package com.example.memorymed;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.memorymed.model.Medication;

/**
 * Created by Cameron on 3/1/2015.
 */
public class AddDoctor extends Activity{

    TextView name;
    TextView number;
    TextView email;
    TextView address;

    ImageView imageView;

    Button saveBtn;
    Button selectImageBtn;

    Bitmap image;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adddoctor);
        setTitle("Add Doctor");
    }
}
