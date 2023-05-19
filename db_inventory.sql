/*
SQLyog Community v12.5.0 (64 bit)
MySQL - 5.5.39 : Database - db_inventory
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_inventory` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `db_inventory`;

/*Table structure for table `barang` */

DROP TABLE IF EXISTS `barang`;

CREATE TABLE `barang` (
  `kode_barang` char(8) NOT NULL,
  `kode_jenis` char(5) NOT NULL,
  `nama_barang` varchar(30) NOT NULL,
  `satuan` varchar(10) NOT NULL,
  `harga` double NOT NULL,
  `stok` int(5) NOT NULL,
  PRIMARY KEY (`kode_barang`),
  KEY `kode_jenis` (`kode_jenis`),
  CONSTRAINT `barang_ibfk_1` FOREIGN KEY (`kode_jenis`) REFERENCES `jenis_barang` (`kode_jenis`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `barang` */

insert  into `barang`(`kode_barang`,`kode_jenis`,`nama_barang`,`satuan`,`harga`,`stok`) values 
('B1908001','JB001','Paku Beton','Kotak',2000,100),
('B1908002','JB003','Semen Putih','Kg',25000,20);

/*Table structure for table `barang_keluar` */

DROP TABLE IF EXISTS `barang_keluar`;

CREATE TABLE `barang_keluar` (
  `no_keluar` char(12) NOT NULL,
  `tgl_keluar` date NOT NULL,
  `total_keluar` double NOT NULL,
  `id_pengguna` char(10) NOT NULL,
  PRIMARY KEY (`no_keluar`),
  KEY `id_pengguna` (`id_pengguna`),
  CONSTRAINT `barang_keluar_ibfk_1` FOREIGN KEY (`id_pengguna`) REFERENCES `pengguna` (`id_pengguna`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `barang_keluar` */

/*Table structure for table `barang_masuk` */

DROP TABLE IF EXISTS `barang_masuk`;

CREATE TABLE `barang_masuk` (
  `no_masuk` char(12) NOT NULL,
  `tgl_masuk` date NOT NULL,
  `total_masuk` double NOT NULL,
  `id_pengguna` char(10) NOT NULL,
  `id_distributor` char(10) NOT NULL,
  PRIMARY KEY (`no_masuk`),
  KEY `id_pengguna` (`id_pengguna`),
  KEY `id_distributor` (`id_distributor`),
  CONSTRAINT `barang_masuk_ibfk_1` FOREIGN KEY (`id_pengguna`) REFERENCES `pengguna` (`id_pengguna`),
  CONSTRAINT `barang_masuk_ibfk_2` FOREIGN KEY (`id_distributor`) REFERENCES `distributor` (`id_distributor`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `barang_masuk` */

/*Table structure for table `detail_barang_keluar` */

DROP TABLE IF EXISTS `detail_barang_keluar`;

CREATE TABLE `detail_barang_keluar` (
  `no_keluar` char(12) NOT NULL,
  `kode_barang` char(12) NOT NULL,
  `jml_keluar` int(4) NOT NULL,
  `subtotal_keluar` double NOT NULL,
  KEY `no_keluar` (`no_keluar`),
  KEY `detail_barang_keluar_ibfk_2` (`kode_barang`),
  CONSTRAINT `detail_barang_keluar_ibfk_2` FOREIGN KEY (`kode_barang`) REFERENCES `barang` (`kode_barang`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `detail_barang_keluar_ibfk_3` FOREIGN KEY (`no_keluar`) REFERENCES `barang_keluar` (`no_keluar`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `detail_barang_keluar` */

/*Table structure for table `detail_barang_masuk` */

DROP TABLE IF EXISTS `detail_barang_masuk`;

CREATE TABLE `detail_barang_masuk` (
  `no_masuk` char(12) NOT NULL,
  `kode_barang` char(12) NOT NULL,
  `jml_masuk` int(4) NOT NULL,
  `subtotal_masuk` double NOT NULL,
  KEY `kode_barang` (`kode_barang`),
  KEY `no_masuk` (`no_masuk`),
  CONSTRAINT `detail_barang_masuk_ibfk_2` FOREIGN KEY (`kode_barang`) REFERENCES `barang` (`kode_barang`),
  CONSTRAINT `detail_barang_masuk_ibfk_3` FOREIGN KEY (`no_masuk`) REFERENCES `barang_masuk` (`no_masuk`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `detail_barang_masuk` */

/*Table structure for table `detail_pemesanan` */

DROP TABLE IF EXISTS `detail_pemesanan`;

CREATE TABLE `detail_pemesanan` (
  `no_pesan` char(12) NOT NULL,
  `kode_barang` char(12) NOT NULL,
  `jml_pesan` int(4) NOT NULL,
  `subtotal_pesan` double NOT NULL,
  KEY `no_pesan` (`no_pesan`),
  KEY `kode_barang` (`kode_barang`),
  CONSTRAINT `detail_pemesanan_ibfk_1` FOREIGN KEY (`no_pesan`) REFERENCES `pemesanan` (`no_pesan`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `detail_pemesanan_ibfk_2` FOREIGN KEY (`kode_barang`) REFERENCES `barang` (`kode_barang`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `detail_pemesanan` */

/*Table structure for table `distributor` */

DROP TABLE IF EXISTS `distributor`;

CREATE TABLE `distributor` (
  `id_distributor` char(10) NOT NULL,
  `nama_distributor` varchar(30) NOT NULL,
  `telp_distributor` varchar(13) NOT NULL,
  `alamat_distributor` varchar(100) NOT NULL,
  PRIMARY KEY (`id_distributor`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `distributor` */

insert  into `distributor`(`id_distributor`,`nama_distributor`,`telp_distributor`,`alamat_distributor`) values 
('DST1907001','CV. Dua Putra Petir','082123423789','Bekasi'),
('DST1907002','CV. Aneka Steel Teknik','082142342424','Jl. Randegan Sari No. 22 Gresik Driyorejo, Jawa Timur, Indonesia');

/*Table structure for table `jenis_barang` */

DROP TABLE IF EXISTS `jenis_barang`;

CREATE TABLE `jenis_barang` (
  `kode_jenis` char(5) NOT NULL,
  `nama_jenis` varchar(30) NOT NULL,
  PRIMARY KEY (`kode_jenis`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `jenis_barang` */

insert  into `jenis_barang`(`kode_jenis`,`nama_jenis`) values 
('JB001','Paku'),
('JB002','Pasir'),
('JB003','Semen'),
('JB004','Keramik'),
('JB005','Pipa'),
('JB006','Cat'),
('JB007','Triplek'),
('JB008','Besi'),
('JB009','Kayu'),
('JB010','Thinner'),
('JB011','Selang'),
('JB012','Kran'),
('JB013','Batu Bata'),
('JB014','Asbes'),
('JB015','Pintu'),
('JB016','Jendela'),
('JB017','Baut'),
('JB018','Alat Tukang'),
('JB019','Seng'),
('JB020','Kawat'),
('JB021','Lem'),
('JB022','Bor'),
('JB023','Mata Bor'),
('JB024','Pompa Air');

/*Table structure for table `pemesanan` */

DROP TABLE IF EXISTS `pemesanan`;

CREATE TABLE `pemesanan` (
  `no_pesan` char(12) NOT NULL,
  `tgl_pesan` date NOT NULL,
  `total_pesan` double NOT NULL,
  `id_distributor` char(10) NOT NULL,
  `id_pengguna` char(10) NOT NULL,
  PRIMARY KEY (`no_pesan`),
  KEY `id_distributor` (`id_distributor`),
  KEY `id_pengguna` (`id_pengguna`),
  CONSTRAINT `pemesanan_ibfk_1` FOREIGN KEY (`id_distributor`) REFERENCES `distributor` (`id_distributor`),
  CONSTRAINT `pemesanan_ibfk_2` FOREIGN KEY (`id_pengguna`) REFERENCES `pengguna` (`id_pengguna`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `pemesanan` */

/*Table structure for table `pengguna` */

DROP TABLE IF EXISTS `pengguna`;

CREATE TABLE `pengguna` (
  `id_pengguna` char(10) NOT NULL,
  `nama_pengguna` varchar(30) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(100) NOT NULL,
  `telp_pengguna` varchar(13) NOT NULL,
  `alamat_pengguna` varchar(100) NOT NULL,
  `level` varchar(5) NOT NULL,
  PRIMARY KEY (`id_pengguna`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `pengguna` */

insert  into `pengguna`(`id_pengguna`,`nama_pengguna`,`username`,`password`,`telp_pengguna`,`alamat_pengguna`,`level`) values 
('USR1907001','Administrator','admin','21232f297a57a5a743894a0e4a801fc3','089723432343','Jl. Raya Tegal No. 1 Tegal, Jawa Tengah, Indonesia','Owner'),
('USR1907002','Teguh Julianto','teguh','f5cd3a020bc94866049206a7cf14e266','089671337916','Jl. Raya Suradadi No. 44 Kec. Suradadi Kab. Tegal','Staff'),
('USR1908003','Farid','farid','a1d12da42d4302e53d510954344ad164','089671337916','Tegal','Owner');

/*Table structure for table `sementara_pesan` */

DROP TABLE IF EXISTS `sementara_pesan`;

CREATE TABLE `sementara_pesan` (
  `kode_barang` char(9) NOT NULL,
  `nama_barang` varchar(30) NOT NULL,
  `harga` double NOT NULL,
  `jml_pesan` int(4) NOT NULL,
  `subtotal_pesan` double NOT NULL,
  KEY `kode_barang` (`kode_barang`),
  CONSTRAINT `sementara_pesan_ibfk_1` FOREIGN KEY (`kode_barang`) REFERENCES `barang` (`kode_barang`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `sementara_pesan` */

/* Trigger structure for table `detail_barang_keluar` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `barang_keluar` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `barang_keluar` AFTER INSERT ON `detail_barang_keluar` FOR EACH ROW BEGIN
	UPDATE barang SET stok = stok-NEW.jml_keluar
    WHERE kode_barang=NEW.kode_barang;
END */$$


DELIMITER ;

/* Trigger structure for table `detail_barang_masuk` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `barang_masuk` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `barang_masuk` AFTER INSERT ON `detail_barang_masuk` FOR EACH ROW BEGIN
	UPDATE barang SET stok = stok+NEW.jml_masuk
    WHERE kode_barang = NEW.kode_barang;
END */$$


DELIMITER ;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
