package com.traveller.demo1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
/**
 * 数学与自然科学学分占比以及达标情况 表2
 */
public class Naturalsciencescredits {

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
