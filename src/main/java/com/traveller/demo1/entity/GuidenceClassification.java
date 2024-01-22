package com.traveller.demo1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
/**
 * 学习指导、职业规划、就业指导、心理指导分类
 */
public class GuidenceClassification {

	/**
	 * 主键id
	 */
	private Integer id;

	/**
	 * 指导分类
	 */
	private String g_Classification;


}
