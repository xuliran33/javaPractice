# 连接查询 (自连接)
# 创建主题表
create table if not exists category(
	categoryid int(10) unsigned not null auto_increment,
    # 父栏目的id
    pid int(10) not null,
    categoryname varchar(50) not null,
    # 设置主键
    primary key(categoryid)
    
);

insert into category 
values(2,1,'美术设计'),
(3,1,'软件开发'),
(4,3,'数据库基础'),
(5,2,'ps基础'),
(6,2,'色彩搭配'),
(7,3,'php基础'),
(8,3,'java基础');

select * from category;

# 编写sql语句, 将各个栏目的父子关系呈现出来(父栏目名称, 子栏目名称)
# 父栏目 子栏目
# 把category表看做两张一模一样的表, 将两张表连接查询
select c1.categoryname '父栏目', c2.categoryname '子栏目' 
from category as c1,category as c2
where c1.pid=c2.categoryid;

# 查询参加过考试的学员信息: 学号, 姓名, 科目号, 成绩
select s.StudentNo,StudentName,SubjectNo,StudentResult 
from student s
inner join result r
on s.StudentNo=r.StudentNo;

# 查询参加过考试的学员信息: 学号, 姓名, 科目名称, 成绩
select s.StudentNo 学号,StudentName 姓名,SubjectName 科目,StudentResult 成绩
from student s
inner join result r
on s.StudentNo=r.StudentNo
inner join `subject` sub
on r.SubjectNo=sub.SubjectNo;

# 查询学员及所属年级(学号 学生姓名 年级) 1 张三 大一
select StudentNo 学号,StudentName 姓名,GradeName 年级
from student s
left join grade g
on s.GradeId=g.GradeID;

# 查询科目及所属的年级(科目名称, 年级名称)
select SubjectName 科目,GradeName 年级
from subject s
left join grade g
on s.GradeID=g.GradeID;

# 查询 <<数据库结构-1>> 的所有考试结果(学号 学生姓名 科目名称 成绩)
select s.StudentNo 学号,StudentName 姓名,SubjectName 科目,StudentResult 成绩
from student s
inner join result r
on s.StudentNo=r.StudentNo
inner join `subject` sub
on r.SubjectNo=sub.SubjectNo
where sub.SubjectName='数据库结构-1';

# 查询 <<数据库结构-1>> 的所有考试结果(学号 学生姓名 科目名称 成绩) 按照程序由高到低降序排列, 如果成绩一样, 按照学号降序排列
# order by 默认升序(asc) 讲学 desc
# 常见错误 order by StudentResult, StudentNo desc, 按照成绩升序排, 按照学号降序排
# mysql Error:1052 Column 'xxx' in where clause is ambiguous
	#1多表查询的时候几个表中同时出现了某个相同的列名，而在查询条件WHERE后面又没有指定是那个表。
	#2.查询结果里面有两个相同的列名，而没有指定是哪个表
select s.StudentNo 学号,StudentName 姓名,SubjectName 科目,StudentResult 成绩
from student s
inner join result r
on s.StudentNo=r.StudentNo
inner join `subject` sub
on r.SubjectNo=sub.SubjectNo
where sub.SubjectName='数据库结构-1'
order by StudentResult desc,s.StudentNo desc;

# 分页显示 --- 提高用户体验, 网络传输块, 降低查询压力
# 查询 <<数据库结构-1>> 的所有考试结果(学号 学生姓名 科目名称 成绩) 按照程序由高到低降序排列, 如果成绩一样, 按照学号降序排列
# 每页显示5条
# limit n,m n代表起始行, m代表显示几行, 数据库中起始行从0开始
# limit (pageno-1)*pagesize,pagesize
select s.StudentNo 学号,StudentName 姓名,SubjectName 科目,StudentResult 成绩
from student s
inner join result r
on s.StudentNo=r.StudentNo
inner join `subject` sub
on r.SubjectNo=sub.SubjectNo
where sub.SubjectName='数据库结构-1'
order by StudentResult desc,s.StudentNo desc
limit 0,5; # 等同于 limit 5 offset 0

# 查询 <java第一学年> 成绩前10名且分数大于80的学生信息(学号, 姓名, 课程名, 分数)
select s.StudentNo 学号,StudentName 姓名,SubjectName 科目,StudentResult 分数
from student s
inner join result r
on s.StudentNo = r.StudentNo
inner join `subject` sub
on r.SubjectNo=sub.SubjectNo
where sub.SubjectName='java第一学年' and StudentResult>80
order by StudentResult desc
limit 0,10;

# 子查询: 在查询语句中嵌套查询语句
# 查询<数据库结构-1>的所有考试结果(学号, 科目编号, 成绩)
select StudentNo,r.SubjectNo,StudentResult
from result r
inner join `subject` s
on r.SubjectNo=s.SubjectNo
where SubjectName='数据库结构-1'
order by StudentResult desc;

# 方法二 子查询, 子查询执行顺序, 由里到外
select StudentNo,SubjectNo,StudentResult
from result
where SubjectNo=(select SubjectNo from `subject` where SubjectName = '数据库结构-1')
order by StudentResult desc;

# 查询课程为<高等数学-2>且分数不小于80分的学生的学号和姓名
# 方法一: 连接查询
select s.StudentNo,StudentName
from student s
inner join result r
on s.StudentNo = r.StudentNo
inner join `subject` su
on su.SubjectNo=r.SubjectNo
where StudentResult>=80 and SubjectName='高等数学-2';

# 连接查询 + 子查询
select s.StudentNo,StudentName
from student s
inner join result r
on s.StudentNo = r.StudentNo
where r.StudentResult>=80 and r.SubjectNo=(select SubjectNo from `subject` where SubjectName='高等数学-2');

# 子查询 -- 分步写简单sql然后嵌套
select StudentNo,StudentName
from student
where StudentNo in (select StudentNo from result where StudentResult>=80 and SubjectNo=(select SubjectNo from `subject` where SubjectName='高等数学-2'));

# 查询<C语言-1>前五名学生的成绩信息(学号, 姓名, 考试分数)
select s.StudentNo,StudentName,StudentResult
from student s
inner join result r
where r.SubjectNo=(select SubjectNo from `subject` where SubjectName='C语言-1')
order by StudentResult desc
limit 0,5;

# 查询郭靖同学所在的年级名称
select GradeName from grade 
where GradeId in (select GradeId from student where StudentName='郭靖');
