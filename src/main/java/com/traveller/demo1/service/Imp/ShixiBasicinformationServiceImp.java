package com.traveller.demo1.service.Imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.traveller.demo1.entity.ShixiBasicinformation;
import com.traveller.demo1.mapper.ShixiBasicinformationMapper;
import com.traveller.demo1.service.ShixiBasicinformationService;
import org.springframework.stereotype.Service;

@Service
public class ShixiBasicinformationServiceImp extends ServiceImpl<ShixiBasicinformationMapper, ShixiBasicinformation> implements ShixiBasicinformationService {
}