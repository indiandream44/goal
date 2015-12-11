CREATE TABLE `Student` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL DEFAULT '',
  `emailid` varchar(40) DEFAULT NULL,
  age int(2) DEFAULT NULL,
  address varchar(40) DEFAULT NULL,
   addmissiondate date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
commit;

