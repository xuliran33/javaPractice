use School;
# 创建一个测试表
create table if not exists test(
	coll INT(4) NOT NULL
);

create table if not exists test2(
	coll INT(4) PRIMARY KEY AUTO_INCREMENT NOT NULL,
    name varchar(20)
)AUTO_INCREMENT=5;
# 自增列初始值默认为1, 步长为1
# 更改初始值 AUTO_INCREMENT=5
SET @@auto_increment_increment = 5;

#查看MySQL支持的表类型
show engines;
#查看默认引擎
show variables like 'storage_engine';