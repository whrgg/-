package com.traveller.demo1.service.Imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.traveller.demo1.entity.TransferClass;
import com.traveller.demo1.mapper.TransferClassMapper;
import com.traveller.demo1.service.TransferClassService;
import org.springframework.stereotype.Service;

@Service
public class TransferClassServiceImp extends ServiceImpl<TransferClassMapper, TransferClass> implements TransferClassService {
}