-- book 테이블 드랍, 생성
DROP TABLE book;
CREATE TABLE book
(   bookid  VARCHAR2(5)
  , title   VARCHAR2(200)
  , author  VARCHAR2(50)
  , price   NUMBER(10)
  , isbn    VARCHAR2(13)
  , publish VARCHAR2(30)
  , regdate DATE    DEFAULT sysdate
  , moddate DATE
  , CONSTRAINT pk_book PRIMARY KEY (bookid)
);

-- select
SELECT b.BOOKID
  FROM book b
 WHERE b.BOOKID = ?

-- insert
INSERT INTO book (bookid, title, author, price, isbn, publish)
VALUES (?, ?, ?, ?, ?, ?)

-- delete
DELETE FROM book
 WHERE bookid = ?

-- update
UPDATE book SET title = ?
              , author = ?
              , price = ?
              , isbn = ?
              , publish = ?
              , moddate = sysdate

-- low high 사이 가격의 책 목록 검색
SELECT b.BOOKID
     , b.TITLE
     , b.AUTHOR
     , b.PRICE
     , b.ISBN
     , b.PUBLISH
  FROM book b
 WHERE b.PRICE BETWEEN ? AND ?

-- 책 title에 keyword가 들어있는 목록 검색
SELECT b.BOOKID
     , b.TITLE
     , b.AUTHOR
     , b.PRICE
     , b.ISBN
     , b.PUBLISH
  FROM book b
 WHERE b.TITLE LIKE '%' + ? + '%'

-- 책 전체 건수 조회
SELECT COUNT(b.BOOKID)
  FROM book b
 
-- 책 존재 유무 판단
SELECT b.BOOKID
  FROM book b