/**
* 
* @author Mity1299
*/
package com.didispace.bizImpl;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.didispace.biz.UserBiz;
import com.didispace.entity.User;
import com.didispace.mapper.UserMapper;

/**
 * @author Mity1299
 *
 */
@Service(value="userBiz")
public class UserBizImpl implements UserBiz {

    @Autowired
    UserMapper userMapper;
    
    @Override
    public User selectById(Long id) {
        // TODO Auto-generated method stub
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }

    @Override
    public int insertUser(String name,Integer age) {
        // TODO Auto-generated method stub
        User user =new User();
        user.setName(name);
        user.setAge(age);
        return userMapper.insert(user);
    }

    @Override
    public int insertUserCorrect( User user) {
        return userMapper.insert(user);
    }            

}
