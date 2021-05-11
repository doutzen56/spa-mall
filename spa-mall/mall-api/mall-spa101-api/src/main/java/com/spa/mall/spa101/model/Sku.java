package com.spa.mall.spa101.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author: doutzen@163.com
 * @Date: 2021/4/21 18:00
 * @Description:Spring Cloud Alibaba 商城
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
//MyBatisPlus表映射注解
@TableName(value = "sku")
public class Sku {

    @TableId(type = IdType.ASSIGN_ID)
    private String id;
    private String name;
    private Integer price;
    private Integer num;
    private String image;
    private String images;
    private Date createTime;
    private Date updateTime;
    private String spuId;
    private Integer categoryId;
    private String categoryName;
    private Integer brandId;
    private String brandName;
    private String skuAttribute;
    private Integer status;
}
