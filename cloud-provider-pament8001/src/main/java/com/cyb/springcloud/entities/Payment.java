package com.cyb.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by cyb on 2020/4/15 16:03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
private Long id;
private String serial;




}
