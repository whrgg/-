package com.traveller.demo1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 最近三年学生数
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecruitStudents {

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
	 * 省份
	 */
	private String province;

	/**
	 * 年份
	 */
	private String year;

	/**
	 * 招生人数
	 */
	private Integer nums;

	/**
	 * 本专业分数线
	 */
	private Integer acGrade;

	/**
	 * 超出一本线成绩
	 */
	private Integer overGrade;


}
