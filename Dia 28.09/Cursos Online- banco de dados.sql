create database db_cursoDaMinhaVida;

use db_cursoDaMinhaVida;

create table tb_categoria(
id bigInt auto_increment,
nome varchar(255) not null,
tipo varchar(255) not null,

primary key (id)

);

create table tb_produto(
id bigInt auto_increment,
nome varchar(255) not null,
preco decimal(4,2) not null,
carga_horaria int not null,
categoria_id bigInt not null,

primary key(id),
foreign key(categoria_id) references tb_categoria(id)

);

insert into tb_categoria(nome, tipo) values
("Tecnologia","EAD"),
("Desenvolvimnento Pessoal","Presencial"),
("Tecnologia","Presencial"),
("Humanas","EAD"),
("Exatas","EAD");


insert into tb_produto (nome, preco, carga_horaria, categoria_id) values
("Java Script", 20.99, 40, 1),
("Meditação",50.99,60,2),
("Java",99.59,110,3),
("Python",89.45,70,3),
("História Para Vestibular",35.99,60,4),
("Pacote Química e Física para Vestibular",78.99,120,5),
("MySQL",32.22,40,3),
("Lógica de Programação",14.99,30,1);

select * from tb_produto where preco > 50;
select * from tb_produto where preco >3 and preco <60;
select * from tb_produto where nome like '%JAV%';

select tb_produto.nome, tb_produto.preco, tb_categoria.nome, tb_categoria.tipo
from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;


select tb_produto.nome, tb_produto.preco, tb_categoria.nome, tb_categoria.tipo
from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id
where tb_categoria.tipo = "EAD";


