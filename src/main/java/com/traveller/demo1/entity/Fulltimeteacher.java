package com.traveller.demo1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


/**
 * 本专业专职教师统计表
 */
public class Fulltimeteacher {

	/**
	 * 主键id
	 */
	private Integer id;

	/**
	 * 专职教师编号
	 */
	private Integer fulltimeTeaId;

	/**
	 * 专职教师名字
	 */
	private String fulltimeTeaName;

	/**
	 * 学院
	 */
	private String academy;

	/**
	 * 专业
	 */
	private String subject;

	/**
	 * 教师编号
	 */
	private Integer teacherId;

	/**
	 * 性别
	 */
	private String sex;

	/**
	 * 年龄
	 */
	private Integer age;

	/**
	 * 职称
	 */
	private String title;

	/**
	 * 最终学历
	 */
	private String finalEducation;

	/**
	 * 毕业学校
	 */
	private String graduationSch;

	/**
	 * 毕业专业
	 */
	private String graduationSpe;

	/**
	 * 专业工作经验
	 */
	private String speWorkExp;

	/**
	 * 所授课程编号
	 */
	private Integer courseId;

	/**
	 * 本专业经验
	 */
	private String thisSpeExp;


}
