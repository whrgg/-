package com.traveller.demo1.service.Imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.traveller.demo1.entity.GuidenceClassification;
import com.traveller.demo1.mapper.GuidenceClassificationMapper;
import com.traveller.demo1.service.GuidenceClassificationService;
import org.springframework.stereotype.Service;

@Service
public class GuidenceClassificationServiceImp extends ServiceImpl<GuidenceClassificationMapper, GuidenceClassification> implements GuidenceClassificationService {
}