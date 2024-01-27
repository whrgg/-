package com.traveller.demo1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 人文社科课程对毕业要求的支撑证明
 */
public class Coursegradu {

	/**
	 * 课程毕业要求编号
	 */
	private Integer id;

	/**
	 * 学院
	 */
	private String academy;

	/**
	 * 专业
	 */
	private String subject;

	/**
	 * 课程名称
	 */
	private String course;

	/**
	 * 课程目标
	 */
	private String courseTarget;

	/**
	 * 学生能力要求
	 */
	private String studentAbility;

	/**
	 * 毕业要求
	 */
	private String graduRequi;

	/**
	 * 评价方式
	 */
	private String commentMethod;


}
