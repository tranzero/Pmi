CREATE DATABASE  IF NOT EXISTS `pmiuserslist` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `pmiuserslist`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: localhost    Database: pmiuserslist
-- ------------------------------------------------------
-- Server version	5.6.15-log

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
-- Table structure for table `departments`
--

DROP TABLE IF EXISTS `departments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `departments` (
  `departmentsid` int(11) NOT NULL AUTO_INCREMENT,
  `departmentsnumber` int(11) DEFAULT NULL,
  `departmentsname` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`departmentsid`),
  UNIQUE KEY `departmentsid_UNIQUE` (`departmentsid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `departments`
--

LOCK TABLES `departments` WRITE;
/*!40000 ALTER TABLE `departments` DISABLE KEYS */;
/*!40000 ALTER TABLE `departments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ipadresses`
--

DROP TABLE IF EXISTS `ipadresses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ipadresses` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ipadress` varchar(45) DEFAULT NULL,
  `owner` varchar(45) DEFAULT NULL,
  `rangid` int(11) DEFAULT NULL,
  `departmentid` int(11) DEFAULT NULL,
  `locationid` int(11) DEFAULT NULL,
  `sysadminid` int(11) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `mac` varchar(45) DEFAULT NULL,
  `isactive` binary(1) DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `rangid_idx` (`rangid`),
  KEY `departmentid_idx` (`departmentid`),
  KEY `locationid_idx` (`locationid`),
  KEY `sysadminid_idx` (`sysadminid`),
  CONSTRAINT `departmentid` FOREIGN KEY (`departmentid`) REFERENCES `departments` (`departmentsid`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `locationid` FOREIGN KEY (`locationid`) REFERENCES `locations` (`locationid`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `rangid` FOREIGN KEY (`rangid`) REFERENCES `rang` (`rangid`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `sysadminid` FOREIGN KEY (`sysadminid`) REFERENCES `sysadmin` (`sadminid`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ipadresses`
--

LOCK TABLES `ipadresses` WRITE;
/*!40000 ALTER TABLE `ipadresses` DISABLE KEYS */;
/*!40000 ALTER TABLE `ipadresses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `locations`
--

DROP TABLE IF EXISTS `locations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `locations` (
  `locationid` int(11) NOT NULL AUTO_INCREMENT,
  `locationname` varchar(45) DEFAULT NULL,
  `locationfloor` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`locationid`),
  UNIQUE KEY `locationid_UNIQUE` (`locationid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `locations`
--

LOCK TABLES `locations` WRITE;
/*!40000 ALTER TABLE `locations` DISABLE KEYS */;
/*!40000 ALTER TABLE `locations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rang`
--

DROP TABLE IF EXISTS `rang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rang` (
  `rangid` int(11) NOT NULL AUTO_INCREMENT,
  `rangname` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`rangid`),
  UNIQUE KEY `rangid_UNIQUE` (`rangid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rang`
--

LOCK TABLES `rang` WRITE;
/*!40000 ALTER TABLE `rang` DISABLE KEYS */;
/*!40000 ALTER TABLE `rang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sysadmin`
--

DROP TABLE IF EXISTS `sysadmin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sysadmin` (
  `sadminid` int(11) NOT NULL AUTO_INCREMENT,
  `sadminname` varchar(45) DEFAULT NULL,
  `sadminphone` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`sadminid`),
  UNIQUE KEY `sadminid_UNIQUE` (`sadminid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sysadmin`
--

LOCK TABLES `sysadmin` WRITE;
/*!40000 ALTER TABLE `sysadmin` DISABLE KEYS */;
/*!40000 ALTER TABLE `sysadmin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`userid`),
  UNIQUE KEY `userid_UNIQUE` (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
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

-- Dump completed on 2014-04-01 23:07:47
