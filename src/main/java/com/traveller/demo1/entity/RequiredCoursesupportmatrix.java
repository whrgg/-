package com.traveller.demo1.entity;


import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequiredCoursesupportmatrix {

	/**
	 * 主键id
	 */
	private Integer id;

	/**
	 * 学院
	 */
	private String academy;

	/**
	 * 专业名称
	 */
	private String subjectName;

	/**
	 * 课程选择
	 */
	private String courseSelection;

	/**
	 * 工程知识开发
	 */
	private String engineerKnowledge;

	/**
	 * 问题分析
	 */
	private String problemAnalysis;

	/**
	 * 设计/开发解决方案
	 */
	private String designSolution;

	/**
	 * 研究
	 */
	private String research;

	/**
	 * 使用现代工具
	 */
	private String useTools;

	/**
	 * 工程与社会
	 */
	private String engineerSociety;

	/**
	 * 环保和可持续发展
	 */
	private String development;

	/**
	 * 职业道德
	 */
	private String professional;

	/**
	 * 沟通
	 */
	private String communication;

	/**
	 * 项目管理
	 */
	private String projectManagement;

	/**
	 * 个人和团队
	 */
	private String personalTeam;

	/**
	 * 终身学习
	 */
	private String lifeLearn;


}
