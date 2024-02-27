package com.traveller.demo1.service.Imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.traveller.demo1.entity.Studentguidancework;
import com.traveller.demo1.mapper.StudentguidanceworkMapper;
import com.traveller.demo1.service.StudentguidanceworkService;
import org.springframework.stereotype.Service;

@Service
public class StudentguidanceworkServiceImp extends ServiceImpl<StudentguidanceworkMapper, Studentguidancework> implements StudentguidanceworkService {
}