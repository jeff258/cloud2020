package com.cyb.springcloud.service;

/**
 * Created by cyb on 2020/7/11 15:13
 */
public interface StorageService {
    void decrease(Long productId, Integer count);
}
