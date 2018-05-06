-- MySQL dump 10.13  Distrib 5.7.22, for Linux (x86_64)
--
-- Host: localhost    Database: tieba_db
-- ------------------------------------------------------
-- Server version	5.7.22-0ubuntu0.17.10.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `reply`
--

drop database if exists 'tieba_db';

create database 'tieba_db';

use 'tieba_db';
DROP TABLE IF EXISTS `reply`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reply` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` text,
  `user_id` int(11) DEFAULT NULL,
  `parent_id` int(11) DEFAULT NULL,
  `topic_id` int(11) DEFAULT NULL,
  `create_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reply`
--

LOCK TABLES `reply` WRITE;
/*!40000 ALTER TABLE `reply` DISABLE KEYS */;
INSERT INTO `reply` VALUES (1,'reply hhh',2,NULL,1,NULL),(2,'child',NULL,1,NULL,NULL),(3,'child22222',NULL,1,NULL,NULL),(4,'mmmmmmmmmmmm\r\n                                    ',5,0,0,'2018-05-05'),(5,'\r\n                                    lllllll',5,0,0,'2018-05-05'),(6,'\r\n                                    nnnnnnnn',6,0,0,'2018-05-05'),(7,'\r\n                                    bbbbbbbb',5,0,0,'2018-05-05'),(8,'\r\n                                    wwwwwwwwww',5,0,0,'2018-05-05'),(9,'\r\n                                    nnn',6,0,0,'2018-05-05'),(10,'\r\n                                    aaaaaaaaaaaaaaa',6,0,0,'2018-05-05'),(11,'\r\n                                    iiiiiiiiiiii',5,0,0,'2018-05-05'),(12,'\r\n                                    mmmmmmmmmm',0,0,5,'2018-05-05'),(13,'\r\n                                    ww',0,0,6,'2018-05-05'),(14,'\r\n                                    bv',0,0,5,'2018-05-05'),(15,'\r\n                                  inhbi  ',0,0,3,'2018-05-05'),(16,'\r\n                                    ioooooooooo',0,0,6,'2018-05-05'),(17,'\r\n                                    wwwwww',0,NULL,3,'2018-05-05'),(18,'\r\n                                    nnnnnnn',0,NULL,1,'2018-05-05'),(19,'\r\n                                    nnnnnnnn',0,NULL,6,'2018-05-05'),(20,'\r\n                                    nggggggggggg',0,NULL,6,'2018-05-05'),(21,'\r\n                                    klkk',0,NULL,5,'2018-05-05');
/*!40000 ALTER TABLE `reply` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `topic`
--

DROP TABLE IF EXISTS `topic`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `topic` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL,
  `content` text,
  `user_id` int(11) DEFAULT NULL,
  `create_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `topic`
--

LOCK TABLES `topic` WRITE;
/*!40000 ALTER TABLE `topic` DISABLE KEYS */;
INSERT INTO `topic` VALUES (1,'test','content',1,NULL),(2,'asdf',NULL,0,'2018-05-05'),(3,'tead',NULL,0,'2018-05-05'),(5,'pppppppppppppppppppppp',NULL,0,'2018-05-05'),(6,'oooo',NULL,0,'2018-05-05');
/*!40000 ALTER TABLE `topic` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `permission` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'zhangjun','zhangjun249',NULL),(2,'zhangsan','a100023d69f',NULL),(3,'zhangjun','zhangjun249',NULL),(4,'zhangjun','zhangjun249',NULL),(5,'zhangjun','zhangjun249',NULL),(6,'zhangjun','zhangjun249',NULL),(7,'zhangjun','zhangjun249',NULL),(8,NULL,NULL,NULL),(9,'zhangjun','zhangjun249',NULL),(10,'zhangjun','zhangjun249',NULL),(11,'zhangjun','zhangjun249',NULL),(12,'zhangjun','zhangjun249',NULL),(13,'zhangjun','zhangjun249',NULL),(14,'zhangjun','zhangjun249',NULL),(15,'zhangjun','zhangjun249',NULL),(16,'zhangjun','zhangjun249',NULL),(17,'zhangjun','zhangjun249',NULL),(18,'zhangjun','zhangjun249',NULL),(19,'zhangjun','zhangjun249',NULL),(20,'zhangjun','zhangjun249',NULL),(21,'zhangjun','zhangjun249',NULL),(22,'zhangjun','zhangjun249',NULL),(23,'zhangjun','zhangjun249',NULL),(24,'zhangjun','zhangjun249',NULL),(25,'zhangjun','zhangjun249',NULL),(26,'zhangjun','zhangjun249',NULL),(27,'zhangjun','zhangjun249',NULL),(28,'zhangjun','zhangjun249',NULL),(29,'zhangjun','zhangjun249',NULL),(30,'zhangjun','zhangjun249',NULL),(31,'zhangjun','zhangjun249',NULL),(32,'zhangjun','zhangjun249',NULL),(33,'zhangjun','zhangjun249',NULL);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-05-06 21:02:55
