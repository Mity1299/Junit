/**
* 
* @author Mity1299
*/
package com.didispace.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.didispace.Application;
import com.didispace.biz.HouseBiz;
import com.didispace.entity.House;


/**
 * @author Mity1299
 *
 */
@Controller
@RequestMapping(value="/house")
public class HouseController {
    
    @Autowired
    HouseBiz houseBiz;
    
    private final static Logger logger = LoggerFactory.getLogger(HouseController.class);
    
    @RequestMapping(value="/insert.do")    
    public String insertHouse(@Valid @ModelAttribute("house") House house,
                            BindingResult bindResult){
        logger.info("进入HouseController，调用insertHouse方法");
        if(bindResult.hasErrors()) {
            return "house_insert";
        }else {
            houseBiz.insert(house);
            return "redirect:main";
        }
            
        
    }
}
