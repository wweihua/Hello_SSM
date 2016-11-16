package cn.mtoke.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.mtoke.service.ShortUrlService;
import cn.mtoke.utils.ChangString;

@Controller
@RequestMapping("/link")
public class ShortUrlController {
	@Resource
	private ShortUrlService shortUrlService;
	
	@RequestMapping(value="/{code}")
	public String foword(@PathVariable("code")String code,Model model){
		System.out.println(code);
		String url=shortUrlService.queryById(code);
		System.out.println(url);
		model.addAttribute("url",url);
		return "shortUrl";
	}
}
