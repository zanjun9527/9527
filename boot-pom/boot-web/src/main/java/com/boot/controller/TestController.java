package com.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.dao.dmo.TbItemCat;
import com.boot.dao.mapper.TbItemCatMapper;

@Controller
@RequestMapping("/test")
public class TestController {
@Autowired
TbItemCatMapper tbItemCatMapper;
		
		@RequestMapping("/test1/{catId}")
		public TbItemCat getItemCatInfo(@PathVariable("catId") Long catId){
			
			TbItemCat tbItemCat = tbItemCatMapper.selectByPrimaryKey(catId);
			
			System.out.println("试试效果");
					
			return tbItemCat;
		}
		
		@RequestMapping("/test1")
		public TbItemCat getItemCatInfo2(){
			
			TbItemCat tbItemCat = tbItemCatMapper.selectByPrimaryKey((long)2);
			
			System.out.println("试试效果");
					
			return tbItemCat;
		}



}
