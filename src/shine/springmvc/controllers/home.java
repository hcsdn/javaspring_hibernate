package shine.springmvc.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class home implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Got home ctrl request");
		System.out.println("Got home ctrl request111");
		ModelAndView mv = new ModelAndView();
		mv.addObject("message","Hello spring home controller");
		System.out.println("initializing view");
		mv.setViewName("home");
		return mv;
	}

}
