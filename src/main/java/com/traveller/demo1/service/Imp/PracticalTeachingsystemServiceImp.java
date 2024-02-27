package com.traveller.demo1.service.Imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.traveller.demo1.entity.PracticalTeachingsystem;
import com.traveller.demo1.mapper.PracticalTeachingsystemMapper;
import com.traveller.demo1.service.PracticalTeachingsystemService;
import org.springframework.stereotype.Service;

@Service
public class PracticalTeachingsystemServiceImp extends ServiceImpl<PracticalTeachingsystemMapper, PracticalTeachingsystem> implements PracticalTeachingsystemService {
}