package com.traveller.demo1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 专家参与情况
 */
public class ExpertParticipation {

	/**
	 * 主键id
	 */
	private Integer id;

	/**
	 * 学院
	 */
	private String academy;

	/**
	 * 专家姓名
	 */
	private String expertName;

	/**
	 * 单位
	 */
	private String organization;

	/**
	 * 职务职称
	 */
	private String positionTitle;

	/**
	 * 参与方式
	 */
	private String partMethod;

	/**
	 * 作用及建议
	 */
	private String impactSuggestions;

	/**
	 * 是否采纳
	 */
	private Integer isAdopted;

	/**
	 * 建档时间
	 */
	private java.util.Date createTime;


}
