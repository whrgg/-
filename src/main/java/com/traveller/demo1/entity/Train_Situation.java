package com.traveller.demo1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
/**
 * 校企开展实习实训情况
 */
public class Train_Situation {

	/**
	 * 主键id
	 */
	private Integer id;

	/**
	 * 基地名称
	 */
	private String baseName;

	/**
	 * 校外合作方
	 */
	private String schoolCooperation;

	/**
	 * 承担的教学任务
	 */
	private String teachingTasks;

	/**
	 * 学生在基地的考核方式
	 */
	private String checkWay;

	/**
	 * 当年进基地的学生数
	 */
	private Integer num;

	/**
	 * 年份
	 */
	private java.util.Date year;


}
