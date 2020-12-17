package com.yu.localmapcache.constant;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author yu
 * @DateTime 2020/12/17 22:19
 */
public interface LocalCache {

    ConcurrentHashMap<String,Object> cache = new ConcurrentHashMap<>();
}
