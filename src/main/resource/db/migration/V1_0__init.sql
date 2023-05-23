drop table if exists orders;

create table orders (
    order_id varchar(50) not null,
    customer_id varchar(50),
    amount int,
    shipping_address varchar(200) not null,
    status varchar(10) not null,
    primary key (order_id)
);

insert into orders values ('1', 'customer1', 50, 'address1', 'PLACED');