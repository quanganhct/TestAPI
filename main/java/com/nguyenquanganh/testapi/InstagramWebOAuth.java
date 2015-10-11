package com.nguyenquanganh.testapi;

import android.app.Dialog;
import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by nguyenquanganh on 10/11/15.
 */
public class InstagramWebOAuth extends Dialog{

    private final String authUrl = "https://instagram.com/oauth/authorize/";
    private String clientId = "";
    private String redirectUri = "";


    public InstagramWebOAuth(Context context) {
        super(context);

        clientId = context.getResources().getString(R.string.client_id);
        redirectUri = context.getResources().getString(R.string.redirect_url);
        String url = authUrl + "?client_id=" + clientId + "&redirect_uri=" + redirectUri + "&response_type=token";
        setContentView(R.layout.oath_webview_layout);
        WebView webview = (WebView) findViewById(R.id.webview);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl(url);
    }
}
