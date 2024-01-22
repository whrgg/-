package com.traveller.demo1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 本专业近三年各省份招生情况
 *
 */
public class EnrollmentsSituation {

	/**
	 * 主键id
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
	 * 省份
	 */
	private String province;

	/**
	 * 年份
	 */
	private Integer year;

	/**
	 * 招生数
	 */
	private Integer enrollments;

	/**
	 * 本专业分数
	 */
	private Integer subjectGrade;

	/**
	 * 高出一本线分数
	 */
	private Integer overGrade;


}
