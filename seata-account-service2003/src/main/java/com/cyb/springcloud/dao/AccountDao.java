package com.cyb.springcloud.dao;

import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * Created by cyb on 2020/7/11 15:43
 */
public interface AccountDao {
    void decrease(@Param("userId")Long userId,@Param("money") BigDecimal money);
}
