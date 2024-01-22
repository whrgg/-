package com.traveller.demo1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 招生渠道以及宣传内容
 **/

public class PublicizeMethod {

	/**
	 * 表主键
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
	 * 宣传方式
	 */
	private String publicizeMethod;

	/**
	 * 宣传内容
	 */
	private String publicizeContent;

	/**
	 * 宣传负责人
	 */
	private String publicizeLeader;

	/**
	 * 宣传时间
	 */
	private java.util.Date publicizeTime;


}
