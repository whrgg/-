package com.traveller.demo1.service.Imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.traveller.demo1.entity.Effect;
import com.traveller.demo1.mapper.EffectMapper;
import com.traveller.demo1.service.EffectService;
import org.springframework.stereotype.Service;

@Service
public class EffectServiceImp extends ServiceImpl<EffectMapper, Effect> implements EffectService {
}