-- 게시판
drop sequence board_seq;  -- seq
create sequence board_seq;

drop table board;   -- table
create table board (
    board_idx number(4) primary key,    -- 기본키
    board_name varchar2(20),            -- 이름
    board_title varchar2(100),          -- 제목
    board_content varchar2(300),        -- 내용
    board_date date default sysdate,    -- 작성일
    board_hit number(4) default 0       -- 조회수
);

insert into board (board_idx, board_name, board_title, board_content, board_date) values (board_seq.nextval, '홍유진', '글 제목1', '글 내용1', sysdate);
insert into board (board_idx, board_name, board_title, board_content, board_date) values (board_seq.nextval, '변이은', '글 제목2', '글 내용2', sysdate);
insert into board (board_idx, board_name, board_title, board_content, board_date) values (board_seq.nextval, '사루이', '글 제목3', '글 내용3', sysdate);

select * from board;

-- 댓글
drop sequence reply_board_seq;  -- seq
create sequence reply_board_seq;

drop table reply;   -- table
create table reply (
    reply_idx number(4) primary key,    -- 기본키
    reply_name varchar2(20),            -- 이름
    reply_content varchar2(300),        -- 내용
    reply_date date default sysdate,    -- 작성일
    reply_board_idx number(4)           -- 외래키
);

insert into reply (reply_idx, reply_name, reply_content, reply_date, reply_board_idx) values (reply_board_seq.nextval, '홍진아', '댓글 제목1', sysdate, 1);
insert into reply (reply_idx, reply_name, reply_content, reply_date, reply_board_idx) values (reply_board_seq.nextval, '심아영', '댓글 제목2', sysdate, 1);
insert into reply (reply_idx, reply_name, reply_content, reply_date, reply_board_idx) values (reply_board_seq.nextval, '심희진', '댓글 제목3', sysdate, 1);

select * from reply;

commit;