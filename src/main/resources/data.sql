-- spring.jpa.show-sql=true
-- Insert Roles

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
