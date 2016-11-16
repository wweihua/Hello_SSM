package cn.mtoke.controller;

import java.util.List;




import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.mtoke.domain.Act;
import cn.mtoke.service.ActService;
import cn.mtoke.service.ShortUrlService;

@Controller
public class ActController {
	@Resource
	private ActService actService;
	@Resource
	private ShortUrlService shortUrlService;
	@RequestMapping(value="add")
	public String addAct(){
		return "input";
	}
	
	@RequestMapping(value="/save",method=RequestMethod.GET)
	public String saveAct(Act act){
		act.setUrl(shortUrlService.insertUrl(act.getUrl()));
		actService.addAct(act);
		return "redirect:/mgr";
	}
	
	@RequestMapping(value={"/list","/ActMgr","/"},method=RequestMethod.GET)
	public String getList(Model model){
		List<Act> list=actService.getJdactList();
		model.addAttribute("list",list);
		return "list";
	}
	
	@RequestMapping(value="/{id}/detail",method=RequestMethod.GET)
	public String detail(@PathVariable("id")int id,Model model){
		Act detail = actService.getById(id);
		model.addAttribute("detail",detail);
		return "detail";
	}
	//管理页
	@RequestMapping(value="/mgr" ,method=RequestMethod.GET)
	public String getMgrList(Model model){
		List<Act> mgrList = actService.getJdactList();
		model.addAttribute("mgrList",mgrList);
		return "mgr";
	}
	//更新详情页
	@RequestMapping(value="/{id}/updata" , method=RequestMethod.GET)
	public String getPerUpdata(@PathVariable("id")int id,Model model){
		Act act=actService.getById(id);
		model.addAttribute("act",act);
		return "act_updata";
	}
	@RequestMapping(value="/{id}/delete" ,method=RequestMethod.GET)
	public String deleAct(@PathVariable("id")int id){
		actService.deleActById(id);
		return "redirect:/mgr";
	}
	@RequestMapping(value="/updata" ,method=RequestMethod.GET)
	public String updataAct(Act act){
		if(!act.getUrl().startsWith("http://mtoke.cn")){
			act.setUrl(shortUrlService.insertUrl(act.getUrl()));
		}
		actService.updataAct(act);
		return "redirect:/mgr";
	}
}
