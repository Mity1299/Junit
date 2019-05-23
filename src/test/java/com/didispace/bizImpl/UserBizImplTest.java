/**
* 
* @author Mity1299
*/
package com.didispace.bizImpl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Ignore;
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
import com.didispace.mapper.UserMapper;

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
    
    /**
     * 测试Biz的方法
     */
    @Ignore
    public void test() {
        User user=userBiz.selectById((long) 1);
        System.out.println(user.getName());
    }

    @Ignore
    public void testUnion(){
        List<User> userList = userBiz.testUnion();
        for (User user : userList) {
            System.out.println(user.getId());
        }
        System.out.println("finish");
    }
    
    @Test
    public void testEhCache() {
        User user1=userBiz.selectById((long) 1);
        System.out.println(user1.getName());
        User user2=userBiz.selectById((long) 1);
        System.out.println(user2.getName());
    }
}
