package com.example.dell.imagesurfaceview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BigView bigView = (BigView) findViewById(R.id.img);
//从资产目录把图片转换成字节流
        InputStream inputStream = null;
        try {
            inputStream = getAssets().open("world.jpg");
        } catch (IOException e) {
            e.printStackTrace();
        }
//使用自定义控件,调用方法传入图片的字节流,进行图片的展示
        bigView.setInput(inputStream);
    }
}
