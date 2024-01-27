package com.traveller.demo1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 兼职教师承担课业表
 */
public class Pastthreeptimeteawork {

	/**
	 * 编号
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
	 * 课程性质
	 */
	private String courseType;

	/**
	 * 学时
	 */
	private Integer classHour;

	/**
	 * 学分
	 */
	private Integer credit;

	/**
	 * 开设年纪
	 */
	private String openingGrade;

	/**
	 * 兼职教师工作量工作量
	 */
	private String parttimeTeaWorkload;

	/**
	 * 考核方式
	 */
	private String assessmentMethod;

	/**
	 * 学年
	 */
	private String schoolYear;

	/**
	 * 学生人数
	 */
	private Integer studentNumer;

	/**
	 * 成绩分布
	 */
	private String gradeDistribution;


}
