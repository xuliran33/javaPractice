# 查询学生所有信息(*代表所有列, 效率低)
select * from subject;
# 查询指定列(学号 姓名)
select StudentNo,StudentName from student;
# 取别名(as, 也可省略)
select StudentNo as 学号,StudentName as 姓名 from student;
select StudentNo 学号,StudentName 姓名 from student;

# 使用as也可以为表取别名, 当使用多个表连接查询的时候使用
select StudentNo as 学号,StudentName as 姓名 from student as s;
select StudentNo as 学号,StudentName as 姓名 from student s;

#使用as, 为查询结果取一个新的名字
select concat('姓名: ' ,StudentName) as 姓名 from student;

# 查看参加考试的学生学号 -- 去除重复项distinct, 查询所有项all
select distinct StudentNo from result ;

#select查询可以使用表达式(如自增步长)
select @@auto_increment_increment;
select version();

#使用表达式
select 100 *3 -1 as 计算结果;

# 给所有学员考试成绩集体加1分, 数据库中原成绩不变
select StudentNo,StudentResult+1 as 提分后的成绩 from result;

# 满足条件的查询(where)
# 查询考试成绩在95到100之间(模糊查询)
select StudentNo,StudentResult
from result 
where StudentResult>=95 and StudentResult<=100;

select StudentNo,StudentResult
from result 
where StudentResult between 95 and 100;

# 精确查询
select StudentNo,StudentResult
from result 
where StudentResult=100;

# 比较运算符的使用
select StudentNo,StudentResult
from result 
where StudentNo!=1000;

select StudentNo,StudentResult
from result 
where not StudentNo=1000;

# 模糊查询 between and , like, in, null
# 查询姓李的同学
# like 结合使用的通配符 %(0到任意个字符), _(一个字符)
select StudentNo,StudentName from student where StudentName like '李%';
# 查询姓李的同学,名为一个字
select StudentNo,StudentName from student where StudentName like '李_';
# 查询姓李的同学,名为两个字
select StudentNo,StudentName from student where StudentName like '李__';
# 查询姓名中含有"文"的同学
select StudentNo,StudentName from student where StudentName like '%文%';
# 查询学院姓名中有"%"字, 需要用到转义符\
select StudentNo,StudentName from student where StudentName like '%\%%';
# 查询学院姓名中有"_"字, 需要用到转义符\
select StudentNo,StudentName from student where StudentName like '%\_%';
# 查询学院姓名中有"_"字, 自定义转衣服
select StudentNo,StudentName from student where StudentName like '%:_%' escape ':';

# 模糊查询 in
select StudentNo,StudentName from student
where StudentNo=1000 or StudentNo=1001 or StudentNo=1002 or StudentNo=1003;

select StudentNo,StudentName from student where StudentNo in (1000, 1001, 1002, 1003);

select StudentNo,StudentName from student where Address in ('北京', '南京', '苏州', '扬州');

# 模糊查询 null
# 查询出生日期没有填写的同学
select StudentNo,StudentName from student where BornDate is null;
# 查询出生日期填写的同学
select StudentNo,StudentName from student where BornDate is not null;

# 区别空字符串和 null
select StudentNo,StudentName from student where Address='' or Address is null;

# 连接查询, 查询多个不同表之间的数据
# 内连接 inner join 查询两个表中的结果集中的交集
# 外连接 outer join
	# 左外连接 left join
    # 右外连接 right join
# 自连接
# 等值连接 非等值连接

# 查询参加了考试的同学信息(学号, 学生姓名, 科目编号, 分数)
-- select *from student;
-- select *from result;
# 思路: (1)分析需求, 确定查询的列, 来源于两个表student, result; 确定连接查询
	#(2)确定哪一种查询? --内连接, jion默认为inner join
select s.StudentNo,StudentName,SubjectNo,StudentResult
from student s
inner join result r
on s.StudentNo=r.StudentNo;
# 左连接, student为左表, result为右表, 以左表为基准, 右边表来一一匹配, 匹配不上的, 返回左表的记录, 右表已null填充
# 右连接, student为左表, result为右表, 以右表为基准, 左边表来一一匹配, 匹配不上的, 返回右表的记录, 左表已null填充
select s.StudentNo,StudentName,SubjectNo,StudentResult
from student s
left join result r
on s.StudentNo=r.StudentNo
where StudentResult is null;

select s.StudentNo,StudentName,SubjectNo,StudentResult
from student s
right join result r
on s.StudentNo=r.StudentNo;

# 等值连接
select s.StudentNo,StudentName,SubjectNo,StudentResult
from student s, result r
where s.StudentNo=r.StudentNo;

# 非等值连接
select s.StudentNo,StudentName,SubjectNo,StudentResult
from student s, result r;

# 查询 学号, 姓名, 和所在年级
# 内连接
select StudentNo,StudentName,GradeName
from student s
inner join grade g
on s.GradeId=g.GradeID;

# 左连接
select StudentNo,StudentName,GradeName
from student s
left join grade g
on s.GradeId=g.GradeID;

# 右连接
select StudentNo,StudentName,GradeName
from student s
right join grade g
on s.GradeId=g.GradeID;

# 自连接

# 查询参加了考试的同学信息(学号, 学生姓名, 科目, 分数)