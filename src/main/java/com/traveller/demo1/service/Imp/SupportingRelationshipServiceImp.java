package com.traveller.demo1.service.Imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.traveller.demo1.entity.SupportingRelationship;
import com.traveller.demo1.mapper.SupportingRelationshipMapper;
import com.traveller.demo1.service.SupportingRelationshipService;
import org.springframework.stereotype.Service;

@Service
public class SupportingRelationshipServiceImp extends ServiceImpl<SupportingRelationshipMapper, SupportingRelationship> implements SupportingRelationshipService {
}