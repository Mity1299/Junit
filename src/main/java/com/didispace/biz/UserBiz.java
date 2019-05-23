/**
* 
* @author Mity1299
*/
package com.didispace.biz;

import java.util.List;

import com.didispace.entity.User;

/**
 * @author Mity1299
 *
 */
public interface UserBiz {
    
    public User selectById(Long id);
    
    public int insertUser(String name,Integer age);
    
    public int insertUserCorrect(User user);
    
    public List<User> testUnion();
}
