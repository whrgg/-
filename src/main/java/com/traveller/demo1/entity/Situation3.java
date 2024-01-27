package com.traveller.demo1.entity;


import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
