package com.example.web

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    private lateinit var web_view:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        web_view=findViewById<WebView>(R.id.ac_main_webview)
        web_view.loadUrl("https://www.instagram.com/")
        web_view.webViewClient= WebViewClient()

    }

    override fun onBackPressed() {
        if(web_view.canGoBack()){
            web_view.goBack()
        }else {


            super.onBackPressed()
        }
    }
}