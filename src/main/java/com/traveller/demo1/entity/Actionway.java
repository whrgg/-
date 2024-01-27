package com.traveller.demo1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
/**
 * 每个学生毕业前必须完成的设计类实践环节
 */
public class Actionway {

	/**
	 * 学号
	 */
	private Integer id;

	/**
	 * 学生
	 */
	private String studentName;

	/**
	 * 设计名称
	 */
	private String designName;

	/**
	 * 内容与工作量要求
	 */
	private String needed;

	/**
	 * 考核与成绩判定的方式
	 */
	private String checkWay;


}
