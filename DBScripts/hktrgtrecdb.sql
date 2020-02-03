-- Drop table

-- DROP TABLE hktrgtrecdb.trgtrectype;

CREATE TABLE hktrgtrecdb.trgtrectype (
	trgrectypid bigserial NOT NULL,
	convareaname varchar(30) NOT NULL,
	rectypdesc varchar(100) NULL,
	crtdtmstmp timestamptz NOT NULL,
	ctrdusr varchar(40) NOT NULL,
	uptmstmp timestamptz NULL,
	upusr varchar(40) NULL,
	CONSTRAINT trgtrectype_pk PRIMARY KEY (trgrectypid)
);


-- Drop table

-- DROP TABLE hktrgtrecdb.TrgtFldDtls;

CREATE TABLE hktrgtrecdb.TrgtFldDtls (
	trgtFldDetId varchar NOT NULL,
	fldName varchar(40) NOT NULL,
	fldDesc varchar(100) NULL,
	fldDatFmt varchar(20) NULL,
	fldDatType varchar(20) NULL,
	trgRecTypId int8 NOT NULL,
	crtdtmstmp timestamptz NOT NULL,
	ctrdusr varchar(40) NOT NULL,
	uptmstmp timestamptz NULL,
	upusr varchar(40) NULL,
	CONSTRAINT TrgtFldDtls_pk PRIMARY KEY (trgtFldDetId),
	CONSTRAINT TrgtFldDtls_trgtrectype_FK FOREIGN KEY (trgRecTypId) REFERENCES trgtrectype(trgrectypid) ON UPDATE CASCADE ON DELETE CASCADE
);