package com.traveller.demo1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 三类课程分表
 */
public class CapabilityClass {

	/**
	 * id
	 */
	private Integer id;

	/**
	 * 学院
	 */
	private String acdemy;

	/**
	 * 专业名称
	 */
	private String subjectName;

	/**
	 * 学分占比
	 */
	private java.math.BigDecimal allCredis;

	/**
	 * 是否达标 0否 1是
	 */
	private Integer isOk;

	/**
	 * 数据统计时间
	 */
	private java.util.Date createTime;


}
