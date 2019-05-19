/**
* 
* @author Mity1299
*/
package com.didispace.bizImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
