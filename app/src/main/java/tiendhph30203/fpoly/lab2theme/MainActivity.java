package tiendhph30203.fpoly.lab2theme;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     TextView fpoly;
     Button btn4;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fpoly = findViewById(R.id.tvFpoly);
        Typeface font = Typeface.createFromAsset(getAssets(),"blazed (1).ttf");
        fpoly.setTypeface(font);

    }
}