package com.traveller.demo1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 毕业论文设计情况
 */
public class Situation1 {

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
	private Integer subject;

	/**
	 * 类别
	 */
	private String categories;

	/**
	 * 分类基本描述
	 */
	private String descriptions;

	/**
	 * 对该类论文的基本要求
	 */
	private String requirement;

	/**
	 * 当年该类论文所占百分比
	 */
	private Integer percentage;

	private java.util.Date year;


}
