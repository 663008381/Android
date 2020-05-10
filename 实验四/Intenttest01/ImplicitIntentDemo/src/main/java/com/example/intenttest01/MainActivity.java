package com.example.intenttest01;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.intenttest01.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button bn;
    private EditText et_url;
    private String urlHead="http://";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }



    private void initView() {
        bn= (Button) findViewById(R.id.bn);

        et_url= (EditText) findViewById(R.id.edit_text);
        bn.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(urlHead+et_url.getText().toString()));
        Intent choose=Intent.createChooser(intent,"选择一个浏览器");
        startActivity(choose);


    }
}