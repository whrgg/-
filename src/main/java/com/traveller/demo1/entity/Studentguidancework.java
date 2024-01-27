package com.traveller.demo1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 学生指导工作统计表
 */
public class Studentguidancework {

	/**
	 * 项目编号
	 */
	private Integer projectId;

	/**
	 * 学院
	 */
	private String academy;

	/**
	 * 专业
	 */
	private String subject;

	/**
	 * 指导者（教师编号）
	 */
	private Integer teacherId;

	/**
	 * 教师名称
	 */
	private String teacherName;

	/**
	 * 指导方式
	 */
	private String guidanceMethod;

	/**
	 * 指导频度
	 */
	private Integer guidanceFreque;

	/**
	 * 受覆盖面
	 */
	private String coverage;


}
