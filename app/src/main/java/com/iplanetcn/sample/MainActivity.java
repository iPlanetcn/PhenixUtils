package com.iplanetcn.sample;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.iplanetcn.util.AppUtils;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvInfo = findViewById(R.id.tv_info);

        PackageInfo packageInfo = AppUtils.getPackageInfo(this);
        Log.i("PackageInfo", packageInfo.toString());
        String versionName = AppUtils.getVersionName(this);
        Integer versionCode = AppUtils.getVersionCode(this);
        String info = String.format(Locale.ENGLISH,
                "VersionName:%s\nVersionCode:%d",
                versionName,
                versionCode);
        tvInfo.setText(info);

    }
}
