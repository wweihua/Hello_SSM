package cn.mtoke.controller;

import org.junit.runner.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.mtoke.domain.User;
import cn.mtoke.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
    public ModelAndView login(User user,Model model) throws Exception {
		//System.out.println(user.toString());
        user=userService.checkLogin(user.getUsername(), user.getPassword());
        System.out.println(user.toString());
        if(user !=null){
            model.addAttribute(user);
            
            return new ModelAndView("redirect:/mgr");           
        }
        return null;
    }
	@RequestMapping(value="/in" )
	public String input(){
		return "login";
	}
}
