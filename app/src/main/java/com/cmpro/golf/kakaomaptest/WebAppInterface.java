package com.cmpro.golf.kakaomaptest;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.Toast;

public class WebAppInterface {
    Context mContext;
    WebView mWebView;

    public WebAppInterface(WebView webView, MainActivity mainActivity){
        mWebView = webView;
        mContext = mainActivity;
    }

    @JavascriptInterface
    public void showToast(String toast) {
        Toast.makeText(mContext, toast ,Toast.LENGTH_SHORT).show();
    }

}
