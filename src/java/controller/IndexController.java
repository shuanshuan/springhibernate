/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.TextService;
import entity.SingleText;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

//import org.springframework.web.servlet.mvc.Controller;
//import org.springframework.web.portlet.mvc.Controller;
/**
 *
 * @author hasome
 */
@Controller
public class IndexController {
    
    
    @Autowired
    TextService ts;
 
    @RequestMapping("/index")
    public String index(ModelMap model ) {
         
     SingleText st =   ts.test();
     model.put("st", st);
        return "index";
    }

    @RequestMapping("/")
    public String defaultPage() {
        SingleText st = new SingleText();
        return "index";
    }

}
