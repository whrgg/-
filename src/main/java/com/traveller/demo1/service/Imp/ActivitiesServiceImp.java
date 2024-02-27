package com.traveller.demo1.service.Imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.traveller.demo1.entity.Activities;
import com.traveller.demo1.mapper.ActivitiesMapper;
import com.traveller.demo1.service.ActivitiesService;
import org.springframework.stereotype.Service;

@Service
public class ActivitiesServiceImp extends ServiceImpl<ActivitiesMapper, Activities> implements ActivitiesService {
}