#创建数据库
create database if not exists School;
#使用数据库
use school;
#删除 数据库
#drop database if exists Student;
#创建表
create table if not exists student(
	id INT(4) PRIMARY KEY AUTO_INCREMENT COMMENT'主键 学号',
    pwd VARCHAR(20) DEFAULT '123456' NOT NULL COMMENT'密码',
    `name` VARCHAR(30) DEFAULT '匿名' NOT NULL COMMENT'姓名',
    sex VARCHAR(2) NOT NULL DEFAULT'男' COMMENT'性别',
    birthday DATETIME COMMENT'出生日期',
    address VARCHAR(100) COMMENT'家庭住址',
    email VARCHAR(50) COMMENT'邮箱'
)

# 查看创建数据库的定义
# show create database School; 
# 查看数据表的定义
# show create table student; 
#显示表结构
# desc student;
# 设置严格检查模式
#SET sql_mode='strict_trans_tables';