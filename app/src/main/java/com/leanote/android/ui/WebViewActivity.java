
package com.leanote.android.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.webkit.WebView;

/**
 * Basic activity for displaying a WebView.
 */
public abstract class WebViewActivity extends AppCompatActivity {
    /** Primary webview used to display content. */

    protected static String URL = "";

    protected WebView mWebView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
//        supportRequestWindowFeature(Window.FEATURE_PROGRESS);
//
        super.onCreate(savedInstanceState);
//
    }

    @Override
    protected void onPause() {
        super.onPause();
        // Flash video may keep playing if the webView isn't paused here
        pauseWebView();
    }

    @Override
    protected void onResume() {
        super.onResume();
        resumeWebView();
    }

    private void pauseWebView() {
        if (mWebView != null) {
            mWebView.onPause();
        }
    }

    private void resumeWebView() {
        if (mWebView != null) {
            mWebView.onResume();
        }
    }

    /**
     * Load the specified URL in the webview.
     *
     * @param url URL to load in the webview.
     */
    protected void loadUrl(String url) {
        mWebView.loadUrl(url);
    }

    @Override
    public void onBackPressed() {
        if (mWebView != null && mWebView.canGoBack())
            mWebView.goBack();
        else
            super.onBackPressed();
    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
