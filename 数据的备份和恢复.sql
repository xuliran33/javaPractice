# MySQL的备份: 保证数据不丢失, 数据转移
# 备份方法
	#(1)mysql dump 客户端 source命令恢复
    #(2)使用工具备份和恢复
    #(3)使用SQL命令方式备份和恢复
    #(4)直接拷贝数据库文件和相关配置文件
# /*!*/ mysql可执行的注释
# mysqldump -uroot -p密码 数据库 表名 表名>路径
 # mysqldump -uroot -p密码 --skip-add-drop-table 数据库 表名 表名>路径 跳过 add drop table 这句话
 # mysqldump -uroot -p密码 --skip-add-drop-table -c 数据库 表名 表名>路径, -c添加列名
# mysqldump --help|more帮助查看mysqldump的可选参数
# source 恢复
# (1)进入mysql
# (2)切换到要恢复的数据库如test
# (3)source 备份时的路径
# mysql语句 mysql -uroot -p密码 目标数据库</源路径
# 将school数据库studnet表中的学号和姓名导出
# 备份select StudentNo, StudentName into outfile '路径' from student;
# 恢复 use test; 创建表table, 数据结构和备份的结构一致; load data infile '路径' into table(字段1, 字段2)