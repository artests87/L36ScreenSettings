package com.example.artests.l36screensettings;

import android.content.Intent;
import android.graphics.Point;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //startActivity(new Intent(Settings.ACTION_DISPLAY_SETTINGS));
    }
    public void onClick(View v) {
        /*Display display = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        display.getSize(point);
        int screenWidth = point.x;
        int screenHeight = point.y;

        // Теперь получим необходимую информацию
        String width = Integer.toString(screenWidth);
        String height = Integer.toString(screenHeight);

        String orientation = Integer.toString(getResources().getConfiguration().orientation);
        String info = "Ширина: " + width + "; Высота: " + height+ "; Ориентация: " + orientation;

        TextView infoTextView = (TextView) findViewById(R.id.textViewInfo);
        infoTextView.setText(info);*/
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);

        String strScreen = "";
        strScreen += "Width: " + String.valueOf(metrics.widthPixels) + " pixels"
                + "\n";
        strScreen += "Height: " + String.valueOf(metrics.heightPixels) + " pixels"
                + "\n";
        strScreen += "The Logical Density: " + String.valueOf(metrics.density)
                + "\n";
        strScreen += "X Dimension: " + String.valueOf(metrics.xdpi) + " dot/inch"
                + "\n";
        strScreen += "Y Dimension: " + String.valueOf(metrics.ydpi) + " dot/inch"
                + "\n";
        strScreen += "The screen density expressed as dots-per-inch: "
                + metrics.densityDpi + "\n";
        strScreen += "A scaling factor for fonts displayed on the display: "
                + metrics.scaledDensity + "\n";

        TextView infoTextView = (TextView) findViewById(R.id.textViewInfo);
        infoTextView.setText(strScreen);
    }

}
