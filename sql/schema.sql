CREATE TABLE IF NOT EXISTS Song (
    id SERIAL PRIMARY KEY ,
    title varchar(255) NOT NULL,
    artist VARCHAR(20) NOT NULL,
    genre VARCHAR(20) NOT NULL,
    audiofile_path VARCHAR(255) NOT NULL
);