package com.example.livedatapoc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class MainActivity extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = findViewById(R.id.webView);
        final String encodedURL;
        try {
            encodedURL = URLEncoder.encode("https://afdian.net/a/cleversheep", "UTF-8");
            webView.loadUrl(encodedURL);
            //webView.loadUrl(encodedURL);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        try {
            URL url = new URL(encodedURL);
            webView.loadUrl(String.valueOf(url));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
     //   webView.loadUrl("https://afdian.net/a/cleversheep");
       // webView.loadUrl("https://www.google.com/");
    }
}
