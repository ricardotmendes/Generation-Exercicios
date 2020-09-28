create database db_construindo_a_nossa_vida;

use db_construindo_a_nossa_vida;

create table tb_categoria(
id bigInt auto_increment,
nome varchar(255) not null,
fornecedor varchar(255) not null,

primary key (id)

);

create table tb_produto(
id bigInt auto_increment,
nome varchar(255) not null,
preco decimal(4,2) not null,
disponivel boolean not null,
categoria_id bigInt not null,

primary key(id),
foreign key(categoria_id) references tb_categoria(id)

);

insert into tb_categoria(nome, fornecedor) values
("Cimento","Tigre"),
("Tintas","Suvinil"),
("Louças","Celite"),
("Tijolos","Nova União"),
("Vidros","Ibravir");


insert into tb_produto (nome, preco, disponivel, categoria_id) values
("Veneziana ",48.78, false, 5),
("Tinta Azul Bebê",10.98,true,2),
("Pacote 100kg ",99.59,false,1),
("Conjunto tijolo vazado",89.45,true,4),
("Pacotão 10kg",50.78,false,1),
("Pacotão maior ainda 20kg",94.23,true,1),
("Pacotinho 5kg",12.22,true,1),
("Tinta Preto Trevoso",20.45,true,2);

select * from tb_produto where preco > 50;
select * from tb_produto where preco >=3 and preco <=60;
select * from tb_produto where nome like '%TI%';

select tb_produto.nome, tb_produto.preco, tb_categoria.nome, tb_categoria.fornecedor
from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;


select tb_produto.nome, tb_produto.preco, tb_categoria.nome, tb_categoria.fornecedor
from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id
where tb_categoria.nome = "Cimento";

