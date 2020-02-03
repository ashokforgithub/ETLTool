-- DROP SCHEMA hksrctrgmap;

CREATE SCHEMA hksrctrgmap AUTHORIZATION postgres;

-- Drop table

-- DROP TABLE hksrctrgmap."SrcTrgFldMapping";

CREATE TABLE hksrctrgmap."SrcTrgFldMapping" (
	"fldMappingId" bigserial NOT NULL,
	"trgFldId" int8 NOT NULL,
	"trgFldName" varchar(30) NOT NULL,
	"srcFldId" int8 NOT NULL,
	"srcFldName" varchar(300) NOT NULL,
	"mapType" varchar(1) NOT NULL,
	"crtdTmStmp" date NOT NULL,
	"crtdUsr" varchar(40) NOT NULL,
	"upTmStmp" date NULL,
	"upUsr" varchar(40) NULL,
	tmpltfldfnid int8 NULL,
	CONSTRAINT "SrcTrgFldMapping_pk" PRIMARY KEY ("fldMappingId")
);


INSERT INTO hksrctrgmap.srctrgfldmapping (trgfldname,srcfldid,srcfldname,maptype,crtdtmstmp,crtdusr,uptmstmp,upusr,tmpltfldfnid) VALUES 
('SSN',2,'SSN','D','2019-04-06','Ashok',NULL,NULL,1)
,('FULLNAME',2,'TITLE+FIRSTNAME+LASTNAME','C','2019-04-06','Ashok',NULL,NULL,1)
;