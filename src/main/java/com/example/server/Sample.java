package com.example.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {
	
	String Page = "<form action=\"action_page.php\" method=\"post\">\r\n"
			+ "  <div class=\"imgcontainer\">\r\n"
			+ "    <img src=\"img_avatar2.png\" alt=\"Avatar\" class=\"avatar\">\r\n"
			+ "  </div>\r\n"
			+ "\r\n"
			+ "  <div class=\"container\">\r\n"
			+ "    <label for=\"uname\"><b>Username</b></label>\r\n"
			+ "    <input type=\"text\" placeholder=\"Enter Username\" name=\"uname\" required>\r\n"
			+ "\r\n"
			+ "    <label for=\"psw\"><b>Password</b></label>\r\n"
			+ "    <input type=\"password\" placeholder=\"Enter Password\" name=\"psw\" required>\r\n"
			+ "\r\n"
			+ "    <button type=\"submit\">Login</button>\r\n"
			+ "    <label>\r\n"
			+ "      <input type=\"checkbox\" checked=\"checked\" name=\"remember\"> Remember me\r\n"
			+ "    </label>\r\n"
			+ "  </div>\r\n"
			+ "\r\n"
			+ "  <div class=\"container\" style=\"background-color:#f1f1f1\">\r\n"
			+ "    <button type=\"button\" class=\"cancelbtn\">Cancel</button>\r\n"
			+ "    <span class=\"psw\">Forgot <a href=\"#\">password?</a></span>\r\n"
			+ "  </div>\r\n"
			+ "</form>";
	
	@GetMapping("/")
	public String sayHelloWorld(){
		return Page;
	}
	
	
}
