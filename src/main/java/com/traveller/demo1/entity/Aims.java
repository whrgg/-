package com.traveller.demo1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
/**
 * 学生必须完成的企业经历
 */
public class Aims {

	/**
	 * 学号
	 */
	private Integer id;

	/**
	 * 学生姓名
	 */
	private Integer studentName;

	/**
	 * 课程名称
	 */
	private String courseName;

	/**
	 * 内容要求与教学方式
	 */
	private String contextRequirement;

	/**
	 * 考核与成绩判定方式
	 */
	private Integer checkWay;

	/**
	 * 学分或者周数
	 */
	private Integer score;

	/**
	 * 支撑的指标点
	 */
	private Integer supportedPoints;


}
