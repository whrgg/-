package com.traveller.demo1.service.Imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.traveller.demo1.entity.GuidenceFile;
import com.traveller.demo1.mapper.GuidenceFileMapper;
import com.traveller.demo1.service.GuidenceFileService;
import org.springframework.stereotype.Service;

@Service
public class GuidenceFileServiceImp extends ServiceImpl<GuidenceFileMapper, GuidenceFile> implements GuidenceFileService {
}