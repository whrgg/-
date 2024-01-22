package com.traveller.demo1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 专业培养目标对学校人才培养总目标的支撑关系
 */
public class SupportingRelationship {

	/**
	 * 主键id
	 */
	private Long id;

	/**
	 * 专业名称
	 */
	private String subjectName;

	/**
	 * 学校人才培养定位
	 */
	private String cultureOrientation;

	/**
	 * 专业培养目标中的描述
	 */
	private String cultrueDescription;

	/**
	 * 建档时间
	 */
	private java.util.Date createTime;


}
