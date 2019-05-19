/**
* 
* @author Mity1299
*/
package com.didispace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.didispace.biz.UserBiz;
import com.didispace.entity.User;
import com.didispace.mapper.UserMapper;

/**
 * @author Mity1299
 *
 */
@Controller
@RequestMapping(value="/user")
public class UserController {

    @Autowired
    UserBiz userBiz;
    
    @RequestMapping(value="/getUser")
    public User getUser(@RequestParam Long id){
        User user =userBiz.selectById(id);
        return user;
    }
}
