.version
.database
.show
.tables


--USE COORDENADAS;
--------------------------------------------------USUARIO VELASTEGUI---------------------------------------------
<<<<<<< HEAD:resources/SQLscript/VV_COORDENADAS.sql
DROP TABLE VV_COORDENADAS;
CREATE TABLE VV_COORDENADAS
=======
DROP TABLE COORDENADAS;
CREATE TABLE COORDENADAS
>>>>>>> 6951b150ba5965e3e6c0900c190f86af6be568e2:resources/SQLscript/VVCOORDENADAS.sql
(
    VVCAP             VARCHAR(25)
    ,VVGEO            VARCHAR(25)
    ,VVTIPO_ARSENAL   VARCHAR(25)
)

--1754644415
<<<<<<< HEAD:resources/SQLscript/VV_COORDENADAS.sql
INSERT INTO VV_COORDENADAS (VVCAP, VVGEO, VVTIPO_ARSENAL) VALUES ('5', 'GPS6', 'bct');
INSERT INTO VV_COORDENADAS (VVCAP, VVGEO, VVTIPO_ARSENAL) VALUES ('1', 'GPS4', 'bc');
INSERT INTO VV_COORDENADAS (VVCAP, VVGEO, VVTIPO_ARSENAL) VALUES ('4', 'GPS9', 'acd');
INSERT INTO VV_COORDENADAS (VVCAP, VVGEO, VVTIPO_ARSENAL) VALUES ('4', 'GPS4', 'acd');
INSERT INTO VV_COORDENADAS (VVCAP, VVGEO, VVTIPO_ARSENAL) VALUES ('4', 'GPS2', 'acd');
INSERT INTO VV_COORDENADAS (VVCAP, VVGEO, VVTIPO_ARSENAL) VALUES ('6', 'GPS9', 'act');
INSERT INTO VV_COORDENADAS (VVCAP, VVGEO, VVTIPO_ARSENAL) VALUES ('4', 'GPS5', 'acd');
INSERT INTO VV_COORDENADAS (VVCAP, VVGEO, VVTIPO_ARSENAL) VALUES ('5', 'GPS2', 'bct');
INSERT INTO VV_COORDENADAS (VVCAP, VVGEO, VVTIPO_ARSENAL) VALUES ('7', 'GPS7', 'aaabbct');
INSERT INTO VV_COORDENADAS (VVCAP, VVGEO, VVTIPO_ARSENAL) VALUES ('1', 'GPS1', 'bc');
=======

INSERT INTO COORDENADAS (VVCAP, VVGEO, VVTIPO_ARSENAL) VALUES ('5', 'GPS6', 'bct')
INSERT INTO COORDENADAS (VVCAP, VVGEO, VVTIPO_ARSENAL) VALUES ('1', 'GPS4', 'bc')
INSERT INTO COORDENADAS (VVCAP, VVGEO, VVTIPO_ARSENAL) VALUES ('4', 'GPS9', 'acd')
INSERT INTO COORDENADAS (VVCAP, VVGEO, VVTIPO_ARSENAL) VALUES ('4', 'GPS4', 'acd')
INSERT INTO COORDENADAS (VVCAP, VVGEO, VVTIPO_ARSENAL) VALUES ('4', 'GPS2', 'acd')
INSERT INTO COORDENADAS (VVCAP, VVGEO, VVTIPO_ARSENAL) VALUES ('6', 'GPS9', 'act')
INSERT INTO COORDENADAS (VVCAP, VVGEO, VVTIPO_ARSENAL) VALUES ('4', 'GPS5', 'acd')
INSERT INTO COORDENADAS (VVCAP, VVGEO, VVTIPO_ARSENAL) VALUES ('5', 'GPS2', 'bct')
INSERT INTO COORDENADAS (VVCAP, VVGEO, VVTIPO_ARSENAL) VALUES ('7', 'GPS7', 'aaabbct')
INSERT INTO COORDENADAS (VVCAP, VVGEO, VVTIPO_ARSENAL) VALUES ('1', 'GPS1', 'bc')
>>>>>>> 6951b150ba5965e3e6c0900c190f86af6be568e2:resources/SQLscript/VVCOORDENADAS.sql

--------------------------------------------------USUARIO VILLARREAL---------------------------------------------

--1752817799
<<<<<<< HEAD:resources/SQLscript/VV_COORDENADAS.sql
INSERT INTO VV_COORDENADAS (VVCAP, VVGEO, VVTIPO_ARSENAL) VALUES ('9', 'GPS1', 'aaabbcd');
INSERT INTO VV_COORDENADAS (VVCAP, VVGEO, VVTIPO_ARSENAL) VALUES ('9', 'GPS5', 'aaabbcd');
INSERT INTO VV_COORDENADAS (VVCAP, VVGEO, VVTIPO_ARSENAL) VALUES ('7', 'GPS5', 'aaabbct');
INSERT INTO VV_COORDENADAS (VVCAP, VVGEO, VVTIPO_ARSENAL) VALUES ('7', 'GPS0', 'aaabbct');
INSERT INTO VV_COORDENADAS (VVCAP, VVGEO, VVTIPO_ARSENAL) VALUES ('1', 'GPS6', 'ab');
INSERT INTO VV_COORDENADAS (VVCAP, VVGEO, VVTIPO_ARSENAL) VALUES ('8', 'GPS7', 'abbccdt');
INSERT INTO VV_COORDENADAS (VVCAP, VVGEO, VVTIPO_ARSENAL) VALUES ('2', 'GPS2', 'ac');
INSERT INTO VV_COORDENADAS (VVCAP, VVGEO, VVTIPO_ARSENAL) VALUES ('5', 'GPS5', 'bct');
INSERT INTO VV_COORDENADAS (VVCAP, VVGEO, VVTIPO_ARSENAL) VALUES ('7', 'GPS7', 'aaabbct');
INSERT INTO VV_COORDENADAS (VVCAP, VVGEO, VVTIPO_ARSENAL) VALUES ('1', 'GPS1', 'ab');
SELECT * FROM VV_COORDENADAS;
=======

INSERT INTO COORDENADAS (VVCAP, VVGEO, VVTIPO_ARSENAL) VALUES ('9', 'GPS1', 'aaabbcd')
INSERT INTO COORDENADAS (VVCAP, VVGEO, VVTIPO_ARSENAL) VALUES ('9', 'GPS5', 'aaabbcd')
INSERT INTO COORDENADAS (VVCAP, VVGEO, VVTIPO_ARSENAL) VALUES ('7', 'GPS5', 'aaabbct')
INSERT INTO COORDENADAS (VVCAP, VVGEO, VVTIPO_ARSENAL) VALUES ('7', 'GPS0', 'aaabbct')
INSERT INTO COORDENADAS (VVCAP, VVGEO, VVTIPO_ARSENAL) VALUES ('1', 'GPS6', 'bc')
INSERT INTO COORDENADAS (VVCAP, VVGEO, VVTIPO_ARSENAL) VALUES ('8', 'GPS7', 'abbccdt')
INSERT INTO COORDENADAS (VVCAP, VVGEO, VVTIPO_ARSENAL) VALUES ('2', 'GPS2', 'ac')
INSERT INTO COORDENADAS (VVCAP, VVGEO, VVTIPO_ARSENAL) VALUES ('5', 'GPS5', 'bct')
INSERT INTO COORDENADAS (VVCAP, VVGEO, VVTIPO_ARSENAL) VALUES ('7', 'GPS7', 'aaabbct')
INSERT INTO COORDENADAS (VVCAP, VVGEO, VVTIPO_ARSENAL) VALUES ('1', 'GPS1', 'bc')

SELECT * FROM COORDENADAS
>>>>>>> 6951b150ba5965e3e6c0900c190f86af6be568e2:resources/SQLscript/VVCOORDENADAS.sql

---------------------------------------TABLA PARA LOGIN-----------------------------------------
DROP TABLE CREDENCIALES;
CREATE TABLE CREDENCIALES
(
    VVUSUARIO     VARCHAR(25)
    ,VVCONTRASENA  VARCHAR(25)
)

INSERT INTO CREDENCIALES (VVUSUARIO, VVCONTRASENA) VALUES ('Profe', '81dc9bdb52d04dc20036dbd8313ed055')


<<<<<<< HEAD:resources/SQLscript/VV_COORDENADAS.sql
SELECT * FROM VV_CREDENCIALES;
=======
SELECT * FROM CREDENCIALES
>>>>>>> 6951b150ba5965e3e6c0900c190f86af6be568e2:resources/SQLscript/VVCOORDENADAS.sql
