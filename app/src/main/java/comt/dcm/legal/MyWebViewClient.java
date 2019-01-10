package comt.dcm.legal;

import android.webkit.WebViewClient;
import android.webkit.*;

/**
 * Created by Vikash Kumar on 09-01-2019.
 */

public class MyWebViewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {

        view.loadUrl(url);  //load all url in webview
        return true;

    }
}
