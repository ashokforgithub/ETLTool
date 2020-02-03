-- DROP SCHEMA hkprojdb;

CREATE SCHEMA hkprojdb AUTHORIZATION postgres;

-- Drop table

-- DROP TABLE hkprojdb.convproj;

CREATE TABLE hkprojdb.convproj (
	convprojid bigserial NOT NULL,
	projname varchar(100) NOT NULL,
	projtype bpchar(1) NOT NULL,
	startdate timestamptz NOT NULL,
	enddate timestamptz NOT NULL,
	prkname varchar(100) NOT NULL,
	projstatus varchar(15) NOT NULL,
	isactive bpchar(1) NOT NULL DEFAULT 'A'::bpchar,
	prkplanno varchar(20) NOT NULL,
	enrolledplanno varchar(20) NOT NULL,
	crtdtmstmp timestamptz NOT NULL,
	crtdusr varchar NOT NULL,
	uptmstmp varchar NULL,
	upusr varchar NULL,
	CONSTRAINT convproj_pk PRIMARY KEY (convprojid)
);
-------------

INSERT INTO hkprojdb.convproj
( projname, projtype, startdate, enddate, prkname, projstatus, isactive, prkplanno, enrolledplanno, crtdtmstmp, crtdusr, uptmstmp, upusr)
VALUES( 'IBM_AXIS', 'I', '2018-03-31 00:00:00.000', '2023-02-28 00:00:00.000', 'AXIS', 'C', 'Y', '13123', '3456667', '2019-04-06 00:51:40.813', 'Ashok', NULL, NULL);
INSERT INTO hkprojdb.convproj
( projname, projtype, startdate, enddate, prkname, projstatus, isactive, prkplanno, enrolledplanno, crtdtmstmp, crtdusr, uptmstmp, upusr)
VALUES( 'ORACLE_AXIS', 'I', '2018-03-31 00:00:00.000', '2023-02-28 00:00:00.000', 'AXIS', 'C', 'Y', '13123', '3456667', '2019-04-06 00:51:40.813', 'Ashok', NULL, NULL);
INSERT INTO hkprojdb.convproj
( projname, projtype, startdate, enddate, prkname, projstatus, isactive, prkplanno, enrolledplanno, crtdtmstmp, crtdusr, uptmstmp, upusr)
VALUES( 'JSW_AXIS', 'I', '2018-03-31 00:00:00.000', '2023-02-28 00:00:00.000', 'AXIS', 'C', 'Y', '13123', '3456667', '2019-04-06 00:51:40.813', 'Ashok', NULL, NULL);
