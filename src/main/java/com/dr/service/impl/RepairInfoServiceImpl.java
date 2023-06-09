package com.dr.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dr.entity.RepairInfo;
import com.dr.mapper.RepairInfoMapper;
import com.dr.service.IRepairInfoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author stama
 * @since 2023-06-08
 */
@Service
public class RepairInfoServiceImpl extends ServiceImpl<RepairInfoMapper, RepairInfo> implements IRepairInfoService {

}
