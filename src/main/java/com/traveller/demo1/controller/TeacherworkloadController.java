package com.traveller.demo1.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.traveller.demo1.entity.Teacherworkload;
import com.traveller.demo1.service.TeacherworkloadService;
import com.traveller.demo1.untils.Rsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Teacherworkload")
public class TeacherworkloadController {

    @Autowired
    TeacherworkloadService Teahcerservice;

    @GetMapping("/get")
    public Rsg  get(int currentpage,int pagesize){
        Page<Teacherworkload> page =new Page<>(currentpage,pagesize);

        LambdaQueryWrapper queryWrapper = new LambdaQueryWrapper();
        Teahcerservice.page(page);

        return new Rsg(200,"查询成功",page.getRecords());
    }

    @PostMapping
    public Rsg save(@RequestBody Teacherworkload teacherworkload){

        Teahcerservice.save(teacherworkload);

        return new Rsg(200,"保存成功");
    }

    @DeleteMapping
    public Rsg delete(int id){
        Teahcerservice.removeById(id);

        return new Rsg(200,"删除成功");
    }

    @PutMapping
    public Rsg update(Teacherworkload teacherworkload){
        Teahcerservice.updateById(teacherworkload);
        return new Rsg(200,"新增成功");
    }
}
