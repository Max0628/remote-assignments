--Write an SQL statement to select all articles with their author’s email.--
select * from article
join user on article.author_id=user.user_id;

--Write another SQL statement to select articles from 7th to 12th sorted by id--
select * from article 
order by article_id asc 
limit 6 offset 6;

--limit 6 means only 6 rows will return.
--offset 6 means the first 6 rows will be skipped.
