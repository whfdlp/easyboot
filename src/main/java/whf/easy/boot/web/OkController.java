package whf.easy.boot.web;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName OkController
 * @Description TODO
 * @Author whf
 * @Date 2023/1/27 18:52
 * @Version 1.0
 */
@Service("/ok")
public class OkController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("请求到达OkController..............");
        return null;
    }
}
