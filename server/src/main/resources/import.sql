--import.sql
insert into tb_category (name) values ('Informática');
insert into tb_category (name) values ('UD');
insert into tb_category (name) values ('Cozinha');
insert into tb_category (name) values ('Móveis');
insert into tb_category (name) values ('Eletrônico');

insert into tb_product (name, description, price, url_imagem, category_id) values ('Refrigerador 429L','Refrigerador 429L Branco, duplex....',1990.0,'https://example.com/refrigerator.jpg',2);
insert into tb_product (name, description, price, url_imagem, category_id) values ('Notebook Arus 15.6','Notebook Arus 15.6 Core I7, 16Gb Ram...',2449.0,'https://example.com/notebook.jpg',1);
insert into tb_product (name, description, price, url_imagem, category_id) values ('Monitor 27pol','Monitor Gamer 27pol 144Hz, 1ms',1129.99,'https://example.com/monitor.jpg',1);
insert into tb_product (name, description, price, url_imagem, category_id) values ('Kit Teclado e Mouse','Kit com teclado ABNT e mouse com 5 botões',199.0,'https://example.com/keyboard_mouse.jpg',1);
insert into tb_product (name, description, price, url_imagem, category_id) values ('Smartphone XYZ','Smatphone com tela de 9pol, 12GB....',9999.0,'https://example.com/smartphone.jpg',5);
insert into tb_product (name, description, price, url_imagem, category_id) values ('TV LCD 75pol','TV LCD 75pol, 5 HDMI...',7555.0,'https://example.com/tv.jpg',5);
insert into tb_product (name, description, price, url_imagem, category_id) values ('Fogão 6 Bocas','Fogão 6 Bocas em aço inox, ...', 799.99,'https://example.com/stove.jpg',3);
insert into tb_product (name, description, price, url_imagem, category_id) values ('Roteador Wi-Fi 5.4GhZ','Roteador Wi-Fi 5.4GhZ, 6 antenas...',1299.0,'https://example.com/router.jpg',1);

INSERT INTO tb_user(display_name, username, password) VALUES ('Administrador', 'admin','$2a$10$.PVIfB07x.SfMYTcToxL0.yxcLWU0GbS2NUO1W1QAvqMm/TsFhVem');
INSERT INTO tb_user(display_name, username, password) VALUES ('Teste', 'test','$2a$10$.PVIfB07x.SfMYTcToxL0.yxcLWU0GbS2NUO1W1QAvqMm/TsFhVem');

INSERT INTO tb_address (street, number, city, state, zip_code,country, user_id) VALUES ('Rua das Flores', '123', 'Curitiba', 'PR', '80000-000', 'Brasil',1);
INSERT INTO tb_address (street, number, city, state, zip_code,country, user_id) VALUES ('Avenida Brasil', '456', 'São Paulo', 'SP', '01000-000','Brasil',2);

INSERT INTO tb_order (order_date, status, user_id, address_id, total) VALUES ('2023-01-01T10:00:00', 'PENDING', 1, 1, 6890.0);
INSERT INTO tb_order (order_date, status, user_id, address_id, total) VALUES ('2023-01-02T14:30:00', 'COMPLETED', 2, 2, 3397.0);

INSERT INTO tb_order_item (order_index, quantity, price, order_id, product_id) VALUES (1, 1, 1990.0, 1, 1);
INSERT INTO tb_order_item (order_index, quantity, price, order_id, product_id) VALUES (2, 2, 2449.0, 1, 2);
INSERT INTO tb_order_item (order_index, quantity, price, order_id, product_id) VALUES (1, 1, 1129.99, 2, 3);
INSERT INTO tb_order_item (order_index, quantity, price, order_id, product_id) VALUES (2, 3, 199.0, 2, 4);
