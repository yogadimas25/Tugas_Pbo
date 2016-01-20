/*
SQLyog Enterprise - MySQL GUI v7.14 
MySQL - 5.1.41 : Database - perpus
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`perpus` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;

USE `perpus`;

/*Table structure for table `anggota` */

DROP TABLE IF EXISTS `anggota`;

CREATE TABLE `anggota` (
  `no_anggota` varchar(20) COLLATE utf8_bin NOT NULL,
  `nama` varchar(60) COLLATE utf8_bin NOT NULL,
  `no_hp` varchar(20) COLLATE utf8_bin NOT NULL,
  `no_kitas` varchar(25) COLLATE utf8_bin NOT NULL,
  `status` varchar(20) COLLATE utf8_bin NOT NULL,
  `nama_sekolah` varchar(60) COLLATE utf8_bin NOT NULL,
  `alamat` varchar(100) COLLATE utf8_bin NOT NULL,
  `tgl_lahir` varchar(50) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`no_anggota`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `anggota` */

insert  into `anggota`(`no_anggota`,`nama`,`no_hp`,`no_kitas`,`status`,`nama_sekolah`,`alamat`,`tgl_lahir`) values ('007','jems','097869080','sa9809','UMUM','asdf','asdf','asdf'),('009829','tami','5364sdf','asdfas','SMA','asdf','df','sadf'),('98','ahmad utami','6098089','67569','SMP','asfd','asdf','asdf');

/*Table structure for table `buku` */

DROP TABLE IF EXISTS `buku`;

CREATE TABLE `buku` (
  `id_buku` int(11) NOT NULL AUTO_INCREMENT,
  `judul` varchar(60) COLLATE utf8_bin NOT NULL,
  `pengarang` varchar(60) COLLATE utf8_bin NOT NULL,
  `penerbit` varchar(60) COLLATE utf8_bin NOT NULL,
  `thn_terbit` int(11) NOT NULL,
  `status` int(11) NOT NULL,
  PRIMARY KEY (`id_buku`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `buku` */

insert  into `buku`(`id_buku`,`judul`,`pengarang`,`penerbit`,`thn_terbit`,`status`) values (2,'asdf','asdfgag','asdfawe',345,0),(3,'merana aku tanpa my','udin','karena kamu',20229,0);

/*Table structure for table `petugas` */

DROP TABLE IF EXISTS `petugas`;

CREATE TABLE `petugas` (
  `nip` varchar(30) COLLATE utf8_bin NOT NULL,
  `status` varchar(60) COLLATE utf8_bin NOT NULL,
  `nama` varchar(60) COLLATE utf8_bin NOT NULL,
  `alamat` varchar(100) COLLATE utf8_bin NOT NULL,
  `password` varchar(50) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`nip`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `petugas` */

insert  into `petugas`(`nip`,`status`,`nama`,`alamat`,`password`) values ('001','ADMIN','yoga','basing','202cb962ac59075b964b07152d234b70'),('2345646','PEGAWAI TETAP','wertwer','erywrety','202cb962ac59075b964b07152d234b70');

/*Table structure for table `pinjam` */

DROP TABLE IF EXISTS `pinjam`;

CREATE TABLE `pinjam` (
  `id_pinjam` int(11) NOT NULL AUTO_INCREMENT,
  `no_anggota` varchar(20) COLLATE utf8_bin NOT NULL,
  `id_buku` int(11) NOT NULL,
  `tgl_pinjam` varchar(20) COLLATE utf8_bin NOT NULL,
  `tgl_kembali` varchar(20) COLLATE utf8_bin NOT NULL,
  `status` int(11) NOT NULL,
  PRIMARY KEY (`id_pinjam`),
  KEY `no_anggota` (`no_anggota`,`id_buku`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `pinjam` */

insert  into `pinjam`(`id_pinjam`,`no_anggota`,`id_buku`,`tgl_pinjam`,`tgl_kembali`,`status`) values (1,'98',2,'12/01/2016','12/01/2016',0);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
