create database db_ecommerce;

use db_ecommerce; 

create table tb_produtos(
codigoproduto bigInt auto_increment,
nome varchar(255) not null,
preco float not null,
quantidade_estoque int not null,
descricao varchar(255) not null,
primary key(codigoproduto)
);

insert into tb_produtos(nome, preco, quantidade_estoque, descricao)
values 
("BeyBlade", 500, 300, "Brinquedo estilo peão japonês"),
 ("Baralho Tarot", 50, 150, "Baralho para tiragens de tarot"),
 ("Tênis Senninha", 70, 200, "Calçado infantil"),
 ("Bolinho de chuva", 2, 40, "Doce gostoso"),
 ("Notebook MAC", 9999, 3, "Computador de burguês"),
 ("Arroz Tio João", 2000, 3, "Item caro"),
 ("O Segredo", 45, 20, "Livro pra ler"),
("Televisão 40k", 5000, 20, "Tv cara pra ver Naruto");
 
 
	select * from tb_produtos where preco > 500;
	select * from tb_produtos where preco < 500;
    
    update tb_produtos SET preco = 50.00 where codigoproduto = 6;
    

	select *from tb_produtos; 
