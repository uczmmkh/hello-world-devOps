package com.ucl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import edu.ucl.isd.postauthentication.ShibbolethPostAuthentication;

@Controller
public class HelloController {

	@Autowired
	private DevOpsService devOpsService;
	
	@RequestMapping("/team")
	public ModelAndView devOpsTeam(){		
		StringBuffer message=new StringBuffer();
		for (String name : devOpsService.getTeam()){
			message.append(name);
			message.append(" ");
		}
		
		return new ModelAndView("hellopage","msg",message.toString().trim());
	}
}
