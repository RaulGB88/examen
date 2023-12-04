CREATE DATABASE  IF NOT EXISTS `springbootmusica` /*!40100 DEFAULT CHARACTER SET latin1 COLLATE latin1_spanish_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `springbootmusica`;
-- MySQL dump 10.13  Distrib 8.0.22, for macos10.15 (x86_64)
--
-- Host: localhost    Database: springbootmusica
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cancion`
--

DROP TABLE IF EXISTS `cancion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cancion` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `titulo` varchar(100) CHARACTER SET latin1 COLLATE latin1_spanish_ci NOT NULL,
  `duracion` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=192 DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cancion`
--

LOCK TABLES `cancion` WRITE;
/*!40000 ALTER TABLE `cancion` DISABLE KEYS */;
INSERT INTO `cancion` VALUES (1,'20th Century Promise',4),(2,'37 grados',4),(3,'4th of July',3),(4,'7 Deadly Sins',6),(5,'A cara o cruz',5),(6,'A sort of homecoming',3),(7,'Afterglow',4),(8,'Al atardecer',4),(9,'Al sur',3),(10,'Alive And Kicking',4),(11,'All The things She..',4),(12,'Alma de blues',4),(13,'And The Band ...',4),(14,'Andas junto a mí',3),(15,'Annabel Lee',3),(16,'Anything she does',3),(17,'Artitoestoy',4),(18,'Asoma el llanto',3),(19,'Babyface',4),(20,'Bad',2),(21,'Barbara del campo',4),(22,'Beautiful day',5),(23,'Before',4),(24,'Black and blue',3),(25,'Blame',4),(26,'Book of Brilliant...',5),(27,'Brazilian',4),(28,'Cada historia',3),(29,'Can\'t dance',4),(30,'Careful In Career',4),(31,'Carpet crawlers',4),(32,'Cinema show',5),(33,'Come A Long Way',2),(34,'Como hemos cambiado',3),(35,'Criminal World',5),(36,'Cuando quiero sol',5),(37,'Daddys Goma pay for',5),(38,'Dance on a volcano',4),(39,'De puntillas',3),(40,'De sol a sol',4),(41,'Dirty day',5),(42,'Domino',5),(43,'Don\'t',4),(44,'Dreaming while ...',4),(45,'Driving the last...',4),(46,'E.de C. instrumental',3),(47,'East At Easter',4),(48,'El canto del gallo',5),(49,'El hombre de papel',2),(50,'El nadador',3),(51,'Elvis Presley & USA',3),(52,'En Portugal',3),(53,'En la oscuridad',5),(54,'En un baile de perro',2),(55,'Encadenada',4),(56,'Escuela de calor',3),(57,'Even Better Than...',3),(58,'Every body gets...',5),(59,'Fading lights',5),(60,'Fire',4),(61,'Firth of fith',4),(62,'Fly',4),(63,'Get up',4),(64,'Ghostdancing',3),(65,'Gloria',3),(67,'Great Leap Forward',4),(68,'Guitarra y voz',1),(69,'Hadaly',3),(70,'Hay algo raro...',3),(71,'Historia de playback',3),(72,'Hypnotised',5),(73,'I Fall Down',4),(74,'I Threw a Brick',3),(75,'I Wish You Were Here',4),(76,'I know what I like',3),(77,'Icaro',3),(78,'In the glow of night',4),(79,'In too deep',4),(80,'Indian summer sky',4),(81,'Invisible touch',3),(82,'Is That All',3),(83,'Jesus he knows me',5),(84,'La futura promesa',3),(85,'La ley',4),(86,'La mala hora',3),(87,'La negra flor',5),(88,'La noche',2),(89,'La secta del mar',3),(90,'Lamb lies down...',5),(91,'Land of confusion',4),(92,'League Of nations',4),(93,'Lemon',6),(94,'Let\'s pretend...',5),(95,'Living forever',4),(96,'Living years',4),(97,'Llovió',2),(98,'Lluvia del porvenir',3),(99,'Los endos',4),(100,'Love is Blindness',4),(101,'Luna de agosto',3),(102,'MLK',2),(103,'Me das el mar',3),(104,'Mil mariposas',3),(105,'Moon Cry Like A Baby',4),(106,'Musical box',4),(107,'My Life',4),(108,'My crime of passion',3),(109,'Mysterious Ways',4),(110,'Nada tiene sentido',3),(111,'Never a time',5),(112,'Ni tu ni yo',3),(113,'Night Music',4),(114,'No hay humor',3),(115,'No hay palabras',3),(116,'No son of mine',4),(117,'Nobody knows',3),(118,'Nobody\'s perfect',3),(119,'Numb',4),(120,'October',3),(121,'Oh Jungleland',3),(122,'Once Upon A Time',4),(123,'One',4),(124,'Oscuro affaire',3),(125,'Poor boy down',2),(126,'Price',1),(127,'Promenade',3),(128,'Recibes cartas',3),(130,'Rejoice',4),(131,'Rio Po',4),(132,'Robbery, assault...',3),(133,'Sanctify yourself',4),(134,'Scarlet',4),(135,'Sed de amor',4),(136,'Seeing is believing',5),(137,'Semilla negra',4),(138,'Sentir tu calor',4),(139,'Ser de agua',3),(140,'Shake Of The Ghosts',3),(141,'She\'s A river',3),(142,'Since I lost you',4),(143,'So Cruel',6),(144,'Some days are better',4),(145,'Sound In 70 Cities',4),(146,'Speed Your Love...',4),(147,'Squok',4),(148,'Stay',4),(149,'Stop baby',4),(150,'Stranger in a Land',4),(151,'Street Hassle',4),(152,'Supper\'s ready',5),(153,'Tell me why',5),(154,'The Kick Inside ofme',4),(155,'The american',4),(156,'The first time',3),(157,'The last domino',5),(158,'The unforgettable fi',5),(159,'The wanderer',4),(160,'Theme For Great city',3),(161,'This Time',3),(162,'Throwing it all away',4),(163,'Time and place',4),(164,'Tomorrow',3),(165,'Tonight, tonight...',4),(166,'Tormenta de arena',4),(167,'Tryin to Throw...',4),(168,'Ultra Violet',5),(169,'Un africano...',3),(170,'Until The end...',5),(171,'Up On The Catwalk',4),(172,'Volviendo a casa',3),(173,'Waterfront',3),(174,'Way of the world',5),(175,'Way you look at me',3),(176,'White Hot Day',5),(177,'Whos Gonna ride...',5),(178,'Why me?',3),(179,'Wire',2),(180,'With a Shout',4),(181,'Wonderful In Young',5),(182,'Word of mouth',3),(183,'Yesterday, today,..',2),(184,'Zoo Station',4),(185,'Zooropa',6),(186,'Hold on my heart',4);
/*!40000 ALTER TABLE `cancion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `canciondisco`
--

DROP TABLE IF EXISTS `canciondisco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `canciondisco` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `idcancion` bigint NOT NULL,
  `iddisco` bigint NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_CANCION_DISCO` (`idcancion`,`iddisco`),
  KEY `FG_CANCION_CANCIONDISCO_idx` (`idcancion`),
  KEY `FG_DISCO_CANCIONDISCO_idx` (`iddisco`),
  CONSTRAINT `FG_CANCION_CANCIONDISCO` FOREIGN KEY (`idcancion`) REFERENCES `cancion` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FG_DISCO_CANCIONDISCO` FOREIGN KEY (`iddisco`) REFERENCES `disco` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FKcdour2fkaxsdetxls4e0j0hnd` FOREIGN KEY (`iddisco`) REFERENCES `cancion` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=185 DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `canciondisco`
--

LOCK TABLES `canciondisco` WRITE;
/*!40000 ALTER TABLE `canciondisco` DISABLE KEYS */;
INSERT INTO `canciondisco` VALUES (1,1,8),(2,2,18),(3,3,3),(4,4,6),(5,5,18),(6,6,3),(7,7,13),(8,8,15),(9,9,14),(10,10,5),(11,11,5),(12,12,16),(13,13,6),(14,14,15),(15,15,18),(16,16,12),(17,17,4),(18,18,16),(19,19,2),(20,20,3),(21,21,15),(22,22,9),(23,23,10),(24,24,9),(25,25,9),(26,26,7),(27,27,12),(28,28,16),(29,29,11),(30,30,8),(31,31,13),(32,32,13),(33,33,5),(34,34,15),(35,35,6),(36,36,15),(37,37,2),(38,38,13),(39,39,15),(40,40,14),(41,41,2),(42,42,12),(43,43,9),(44,44,11),(45,45,11),(46,46,17),(47,47,7),(48,48,18),(49,49,18),(50,50,17),(51,51,3),(52,52,17),(53,53,14),(54,54,18),(55,55,16),(56,56,17),(57,57,4),(58,58,10),(59,59,11),(60,60,1),(61,61,13),(62,62,4),(63,63,10),(64,64,5),(65,65,1),(66,67,6),(67,68,16),(68,69,17),(69,70,14),(70,71,17),(71,72,6),(72,73,1),(73,74,1),(74,75,5),(75,76,13),(76,77,15),(77,78,12),(78,79,12),(79,80,3),(80,81,12),(81,82,1),(82,83,11),(83,84,16),(84,85,17),(85,86,18),(86,87,18),(87,88,16),(88,89,17),(89,90,13),(90,91,12),(91,92,8),(92,93,2),(93,94,10),(94,95,11),(95,96,9),(96,97,15),(97,98,18),(98,99,13),(99,100,4),(100,101,18),(101,102,3),(102,103,16),(103,104,15),(104,105,7),(105,106,13),(106,107,6),(107,108,10),(108,109,4),(109,110,14),(110,111,11),(111,112,14),(112,113,6),(113,114,16),(114,115,16),(115,116,11),(116,117,9),(117,118,9),(118,119,2),(119,120,1),(120,121,5),(121,122,5),(122,123,4),(123,124,17),(124,125,9),(125,126,3),(126,127,3),(127,128,15),(128,130,1),(129,131,16),(130,132,13),(131,133,5),(132,134,1),(133,135,14),(134,136,9),(135,137,17),(136,138,15),(137,139,15),(138,140,7),(139,141,6),(140,142,11),(141,143,4),(142,144,2),(143,145,8),(144,146,7),(145,147,13),(146,148,2),(147,149,10),(148,150,1),(149,151,7),(150,152,13),(151,153,11),(152,154,7),(153,155,8),(154,156,2),(155,157,12),(156,158,3),(157,159,2),(158,160,8),(159,161,6),(160,162,12),(161,163,10),(162,164,1),(163,165,12),(164,166,17),(165,167,4),(166,168,4),(167,169,17),(168,170,4),(169,171,7),(170,172,14),(171,173,7),(172,174,11),(173,175,10),(174,176,7),(175,177,4),(176,178,9),(177,179,3),(178,180,1),(179,181,8),(180,182,10),(181,183,10),(182,184,4),(183,185,2),(184,186,11);
/*!40000 ALTER TABLE `canciondisco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `companyia`
--

DROP TABLE IF EXISTS `companyia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `companyia` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) CHARACTER SET latin1 COLLATE latin1_spanish_ci NOT NULL,
  `dir` varchar(100) CHARACTER SET latin1 COLLATE latin1_spanish_ci DEFAULT NULL,
  `fax` varchar(15) CHARACTER SET latin1 COLLATE latin1_spanish_ci DEFAULT NULL,
  `tfno` varchar(15) CHARACTER SET latin1 COLLATE latin1_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `companyia`
--

LOCK TABLES `companyia` WRITE;
/*!40000 ALTER TABLE `companyia` DISABLE KEYS */;
INSERT INTO `companyia` VALUES (1,'Island3','sadasd','78782222','72724444'),(2,'ARIOLA','Aragon 204','913667889','913667890'),(3,'WEA','L Hoyos 42','932401212','932401213'),(4,'Virgin','2,23th St.','20812445','20812446'),(5,'ATLANTIC','12, E St.',' 5481223',' 5482312'),(6,'PoliDiscos','Cami de Vera',' 3870001',' 3870000'),(7,'PoliDiscos','Polynesia St.','942380540','942380522');
/*!40000 ALTER TABLE `companyia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `disco`
--

DROP TABLE IF EXISTS `disco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `disco` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) CHARACTER SET latin1 COLLATE latin1_spanish_ci NOT NULL,
  `fecha` varchar(100) CHARACTER SET latin1 COLLATE latin1_spanish_ci DEFAULT NULL,
  `idcompanyia` bigint NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FG_COMPANYIA_DISCO_idx` (`idcompanyia`),
  CONSTRAINT `FG_COMPANYIA_DISCO` FOREIGN KEY (`idcompanyia`) REFERENCES `companyia` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `disco`
--

LOCK TABLES `disco` WRITE;
/*!40000 ALTER TABLE `disco` DISABLE KEYS */;
INSERT INTO `disco` VALUES (1,'October','1981-10-12',1),(2,'Zooropa','1994-08-10',1),(3,'The unforgettable fire','1983-03-07',1),(4,'Achtung baby','1991-12-09',1),(5,'Once upon a time','1985-10-10',4),(6,'Good news F.N. world','1995-11-12',4),(7,'Sparkle in the rain','1984-03-03',4),(8,'Sister feelings call','1981-03-04',4),(9,'Living years','1988-04-02',5),(10,'Word of mouth','1991-05-07',5),(11,'We can\'t dance','1991-02-02',5),(12,'Invisible touch','1986-03-03',5),(13,'Seconds out','1986-08-08',5),(14,'De sol a sol','1987-01-08',3),(15,'Ser de agua','1991-02-05',3),(16,'Alma de blues','1989-02-03',3),(17,'La ley del desierto','1984-03-02',2),(18,'La canción de Jperro','1987-04-03',2);
/*!40000 ALTER TABLE `disco` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-02-28 18:03:11
