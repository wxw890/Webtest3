package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
public class thirdController{
	@RequestMapping("/third.action")
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView mav = new ModelAndView("result");//result는 InternalResourceViewResolver로 지정되어서 /WEB-INF/views/경로와 .jsp 확장자 명을 안써도 된다.
		mav.addObject("msg", "세번째 호출입니다.");
		return mav;
	}
}
