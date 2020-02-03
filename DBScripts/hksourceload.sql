--
-- PostgreSQL database dump
--

-- Dumped from database version 11.2
-- Dumped by pg_dump version 11.2

-- Started on 2019-04-06 10:00:45

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 10 (class 2615 OID 16534)
-- Name: hksourceload; Type: SCHEMA; Schema: -; Owner: postgres
--

CREATE SCHEMA hksourceload;


ALTER SCHEMA hksourceload OWNER TO postgres;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 212 (class 1259 OID 16535)
-- Name: srcdata; Type: TABLE; Schema: hksourceload; Owner: postgres
--

CREATE TABLE hksourceload.srcdata (
    sourcdataid bigint NOT NULL,
    linenum bigint NOT NULL,
    templateid bigint NOT NULL,
    templatekey character varying NOT NULL,
    templatevalue character varying NOT NULL
);


ALTER TABLE hksourceload.srcdata OWNER TO postgres;

--
-- TOC entry 2080 (class 2606 OID 16542)
-- Name: srcdata sourcdataid_pk; Type: CONSTRAINT; Schema: hksourceload; Owner: postgres
--

ALTER TABLE ONLY hksourceload.srcdata
    ADD CONSTRAINT sourcdataid_pk PRIMARY KEY (sourcdataid);


-- Completed on 2019-04-06 10:00:46

--
-- PostgreSQL database dump complete
--

