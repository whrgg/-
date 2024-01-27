package com.traveller.demo1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 近三年行业企业家参与指导毕业设计的情况
 */
public class Situation2 {

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
	 * 学年
	 */
	private Integer years;

	/**
	 * 论文总数
	 */
	private Integer nums;

	/**
	 * 行业专家参与指导的论文数
	 */
	private Integer expertNums;

	/**
	 * 占比
	 */
	private java.math.BigDecimal percentage;


}
