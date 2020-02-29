package com.yu.entity;

import lombok.Data;
import lombok.ToString;

/**
 * Created by Administrator on 2020/2/29.
 */
@Data
@ToString
public class User {

    private Integer id;
    private String name;
    private Integer gender;
    private Integer age;
    private String telphone;
    private String registerMode;
    private String thirdPartyId;
}
