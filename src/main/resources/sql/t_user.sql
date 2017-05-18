/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50712
Source Host           : localhost:3306
Source Database       : db_ssm

Target Server Type    : MYSQL
Target Server Version : 50712
File Encoding         : 65001

Date: 2017-05-15 16:24:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) NOT NULL,
  `user_password` varchar(255) NOT NULL,
  `user_leixing` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'hanxu', '253302530', '领导');
INSERT INTO `t_user` VALUES ('2', 'hanjiuri', '253302530', '员工');
