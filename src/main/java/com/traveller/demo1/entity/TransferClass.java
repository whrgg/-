package com.traveller.demo1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 转入学生的课程认定实例
 */

public class TransferClass {

	/**
	 * 主键id（也是学号）
	 */
	private Integer studentId;

	/**
	 * 原专业课程名称
	 */
	private String lastClassname;

	/**
	 * 原专业课时
	 */
	private Integer lastClasstime;

	/**
	 * 原专业课程学分
	 */
	private Integer lastClassgrade;

	/**
	 * 本专业课程名称
	 */
	private String currentClassname;

	/**
	 * 本专业课时
	 */
	private Integer currentClasstime;

	/**
	 * 本专业学分
	 */
	private Integer currentClassgrade;

	/**
	 * 认定依据
	 */
	private String determination;

	/**
	 * 认定结果 1为通过 0为不通过
	 */
	private Integer determinationBoolean;


}
