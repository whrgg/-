package com.traveller.demo1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 开展学习指导、职业规划、就业指导、心理指导的主要内容和方法
 **/
public class GuidenceMaincontent {

	/**
	 * 主键id
	 */
	private Integer id;

	private Integer pid;

	/**
	 * 具体内容
	 */
	private String content;

	/**
	 * 指导方式
	 */
	private String guideMethod;

	/**
	 * 指导次数
	 */
	private Integer guideNums;

	/**
	 * 受众群体
	 */
	private String guidenGroup;

	/**
	 * 形成的文档的地址
	 */
	private String fileLocation;

	/**
	 * 指导负责人
	 */
	private String leader;


}
