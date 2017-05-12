package com.harsha;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import javax.jdo.PersistenceManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.DatatypeConverter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.jdo.Query;


@Controller
public class SpringSignUP {

	PersistenceManager pm = PMF.get().getPersistenceManager();
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView addSignUpDetails(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		PrintWriter out = response.getWriter();
		String name=request.getParameter("userName");
		String pass=request.getParameter("password");
		String email=request.getParameter("email");
		
		/*Key key = new SecretKeySpec(new byte[] { 'T', 'h', 'e', 'B', 'e', 's', 't',
				'S', 'e', 'c', 'r','e', 't', 'K', 'e', 'y' },"AES");
		
		Cipher c = null;
		try {
			c = Cipher.getInstance("AES");
		} catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			c.init(Cipher.ENCRYPT_MODE, key);
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        byte[] encVal = null;
		try {
			encVal = c.doFinal(pass.getBytes("UTF-8"));
		} catch (IllegalBlockSizeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BadPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        String encryptedValue = DatatypeConverter.printBase64Binary(encVal);
        System.out.println(encryptedValue);
        
        byte[] decordedValue = new BASE64Decoder().decodeBuffer(encryptedData);
        byte[] decValue = c.doFinal(decordedValue);
        String decryptedValue = new String(decValue);
        
        byte[] decoded = DatatypeConverter.parseBase64Binary(encryptedValue);      
		System.out.print(new String(decoded,"UTF-8"));*/
		
		byte[] message = pass.getBytes("UTF-8");
		String encoded = DatatypeConverter.printBase64Binary(message);
		byte[] decoded = DatatypeConverter.parseBase64Binary(encoded);

		System.out.println(encoded);
		System.out.println(new String(decoded, "UTF-8"));
		
		int index=email.indexOf("@");
		int dot=email.lastIndexOf(".");
		
		String pattern= "^[a-zA-Z0-9]*$";
		
		SignUpBean signUpBean = new SignUpBean();
		
		if(index>1 && dot> index+2 && dot+2 < email.length() && pass.matches(pattern) && !pass.equals("")&& !name.equals(""))
		{	
			signUpBean.setUserName(name);
			signUpBean.setPassword(encoded);
			signUpBean.setEmail(email);
			signUpBean.setDate(new Date());
			
			/*Query q = pm.newQuery(SignUpBean.class);
			q.setOrdering("date desc");
			List<SignUpBean> results = null;
			List<String> userData= new ArrayList<String>();

			try {
				results = (List<SignUpBean>) q.execute();
				if (!results.isEmpty()) {
					// good for listing
					for(SignUpBean data : results)
					{
						userData.add(data.getUserName());
						userData.add(data.getEmail());
					}
				}	
			} finally {
				q.closeAll();
			}*/
			List<String> userData =data();
			
			if(!userData.contains(name) && !userData.contains(email))
			{
				try
				{
					pm.makePersistent(signUpBean);
				}
				finally
				{
					pm.close();
				}
				String nameToDisplay=signUpBean.getUserName();
				return new ModelAndView("view","name",nameToDisplay);
			}
			else
			{
				out.println("<script>alert('User already exists with Info entered.')</script>");
			}
		}
		else
		{
			out.println("<script>alert('Required fields are incorrect')</script>");
		}
		System.out.println("working");
		return new ModelAndView("index1");
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List data()
	{
		Query q = pm.newQuery(SignUpBean.class);
		q.setOrdering("date desc");
		List<SignUpBean> results = null;
		List<String> userData= new ArrayList<String>();

		try {
			results = (List<SignUpBean>) q.execute();
			if (!results.isEmpty()) {
				// good for listing
				for(SignUpBean data : results)
				{
					userData.add(data.getUserName());
					userData.add(data.getEmail());
					userData.add(data.getPassword());
				}
			}	
		} finally {
			q.closeAll();
		}
		return userData;

	}
}
