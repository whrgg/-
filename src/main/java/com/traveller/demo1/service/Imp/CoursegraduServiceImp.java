package com.traveller.demo1.service.Imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.traveller.demo1.entity.Coursegradu;
import com.traveller.demo1.mapper.CoursegraduMapper;
import com.traveller.demo1.service.CoursegraduService;
import org.springframework.stereotype.Service;

@Service
public class CoursegraduServiceImp extends ServiceImpl<CoursegraduMapper, Coursegradu> implements CoursegraduService {
}