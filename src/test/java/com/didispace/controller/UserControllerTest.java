/**
* 
* @author Mity1299
*/
package com.didispace.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.mock.web.MockServletContext;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.RequestParam;

import com.didispace.controller.UserController;
import com.didispace.entity.User;
import com.didispace.Application;

/**
 * @author Mity1299
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class UserControllerTest {
    
    private MockHttpServletRequest request;
    private MockHttpServletResponse response;
    
    @Autowired
    private UserController userController;
    
    
    @Before
    public void setUp() throws Exception{
        request = new MockHttpServletRequest();
        request.setCharacterEncoding("UTF-8");
        response = new MockHttpServletResponse();
        
    }
    
    @Test
    public void test() {
        request.setParameter("id", "1");
        User user =userController.getUser(Long.parseLong(request.getParameter("id")));
        System.out.println(user.getName());
        assertEquals("user1", user.getName());
    }

}
