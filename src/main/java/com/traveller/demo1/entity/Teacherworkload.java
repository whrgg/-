package com.traveller.demo1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 教师对本科教学工作量统计表
 */
public class Teacherworkload {

	/**
	 * 教师编号
	 */
	private Integer teacherId;

	/**
	 * 教师名称
	 */
	private String teacherName;

	/**
	 * 学院
	 */
	private String academy;

	/**
	 * 专业
	 */
	private String subject;

	/**
	 * 年份
	 */
	private String year;

	/**
	 * 课程编号
	 */
	private Integer courseId;

	/**
	 * 教授课时
	 */
	private String teachHour;

	/**
	 * 行政工作
	 */
	private String administration;

	/**
	 * 教改工作
	 */
	private String educationReform;

	/**
	 * 学生指导
	 */
	private String studentGuidance;


}
