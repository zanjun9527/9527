package com.boot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	
	
	 @RequestMapping("/index")
	    public String index(Model model){
	 
	        model.addAttribute("name","aaa");
	 
	        return "222";
	    }
	 
	 @RequestMapping("/index1")
	    public ModelAndView index1(){
		ModelAndView mv = new ModelAndView();
	 	mv.setViewName("312");
	 	mv.addObject("name", "kobe");
	 
	        return mv;
	    }
	 
	 
	 
	 
	 	@RequestMapping("/json")
	    @ResponseBody
	    public Map<String,Object> json(){
	        Map<String,Object> map = new HashMap<String,Object>();
	        map.put("name","nime");
	        map.put("age","18");
	        map.put("sex","man");
	        return map;
	    }

}
