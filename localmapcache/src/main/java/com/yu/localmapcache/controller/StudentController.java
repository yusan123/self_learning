package com.yu.localmapcache.controller;

import com.yu.localmapcache.constant.LocalCache;
import com.yu.localmapcache.domain.CommonResp;
import com.yu.localmapcache.domain.Student;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author yu
 * @DateTime 2020/12/17 22:21
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    /**
     * 新增或者更新
     *
     * @param student
     * @return
     */
    @PostMapping("/add")
    public Object addStudent(@RequestBody Student student) {
        LocalCache.cache.put(student.getId(), student);
        return CommonResp.success("新增成功", student);
    }

    /**
     * 删除根据id
     *
     * @param id
     * @return
     */
    @PostMapping("/del")
    public Object delStudent(@RequestParam String id) {
        Student remove = null;
        if (LocalCache.cache.containsKey(id)) {
            remove = (Student) LocalCache.cache.remove(id);
        }
        return CommonResp.success("删除成功", remove);
    }

    @GetMapping("/get")
    public Object getStudent(@RequestParam String id) {
        Student one = null;
        if (LocalCache.cache.containsKey(id)) {
            one = (Student) LocalCache.cache.get(id);
        }
        return CommonResp.success("查询单个成功", one);
    }

    @GetMapping("/getAll")
    public Object getAllStudent() {
        ConcurrentHashMap<String, Object> cache = LocalCache.cache;
        Collection<Object> values = cache.values();
        return CommonResp.success("查询所有成功", values);
    }

}
