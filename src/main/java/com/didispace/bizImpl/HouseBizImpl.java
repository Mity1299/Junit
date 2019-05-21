/**
* 
* @author Mity1299
*/
package com.didispace.bizImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.didispace.biz.HouseBiz;
import com.didispace.entity.House;
import com.didispace.mapper.HouseMapper;

/**
 * @author Mity1299
 *
 */
@Service("houseBiz")
public class HouseBizImpl implements HouseBiz {

    @Autowired
    HouseMapper houseMapper;
    @Override
    public void insert(House house) {
        // TODO Auto-generated method stub
        houseMapper.insert(house);
    }

}
