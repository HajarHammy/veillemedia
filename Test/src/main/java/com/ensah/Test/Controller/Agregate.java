package com.ensah.Test.Controller;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.*;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/Agreagte")
public class Agregate {

	@CrossOrigin
	@RequestMapping(value="/",method = RequestMethod.GET)
	@ResponseBody
	public String getflux(){
		try{
			URL url = new URL("https://lematin.ma/feed-rss/articles.xml");
			URLConnection spoof = url.openConnection();

			
			spoof.setRequestProperty( "User-Agent", "Mozilla/4.0 (compatible; MSIE 5.5; Windows NT 5.0;    H010818)" );
			BufferedReader in = new BufferedReader(new InputStreamReader(spoof.getInputStream()));
			String strLine = "";
			String finalHTML = "";
			
			while ((strLine = in.readLine()) != null)
			{
			   finalHTML += strLine; 
			}
			
			FileWriter fw = new FileWriter("D:\\Mes documents\\GI_2\\S4\\PFA\\monfichier.xml",true);
			 fw.write(finalHTML);
			 fw.close();
				System.out.println(finalHTML);
				
			return "{\"Agregate\" : \"true\" }";
		}catch(Exception e){
			return "{\"Agregate\" : \""+e.toString()+"\" }";
		}
	}
	
}
