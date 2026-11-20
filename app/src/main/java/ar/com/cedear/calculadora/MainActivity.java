package ar.com.cedear.calculadora;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebSettings;
public class MainActivity extends Activity {
  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    WebView view = new WebView(this);
    view.setWebViewClient(new WebViewClient());
    WebSettings settings = view.getSettings();
    settings.setJavaScriptEnabled(true);
    settings.setAllowFileAccess(true);
    setContentView(view);
    view.loadUrl("file:///android_asset/index.html");
  }
}
