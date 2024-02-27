package com.traveller.demo1.service.Imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.traveller.demo1.entity.Fulltimeteacher;
import com.traveller.demo1.mapper.FulltimeteacherMapper;
import com.traveller.demo1.service.FulltimeteacherService;
import org.springframework.stereotype.Service;

@Service
public class FulltimeteacherServiceImp extends ServiceImpl<FulltimeteacherMapper, Fulltimeteacher> implements FulltimeteacherService {
}