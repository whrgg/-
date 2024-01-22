package com.traveller.demo1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 三类课程对学生能力培养的举例说明
 */
public class CapabilityTraining {

	/**
	 * 主键id 专业id
	 */
	private Integer id;

	/**
	 * 学院
	 */
	private String academy;

	/**
	 * 课程类别
	 */
	private String courseCategory;

	/**
	 * 课程名称（与类别多对一）
	 */
	private String courseName;

	/**
	 * 课程目标
	 */
	private String courseObjectives;

	/**
	 * 对学生能力的培养
	 */
	private String abilityDevelopment;

	/**
	 * 考核评价方法
	 */
	private String test_Method;

	/**
	 * 考支撑的指标点
	 */
	private String indicate;


}
