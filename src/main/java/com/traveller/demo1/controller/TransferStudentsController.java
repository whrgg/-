package com.traveller.demo1.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.traveller.demo1.entity.TransferStudents;
import com.traveller.demo1.service.TransferStudentsService;
import com.traveller.demo1.untils.Rsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/TransferStudents")
public class TransferStudentsController {

    @Autowired
    TransferStudentsService service;

    @GetMapping("/get")
    public Rsg get(int currentpage, int pagesize) {
        Page<TransferStudents> page = new Page<>(currentpage, pagesize);
        LambdaQueryWrapper queryWrapper = new LambdaQueryWrapper();
        service.page(page);
        return new Rsg(200, "查询成功", page.getRecords());
    }

    @PostMapping
    public Rsg save(@RequestBody TransferStudents transferstudents) {
        service.save(transferstudents);
        return new Rsg(200, "保存成功");
    }

    @DeleteMapping
    public Rsg delete(int id) {
        service.removeById(id);
        return new Rsg(200, "删除成功");
    }

    @PutMapping
    public Rsg update(@RequestBody TransferStudents transferstudents) {
        service.updateById(transferstudents);
        return new Rsg(200, "更新成功");
    }
}
