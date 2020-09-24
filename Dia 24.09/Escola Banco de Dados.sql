create database db_escola;

use db_escola; 

create table tb_alunxs(
matricula bigInt auto_increment,
nome varchar(255) not null,
idade int not null,
curso varchar(255) not null,
nota_final int not null,
primary key(matricula)
);

insert into tb_alunxs(nome, idade, curso, nota_final)
values 
("Fulano de Tal", 27, "Agronomia", 09),
("Xuxa Meneghel", 35, "Rádio e TV", 10),
("Vera Magalhães", 50, "Jornalismo", 02),
("Goku da Silva", 40, "Educação Física", 10),
("Henry Bugalho", 37, "Filosofia", 06),
("Wilson Simonal", 18, "Administração", 04),
("José da Silva", 27, "Jornalismo", 00),
("Jaqueline Barbosa", 30, "Gastronomia", 08);

 
 
 
	select * from tb_alunxs where nota_final > 7;
	select * from tb_alunxs where nota_final < 7;
    
    update tb_alunxs SET curso = "Música" where matricula = 6;
    

	select *from tb_alunxs; 
