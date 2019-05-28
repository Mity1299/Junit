/**
* 
* @author Mity1299
*/
package com.didispace.mapper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.didispace.Application;
import com.didispace.entity.User;

/**
 * @author Mity1299
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)//启动类
@WebAppConfiguration
public class UserMapperTest {

    @Autowired
    UserMapper userMapper;
    
    @Test
    public void test() {
        User user = userMapper.selectByPrimaryKey((long)1);
        assertEquals("user1", user.getName());
    }

}
