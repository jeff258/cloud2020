package com.cyb.springcloud.dao;

import com.cyb.springcloud.domain.Order;
import org.apache.ibatis.annotations.Param;

/**
 * Created by cyb on 2020/7/11 16:19
 */
public interface OrderDao {
    void create(Order order);

    void update(@Param("userId") Long userId, @Param("status")int status);
}
