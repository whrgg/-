package com.traveller.demo1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 工业基础类，专业基础类与专业课程的学分设置和达标情况
 */
public class EngineeringCredits {

	/**
	 * 主键id
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
	 * 课程名称
	 */
	private String courseName;

	/**
	 * 课程性质
	 */
	private String courseNature;

	/**
	 * 学分
	 */
	private Integer credits;

	/**
	 * 是否达标
	 */
	private Integer isMet;


}
