/**
* 
* @author Mity1299
*/
package com.didispace.biz;

import com.didispace.entity.User;

/**
 * @author Mity1299
 *
 */
public interface UserBiz {
    
    public User selectById(Long id);
    
    public int insertUser(String name,Integer age);
    
    public int insertUserCorrect(User user);
}
