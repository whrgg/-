package com.traveller.demo1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 实习教学条件
 */
public class ShixiBasicinformation {

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
	 * 实习地点承担的教学科目
	 */
	private String shixiSubject;

	/**
	 * 学生能力达成的考核评价方式
	 */
	private String evaluationMethod;

	/**
	 * 实习场所
	 */
	private String shixiPlace;

	/**
	 * 学生数量
	 */
	private Integer studentNum;

	/**
	 * 实践
	 */
	private java.util.Date year;


}
