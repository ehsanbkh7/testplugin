package ir.sitecoder.testplugin;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ir.sitecoder.mylibrary.MyView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        View v = new MyView(this);
        setContentView(v);



    }



}