package com.news;

import java.util.List;

import com.tutorial.adapters.NewsAdapter;
import com.tutorial.model.RssItem;
import com.tutorial.utils.Variables;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class NewsListActivity extends ListActivity{
	private List<RssItem> items;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Bundle bundle = getIntent().getExtras();
		int category = bundle.getInt(Variables.CATEGORY);
		int paper = bundle.getInt(Variables.PAPER);
		setTitle(Variables.CATEGORIES[paper][category]);
		int key = paper * 1000 + category;
		items = Variables.newsMap.get(key);
		NewsAdapter adapter = new NewsAdapter(this, Variables.ICONS[paper], items);
		setListAdapter(adapter);
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		Intent intent = new Intent(this, NewsActivity.class);
		intent.putExtra(Variables.LINK, items.get(position).getLink());
		
		startActivity(intent);
	}
	
}
