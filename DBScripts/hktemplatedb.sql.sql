-- DROP SCHEMA hktemplatedb;

CREATE SCHEMA hktemplatedb AUTHORIZATION postgres;

-- Drop table

-- DROP TABLE hktemplatedb.tmpltfiledefn;

CREATE TABLE hktemplatedb.tmpltfiledefn (
	flname varchar(100) NOT NULL,
	flfrmttyp bpchar(1) NOT NULL,
	fldesc varchar(200) NULL,
	fldelimchar bpchar(1) NULL,
	flrecidpos int4 NULL,
	flrecstartpos int4 NULL,
	flrecendpos int4 NULL,
	ismultirectypes bpchar(1) NULL,
	crtdtmstmp timestamptz NOT NULL,
	crtdusr varchar NOT NULL,
	uptmstmp varchar NULL,
	upusr varchar NULL,
	tmpltfldfnid bigserial NOT NULL,
	convprojid int8 NULL,
	CONSTRAINT tmpltfiledefn_pk PRIMARY KEY (tmpltfldfnid)
);


-- Drop table

-- DROP TABLE hktemplatedb.tmpltrectype;

CREATE TABLE hktemplatedb.tmpltrectype (
	tmpltrectypid bigserial NOT NULL,
	rectypname varchar(4) NULL,
	rectypdesc varchar(100) NULL,
	isrectypblank bpchar(1) NULL,
	tmpltfldfnid bigserial NOT NULL,
	crtdtmstmp timestamptz NOT NULL,
	crtdusr varchar(40) NOT NULL,
	uptmstmp timestamptz NULL,
	upusr varchar(40) NULL,
	CONSTRAINT tmpltrectype_pk PRIMARY KEY (tmpltrectypid),
	CONSTRAINT tmpltrectype_tmpltfiledefn_fk FOREIGN KEY (tmpltfldfnid) REFERENCES tmpltfiledefn(tmpltfldfnid) ON UPDATE CASCADE ON DELETE CASCADE
);

-- Drop table

-- DROP TABLE hktemplatedb.tmpltflddtls;

CREATE TABLE hktemplatedb.tmpltflddtls (
	tmpltflddetid bigserial NOT NULL,
	fldname varchar(40) NOT NULL,
	flddesc varchar(100) NULL,
	fldstartpos int4 NULL,
	fldendpos int4 NULL,
	fldcolpos int4 NULL,
	flddatfmt varchar(20) NULL,
	flddattype varchar(20) NULL,
	isfldforconv bpchar(1) NULL,
	tmpltrectypid bigserial NOT NULL,
	crtdtmstmp timestamptz NOT NULL,
	crtdusr varchar(40) NULL,
	uptmstmp timestamptz NULL,
	upusr varchar(40) NULL,
	CONSTRAINT tmpltflddtls_pk PRIMARY KEY (tmpltflddetid),
	CONSTRAINT tmpltflddtls_tmpltrectype_fk FOREIGN KEY (tmpltrectypid) REFERENCES tmpltrectype(tmpltrectypid) ON UPDATE CASCADE ON DELETE CASCADE
);

