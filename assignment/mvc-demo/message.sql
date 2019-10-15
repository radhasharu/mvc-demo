use slktraining;

drop table if exists message;

create table message(
	id int primary key auto_increment,
	msg_from varchar(255) not null,
	msg_to varchar(255) not null,
	msg_cc varchar(255),
	subject varchar(255) not null,
	body text not null,
	send_at datetime
	);