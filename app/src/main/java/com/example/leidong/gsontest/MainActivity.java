package com.example.leidong.gsontest;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.leidong.gsontest.json.Bean;
import com.google.gson.Gson;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tv_title;
    private ImageView iv_image;
    private TextView tv_url;
    private TextView tv_des;
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    /**
     * 获取组件
     */
    private void init() {
        tv_title = (TextView) findViewById(R.id.tv_title);
        iv_image = (ImageView) findViewById(R.id.iv_image);
        tv_url = (TextView) findViewById(R.id.tv_url);
        tv_des = (TextView) findViewById(R.id.tv_des);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
            {
                //证明.json可以成功解析
                //tv_title.setText(getJson(getApplicationContext(), "appwall.json"));
                String jsonStr = getJson(getApplicationContext(), "appwall.json");
                Gson gson = new Gson();
                Bean bean = gson.fromJson(jsonStr, Bean.class);
                Bean.Banner1Bean banner1Bean = bean.getBanner1();
                String title = banner1Bean.getTitle();
                String imageUrl = banner1Bean.getImage();
                String url = banner1Bean.getUrl();
                String des = banner1Bean.getDes();

                tv_title.setText(title);
                DisplayImageOptions options = new DisplayImageOptions.Builder()
                        .cacheInMemory(true)
                        .cacheOnDisk(true)
                        .bitmapConfig(Bitmap.Config.RGB_565)
                        .build();
                ImageLoader.getInstance().displayImage("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1490083480&di=46ae388205ac0d65d12b41fab5b532d4&imgtype=jpg&er=1&src=http%3A%2F%2Fimg1.cache.netease.com%2Fcatchpic%2FE%2FE5%2FE5EC40550F71C75E5F847F89F7EACBB6.jpg", iv_image, options);
                tv_url.setText(url);
                tv_des.setText(des);
            }
                break;
            case R.id.button2:
            {
                tv_title.setText("1234567890");
            }
                break;
            default:
                break;
        }
    }

    /**
     * 获取assets下的Json文件
     * @param context
     * @param fileName
     * @return
     */
    private static String getFromAssets(Context context, String fileName) {
        InputStreamReader inputReader = null;
        BufferedReader bufReader = null;
        try {
            inputReader = new InputStreamReader(context.getResources().getAssets().open(fileName));
            bufReader = new BufferedReader(inputReader);
            String line = "";
            String Result = "";
            while ((line = bufReader.readLine()) != null)
                Result += line;
            return Result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                inputReader.close();
                bufReader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 读取.json文件并将内容转为String类型
     * @param mContext
     * @param filename
     * @return
     */
    private static String getJson(Context mContext, String filename){
        StringBuilder stringBuilder = new StringBuilder();
        AssetManager assetManager = mContext.getAssets();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(assetManager.open(filename)));
            String nextLine = "";
            while((nextLine = bufferedReader.readLine()) != null){
                stringBuilder.append(nextLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString().trim();
    }
}
