desc guestbook;

-- insert
insert	into guestbook values(null, '안대혁', '1234', '안녕하세요', SYSDATE());
insert	into guestbook values(null, '둘리', '1234', '호이', now());

-- select
select no, password, name, date_format(reg_date, '%Y/%m/%d %H:%i:%s') as regDate, message
	from guestbook
order by reg_date desc;

-- delete
delete
	from guestbook
where no= 1
	and password='1234';