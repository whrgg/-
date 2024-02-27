package com.traveller.demo1.service.Imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.traveller.demo1.entity.CapabilityTraining;
import com.traveller.demo1.mapper.CapabilityTrainingMapper;
import com.traveller.demo1.service.CapabilityTrainingService;
import org.springframework.stereotype.Service;

@Service
public class CapabilityTrainingServiceImp extends ServiceImpl<CapabilityTrainingMapper, CapabilityTraining> implements CapabilityTrainingService {
}