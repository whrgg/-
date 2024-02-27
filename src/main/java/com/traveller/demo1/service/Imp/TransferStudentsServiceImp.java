package com.traveller.demo1.service.Imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.traveller.demo1.entity.TransferStudents;
import com.traveller.demo1.mapper.TransferStudentsMapper;
import com.traveller.demo1.service.TransferStudentsService;
import org.springframework.stereotype.Service;

@Service
public class TransferStudentsServiceImp extends ServiceImpl<TransferStudentsMapper, TransferStudents> implements TransferStudentsService {
}