package com.yu.test.domain;

import lombok.*;

import java.time.LocalDateTime;

/**
 * @Author yu
 * @DateTime 2020/12/23 20:39
 */
@Data
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String id;
    private String name;
    private LocalDateTime birthday;
}
