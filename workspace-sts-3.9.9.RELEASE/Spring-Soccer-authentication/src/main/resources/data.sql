insert into users (username, password, enabled) values ('bob', '$2a$10$t8iimbzY1Pk4dQ0mVOqqa.Xq/BiGBBqD/50SfQvggT4EDfsqaoO8C', true);
insert into authorities (username, authority) values ('bob', 'ROLE_USER');

insert into users (username, password, enabled) values ('sara', '$2a$10$LtV0jQqO2uKBuL.cYRB8kOngHUdB33RozLeV3VRQ7XMWESyYa/PKW',true);
insert into authorities (username, authority) values ('sara', 'ROLE_ADMIN');