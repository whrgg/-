package com.traveller.demo1.service.Imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.traveller.demo1.entity.GradeDetermination;
import com.traveller.demo1.mapper.GradeDeterminationMapper;
import com.traveller.demo1.service.GradeDeterminationService;
import org.springframework.stereotype.Service;

@Service
public class GradeDeterminationServiceImp extends ServiceImpl<GradeDeterminationMapper, GradeDetermination> implements GradeDeterminationService {
}