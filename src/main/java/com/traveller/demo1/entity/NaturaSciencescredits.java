package com.traveller.demo1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 学分设置
 */
public class NaturaSciencescredits {

	/**
	 * 主键id
	 */
	private Integer id;

	/**
	 * 专业编号

	 */
	private Integer classPid;

	/**
	 * 课程名称
	 */
	private String courseName;

	/**
	 * 课程类别
	 */
	private String courseCategory;

	/**
	 * 课程性质
	 */
	private String courseNature;

	/**
	 * 学分
	 */
	private Integer credits;


}
