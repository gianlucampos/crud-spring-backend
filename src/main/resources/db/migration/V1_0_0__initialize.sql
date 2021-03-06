DROP TABLE IF EXISTS artista,musica,album,playlist;
DROP SEQUENCE IF EXISTS seqartista,seqmusica,seqalbum,seqplaylist;

CREATE SEQUENCE seqartista
        INCREMENT BY 1
        MINVALUE 1
        MAXVALUE 9223372036854775807
        START 1
        CACHE 1
        NO CYCLE;

CREATE SEQUENCE seqmusica
        INCREMENT BY 1
        MINVALUE 1
        MAXVALUE 9223372036854775807
        START 1
        CACHE 1
        NO CYCLE;

CREATE SEQUENCE seqalbum
        INCREMENT BY 1
        MINVALUE 1
        MAXVALUE 9223372036854775807
        START 1
        CACHE 1
        NO CYCLE;

CREATE SEQUENCE seqplaylist
        INCREMENT BY 1
        MINVALUE 1
        MAXVALUE 9223372036854775807
        START 1
        CACHE 1
        NO CYCLE;

CREATE TABLE artista (
    id int8 NOT NULL,
    genero varchar(255) NULL,
    nome varchar(255) NULL,
    CONSTRAINT artista_pkey PRIMARY KEY (id)
);

CREATE TABLE album (
	id int8 NOT NULL,
	ano_lancamento int4 NULL,
	capa bytea NULL,
	titulo varchar(255) NULL,
	artistaid int8 NULL,
	CONSTRAINT album_pkey PRIMARY KEY (id),
	CONSTRAINT fk_artistaid_album FOREIGN KEY (artistaid) REFERENCES artista(id)
);

CREATE TABLE playlist (
        id int8 NOT NULL,
        descricao varchar(255) NULL,
        titulo varchar(255) NULL,
        CONSTRAINT playlist_pkey PRIMARY KEY (id)
);

CREATE TABLE musica (
    id int8 NOT NULL,
    nome varchar(255) NULL,
    albumid int8 NULL,
    artistaid int8 NULL,
    playlistid int8 NULL,
    CONSTRAINT musica_pkey PRIMARY KEY (id),
    CONSTRAINT fk_albumid_musica FOREIGN KEY (albumid) REFERENCES album(id),
    CONSTRAINT fk_artistaid_musica FOREIGN KEY (artistaid) REFERENCES artista(id),
    CONSTRAINT fk_playlistid_musica FOREIGN KEY (playlistid) REFERENCES playlist(id)
);
