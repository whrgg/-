package com.traveller.demo1.service.Imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.traveller.demo1.entity.QualityRequirements;
import com.traveller.demo1.mapper.QualityRequirementsMapper;
import com.traveller.demo1.service.QualityRequirementsService;
import org.springframework.stereotype.Service;

@Service
public class QualityRequirementsServiceImp extends ServiceImpl<QualityRequirementsMapper, QualityRequirements> implements QualityRequirementsService {
}