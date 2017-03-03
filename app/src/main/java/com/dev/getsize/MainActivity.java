package com.dev.getsize;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.tv)
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        DisplayMetrics metric = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metric);
        int width = metric.widthPixels;  //宽度（PX）
        int height = metric.heightPixels;  //高度（PX）
        float density = metric.density;  //密度（0.75 / 1.0 / 1.5）
        int densityDpi = metric.densityDpi;  //密度DPI（120 / 160 / 240）

        tv.setText("宽："+width+"--- 高："+height+"--- 密度："+density+"--- 密度DPI:"+densityDpi);


    }
}
