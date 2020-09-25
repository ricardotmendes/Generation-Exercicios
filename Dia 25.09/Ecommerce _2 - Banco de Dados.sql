create database db_ecommerce;

use  db_ecommerce;

create table tb_categoria(
id bigInt auto_increment,
nome varchar(50) not null,
sub_categoria varchar(50) not null,

primary key(id)
);


create table tb_produto(
id bigInt auto_increment,
nome varchar(255)not null,
quantidade float not null,
preco float not null,
disponivel boolean not null,
categoria_id bigInt not null,
 
primary key(id),
foreign key (categoria_id) references tb_categoria(id)

);

insert into tb_categoria(nome, sub_categoria) values
("Livros","Auto-Ajuda"),
("Eletrônicos","Celulares"),
("Roupas","Moda Feminina"),
("Casa","Decoração"),
("Artigos Esportivos","Equipamento de Proteção");

insert into tb_produto(nome, quantidade, preco, disponivel, categoria_id) values
("Conjunto de Cortinas",1000,80.00,true, 4),
("O Segredo",0,20.00,false, 1),
("Assim falou Zaratrusta",100,4000,true, 1),
("Celuar da Maçã caro",100,5880.00,true, 2),
("Celular chinês bom",54800,1900.00,true, 2),
("Casaco bonito",40,150.00,true, 3),
("Bola cara",20,2580.00,true, 5),
("Livro raro",01,1570.00,true, 1),
("Travesseiro de rico",200,7890.00,true, 4),
("Outro Livro Raro",00 , 1500.00,false, 1),
("Celular antigo ",00,1500.00,false, 2),
("O Capital",9999,20.00,true, 1),
("Conjunto tacos de golfe caros",09,3000.00,true, 5),
("Toalha muito procurada",500,1500.00,true, 4),
("Outro celular caro da Maçã",00,9999.00,false, 1),
("Calça bonita",400,9000.00,true, 3);



select * from tb_produto where preco >2000;
select * from tb_produto where preco>1000 and preco<2000; 

select * from tb_produto where nome like '%c%';

