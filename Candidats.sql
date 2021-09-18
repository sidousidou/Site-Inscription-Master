drop database candidats;
create database candidats;
use candidats;



create table Candidats (Matricule integer(5),
	                    nom varchar(30) not null,
                        prenom	varchar(30) not null,
                        specialite	varchar(30) not null,
                        constraint pk_Candidats primary key(Matricule));
                        
                        


insert into Candidats values(1,'FICEL','HAMZA','GL');   
insert into Candidats values(2,'BOUKEBBOUS','FATIMAZOHRA','SI');
insert into Candidats values(3,'BOUMAKH','SARRA','GL');
insert into Candidats values(4,'HAMADI','BOUTHEINA','SCI');
insert into Candidats values(5,'HIMEUR','ABDELHAKIM','GL');
insert into Candidats values(6,'KERMOUZ','ZINEDDINE','TI');
insert into Candidats values(7,'LAKEHAL','AYAT','GL');
insert into Candidats values(8,'LATRECHE','NACEREDDINE','GL');
insert into Candidats values(9,'LOUAR','FADILA','GL');
insert into Candidats values(10,'MOKRANI','KHALED','GL');
insert into Candidats values(11,'NEMOUCHI','MOURAD','GL');