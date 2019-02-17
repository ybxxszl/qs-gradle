package com.wjy.task.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.wjy.common.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author ybxxszl
 * @since 2019-02-17
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="DelayTask对象", description="")
public class DelayTask extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "延时ID")
    @TableId(value = "delay_id", type = IdType.UUID)
    private String delayId;

    @ApiModelProperty(value = "延时名称")
    @TableField("delay_name")
    private String delayName;

    @ApiModelProperty(value = "任务ID")
    @TableField("task_id")
    private String taskId;

    @ApiModelProperty(value = "任务数据")
    @TableField("task_data")
    private String taskData;

    @ApiModelProperty(value = "分数")
    @TableField("task_score")
    private String taskScore;

    @ApiModelProperty(value = "任务状态: 1 等待中 2 执行中 3 已完成 4 已取消")
    @TableField("task_state")
    private Integer taskState;


}
