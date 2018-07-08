-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.7.20-log


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema food
--

CREATE DATABASE IF NOT EXISTS food;
USE food;

--
-- Definition of table `food_items`
--

DROP TABLE IF EXISTS `food_items`;
CREATE TABLE `food_items` (
  `item_id` bigint(20) NOT NULL,
  `item_name` varchar(255) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `quantity` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`item_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `food_items`
--

/*!40000 ALTER TABLE `food_items` DISABLE KEYS */;
INSERT INTO `food_items` (`item_id`,`item_name`,`price`,`quantity`) VALUES 
 (7,'Rice',25,'FULL'),
 (8,'DalMakhani',35,'FULL'),
 (9,'Roti',8,'1'),
 (10,'Roti',8,'1'),
 (11,'Chicken curry',60,'FULL'),
 (12,'Egg curry',40,'FULL'),
 (13,'Rice',30,'FULL'),
 (14,'Soup',30,'FULL'),
 (15,'Ice-cream',40,'FULL'),
 (16,'Tea',10,'1'),
 (17,'Coffee',15,'1');
/*!40000 ALTER TABLE `food_items` ENABLE KEYS */;


--
-- Definition of table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hibernate_sequence`
--

/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` (`next_val`) VALUES 
 (18),
 (18),
 (18);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;


--
-- Definition of table `menu_items`
--

DROP TABLE IF EXISTS `menu_items`;
CREATE TABLE `menu_items` (
  `menu_id` bigint(20) NOT NULL,
  `item_id` bigint(20) NOT NULL,
  PRIMARY KEY (`menu_id`,`item_id`),
  UNIQUE KEY `UK_eouio6e75o5pj5ysaqu1h4me9` (`item_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `menu_items`
--

/*!40000 ALTER TABLE `menu_items` DISABLE KEYS */;
INSERT INTO `menu_items` (`menu_id`,`item_id`) VALUES 
 (4,10),
 (4,11),
 (4,12),
 (4,13),
 (4,14),
 (4,15),
 (5,16),
 (5,17),
 (6,7),
 (6,8),
 (6,9);
/*!40000 ALTER TABLE `menu_items` ENABLE KEYS */;


--
-- Definition of table `restaurent`
--

DROP TABLE IF EXISTS `restaurent`;
CREATE TABLE `restaurent` (
  `restaurent_id` bigint(20) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `contact_no` bigint(20) DEFAULT NULL,
  `restaurent_name` varchar(255) DEFAULT NULL,
  `menu_menu_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`restaurent_id`),
  KEY `FK3kqqaa7y457l4pwmmxooyou4y` (`menu_menu_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `restaurent`
--

/*!40000 ALTER TABLE `restaurent` DISABLE KEYS */;
INSERT INTO `restaurent` (`restaurent_id`,`address`,`contact_no`,`restaurent_name`,`menu_menu_id`) VALUES 
 (1,'Vignan Nagar',1234567890,'BFC',4),
 (2,'Marathslli',1234567890,'KFC',5),
 (3,'IndiaraNagar',1234567890,'Paradise',6);
/*!40000 ALTER TABLE `restaurent` ENABLE KEYS */;


--
-- Definition of table `restaurent_menu`
--

DROP TABLE IF EXISTS `restaurent_menu`;
CREATE TABLE `restaurent_menu` (
  `menu_id` bigint(20) NOT NULL,
  `menu_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`menu_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `restaurent_menu`
--

/*!40000 ALTER TABLE `restaurent_menu` DISABLE KEYS */;
INSERT INTO `restaurent_menu` (`menu_id`,`menu_name`) VALUES 
 (4,'combo-Menu'),
 (5,'combo-Menu'),
 (6,'Veg-Menu');
/*!40000 ALTER TABLE `restaurent_menu` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
