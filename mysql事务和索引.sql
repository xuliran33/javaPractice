# 事务: 就是将一组SQL语句放在同一批次内去执行
# 如果一个SQL语句出错, 则该批次内的所有SQL都将被取消执行
	# 注意: MYSQL事务处理只支持InnoDB和BDB数据表类型
# 事务的特点
# ACID原则 原子性(atomic) 一致性(Consist) 隔离性(Isolated, 每个事务之间是互补影响的) 持久性(Durable)
# MySQL中默认是自动提交, 使用事务时应先关闭自动提交
# SET AUTOCOMMIT = 0; 关闭自动提交
# start transaction 开始一个事务, 标记事务的起点
# commit 提交一个事务给数据库
# rollback 将事务回滚, 数据回到本次事务的初始状态
# SET AUTOCOMMIT = 1; 还原自动提交

# 需求 A在线购买一款商品, 价格为500, 采用网上银行转账的方式支付
# 假如A卡内余额为2000元, 且向卖家B支付500元, 卖家B的账号金额为10000元
# 创建数据库shop和创建表account并插入两条数据
# 以school为例
create table if not exists `account`(
	id int(4) primary key auto_increment,
    `name` varchar(32) not null,
    cash decimal(9,2) not null
);

insert into `account`(`name`, cash) 
values ('A', 2000.00),
('B', 10000.00);

set AUTOCOMMIT=0;
start transaction;
update `account` set cash=cash-500 where `name`='A';
update `account` set cash=cash+500 where `name`='B';
#commit;
rollback;
set AUTOCOMMIT=1;

select *from `account`;

delete from `account`;

# 数据索引
# 作用 提高查询速度
	# 确保数据的唯一性
    # 可以加速表和表之间的连接, 实现表与表之间参照的完整性
	# 使用分组和排序子句进行检索时, 可以显著减少分组和排序的时间
    # 全文检索字段进行搜索优化
# 分类: 主键索引(primary key) 唯一所以(unique) 常规索引(index, 经常被当做查询调价的字段) 全文索引(fulltext, 只能用于MyISAM, 只能用于char varchar text类型)
# 添加索引方式一:创建表声明列属性的时候添加
create table test1(
	id int(4) primary key,
    testno varchar(10) unique,
    c varchar(50),
    d varchar(20),
    e text,
    # c,d那个频率高哪个在前面
    index `index_c` (`c`, `d`),
    fulltext(e)
)engine=MyISAM;

# 添加索引方式二:创建表将所有列都声明完后添加索引
create table test2(
	id int(4),
    testno varchar(10),
    c varchar(50),
    d varchar(20),
    e text,
    primary key (id),
    unique (testno),
	index `index_c` (`c`, `d`),
    fulltext(e)
)engine=MyISAM;


# 添加索引方式三:先创建表, 创建表完毕后修改表, 添加索引
create table test3(
	id int(4),
    testno varchar(10),
    c varchar(50),
    d varchar(20),
    e text
)engine=MyISAM;

alter table test3 add primary key(id);
alter table test3 add unique(testno);
alter table test3 add index(c,d);
alter table test3 add fulltext(e);

explain select *from student where StudentNo=1000;

# 全文索引: 
# 注意: 全文索引的内容出现次数大于50%, 全文索引无效
alter table student engine=MyISAM;
alter table student add fulltext(StudentName);

explain select *from student where StudentName like '李%';
# 使用全文索引
explain select *from student where match(StudentName) against ('李');

# 删除索引
drop index testno on test1;
alter table test1 drop index e;

# 删除主键索引
alter table test1 drop primary key;
# 显示索引信息
show index from student;

# 索引准则
# 索引不是越多越好
# 不要对经常变动的数据添加索引
# 小数据量的表建议不要加索引
# 索引一般应加在查找条件的字段