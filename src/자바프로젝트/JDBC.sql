CREATE TABLE MEMBERS (
MEM_ID VARCHAR2(20) CONSTRAINT MEM_MID_PK PRIMARY KEY,
MEM_PW VARCHAR2(20) NOT NULL,
MEM_NAME VARCHAR2(10) NOT NULL,
MEM_AGE NUMBER(3) NOT NULL,
MEM_PNUM NUMBER(15) NOT NULL,
MEM_ADD VARCHAR2(70) NOT NULL
);


select * from members;


CREATE TABLE RENTAL (




)


CREATE TABLE BOOKS (
BOOK_GENRE_ID VARCHAR2(10) CONSTRAINT BK_BKGRID_PK PRIMARY KEY,
BOOK_TITLE VARCHAR2(30) NOT NULL,
BOOK_AUTHOR VARCHAR2(30) NOT NULL,
BOOK_PUBLISHER VARCHAR2(30) NOT NULL,
BOOK_RENTYN CHAR(2) NOT NULL
);
