package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class IndexController 
{
	
	@GetMapping("/")
	public ModelAndView getWishMsg()
	{
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("msg","index Best");
		
		mav.setViewName("index");
	
		return mav;
	}

}
