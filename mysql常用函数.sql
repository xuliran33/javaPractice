# 数学函数
select abs(-8) 绝对值;
select ceiling(9.8) 大于等于我的最小整数;
select floor(9.8) 小于等于我的最大整数;
select rand(10) '0-1之间的随机数,10为种子'; # 以某个数作为种子返回的一个重复的随机数
select sign(-10) 符号函数,判断正负数; # 整数返回1, 负数返回-1, 0返回0

# 字符串函数
select char_length('11111') 返回字符串长度;
select concat('我','你','...') 合并字符串;
select insert('徐丽然123', 3, 10, '45') 替换字符串; # 从某个位置替换某个长度, 如起始位置超过字符串长度, 则返回原字符串
select lower('I LOVE YOU') 变小写;
select upper('I LOVE you') 变大写;
select left('我爱你中国', 3) 从左侧截取;
select right('我爱你中国', 3) 从又侧截取;
select replace('我爱你中国', '你', '你们') 替换;
select substring('我爱你中国', 0, 3) 截取; # 从哪个位置开始截取, 截取长度
select reverse('我爱你中国') 反转字符串;

# 日期和时间函数
select current_date() 当前日期;
select curdate() 当前日期;
select now() 获取当前时间和日期;
select localtime() 获取本地时间;
select sysdate() 系统时间;
# 分别获取日期中的某个部分
select year(now());
select month(now());
select day(now());

select hour(now());
select minute(now());
select second(now());

# 系统信息函数
select version();
select user();

# 查询姓李的同学, 改成历
select replace(StudentName, '李', '历') from student where StudentName like '李%';

# 聚合函数 count, sum, avg, max, min
select count(email) from student; # count 为非空值的计数
select count(1) from student;

select sum(StudentResult) from result;

select avg(StudentResult) from result;

select max(StudentResult) from result;

select min(StudentResult) from result;

# 查询不同课程的平均分, 最高分, 最低分
# 前提根据不同课程分组
# having 过滤分组记录必须满足的次要条件
select SubjectName, avg(StudentResult) 平均分, max(StudentResult) 最高分, min(StudentResult) 最低分
from result r
inner join `subject` su
on r.SubjectNo=su.SubjectNo
group by r.SubjectNo
having 平均分>80
order by 平均分 desc
limit 0,4;