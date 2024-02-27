package com.traveller.demo1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
/**
 * 人文社科类课程学分设置以及达标情况
 */
public class Situation3 {

	/**
	 * 主键id
	 */
	private Integer id;

	/**
	 * 学院
	 */
	private String academy;

	/**
	 * 学科
	 */
	private String subject;

	/**
	 * 类别
	 */
	private String categories;

	/**
	 * 课程名称
	 */
	private String course_Name;

	/**
	 * 课程性质
	 */
	private String properties;

	/**
	 * 学分
	 */
	private Integer score;


}
