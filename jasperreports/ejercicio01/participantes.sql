CREATE TABLE participantes (            
                ID bigint(21) NOT NULL,               
                NOMBRE varchar(100) NOT NULL,         
                USERNAME varchar(100) NOT NULL,       
                PASSWORD varchar(100) NOT NULL,       
                COMENTARIOS varchar(100) default NULL,
                PRIMARY KEY  (ID)                     
              ) ENGINE=InnoDB DEFAULT CHARSET=latin1