CREATE TABLE POST(
    id bigint auto_increment primary key,
    title varchar(400) not null,
    content varchar(2000) null,
    created timestamp
);

CREATE TABLE Comment (
    id bigint auto_increment primary key,
    post_id bigint not null,
    content varchar(2000) null,
    created timestamp
);

ALTER TABLE Comment
    Add CONSTRAINT comment_post_id
    FOREIGN key (post_id) references post(id)