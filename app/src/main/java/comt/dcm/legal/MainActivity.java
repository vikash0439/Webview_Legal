package comt.dcm.legal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.webkit.WebSettings;
import android.webkit.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = (WebView) findViewById(R.id.webview);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView.loadUrl("http://192.168.1.2:8080/LegalApp/login");  //enter url or domain here with http/https

        MyWebViewClient wb =new MyWebViewClient();
        webView.setWebViewClient(wb);


    }

}
