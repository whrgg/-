package com.traveller.demo1.service.Imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.traveller.demo1.entity.Explanation;
import com.traveller.demo1.mapper.ExplanationMapper;
import com.traveller.demo1.service.ExplanationService;
import org.springframework.stereotype.Service;

@Service
public class ExplanationServiceImp extends ServiceImpl<ExplanationMapper, Explanation> implements ExplanationService {
}