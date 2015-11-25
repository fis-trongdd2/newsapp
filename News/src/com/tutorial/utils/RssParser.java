package com.tutorial.utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

import com.tutorial.model.RssItem;

import android.os.AsyncTask;

public class RssParser {
//extends AsyncTask<String, Void, List<RssItem>>{
	public List<RssItem> getNewList(String link) {
		try{
			URL url = new URL(link);
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser parser = factory.newSAXParser();
			XMLReader reader = parser.getXMLReader();
			RssHandler handler = new RssHandler();
			reader.setContentHandler(handler);
			InputSource source = new InputSource(url.openStream());
			reader.parse(source);
			return handler.getItemList();
		}
		catch (Exception e){
			e.printStackTrace();
			return null;
		}
	}
/*	@Override
	protected List<RssItem> doInBackground(String... link) {
		try{
			URL url = new URL(link[0]);
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser parser = factory.newSAXParser();
			XMLReader reader = parser.getXMLReader();
			RssHandler handler = new RssHandler();
			reader.setContentHandler(handler);
			InputSource source = new InputSource(url.openStream());
			reader.parse(source);
			return handler.getItemList();
		}
		catch (Exception e){
			e.printStackTrace();
			return null;
		}
	}*/
}
