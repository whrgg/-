package com.traveller.demo1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


/**
 * 成绩评价标准
 */
public class GradeDetermination {

	/**
	 * 主键id
	 */
	private Long id;

	/**
	 * 毕业要求
	 */
	private Long graduationRequirements;

	/**
	 * 指标点
	 */
	private Integer indexPoint;

	/**
	 * 用于评价的教学环节
	 */
	private String teachLink;

	/**
	 * 评价方法
	 */
	private String evaluateMethod;

	/**
	 * 评价依据
	 */
	private String evaluateGist;

	/**
	 * 评价负责人
	 */
	private String personResponsibility;

	/**
	 * 形成的记录文档
	 */
	private String recordDocument;


}
