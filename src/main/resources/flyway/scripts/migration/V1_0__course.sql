CREATE TABLE course
(
    id          BIGINT       NOT NULL AUTO_INCREMENT,
    title       VARCHAR(255) NOT NULL,
    description VARCHAR(255) NOT NULL,
    PRIMARY KEY (ID)
);

CREATE TABLE lecture
(
    id          BIGINT       NOT NULL AUTO_INCREMENT,
    title       VARCHAR(255) NOT NULL,
    description VARCHAR(255) NOT NULL,
    course_id   BIGINT,
    PRIMARY KEY (id)

);

ALTER TABLE lecture
    ADD CONSTRAINT LECTURE_COURSE_ID_FK
        FOREIGN KEY (course_id) REFERENCES course (id)
            ON DELETE CASCADE;

