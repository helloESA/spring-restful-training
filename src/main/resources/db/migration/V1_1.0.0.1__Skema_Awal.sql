create table brand (
    id BIGINT not null,
    brand_name VARCHAR(255),
    primary key(id)
);

create table product (
    id BIGINT not null,
    brand_id BIGINT not null,
    product_name VARCHAR(255),
    primary key(id),
    foreign key(brand_id)
        references brand(id)
);
