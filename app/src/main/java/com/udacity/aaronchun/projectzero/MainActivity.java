package com.udacity.aaronchun.projectzero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button movie_btn;
    private Button stock_btn;
    private Button reader_btn;
    private Button news_btn;
    private Button project_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movie_btn = (Button) findViewById(R.id.movie);
        stock_btn = (Button) findViewById(R.id.stock);
        reader_btn = (Button) findViewById(R.id.reader);
        news_btn = (Button) findViewById(R.id.news);
        project_btn = (Button) findViewById(R.id.graduation_project);

        //注册Button按钮点击事件
        movie_btn.setOnClickListener(this);
        stock_btn.setOnClickListener(this);
        reader_btn.setOnClickListener(this);
        news_btn.setOnClickListener(this);
        project_btn.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.movie:
                Toast.makeText(MainActivity.this, getString(R.string.str_detail) + getString(R.string.str_movie), Toast.LENGTH_SHORT).show();
                break;
            case R.id.stock:

                Toast.makeText(MainActivity.this, getString(R.string.str_detail) + getString(R.string.str_stock), Toast.LENGTH_SHORT).show();
                break;
            case R.id.reader:
                Toast.makeText(MainActivity.this, getString(R.string.str_detail) + getString(R.string.str_reader), Toast.LENGTH_SHORT).show();

                break;
            case R.id.news:
                Toast.makeText(MainActivity.this, getString(R.string.str_detail) + getString(R.string.str_news), Toast.LENGTH_SHORT).show();

                break;
            case R.id.graduation_project:
                Toast.makeText(MainActivity.this, getString(R.string.str_detail) + getResources().getString(R.string.str_project), Toast.LENGTH_SHORT).show();

                break;
            default:
                break;

        }


    }
}
