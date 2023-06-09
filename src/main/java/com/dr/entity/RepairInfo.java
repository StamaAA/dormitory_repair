package com.dr.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author stama
 * @since 2023-06-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class RepairInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;

    private Integer phone;

    private String address;

    private String des;

    private String level;

    private String status;

//    private String imgs;
}
