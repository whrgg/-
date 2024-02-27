package com.traveller.demo1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


/**
 近三年转入本专业的学生名单
 **/
public class TransferStudents {

	/**
	 * 学号
	 */
	Integer studentId;

	/**
	 * 当前学院
	 */
	private String currentAcademy;

	/**
	 * 当前专业
	 */
	private String currentSubject;

	/**
	 * 上一个学院
	 */
	private String lastAcademy;

	/**
	 * 上一个专业
	 */
	private String lastSubject;

	/**
	 * 学生姓名
	 */
	private String name;

	/**
	 * 转入时间
	 */
	private java.util.Date transferTime;


}
