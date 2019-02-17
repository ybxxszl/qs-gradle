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
@ApiModel(value="QueueTask对象", description="")
public class QueueTask extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "队列ID")
    @TableId(value = "queue_id", type = IdType.UUID)
    private String queueId;

    @ApiModelProperty(value = "队列名称")
    @TableField("queue_name")
    private String queueName;

    @ApiModelProperty(value = "任务ID")
    @TableField("task_id")
    private String taskId;

    @ApiModelProperty(value = "任务数据")
    @TableField("task_data")
    private String taskData;

    @ApiModelProperty(value = "执行顺序索引")
    @TableField("task_index")
    private Integer taskIndex;

    @ApiModelProperty(value = "任务状态: 1 等待中 2 执行中 3 已完成 4 已取消")
    @TableField("task_state")
    private Integer taskState;


}
