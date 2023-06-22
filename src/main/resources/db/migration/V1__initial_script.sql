create table customer (id bigserial not null, property_id bigint unique, location varchar(255), name varchar(255), primary key (id));
create table owner (id bigserial not null, location varchar(255), name varchar(255), primary key (id));
create table owner_properties (owner_id bigint not null, properties_id bigint not null unique);
create table property (id bigserial not null, owner_id bigint, location varchar(255), name varchar(255), primary key (id));
alter table if exists customer add constraint FKcntp716ait4lrxghdtiek376o foreign key (property_id) references property;
alter table if exists owner_properties add constraint FKmkcoqr2kocjdr4iqk03fdjmjs foreign key (properties_id) references property;
alter table if exists owner_properties add constraint FK48hlh7ipo737axf2e9k8wksiq foreign key (owner_id) references owner;
alter table if exists property add constraint FKj2cohq7sjhdetbls088cupcu3 foreign key (owner_id) references owner;
