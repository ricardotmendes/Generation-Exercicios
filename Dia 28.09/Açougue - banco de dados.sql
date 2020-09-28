create database db_cidade_das_carnes;

use db_cidade_das_carnes;

create table tb_categoria(
id bigInt auto_increment,
tipo varchar(50),
marca varchar(255),

primary key (id)
);

create table tb_produto(
id bigInt auto_increment,
nome varchar(255) not null,
quantidade int not null,
preco decimal(4,2) not null,
categoria_id bigInt not null,

primary key(id),
foreign key (categoria_id) references tb_categoria(id)

);

insert into tb_categoria(tipo, marca) values
("Frango","Korin"),
("Bovina","JBS"),
("Peixe","Qualitá"),
("Suina","Perdigão"),
("Proteina não animal","Seara");

insert into tb_produto(nome, quantidade, preco, categoria_id )values
("Coxinha da Asa", 90, 20.99, 1),
("Alcatra", 20, 80.99, 2),
("Atum", 70, 50.99, 3),
("Linguiça", 10, 24.99, 4),
("Proteina Moida", 30, 15.99, 5),
("Costela", 30, 45.99, 4),
("Frango à Passatinho", 200, 19.99, 1),
("Picanha", 90, 99.99, 2);

select * from tb_produto where preco > 50;
select * from tb_produto where preco >=3 and preco <=60;
select * from tb_produto where nome like '%co%';

select tb_produto.nome, tb_produto.preco, tb_categoria.tipo, tb_categoria.marca
from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;

select tb_produto.nome, tb_produto.preco, tb_categoria.tipo, tb_categoria.marca
from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id
where tb_categoria.tipo = "Suina";




