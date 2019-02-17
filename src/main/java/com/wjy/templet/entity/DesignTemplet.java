package com.wjy.templet.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.wjy.common.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
@ApiModel(value="DesignTemplet对象", description="")
public class DesignTemplet extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "设计模板ID")
    @TableId(value = "design_templet_id", type = IdType.UUID)
    private String designTempletId;

    @ApiModelProperty(value = "设计模板名称")
    @TableField("design_templet_name")
    private String designTempletName;

    @ApiModelProperty(value = "设计模板完成时间")
    @TableField("finish_time")
    private LocalDateTime finishTime;

    @ApiModelProperty(value = "设计模板开始回收时间")
    @TableField("start_recovery_time")
    private LocalDateTime startRecoveryTime;

    @ApiModelProperty(value = "设计模板结束回收时间")
    @TableField("end_recovery_time")
    private LocalDateTime endRecoveryTime;

    @ApiModelProperty(value = "设计模板状态")
    @TableField("state")
    private Integer state;

    @ApiModelProperty(value = "设计模板链接")
    @TableField("link")
    private String link;

    @ApiModelProperty(value = "作者ID")
    @TableField("author_id")
    private String authorId;


}
