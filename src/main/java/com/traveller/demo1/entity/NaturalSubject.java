package com.traveller.demo1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 专业学分占比统计
 */
public class NaturalSubject {

	/**
	 * 专业编号
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
	 * 数学与自然学科合计学分占比
	 */
	private java.math.BigDecimal conut;

	/**
	 * 1表示达标 0表示不达标
	 */
	private Integer isOk;


}
