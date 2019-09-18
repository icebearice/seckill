CREATE DATABASE
  IF NOT EXISTS seckill
  default character
    set utf8 COLLATE utf8_unicode_ci;
use seckill;
create table if not exists `user_info` (
  `id` int not null auto_increment primary key,
  `name` varchar(64) not null,
  `gender` tinyint not null comment '//1代表男 2代表女',
  `age` int not null,
  `telephone` varchar(255) not null ,
  `register_mode` varchar(255) not null comment '//byphone bywechat byalipay',
  `third_party_id` varchar(64) not null
);
create table if not exists `user_password` (
  `id` int(11) not null auto_increment primary key ,
  `encrpt_password` varchar(128) not null,
  `user_id` int(11) not null default 0
);
create unique index user_info_telephone_uindex
  on user_info (telephone) USING BTREE ;
create table if not exists `item` (
  `id` int not null auto_increment primary key ,
  `title` varchar(64) not null default '',
  `price` double not null default 0,
  `description` varchar(500) not null default '',
  `sales` int not null default 0,
  `img_url` varchar(255) not null default ''
);
create table if not exists `item_stock` (
  `id` int not null auto_increment primary key ,
  `stock` int not null default 0,
  `item_id` int not null default 0
);
create table if not exists `order_info` (
  `id` varchar(32) not null primary key,
  `user_id` int not null default 0,
  `item_id` int not null default 0,
  `item_price` double not null default 0,
  `amount` int not null default 0,
  `order_price` double not null default 0
);
create table if not exists `sequence_info` (
  `name` varchar(255) not null primary key,
  `current_value` int(11) not null default 0,
  `step` int(11) not null default 0
)