/**
* 
* @author Mity1299
*/
package com.didispace.controller;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.mock.web.MockServletContext;
import org.springframework.stereotype.Controller;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.WebApplicationContext;

import com.didispace.controller.UserController;
import com.didispace.entity.User;
import com.didispace.Application;

/**
 * @author Mity1299
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)//启动类
@Transactional//事务
@WebAppConfiguration
public class UserControllerTest {
    
    private MockHttpServletRequest request;//模拟用户请求
    private MockHttpServletResponse response;//模拟用户回应
    private MockMvc mvc;
    
    @Autowired
    protected WebApplicationContext wac;
    @Autowired
    private UserController userController;
    
    
    @Before
    public void setUp() throws Exception{
        request = new MockHttpServletRequest();
        request.setCharacterEncoding("UTF-8");
        response = new MockHttpServletResponse();
        mvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }
    
    @Ignore
    public void test() {
        request.setParameter("id", "1");
        User user =userController.getUser(Long.parseLong(request.getParameter("id")));
//        System.out.println(user.getName());
        assertEquals("user1", user.getName());
    }
    
    /**
     * 请求路径测试
     */
    @Test
    @Rollback
    public void testPath() {
        try {
            
            mvc.perform(post("/user/main").param("id", "1")).
                    andExpect(status().isOk()).
                    andDo(print());

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

}
