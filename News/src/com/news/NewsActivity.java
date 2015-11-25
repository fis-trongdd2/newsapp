package com.news;

import com.tutorial.utils.Variables;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class NewsActivity extends Activity{
	private WebView webview;
	private String link;
	private ProgressDialog dialog;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.article);
		Bundle bundle = getIntent().getExtras();
		setTitle(R.string.app_name);
		link = bundle.getString(Variables.LINK);
		webview = (WebView) findViewById(R.id.wvNews); 
		webview.getSettings().setSupportZoom(true);
		webview.setInitialScale(1);
		webview.getSettings().setLoadWithOverviewMode(true);
		webview.getSettings().setUseWideViewPort(true);
		webview.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
		webview.setScrollbarFadingEnabled(false);
//		webview.setWebViewClient(new NewsWebViewClient());
//		dialog = ProgressDialog.show(this, "", "Loading...");
//		new NewsTask().execute();
        webview.loadUrl(link);
	}
/*	class NewsTask extends AsyncTask<Void, Void, Void> {
		
		@Override
		protected void onPostExecute(Void result) {
			if (dialog != null) {
				dialog.dismiss();
			}
			super.onPostExecute(result);
		}

		@Override
		protected Void doInBackground(Void... params) {
			webview.loadUrl(link);
			return null;
		}
		
	}
/*	class NewsWebViewClient extends WebViewClient {

		@Override
		public void onPageFinished(WebView view, String url) {
			if (dialog != null) {
				dialog.dismiss();
			}
			super.onPageFinished(view, url);
		}
		
	}*/
}
