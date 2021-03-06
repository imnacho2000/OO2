package ar.edu.unlp.info.oo2.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String ScreenName;
	private List<Tweet> tweets;
	
	public Usuario(String ScreenName) {
		this.tweets = new ArrayList<Tweet>();
		this.ScreenName = ScreenName;
	}
	
	public void eliminarTweets() {
		this.tweets.clear();
	}
	
	public void crearTweet(String text) {
		if(text.length() > 0 && text.length() <= 140) {
			this.tweets.add(new Tweet(text));
		}
	}
	
	public Tweet hacerRetweet(String text, Tweet t) {
		if(text.length() > 0 && text.length() <= 140) {
			Tweet tw = new Tweet(text,t);
			this.tweets.add(t);
			return tw;
		}
		else {
			return null;
		}
	}

	public String getScreenName() {
		return ScreenName;
	}

	public void setScreenName(String screenName) {
		ScreenName = screenName;
	}
	
	public int listaTweets() {
		return this.tweets.size();
	}
	
	
}
