package com.traveller.demo1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 本专业核心课程对毕业要求的支撑理由
 */
public class CorecourseSupportmatrix {

	/**
	 * 主键id
	 */
	private Integer id;

	/**
	 * 学院
	 */
	private String academy;

	/**
	 * 课程名称
	 */
	private String courseName;

	/**
	 * 支撑的指标点
	 */
	private String supportInd;

	/**
	 * 支撑理由说明
	 */
	private String supportingReasons;

	/**
	 * 建档时间
	 */
	private java.util.Date createTime;


}
