package com.yu.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by Administrator on 2019/8/6.
 */

@Data
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Car {

    private String id;
    private String name;
    private String color;
    private Double price;
    private Boolean isOld;
}
