package com.ensah.Test.Model;

import org.springframework.data.annotation.Id;

public class Item {

	@Id
	private String title;
	private String link;
	private String comments;
    private String pubDate;
    private String category;
    private String description;
    private String creator;
    
    
    //première condition TOUJOURS UN CONSTRUCTEUR PAR DEFAUT §§!!!!!!
    public Item(){
    	
    }
    //deuxième condition (mais hadi pour java to json machi json to java on verra plus tard )
    
    public Item(String t, String l ,String p)
    {
    	this.title=t;
    	this.link=l;
    	this.pubDate=p;
    }
    
	public String getTitle() {
		return title;
	}
	public String getLink() {
		return link;
	}
	public String getComments() {
		return comments;
	}
	public String getPubDate() {
		return pubDate;
	}
	public String getCategory() {
		return category;
	}
	public String getDescription() {
		return description;
	}
	public String getCreator() {
		return creator;
	}

	@Override
	public String toString() {
		return " {\"title \" : \"" + title + "\", link \" : \"" + link + "\", comments \" : \"" + comments
				+ "\", pubDate \" : \"" + pubDate + "\", category \" : \"" + category + "\", description \" : \""
				+ description + "\", creator \" : \"" + creator + "}";
	}
} 	