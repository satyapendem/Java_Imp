package com.harsha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GoogleOAuthServlet{
	@RequestMapping(value="/")
	public String home()
	{
		return "index";
	}
	@RequestMapping(value="/loginWithGoogle")
	public ModelAndView login()
	{
		return new ModelAndView("redirect:https://accounts.google.com/o/oauth2/auth?redirect_uri=http://1-dot-main-aura-139506.appspot.com/get_code&response_type=code&client_id=943079403517-3b7v143ts4kqe8hnnei8j3qjauu91t79.apps.googleusercontent.com&approval_prompt=force&scope=email&access_type=online");
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
				+ "client_id=943079403517-3b7v143ts4kqe8hnnei8j3qjauu91t79.apps.googleusercontent.com"
				+ "&client_secret=h2L0t6ZmkExaGHlfSbhChqi9&" + "redirect_uri=http://1-dot-main-aura-139506.appspot.com/get_code&"
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
		
		JSONParser jsonParser = new JSONParser();
		JSONObject jsonAccessToken=null;
		try {
			jsonAccessToken = (JSONObject) jsonParser.parse(response);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String access_token = (String)jsonAccessToken.get("access_token");
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
		JSONObject json_user_details = null;
		try {
			json_user_details = (JSONObject) jsonParser.parse(responsee);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String userMail=(String)json_user_details.get("email");
		String userName=(String)json_user_details.get("name");
		String gender=(String)json_user_details.get("gender");
		String birthDay=(String)json_user_details.get("dateofbirth");
		String image=(String) json_user_details.get("picture");
		
		System.out.println(userMail);
		System.out.println(userName);
		
		return new ModelAndView("info.jsp?name=" + userName +"&gender="+gender+"&image="+image+"&mail="+userMail);
	}
}
