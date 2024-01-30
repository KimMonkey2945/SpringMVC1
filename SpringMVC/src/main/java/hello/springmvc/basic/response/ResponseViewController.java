package hello.springmvc.basic.response;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResponseViewController {

    @RequestMapping("/response-view-v1")
    public ModelAndView responseViewV1(){

        ModelAndView mav = new ModelAndView("response/hello")
                .addObject("data", "김주하!!");
        return mav;

    }

    @RequestMapping("/response-view-v2")
    public String responseViewV2(Model model){

        model.addAttribute("data", "현대건설힐스테이트배구단 김주하");
        return "response/hello"; //String을 반환하면 뷰의 논리적인 이름이 되는것임.

    }

    //v3는 권장하지 않음...
    @RequestMapping("/response/hello")
    public void responseViewV3(Model model){

        model.addAttribute("data", "현대건설힐스테이트배구단 황연주");

    }

}
