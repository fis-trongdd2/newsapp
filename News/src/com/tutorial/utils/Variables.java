package com.tutorial.utils;

import java.util.HashMap;
import java.util.List;

import com.news.R;
import com.tutorial.model.RssItem;

public class Variables {
	public static final String[] PAPERS = {"Vnexpress", "24h"};
	public static final int[] ICONS = { R.drawable.vnexpress, R.drawable.haituh};

	public static final String[] VNEXPRESS_CATEGORIES = {"Trang chủ", "Thời sự"};
	public static final String[] VNEXPRESS_LINKS = {
			"http://dantri.com.vn/suc-khoe/lam-dep.rss",
			"http://dantri.com.vn/xa-hoi/chinh-tri.rss"
	};
	
	public static final String[][] CATEGORIES = {VNEXPRESS_CATEGORIES};
	public static final String[][] LINKS = {VNEXPRESS_LINKS};
	public static final String PAPER = "paper";
	
	public static final String CATEGORY = "category";
	public static final String LINK = "link";
	public static HashMap<Integer,List<RssItem>> newsMap = new HashMap<Integer,List<RssItem> >(); 
}