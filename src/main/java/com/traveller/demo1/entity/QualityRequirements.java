package com.traveller.demo1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * 主要教学质量环节
 */
public class QualityRequirements {

	/**
	 * 主键id
	 */
	private Long id;

	/**
	 * 教学环节名称
	 */
	private String teachName;

	/**
	 * 主要质量要求
	 */
	private String mainQualityRequirements;

	/**
	 * 质量控制责任人
	 */
	private String personResponsibleForQualityControl;

	/**
	 * 质量监控措施
	 */
	private String qualityControlMeasure;

	/**
	 * 形成的文件和记录性文档
	 */
	private String flieRecordDocumentation;


}
