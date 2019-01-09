package comt.dcm.legal;

import android.webkit.WebViewClient;
import android.webkit.*;

public class MyWebViewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {

        view.loadUrl(url);
        return true;
    }
}
