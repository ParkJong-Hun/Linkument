create TABLE if not exists `user`(
    `id` BIGINT unsigned not null auto_increment,
    `nickname` VARCHAR(20) not null,
    `create_time` DATETIME not null default current_timestamp,
    `update_time` DATETIME not null default current_timestamp on update current_timestamp,
    PRIMARY KEY(`id`),
    UNIQUE KEY `nickname`(`nickname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;