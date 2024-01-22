package com.traveller.demo1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


/**
 学习指导、职业规划、就业指导、心理指导制度文件
 **/
public class GuidenceFile {

	/**
	 * 主键id
	 */
	private Integer id;

	/**
	 * 外键，用来关联是哪一类的
	 */
	private Integer pid;

	/**
	 * 制度文件名称
	 */
	private String fileName;

	/**
	 * 责任机构和责任人
	 */
	private String responser;

	/**
	 * 工作职责
	 */
	private String jresponse;


}
