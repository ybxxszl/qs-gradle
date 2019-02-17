package com.wjy.author.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.wjy.common.base.BaseEntity;
import java.time.LocalDate;
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
@ApiModel(value="Author对象", description="")
public class Author extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "作者ID")
    @TableId(value = "author_id", type = IdType.UUID)
    private String authorId;

    @ApiModelProperty(value = "作者账号")
    @TableField("author_account")
    private String authorAccount;

    @ApiModelProperty(value = "作者密码")
    @TableField("author_password")
    private String authorPassword;

    @ApiModelProperty(value = "作者姓名")
    @TableField("author_name")
    private String authorName;

    @ApiModelProperty(value = "作者性别")
    @TableField("author_sex")
    private String authorSex;

    @ApiModelProperty(value = "作者出生日期")
    @TableField("author_birthday")
    private LocalDate authorBirthday;

    @ApiModelProperty(value = "作者电话号码")
    @TableField("author_phone")
    private String authorPhone;

    @ApiModelProperty(value = "作者电子邮件")
    @TableField("author_email")
    private String authorEmail;

    @ApiModelProperty(value = "作者照片")
    @TableField("author_photo")
    private String authorPhoto;

    @ApiModelProperty(value = "作者状态")
    @TableField("author_state")
    private Integer authorState;


}
