create schema if not exists baseinicial_schema;

#una tabla para los usuarios que se registren
create table `baseinicial_schema`.`usuario`(
`usuario_id` int not null auto_increment,
`nombre completo` varchar(50),
`correo` varchar(30),
`fechaNacimiento` date,
`telefono` int not null,
`pais` varchar(30),
`region` varchar(30),
`comuna/distrito` varchar(30),
primary key(`usuario_id`));

#acá se almacenarán lo que boten los usuarios para fines estadísticos y definir el tipo de usuario
create table `baseinicial_schema`.`interesUsuario`(
`interesUsuario_id` int not null auto_increment,
`respuesta1` varchar(50),
primary key(`interesUsuario_id`));

#el tipo de perfil que tendrán los usuarios y en base a esto la página personalizada
create table `baseinicial_schema`.`perfil`(
`perfil_id` int not null auto_increment,
`tipoDeperfil` varchar(50),
primary key(`perfil_id`));

#se hará una tabla para cada módulo para saber cuánto ha avanzado en cada tema,
#como aún no se definen los demás temas se coloca esta como ejemplo
#en total serían tres tablas de este tipo y cada una con los temas que almacenará 
create table `baseinicial_schema`.`progreProteMone`(
`progreProteMone_id` int not null auto_increment,
`EstafasPiramidales` int,
`EstafasPorLlamadas` int,
`EstafasDigitales` int,
`CambiarTuContraseña` int,
primary key(`progreProteMone_id`)
);


ALTER TABLE baseinicial_schema.usuario ADD perfil_id int not null;
ALTER TABLE baseinicial_schema.usuario ADD constraint usuarioPerfil foreign key (perfil_id) references baseinicial_schema.perfil(perfil_id);

ALTER TABLE baseinicial_schema.interesusuario ADD usuario_id int not null;
ALTER TABLE baseinicial_schema.interesusuario ADD constraint interesusuarioUsuario foreign key (usuario_id) references baseinicial_schema.usuario(usuario_id);

ALTER TABLE baseinicial_schema.Usuario ADD progreProteMone_id int not null;
ALTER TABLE baseinicial_schema.Usuario ADD constraint UsuarioProgreProteMone foreign key (progreProteMone_id) references baseinicial_schema.progreprotemone(progreProteMone_id);
