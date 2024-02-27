package com.traveller.demo1.service.Imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.traveller.demo1.entity.ProfessTeacher;
import com.traveller.demo1.mapper.ProfessTeacherMapper;
import com.traveller.demo1.service.ProfessTeacherService;
import org.springframework.stereotype.Service;

@Service
public class ProfessTeacherServiceImp extends ServiceImpl<ProfessTeacherMapper, ProfessTeacher> implements ProfessTeacherService {
}