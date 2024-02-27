package com.traveller.demo1.service.Imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.traveller.demo1.entity.Actionway;
import com.traveller.demo1.mapper.ActionwayMapper;
import com.traveller.demo1.service.ActionwayService;
import org.springframework.stereotype.Service;

@Service
public class ActionwayServiceImp extends ServiceImpl<ActionwayMapper, Actionway> implements ActionwayService {
}