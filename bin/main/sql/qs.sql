DROP TABLE IF EXISTS `author`;
CREATE TABLE `author` (
  `author_id` varchar(255) COLLATE utf8_bin NOT NULL COMMENT '作者ID',
  `author_account` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '作者账号',
  `author_password` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '作者密码',
  `author_name` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '作者姓名',
  `author_sex` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '作者性别',
  `author_birthday` date DEFAULT NULL COMMENT '作者出生日期',
  `author_phone` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '作者电话号码',
  `author_email` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '作者电子邮件',
  `author_photo` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '作者照片',
  `author_state` int(11) DEFAULT NULL COMMENT '作者状态',
  PRIMARY KEY (`author_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

INSERT INTO `author` VALUES ('5959ab5b-fa1f-4f72-8895-e70b480b71b0', 'test', '0000', '王军岩', '男', '1995-10-16', '18743102774', '1062837400@qq.com', 'logo.jpg', '1');
INSERT INTO `author` VALUES ('c5337055-7ae7-4227-b4f7-d65e94b45575', 'admin', '1234', '王军岩', '男', '1995-10-16', '18743102774', '1062837400@qq.com', 'logo.jpg', '1');

DROP TABLE IF EXISTS `design_templet`;
CREATE TABLE `design_templet` (
  `design_templet_id` varchar(255) COLLATE utf8_bin NOT NULL COMMENT '设计模板ID',
  `design_templet_name` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '设计模板名称',
  `finish_time` datetime DEFAULT NULL COMMENT '设计模板完成时间',
  `start_recovery_time` datetime DEFAULT NULL COMMENT '设计模板开始回收时间',
  `end_recovery_time` datetime DEFAULT NULL COMMENT '设计模板结束回收时间',
  `state` int(11) DEFAULT NULL COMMENT '设计模板状态',
  `link` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '设计模板链接',
  `author_id` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '作者ID',
  PRIMARY KEY (`design_templet_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

INSERT INTO `design_templet` VALUES ('3681c296-7a0a-45fa-9724-09716438aa04', '薛中然公众号粉丝调查', '2018-05-08 18:04:43', null, null, '1', null, 'c5337055-7ae7-4227-b4f7-d65e94b45575');

DROP TABLE IF EXISTS `queue_task`;
CREATE TABLE `queue_task` (
  `queue_id` varchar(255) COLLATE utf8_bin NOT NULL COMMENT '队列ID',
  `queue_name` varchar(255) COLLATE utf8_bin NOT NULL COMMENT '队列名称',
  `task_id` varchar(255) COLLATE utf8_bin NOT NULL COMMENT '任务ID',
  `task_data` varchar(255) COLLATE utf8_bin NOT NULL COMMENT '任务数据',
  `task_index` int(11) NOT NULL COMMENT '执行顺序索引',
  `task_state` int(11) NOT NULL COMMENT '任务状态: 1 等待中 2 执行中 3 已完成 4 已取消',
  PRIMARY KEY (`queue_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

INSERT INTO `queue_task` VALUES ('3c3aeee3-14b4-4405-881e-4209eabbb5f0', 'DesignTempletQueueTask3', '0', '{\"design_templet_id\":\"f5d24c42-ce09-4a83-88f4-b63f7978e120\",\"design_templet_name\":\"3\",\"finish_time\":null,\"start_recovery_time\":null,\"end_recovery_time\":null,\"state\":null,\"link\":null,\"author_id\":null}', '3', '3');
INSERT INTO `queue_task` VALUES ('8639cdac-5c5f-410c-abc5-a1d03528c71d', 'DesignTempletQueueTask2', '0', '{\"design_templet_id\":\"84d182ea-a684-45bd-9792-783cb3fcf671\",\"design_templet_name\":\"2\",\"finish_time\":null,\"start_recovery_time\":null,\"end_recovery_time\":null,\"state\":null,\"link\":null,\"author_id\":null}', '2', '3');
INSERT INTO `queue_task` VALUES ('9cd8e81d-576b-46fe-a0e3-ccb282aa136c', 'DesignTempletQueueTask1', '0', '{\"design_templet_id\":\"3f2c23b4-7044-4380-b869-fd453d52bcec\",\"design_templet_name\":\"1\",\"finish_time\":null,\"start_recovery_time\":null,\"end_recovery_time\":null,\"state\":null,\"link\":null,\"author_id\":null}', '1', '3');

DROP TABLE IF EXISTS `delay_task`;
CREATE TABLE `delay_task` (
  `delay_id` varchar(255) COLLATE utf8_bin NOT NULL COMMENT '延时ID',
  `delay_name` varchar(255) COLLATE utf8_bin NOT NULL COMMENT '延时名称',
  `task_id` varchar(255) COLLATE utf8_bin NOT NULL COMMENT '任务ID',
  `task_data` varchar(255) COLLATE utf8_bin NOT NULL COMMENT '任务数据',
  `task_score` varchar(255) COLLATE utf8_bin NOT NULL COMMENT '分数',
  `task_state` int(11) NOT NULL COMMENT '任务状态: 1 等待中 2 执行中 3 已完成 4 已取消',
  PRIMARY KEY (`delay_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

INSERT INTO `delay_task` VALUES ('7604db4c-d00c-48f6-9851-975163f090d1', 'DesignTempletDelayTask2', '2', '{\"design_templet_id\":\"156fb506-746d-463f-bec5-6faca7ce6f79\",\"design_templet_name\":\"2\",\"finish_time\":null,\"start_recovery_time\":null,\"end_recovery_time\":null,\"state\":null,\"link\":null,\"author_id\":null}', '1546261360044', '3');
INSERT INTO `delay_task` VALUES ('8f29fc35-df80-41bd-a180-c9019f2c94aa', 'DesignTempletDelayTask1', '1', '{\"design_templet_id\":\"bb329449-dbb8-4d36-a455-c04d261d27a0\",\"design_templet_name\":\"1\",\"finish_time\":null,\"start_recovery_time\":null,\"end_recovery_time\":null,\"state\":null,\"link\":null,\"author_id\":null}', '1546261330042', '3');
