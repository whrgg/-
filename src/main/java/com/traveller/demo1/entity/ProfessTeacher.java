package com.traveller.demo1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 专业教师
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProfessTeacher {

	/**
	 * 主键id
	 */
	private Long id;

	/**
	 * 学院
	 */
	private String academy;

	/**
	 * 专业
	 */
	private String subject;

	/**
	 * 教师名称
	 */
	private String teacherName;

	/**
	 * 出生年月
	 */
	private String birth;

	/**
	 * 学位
	 */
	private String degree;

	/**
	 * 职称
	 */
	private String jobTitle;

	/**
	 * 本科学校以及专业存储使用格式school:专业
	 */
	private String bacSchool;

	/**
	 * 硕士学校以及专业存储使用格式school:专业
	 */
	private String masSchool;

	/**
	 * 博士学校以及专业存储使用格式school:专业
	 */
	private String docSchool;

	/**
	 * 最近一年承担的课程或者教学环节
	 */
	private String fWorks;

	/**
	 * 第二年的任务
	 */
	private String sWorks;

	/**
	 * 第三年承担的本专业课程或者教学环节
	 */
	private String tWorks;


}
