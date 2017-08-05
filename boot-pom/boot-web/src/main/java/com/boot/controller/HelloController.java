package com.boot.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.boot.dao.dmo.User;
import com.boot.util.Utils;

@Controller
public class HelloController {
	
	
	 @RequestMapping("/")
	    public String home(Model model){
	
	        return "index";
	    }
	 
	 @RequestMapping("/addTalents")
	    public void addTalents(Model model,HttpServletResponse response,HttpServletRequest request,String a){
	
		 JSONObject jsonObject = new JSONObject();
		 
		 
		 
		 Utils.printDataText(response, jsonObject.toJSONString());
	    }
	 
	 
	 @SuppressWarnings("unused")
	@RequestMapping("/addTalentsBind")
	    public void addTalentsBind(Model model,HttpServletResponse response,HttpServletRequest request,User user){
		 String age = request.getParameter("age");
		 String sex = request.getParameter("sex");
		 String high = request.getParameter("high");
		 
		 
		 JSONObject jsonObject = new JSONObject();
		 
		 
		 
		 Utils.printDataText(response, jsonObject.toJSONString());
	    }
	 
	 
	 
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
