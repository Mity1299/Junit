/**
* 
* @author Mity1299
*/
package com.didispace.bizImpl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.didispace.Application;
import com.didispace.biz.UserBiz;
import com.didispace.entity.User;

/**
 * @author Mity1299
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class UserBizImplTest {
    
    @Autowired
    UserBiz userBiz;
    
    @Test
    public void test() {
        User user=userBiz.selectById((long) 1);
        System.out.println(user.getName());
    }

}
