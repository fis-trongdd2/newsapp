package com.tutorial.adapters;

import com.news.R;
import com.tutorial.utils.Variables;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CategoryAdapter extends ArrayAdapter<String>{
	private Context context;
	private String[] categories;
	private int ivIcon;
	public CategoryAdapter(Context context, int ivIcon, String[] categories) {
		super(context, ivIcon, categories);
		// TODO Auto-generated constructor stub
		this.context = context;
		this.ivIcon = ivIcon;
		this.categories = categories;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(R.layout.category, parent,false); 
		ImageView iv = (ImageView) rowView.findViewById(R.id.ivIcon);
		TextView tv = (TextView) rowView.findViewById(R.id.tvCategory);
		iv.setImageResource(ivIcon);
		tv.setText(categories[position]);
		return rowView;
	}
	

}
