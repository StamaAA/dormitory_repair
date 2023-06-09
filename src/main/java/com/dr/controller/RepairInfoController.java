package com.dr.controller;


import com.dr.entity.RepairInfo;
import com.dr.service.IRepairInfoService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author stama
 * @since 2023-06-08
 */
@RestController
@RequestMapping("/dr/repair-info")
public class RepairInfoController {

    @Autowired
    IRepairInfoService repairInfoService;

    @RequestMapping("insert")
    public String insert(RepairInfo repairInfo) throws JsonProcessingException {
        //JSON解析工具
        ObjectMapper objectMapper = new ObjectMapper();
        //定义map集合
        HashMap result = new HashMap();
        //查询构造条件
        boolean ok = repairInfoService.save(repairInfo);
        //保存在map中
        result.put("ok", ok);
        // 转换为json写出
        return objectMapper.writeValueAsString(result);
    }
}
