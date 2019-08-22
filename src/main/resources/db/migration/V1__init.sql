CREATE TABLE BOOK (
    ID INTEGER IDENTITY PRIMARY KEY,
    NAME VARCHAR(256) NOT NULL,
    ISBN VARCHAR(16) NOT NULL,
    PRICE DECIMAL(10,2) NOT NULL,
    PUBLISHED_DATE DATE NOT NULL,
    CREATED_BY VARCHAR(200) NOT NULL,
    CREATED_DATE DATETIME NOT NULL,
    LAST_MODIFIED_BY VARCHAR(200)NOT NULL,
    LAST_MODIFIED_DATE DATETIME NOT NULL
);

CREATE TABLE AUTHOR (
    ID INTEGER IDENTITY PRIMARY KEY,
    FIRST_NAME VARCHAR(128) NOT NULL,
    LAST_NAME VARCHAR(128) NOT NULL,
    DATE_OF_BIRTH DATE NOT NULL,
    CREATED_BY VARCHAR(200) NOT NULL,
    CREATED_DATE DATETIME NOT NULL,
    LAST_MODIFIED_BY VARCHAR(200)NOT NULL,
    LAST_MODIFIED_DATE DATETIME NOT NULL
);

CREATE TABLE BOOK_AUTHOR (
    BOOK INTEGER NOT NULL,
    AUTHOR INTEGER NOT NULL
)