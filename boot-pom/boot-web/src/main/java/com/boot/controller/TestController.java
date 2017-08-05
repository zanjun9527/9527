package com.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.dao.dmo.TbItemCat;
import com.boot.dao.mapper.TbItemCatMapper;
import com.boot.dao.talents.dmo.TbItem;
import com.boot.dao.talents.mapper.TbItemMapper;

@Controller
@RequestMapping("/test")
public class TestController {
@Autowired
TbItemCatMapper tbItemCatMapper;
@Autowired
TbItemMapper tbItemMapper;

		
		@RequestMapping("/test1/{catId}")
		@ResponseBody
		public TbItemCat getItemCatInfo(@PathVariable("catId") Long catId){
			
			TbItemCat tbItemCat = tbItemCatMapper.selectByPrimaryKey(catId);
			
			System.out.println("试试效果");
					
			return tbItemCat;
		}
		
		@RequestMapping("/test2/{catId}")
		@ResponseBody
		public TbItem getItemCatInfo2(@PathVariable("catId") Long catId){
					
			TbItem tbItem = tbItemMapper.selectByPrimaryKey(catId);
			System.out.println("试试效果");
					
			return tbItem;
		}



}
