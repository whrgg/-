package com.traveller.demo1.service.Imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.traveller.demo1.entity.ExpertParticipation;
import com.traveller.demo1.mapper.ExpertParticipationMapper;
import com.traveller.demo1.service.ExpertParticipationService;
import org.springframework.stereotype.Service;

@Service
public class ExpertParticipationServiceImp extends ServiceImpl<ExpertParticipationMapper, ExpertParticipation> implements ExpertParticipationService {
}