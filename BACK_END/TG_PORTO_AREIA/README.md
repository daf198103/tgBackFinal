# TG_PORTO_AREIA
TG, Porto de Areia

-----------------------BANCO--------------------------------
CREATE DATABASE portoareia
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Portuguese_Brazil.1252'
    LC_CTYPE = 'Portuguese_Brazil.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;
-----------------------------------------------------------
Tabelas
CREATE TABLE public.cmn_caminhao
(
    cmn_id integer NOT NULL,
    cmn_carga_maxima numeric(19,2),
    cmn_cidade_placa character varying(50) COLLATE pg_catalog."default",
    cmn_estado_placa character varying(2) COLLATE pg_catalog."default",
    cmn_nome_empresa character varying(50) COLLATE pg_catalog."default",
    cmn_nome_motorista character varying(50) COLLATE pg_catalog."default",
    cmn_peso_bruto_total numeric(19,2),
    cmn_placa_cavalo character varying(7) COLLATE pg_catalog."default",
    cmn_tara numeric(19,2),
    cmn_tipo_caminhao character varying(50) COLLATE pg_catalog."default",
    CONSTRAINT cmn_caminhao_pkey PRIMARY KEY (cmn_id)
)

TABLESPACE pg_default;

ALTER TABLE public.cmn_caminhao
    OWNER to postgres;
    
------------------------------------------------------------------------
CREATE TABLE public.crg_carregamento
(
    crg_id integer NOT NULL,
    cmn_id integer,
    crg_carga_carregada numeric(19,2),
    crg_data_hora_carregamento timestamp without time zone,
    opr_id integer,
    CONSTRAINT crg_carregamento_pkey PRIMARY KEY (crg_id)
)

TABLESPACE pg_default;

ALTER TABLE public.crg_carregamento
    OWNER to postgres;
-----------------------------------------------------------------------

CREATE TABLE public.opr_operador_carregamento
(
    opr_id integer NOT NULL,
    opr_nome_carregador character varying(50) COLLATE pg_catalog."default",
    CONSTRAINT opr_operador_carregamento_pkey PRIMARY KEY (opr_id)
)

TABLESPACE pg_default;

ALTER TABLE public.opr_operador_carregamento
    OWNER to postgres;
-----------------------------------------------------------------------


