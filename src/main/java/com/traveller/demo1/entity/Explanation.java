package com.traveller.demo1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 毕业论文各环节的质控制措施以及对学生能力的培养说明
 */
public class Explanation {

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
	 * 毕业设计环节
	 */
	private String link;

	/**
	 * 质量控制措施
	 */
	private String measures;

	/**
	 * 支撑的毕业要求
	 */
	private String requirement;


}
