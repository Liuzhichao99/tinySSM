/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 80012
Source Host           : localhost:3306
Source Database       : tinyssm

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2022-11-06 22:40:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_employee
-- ----------------------------
DROP TABLE IF EXISTS `t_employee`;
CREATE TABLE `t_employee` (
  `emp_id` int(11) NOT NULL AUTO_INCREMENT,
  `emp_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `age` int(11) DEFAULT NULL,
  `gender` int(11) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`emp_id`,`emp_name`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_employee
-- ----------------------------
INSERT INTO `t_employee` VALUES ('1', 'asdf', '123', '1', '阿斯蒂芬');
INSERT INTO `t_employee` VALUES ('2', 'fff', '32', '0', '阿萨德');
INSERT INTO `t_employee` VALUES ('4', 'dd1', '15', '1', '阿萨德李逵负荆');
INSERT INTO `t_employee` VALUES ('5', 's77', '77', '1', '俄日6677');
INSERT INTO `t_employee` VALUES ('10', 'kunkun666', '156', '0', '62666@q.c');
