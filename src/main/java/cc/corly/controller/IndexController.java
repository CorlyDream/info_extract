package cc.corly.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class IndexController {
	
	private final static Logger log = LoggerFactory.getLogger(IndexController.class);
	@RequestMapping("/index")
	public Object index(){
		log.info("success");
		return "success";
	}
}
