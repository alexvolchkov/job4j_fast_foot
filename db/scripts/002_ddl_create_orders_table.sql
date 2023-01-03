create table if not exists customers (
    id serial primary key,
    name text
);

create table if not exists orders (
  id serial primary key,
  number text,
  customer_id int not null references customers(id)
);

create table if not exists customers (
    id serial primary key,
    dish_id int not null references dishes(id),
    amount_of_dish int,
    total int,
    order_id int not null references orders(id)
);