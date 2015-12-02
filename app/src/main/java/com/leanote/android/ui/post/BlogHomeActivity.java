package com.leanote.android.ui.post;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class BlogHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //setContentView(R.layout.activity_blog_home);
        WebView webview = new WebView(this);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        webview.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                // TODO Auto-generated method stub
                view.loadUrl(url);
                return true;
            }
        });

        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("http://www.google.com");
        setContentView(webview);
    }
}
