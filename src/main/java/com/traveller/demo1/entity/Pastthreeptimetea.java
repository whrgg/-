package com.traveller.demo1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 企业兼职教师表
 */
public class Pastthreeptimetea {

	/**
	 * 兼职教师编号
	 */
	private Integer parttimeTeaId;

	/**
	 * 兼职教师名字
	 */
	private String parttimeName;

	/**
	 * 学院
	 */
	private String academy;

	/**
	 * 专业
	 */
	private String subject;

	/**
	 * 教师编号
	 */
	private Integer teacherId;

	/**
	 * 教师名称
	 */
	private String teacherName;

	/**
	 * 工作单位
	 */
	private String workUnit;

	/**
	 * 专业职务
	 */
	private String professionPosition;

	/**
	 * 职称
	 */
	private String title;

	/**
	 * 兼职实践
	 */
	private String parttimePractice;

	/**
	 * 承担的教学工作
	 */
	private String teachingWork;

	/**
	 * 近三年工作量
	 */
	private String workloadPastThree;


}
