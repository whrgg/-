package com.traveller.demo1.service.Imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.traveller.demo1.entity.RecruitStudents;
import com.traveller.demo1.mapper.RecruitStudentsMapper;
import com.traveller.demo1.service.RecruitStudentsService;
import org.springframework.stereotype.Service;

@Service
public class RecruitStudentsServiceImp extends ServiceImpl<RecruitStudentsMapper, RecruitStudents> implements RecruitStudentsService {
}