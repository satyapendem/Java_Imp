package com.harsha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

@Controller
public class GoogleOAuthenServlet{
	@RequestMapping(value="/")
	public String home()
	{
		return "index";
	}
	@RequestMapping(value="/loginWithGoogle")
	public ModelAndView login()
	{
		return new ModelAndView("redirect:https://accounts.google.com/o/oauth2/auth?redirect_uri=http://1-dot-sample-1470460782237.appspot.com/get_code&response_type=code&client_id=205689977579-rfragbqh1v4u0hnsjf3voufh31hallap.apps.googleusercontent.com&approval_prompt=force&scope=email&access_type=online");
	}
	@RequestMapping(value="/get_code")
	public ModelAndView get_code(@RequestParam String code, HttpServletRequest req,
			HttpServletResponse resp) throws IOException
	{
		
		// code for getting authorization_code
		System.out.println("Getting Authorization.");
		String auth_code = code;
		System.out.println(auth_code);
		
		//code for getting access token
		
		URL url = new URL("https://www.googleapis.com/oauth2/v3/token?"
				+ "client_id=205689977579-rfragbqh1v4u0hnsjf3voufh31hallap.apps.googleusercontent.com"
				+ "&client_secret=f94nntBaAva-_y7WHr-hUa7u&" + "redirect_uri=http://1-dot-sample-1470460782237.appspot.com/get_code&"
				+ "grant_type=authorization_code&" + "code=" + auth_code);
		HttpURLConnection connect = (HttpURLConnection) url.openConnection();
		connect.setRequestMethod("POST");
		connect.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		connect.setDoOutput(true);
		BufferedReader in = new BufferedReader(new InputStreamReader(connect.getInputStream()));
		String inputLine;
		String response = "";
		while ((inputLine = in.readLine()) != null) {
			response += inputLine;
		}
		in.close();
		System.out.println(response.toString());
		
		JsonParser jsonParser = new JsonParser();
		JsonObject jsonAccessToken=null;
		jsonAccessToken = (JsonObject) jsonParser.parse(response);
		String access_token = jsonAccessToken.get("access_token").toString();
		System.out.println("Access token =" + access_token);
		System.out.println("access token caught");
		
		URL obj1 = new URL("https://www.googleapis.com/oauth2/v3/userinfo?access_token=" + access_token);
		HttpURLConnection conn = (HttpURLConnection) obj1.openConnection();
		BufferedReader in1 = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String inputLine1;
		String responsee = "";
		while ((inputLine1 = in1.readLine()) != null) {
			responsee += inputLine1;
		}
		in1.close();
		System.out.println(responsee.toString());
		JsonObject json_user_details = null;
		json_user_details = (JsonObject) jsonParser.parse(responsee);
		String userEmail=json_user_details.get("email").toString();
		String userName=json_user_details.get("name").toString();
		
		System.out.println(userEmail);
		System.out.println(userName);
		
		return new ModelAndView("info.jsp?name=" + json_user_details.get("email") + "&mail=" + userEmail);
	}
}
