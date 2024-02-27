package com.traveller.demo1.service.Imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.traveller.demo1.entity.NaturalSubject;
import com.traveller.demo1.mapper.NaturalSubjectMapper;
import com.traveller.demo1.service.NaturalSubjectService;
import org.springframework.stereotype.Service;

@Service
public class NaturalSubjectServiceImp extends ServiceImpl<NaturalSubjectMapper, NaturalSubject> implements NaturalSubjectService {
}