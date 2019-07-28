package springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@RequestMapping("/springmvc")
@Controller
public class HelloWorld {
	/*
	 * 
	 * 
	 * 使用requesetmapping來映射請求的URl
	 * 返回值會通過試圖解析器解析為實際的物理視圖，InternalResourceViewResolver 視圖解析器
	 * 通過prefix+returnVal +後綴 方式得到實際的物理視圖，然後通過轉達操作
	 * "/WEB-INF/views/sucess.jsp
	 */
	public static final  String SUCCESS="success";
	@RequestMapping(value="/testMethod",method=RequestMethod.POST)
	public String testmethod() {
		System.out.println("test");
		return "success";
	}
	
	
	@RequestMapping("/helloworld")
	public  String hello(){
		System.out.println("hello world");
		
		return SUCCESS;
		
	}
}
