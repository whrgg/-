package com.traveller.demo1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 以团队形式完成的实践教学活动
 */
public class Activities {

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
	 * 环节名称
	 */
	private String name;

	/**
	 * 内容要求与教学方式
	 */
	private String contextRequirement;

	/**
	 * 学分
	 */
	private Integer score;

	/**
	 * 考核与成绩判定方式
	 */
	private String checkWay;


}
