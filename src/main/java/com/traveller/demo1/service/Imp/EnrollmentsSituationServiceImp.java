package com.traveller.demo1.service.Imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.traveller.demo1.entity.EnrollmentsSituation;
import com.traveller.demo1.mapper.EnrollmentsSituationMapper;
import com.traveller.demo1.service.EnrollmentsSituationService;
import org.springframework.stereotype.Service;

@Service
public class EnrollmentsSituationServiceImp extends ServiceImpl<EnrollmentsSituationMapper, EnrollmentsSituation> implements EnrollmentsSituationService {
}