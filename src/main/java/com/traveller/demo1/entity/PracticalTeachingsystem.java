package com.traveller.demo1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
/**
 * 本专业教学体系一览
 */
public class PracticalTeachingsystem {

	/**
	 * id

	 */
	private Integer id;

	/**
	 * 环节名称
	 */
	private String name;

	/**
	 * 学分
	 */
	private Integer credis;

	/**
	 * 考核和成绩判定的方式
	 */
	private String evaluationMethod;


}
