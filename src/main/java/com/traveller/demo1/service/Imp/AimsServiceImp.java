package com.traveller.demo1.service.Imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.traveller.demo1.entity.Aims;
import com.traveller.demo1.mapper.AimsMapper;
import com.traveller.demo1.service.AimsService;
import org.springframework.stereotype.Service;

@Service
public class AimsServiceImp extends ServiceImpl<AimsMapper, Aims> implements AimsService {
}