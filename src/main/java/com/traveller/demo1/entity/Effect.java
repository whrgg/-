package com.traveller.demo1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 实习训练对学生能力培养的措施和效果
 */
public class Effect {

	/**
	 * 主键id
	 */
	private Integer id;

	/**
	 * 学院名称
	 */
	private String academy;

	/**
	 * 专业
	 */
	private String subject;

	/**
	 * 课程名称
	 */
	private String courseName;

	/**
	 * 课程目标
	 */
	private String courseAims;

	/**
	 * 支撑的指标点
	 */
	private String supportedPoints;

	/**
	 * 质量控制机制与措施
	 */
	private String waysActions;


}
