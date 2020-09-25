create database db_RH2;

use db_RH2;

create table tb_cargo(
id bigInt auto_increment,
funcao varchar(50) not null,
carga_horaria float not null,

primary key(id)
);


create table tb_funcionario(
id bigInt auto_increment,
nome varchar(255)not null,
idade decimal(2,0) not null,
salario float not null,
setor varchar(50)not null,
cargo_id bigInt not null,
 
primary key(id),
foreign key (cargo_id) references tb_cargo(id)

);

insert into tb_cargo(funcao, carga_horaria) values
("Diretor",50),
("Gerente",100),
("Coordenador",150),
("Supervisor",200),
("Estagiário",300);

insert into tb_funcionario(nome, idade, salario, setor, cargo_id) values
("Ricardo",30,4000,"Comercial", 3),
("Elisa",25,8000,"TI",1),
("Leonardo",50,15000,"RH",1),
("Malaquias",18,1200,"Suporte Técnico",5),
("Ana",32,1350,"TI",5),
("Alberto",32,3500,"Comercial",4),
("Dolores",45,8000,"TI",2),
("Cristina",38,20000,"Comercial",1);

select * from tb_funcionario where salario >2000;
select * from tb_funcionario where salario>1000 and salario<2000; 

select * from tb_funcionario where nome like '%c%';

