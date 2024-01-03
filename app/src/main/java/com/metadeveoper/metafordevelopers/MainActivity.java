package com.metadeveoper.metafordevelopers;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    private WebView mywebView;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mywebView = findViewById(R.id.webViewI);
        mywebView.loadUrl("https://developers.facebook.com/docs/");
        mywebView.setWebViewClient(new WebViewClient());
        WebSettings webSettings= mywebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mywebView.getSettings().setBuiltInZoomControls(true);
        mywebView.getSettings().setDisplayZoomControls(false);
      //  progressBar = findViewById(R.id.preId);

    }

    @Override
    public void onBackPressed() {

        if(mywebView.canGoBack()){

            mywebView.goBack();
        }else {

            super.onBackPressed();
        }

    }
}