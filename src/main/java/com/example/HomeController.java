package com.example;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
	public class HomeController {

	@Value("${user}")
	private String userName;
	
	@Value("${user.address}")
	private String userAddress;
	
	@Value("${user.interest}")
	private String userInterest;
	
		@RequestMapping( value="/")
		public String index(){
			
		    //@Value("${webpa.path.version}")
			return "Hello"+"\n" + userName + "\n"+"Your Address ::" + userAddress;
		}	
		@RequestMapping( value="/interest")
		
		public void show(){
			
			List<String> interests=userList();
			for(String interest: interests){
				System.out.println(interest);
			}
			
		}
		
		public List userList(){
            //will seperate the list with comma and return as list
			List<String> interests=Arrays.asList(userInterest.split(","));
			return interests;
		}		
}
