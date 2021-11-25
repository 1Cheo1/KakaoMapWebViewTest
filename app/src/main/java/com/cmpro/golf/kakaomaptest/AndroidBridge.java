package com.cmpro.golf.kakaomaptest;

import android.os.Handler;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;

public class AndroidBridge {
    private String TAG ="AndroidBridge";
    final public Handler handler = new Handler();

    private WebView mAppView;
    private MainActivity mContext;

    public AndroidBridge(WebView _mAppView, MainActivity _mContext){
        mAppView = _mAppView;
        mContext = _mContext;
    }

    @JavascriptInterface
    public void call_log ( final String _message){

        Log.d(TAG, _message);

        handler.post(new Runnable() {
            @Override
            public void run() {
                mAppView.loadUrl("javascript:alert('[" + _message + "] 라고 로그");
            }
        });
    }
}
