/*
 Navicat MySQL Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : localhost
 Source Database       : test

 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : utf-8

 Date: 04/19/2019 22:46:48 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `goods`
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `price` float(2,2) NOT NULL,
  `quantity` int(11) NOT NULL,
  PRIMARY KEY (`id`,`name`,`price`,`quantity`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `history_column_info`
-- ----------------------------
DROP TABLE IF EXISTS `history_column_info`;
CREATE TABLE `history_column_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `chinese_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ext` varchar(200) NOT NULL,
  `yn` tinyint(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `history_paper_info`
-- ----------------------------
DROP TABLE IF EXISTS `history_paper_info`;
CREATE TABLE `history_paper_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) NOT NULL COMMENT '文章标题',
  `colunm_id` int(11) NOT NULL COMMENT '所属栏目的id',
  `content` varchar(128) NOT NULL COMMENT '正文富文本所在文件路径',
  `file_list` varchar(256) DEFAULT NULL COMMENT '下载文件路径列表，分号分割',
  `video` varchar(128) DEFAULT NULL COMMENT '文章视频路径',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `yn` tinyint(4) NOT NULL COMMENT '是否有效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
