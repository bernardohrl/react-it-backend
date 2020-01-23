-- spring.jpa.show-sql=true

-- Roles
INSERT INTO roles (name) VALUES ('Admin'), ('RegularUser');

INSERT INTO role_permissions (role_id, permissions, permissions_key) VALUES (1, 'true', 'READ');
INSERT INTO role_permissions (role_id, permissions, permissions_key) VALUES (1, 'true', 'UPDATE');
INSERT INTO role_permissions (role_id, permissions, permissions_key) VALUES (1, 'true', 'CREATE');
INSERT INTO role_permissions (role_id, permissions, permissions_key) VALUES (1, 'true', 'DELETE');
INSERT INTO role_permissions (role_id, permissions, permissions_key) VALUES (1, 'true', 'CREATE_SUPERUSER');

INSERT INTO role_permissions (role_id, permissions, permissions_key) VALUES (2, 'true', 'READ');
INSERT INTO role_permissions (role_id, permissions, permissions_key) VALUES (2, 'false', 'UPDATE');
INSERT INTO role_permissions (role_id, permissions, permissions_key) VALUES (2, 'false', 'CREATE');
INSERT INTO role_permissions (role_id, permissions, permissions_key) VALUES (2, 'false', 'DELETE');
INSERT INTO role_permissions (role_id, permissions, permissions_key) VALUES (2, 'false', 'CREATE_SUPERUSER');


-- Address
insert into address(cep, city, complement, disctric, federative_unity, public_area) values 
    ('71925360', 'Brasília', 'Em frente aos Correios', 'Rua dos Baobás', 'DF', 'Águas Claras');
insert into address(cep, city, complement, disctric, federative_unity, public_area) values 
    ('72601203', 'Brasília', 'Ao lado da Torre Digital', 'Avenida Sequoia', 'DF', 'Sobradinho');


-- Users
INSERT INTO users (cpf, name, password, address_id, user_id, role_id) VALUES ('12345678910', 'Usuário admin', '123456', 1, 1, 1);
INSERT INTO users (cpf, name, password, address_id, user_id, role_id) VALUES ('01987654321', 'Usuário comum', '123456', 2, 2, 2);


-- Phone
insert into phone (ddd, number, user_id, phone_id) values ('061', '981370001', 1, 1);
insert into phone (ddd, number, user_id, phone_id) values ('061', '981370002', 1, 1);
insert into phone (ddd, number, user_id, phone_id) values ('061', '981370003', 1, 1);
insert into phone (ddd, number, user_id, phone_id) values ('061', '981379999', 1, 2);


-- Email
insert into email (email, user_id, email_id) values ('usuarioComum@gmail.com', 1, 2);
insert into email (email, user_id, email_id) values ('usuarioComum@gmail.com', 1, 2);
insert into email (email, user_id, email_id) values ('usuarioComum@gmail.com', 1, 2);
insert into email (email, user_id, email_id) values ('admin@gmail.com', 1, 1);



