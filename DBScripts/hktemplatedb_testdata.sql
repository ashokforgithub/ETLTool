INSERT INTO hktemplatedb.tmpltfiledefn
(flname, flfrmttyp, fldesc, fldelimchar, flrecidpos, flrecstartpos, flrecendpos, ismultirectypes, crtdtmstmp, crtdusr, uptmstmp, upusr, convprojid)
VALUES('TestTemplate', 'F', '', '', 1, 1, 2, 'Y', now(), 'Ashok', '', '', 0);

INSERT INTO hktemplatedb.tmpltrectype (rectypname,rectypdesc,isrectypblank,crtdtmstmp,crtdusr,uptmstmp,upusr) VALUES 
('DG','Participant Demographics','N','2019-03-30 20:34:34.272','ashok',NULL,'')
,('BL','Balances','N','2019-03-30 20:34:34.272','ashok',NULL,'')
,('LN','Loans','N','2019-03-30 20:34:34.272','ashok',NULL,'')
,('MX','Mixes','N','2019-03-30 20:34:34.272','ashok',NULL,'')
,('DF','Deferrals','N','2019-03-30 20:34:34.272','ashok',NULL,'')
;

INSERT INTO hktemplatedb.tmpltflddtls (fldname,flddesc,fldstartpos,fldendpos,fldcolpos,flddatfmt,flddattype,isfldforconv,crtdtmstmp,crtdusr,uptmstmp,upusr) VALUES 
('SSN','Social Security Number',3,14,2,'','STRING','Y','2019-03-30 23:25:24.330','Ashok',NULL,'')
,('FNAME','First Name',15,40,3,'','STRING','Y','2019-03-30 23:25:24.330','Ashok',NULL,'')
,('MNAME','Middle Name',41,65,4,'','STRING','Y','2019-03-30 23:25:24.330','Ashok',NULL,'')
,('LNAME','Last Name',66,90,5,'','STRING','Y','2019-03-30 23:25:24.330','Ashok',NULL,'')
,('RECID','Record Identifier',1,2,1,'','STRING','Y','2019-03-30 23:25:24.330','Ashok',NULL,'')
;

INSERT INTO hktrgtrecdb.trgtrectype
(convareaname, rectypdesc, crtdtmstmp, ctrdusr, uptmstmp, upusr)
VALUES('DEMOGRAPHICS', 'Participant Demographics', now(), 'Ashok', null, null);

SELECT trgtflddetid, fldname, flddesc, flddatfmt, flddattype, trgrectypid, crtdtmstmp, ctrdusr, uptmstmp, upusr
FROM hktrgtrecdb.trgtflddtls;


update hktrgtrecdb.trgtflddtls set crtdtmstmp=now();



