package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
//annotation의 HandlerMapping

public class firstController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView mav = new ModelAndView("first");//first는 ResourceBundleViewResolver를 통해 별도의 경로로 지정되어있다.
		mav.addObject("msg", "첫번째 호출입니다.");
		return mav;
	}
	


}
