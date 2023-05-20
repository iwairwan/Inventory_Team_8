-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 19, 2023 at 08:42 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 7.4.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_inventory`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `kode_barang` char(8) NOT NULL,
  `kode_jenis` char(5) NOT NULL,
  `nama_barang` varchar(30) NOT NULL,
  `satuan` varchar(10) NOT NULL,
  `harga` double NOT NULL,
  `stok` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`kode_barang`, `kode_jenis`, `nama_barang`, `satuan`, `harga`, `stok`) VALUES
('B1908001', 'JB001', 'Paku 7 cm', 'Kg', 22780, 0),
('B1908002', 'JB001', 'Paku 5 cm', 'Kg', 22250, 100),
('B1908003', 'JB001', 'Paku 4 cm', 'Kg', 22244, 100),
('B1908004', 'JB001', 'Paku 2 cm', 'Kg', 26800, 100),
('B1908005', 'JB001', 'Paku 15 cm', 'Kg', 21440, 62),
('B1908006', 'JB003', 'Semen Tiga Roda', 'Zak', 119260, 53),
('B1908007', 'JB003', 'Semen Tonasa 50 Kg', 'Zak', 116580, 0),
('B1908008', 'JB004', 'Keramik DN3', 'Karton', 87100, 49),
('B1908009', 'JB007', 'Triplek 3 m', 'Lembar', 72360, 43),
('B1908010', 'JB007', 'Triplek 3 mm', 'Lembar', 76380, 72),
('B1908011', 'JB005', 'Pipa Air Minum Medium 1/2 Inch', 'Batang', 140700, 50),
('B1908012', 'JB005', 'Pipa Air Minum Medium 3 Inch', 'Batang', 603000, 38),
('B1908013', 'JB019', 'Seng Gelombang BJLS 20', 'Lembar', 54940, 34),
('B1908014', 'JB019', 'Seng Plat BJLS 30', 'Lembar', 113900, 48),
('B1908015', 'JB008', 'Besi Beton 1/2 Inch', 'Batang', 154100, 20),
('B1908016', 'JB008', 'Besi Siku 7x7', 'Batang', 750400, 23),
('B1908017', 'JB008', 'Besi 5 m', 'Batang', 50000, 50);

-- --------------------------------------------------------

--
-- Table structure for table `barang_keluar`
--

CREATE TABLE `barang_keluar` (
  `no_keluar` char(12) NOT NULL,
  `tgl_keluar` date NOT NULL,
  `total_keluar` double NOT NULL,
  `id_pengguna` char(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `barang_keluar`
--

INSERT INTO `barang_keluar` (`no_keluar`, `tgl_keluar`, `total_keluar`, `id_pengguna`) VALUES
('BK190818001', '2023-05-05', 129000, 'USR1907001'),
('BK190818002', '2023-05-05', 79000, 'USR1907001'),
('BK190819003', '2023-05-08', 1112200, 'USR1907001'),
('BK190819004', '2023-05-08', 1334640, 'USR1907001'),
('BK190922005', '2023-05-10', 3618000, 'USR1907001'),
('BK230520006', '2023-05-20', 6488280, 'USR1907001');

-- --------------------------------------------------------

--
-- Table structure for table `barang_masuk`
--

CREATE TABLE `barang_masuk` (
  `no_masuk` char(12) NOT NULL,
  `tgl_masuk` date NOT NULL,
  `total_masuk` double NOT NULL,
  `id_distributor` char(10) NOT NULL,
  `id_pengguna` char(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `barang_masuk`
--

INSERT INTO `barang_masuk` (`no_masuk`, `tgl_masuk`, `total_masuk`, `id_distributor`, `id_pengguna`) VALUES
('BM190819001', '2023-05-01', 100000, 'DST1907001', 'USR1907001'),
('BM190819002', '2023-05-02', 200000, 'DST1908003', 'USR1907002'),
('BM190926003', '2023-05-02', 1680360, 'DST1908003', 'USR1907001');

-- --------------------------------------------------------

--
-- Table structure for table `detail_barang_keluar`
--

CREATE TABLE `detail_barang_keluar` (
  `no_keluar` char(12) NOT NULL,
  `kode_barang` char(12) NOT NULL,
  `jml_keluar` int(4) NOT NULL,
  `subtotal_keluar` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `detail_barang_keluar`
--

INSERT INTO `detail_barang_keluar` (`no_keluar`, `kode_barang`, `jml_keluar`, `subtotal_keluar`) VALUES
('BK190818001', 'B1908001', 2, 4000),
('BK190818002', 'B1908001', 2, 4000),
('BK190819003', 'B1908002', 50, 1112200),
('BK190819004', 'B1908003', 60, 1334640),
('BK190922005', 'B1908001', 100, 2278000),
('BK190922005', 'B1908004', 50, 1340000),
('BK230520006', 'B1908001', 100, 2278000),
('BK230520006', 'B1908006', 1, 119260),
('BK230520006', 'B1908007', 30, 3497400),
('BK230520006', 'B1908008', 1, 87100),
('BK230520006', 'B1908009', 7, 506520);

--
-- Triggers `detail_barang_keluar`
--
DELIMITER $$
CREATE TRIGGER `barang_keluar` AFTER INSERT ON `detail_barang_keluar` FOR EACH ROW BEGIN
	UPDATE barang SET stok = stok-NEW.jml_keluar
    WHERE kode_barang=NEW.kode_barang;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `detail_barang_masuk`
--

CREATE TABLE `detail_barang_masuk` (
  `no_masuk` char(12) NOT NULL,
  `kode_barang` char(12) NOT NULL,
  `jml_masuk` int(4) NOT NULL,
  `subtotal_masuk` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `detail_barang_masuk`
--

INSERT INTO `detail_barang_masuk` (`no_masuk`, `kode_barang`, `jml_masuk`, `subtotal_masuk`) VALUES
('BM190819001', 'B1908001', 4, 47000),
('BM190819001', 'B1908005', 7, 53000),
('BM190819002', 'B1908005', 5, 60000),
('BM190819002', 'B1908006', 4, 140000),
('BM190926003', 'B1908010', 22, 1680360);

-- --------------------------------------------------------

--
-- Table structure for table `detail_pemesanan`
--

CREATE TABLE `detail_pemesanan` (
  `no_pesan` char(12) NOT NULL,
  `kode_barang` char(12) NOT NULL,
  `jml_pesan` int(4) NOT NULL,
  `subtotal_pesan` double NOT NULL,
  `status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `detail_pemesanan`
--

INSERT INTO `detail_pemesanan` (`no_pesan`, `kode_barang`, `jml_pesan`, `subtotal_pesan`, `status`) VALUES
('PB190817001', 'B1908001', 9, 18000, 'Barang Telah Datang'),
('PB190817002', 'B1908001', 10, 20000, 'Barang Telah Datang'),
('PB190817003', 'B1908001', 2, 4000, 'Barang Telah Datang'),
('PB190817005', 'B1908001', 2, 4000, 'Barang Telah Datang'),
('PB190818006', 'B1908001', 99, 198000, 'Barang Telah Datang'),
('PB190818007', 'B1908001', 2, 4000, 'Barang Telah Datang'),
('PB190819008', 'B1908001', 5, 113900, 'Sedang di pesan'),
('PB190819008', 'B1908002', 5, 111220, 'Sedang di pesan'),
('PB190819009', 'B1908003', 50, 1112200, 'Sedang di pesan'),
('PB190819009', 'B1908004', 100, 2680000, 'Sedang di pesan'),
('PB190926010', 'B1908001', 25, 569500, 'Sedang di pesan'),
('PB190926010', 'B1908001', 50, 1139000, 'Sedang di pesan');

-- --------------------------------------------------------

--
-- Table structure for table `distributor`
--

CREATE TABLE `distributor` (
  `id_distributor` char(10) NOT NULL,
  `nama_distributor` varchar(30) NOT NULL,
  `telp_distributor` varchar(13) NOT NULL,
  `alamat_distributor` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `distributor`
--

INSERT INTO `distributor` (`id_distributor`, `nama_distributor`, `telp_distributor`, `alamat_distributor`) VALUES
('DST1907001', 'CV. Dua Putra Petir', '082123423789', 'Jl. Bukit Palma C5/33 Citraland Utara Surabaya 60185, Surabaya, Jawa Timur, Indonesia'),
('DST1907002', 'CV. Aneka Steel Teknik', '082142342424', 'Jl. Randegan Sari No. 22 Gresik Driyorejo, Jawa Timur, Indonesia'),
('DST1908003', 'PT Prima Perkasa', '086763747234', 'Jl. Merbau No. 29 Medan, Sumatera Utara, Indonesia'),
('DST1908004', 'Sintech', '081245458978', 'Jl. Raya Benovo Desa Kepatihan Gresik, Jawa Timur, Indonesia'),
('DST1908005', 'Indah Prasasti', '081223543522', 'Jl. Raya Pasar Minggu No. 37 Lampu Merah Simpang Tiga Taman Makam Pahlawan, Jakarta, Indonesia'),
('DST1908006', 'PT Ratimo Utama', '081254355464', 'Jl. Raya Medan-Binjai Km2.5 Dusun IV Deli Serdang, Sumatera Utara, Indonesia'),
('DST1908007', 'Berkat Sukses', '085843565778', 'Jl. hayam Wuruk No. 127 Jakarta, Indonesia'),
('DST1908008', 'PT Reka Indo Perkasa', '081254903455', 'Jl. Stadion Kemiri Nomor 22 Sidoarjo, Jawa Timur, Indonesia'),
('DST1908009', 'CV. Anugerah Raya', '081238789345', 'Jl. Lingkungan Tanah Putih, Flores Timur, Nusa Tenggara Timur, Indonesia'),
('DST1908010', 'Mandiri Perkasa', '081274389757', 'Jl. Taman Alfa Indah Joglo, Jakarta, Indonesia'),
('DST1908011', 'PT. Langgeng Trada Teknik', '021455646698', 'Jl. Banceuy No. 98 Bandung, Jawa Barat, Indonesia'),
('DST1908012', 'CV. Herindoe Perkasa', '081234728578', 'Jl. Tembaan No. 57H, Surabaya, Jawa Timur, Indonesia');

-- --------------------------------------------------------

--
-- Table structure for table `jenis_barang`
--

CREATE TABLE `jenis_barang` (
  `kode_jenis` char(5) NOT NULL,
  `nama_jenis` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `jenis_barang`
--

INSERT INTO `jenis_barang` (`kode_jenis`, `nama_jenis`) VALUES
('JB001', 'Paku3'),
('JB002', 'Pasir'),
('JB003', 'Semen'),
('JB004', 'Keramik'),
('JB005', 'Pipa'),
('JB006', 'Cat'),
('JB007', 'Triplek'),
('JB008', 'Besi'),
('JB009', 'Kayu'),
('JB010', 'Thinner'),
('JB011', 'Selang'),
('JB012', 'Kran'),
('JB013', 'Batu Bata'),
('JB014', 'Asbes'),
('JB015', 'Pintu'),
('JB016', 'Jendela'),
('JB017', 'Baut'),
('JB018', 'Alat Tukang'),
('JB019', 'Seng'),
('JB020', 'Kawat'),
('JB021', 'Lem'),
('JB022', 'Bor'),
('JB023', 'Mata Bor'),
('JB024', 'Pompa Air'),
('JB025', 'Kawat');

-- --------------------------------------------------------

--
-- Table structure for table `pemesanan`
--

CREATE TABLE `pemesanan` (
  `no_pesan` char(12) NOT NULL,
  `tgl_pesan` date NOT NULL,
  `total_pesan` double NOT NULL,
  `id_distributor` char(10) NOT NULL,
  `id_pengguna` char(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `pemesanan`
--

INSERT INTO `pemesanan` (`no_pesan`, `tgl_pesan`, `total_pesan`, `id_distributor`, `id_pengguna`) VALUES
('PB190817001', '2023-05-01', 218000, 'DST1907002', 'USR1907001'),
('PB190817002', '2023-05-01', 320000, 'DST1907002', 'USR1907001'),
('PB190817003', '2023-05-01', 4000, 'DST1907002', 'USR1907001'),
('PB190817004', '2023-05-01', 50000, 'DST1907001', 'USR1907001'),
('PB190817005', '2023-05-01', 129000, 'DST1907002', 'USR1907001'),
('PB190818006', '2023-05-01', 198000, 'DST1907002', 'USR1907001'),
('PB190818007', '2023-05-01', 129000, 'DST1907001', 'USR1907001'),
('PB190819008', '2023-05-01', 225120, 'DST1907001', 'USR1907001'),
('PB190819009', '2023-05-01', 3792200, 'DST1907001', 'USR1907001'),
('PB190926010', '2023-05-01', 1708500, 'DST1907001', 'USR1907001'),
('PB230519011', '2023-05-01', 5000, 'DST1908006', 'USR1907001'),
('PB230519012', '2023-05-01', 5000, 'DST1908009', 'USR1907001'),
('PB230519013', '2023-05-01', 500000, 'DST1908008', 'USR1907001'),
('PB230519014', '2023-05-01', 9000000, 'DST1908005', 'USR1907001'),
('PB230519015', '2023-05-01', 100000, 'DST1908004', 'USR1907001'),
('PB230519016', '2023-05-01', 500000, 'DST1908009', 'USR1907001'),
('PB230519017', '2023-05-01', 1000000, 'DST1908004', 'USR1907001');

-- --------------------------------------------------------

--
-- Table structure for table `pengguna`
--

CREATE TABLE `pengguna` (
  `id_pengguna` char(10) NOT NULL,
  `nama_pengguna` varchar(30) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(100) NOT NULL,
  `telp_pengguna` varchar(13) NOT NULL,
  `alamat_pengguna` varchar(100) NOT NULL,
  `level` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `pengguna`
--

INSERT INTO `pengguna` (`id_pengguna`, `nama_pengguna`, `username`, `password`, `telp_pengguna`, `alamat_pengguna`, `level`) VALUES
('USR1907001', 'Administrator', 'admin', 'admin', '089723432343', 'Jl. Raya Tengah Kelurahan Gedong, Pasar Rebo, Jakarta Timur 13760', 'Owner'),
('USR1907002', 'irwan', 'irwan', '12345', '202243570047', 'Jl. Raya Tengah Kelurahan Gedong, Pasar Rebo, Jakarta Timur 13760', 'Staff'),
('USR2305003', 'Irwandi', 'irwan1', '7cd2977616e6ad4e0c6346ae3502f0a0', '202243570047', 'Jl. jalan di jakarta timur', 'Staff'),
('USR2305004', 'Intan Rachmawati Sinaga', 'intan', '202cb962ac59075b964b07152d234b70', '202143579087', 'jl. jalan jalan di jakarta barat', 'Staff'),
('USR2305005', 'Isa Maulana Danang A', 'danang', '202cb962ac59075b964b07152d234b70', '202143579021', 'jl. jalan jalan di jakarta selatan', 'Staff'),
('USR2305006', 'Lukman Asfrika', 'lukman', '202cb962ac59075b964b07152d234b70', '202143570048', 'jl. jalan jalan di jakarta pusat', 'Staff'),
('USR2305007', 'Ekky Abi Pratama', 'ekky', '202cb962ac59075b964b07152d234b70', '202143570055', 'jl. jalan jalan di tanggerang selatan', 'Staff'),
('USR2305008', 'Fajri', 'fajri', '202cb962ac59075b964b07152d234b70', '202243579091', 'jl. jalan jalan di depok', 'Staff');

-- --------------------------------------------------------

--
-- Table structure for table `sementara_barang_masuk`
--

CREATE TABLE `sementara_barang_masuk` (
  `kode_barang` char(8) NOT NULL,
  `nama_barang` varchar(30) NOT NULL,
  `harga` double NOT NULL,
  `jml_masuk` int(5) NOT NULL,
  `subtotal_masuk` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `sementara_barang_masuk`
--

INSERT INTO `sementara_barang_masuk` (`kode_barang`, `nama_barang`, `harga`, `jml_masuk`, `subtotal_masuk`) VALUES
('B1908010', 'Triplek 3 mm', 76380, 1, 76380),
('B1908008', 'Keramik DN3', 87100, 2, 174200),
('B1908008', 'Keramik DN3', 87100, 5, 435500),
('B1908008', 'Keramik DN3', 87100, 6, 522600);

-- --------------------------------------------------------

--
-- Table structure for table `sementara_keluar`
--

CREATE TABLE `sementara_keluar` (
  `kode_barang` char(8) NOT NULL,
  `nama_barang` varchar(30) NOT NULL,
  `harga` double NOT NULL,
  `jml_keluar` int(4) NOT NULL,
  `subtotal_keluar` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Table structure for table `sementara_pesan`
--

CREATE TABLE `sementara_pesan` (
  `kode_barang` char(8) NOT NULL,
  `nama_barang` varchar(30) NOT NULL,
  `harga` double NOT NULL,
  `jml_pesan` int(4) NOT NULL,
  `subtotal_pesan` double NOT NULL,
  `status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`kode_barang`),
  ADD KEY `kode_jenis` (`kode_jenis`);

--
-- Indexes for table `barang_keluar`
--
ALTER TABLE `barang_keluar`
  ADD PRIMARY KEY (`no_keluar`),
  ADD KEY `id_pengguna` (`id_pengguna`);

--
-- Indexes for table `barang_masuk`
--
ALTER TABLE `barang_masuk`
  ADD PRIMARY KEY (`no_masuk`),
  ADD KEY `id_pengguna` (`id_pengguna`),
  ADD KEY `id_distributor` (`id_distributor`);

--
-- Indexes for table `detail_barang_keluar`
--
ALTER TABLE `detail_barang_keluar`
  ADD KEY `no_keluar` (`no_keluar`),
  ADD KEY `detail_barang_keluar_ibfk_2` (`kode_barang`);

--
-- Indexes for table `detail_barang_masuk`
--
ALTER TABLE `detail_barang_masuk`
  ADD KEY `kode_barang` (`kode_barang`),
  ADD KEY `no_masuk` (`no_masuk`);

--
-- Indexes for table `detail_pemesanan`
--
ALTER TABLE `detail_pemesanan`
  ADD KEY `no_pesan` (`no_pesan`),
  ADD KEY `kode_barang` (`kode_barang`);

--
-- Indexes for table `distributor`
--
ALTER TABLE `distributor`
  ADD PRIMARY KEY (`id_distributor`);

--
-- Indexes for table `jenis_barang`
--
ALTER TABLE `jenis_barang`
  ADD PRIMARY KEY (`kode_jenis`);

--
-- Indexes for table `pemesanan`
--
ALTER TABLE `pemesanan`
  ADD PRIMARY KEY (`no_pesan`),
  ADD KEY `id_distributor` (`id_distributor`),
  ADD KEY `id_pengguna` (`id_pengguna`);

--
-- Indexes for table `pengguna`
--
ALTER TABLE `pengguna`
  ADD PRIMARY KEY (`id_pengguna`);

--
-- Indexes for table `sementara_barang_masuk`
--
ALTER TABLE `sementara_barang_masuk`
  ADD KEY `kode_barang` (`kode_barang`);

--
-- Indexes for table `sementara_keluar`
--
ALTER TABLE `sementara_keluar`
  ADD PRIMARY KEY (`kode_barang`);

--
-- Indexes for table `sementara_pesan`
--
ALTER TABLE `sementara_pesan`
  ADD KEY `kode_barang` (`kode_barang`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `barang`
--
ALTER TABLE `barang`
  ADD CONSTRAINT `barang_ibfk_1` FOREIGN KEY (`kode_jenis`) REFERENCES `jenis_barang` (`kode_jenis`);

--
-- Constraints for table `barang_keluar`
--
ALTER TABLE `barang_keluar`
  ADD CONSTRAINT `barang_keluar_ibfk_1` FOREIGN KEY (`id_pengguna`) REFERENCES `pengguna` (`id_pengguna`);

--
-- Constraints for table `barang_masuk`
--
ALTER TABLE `barang_masuk`
  ADD CONSTRAINT `barang_masuk_ibfk_1` FOREIGN KEY (`id_pengguna`) REFERENCES `pengguna` (`id_pengguna`),
  ADD CONSTRAINT `barang_masuk_ibfk_2` FOREIGN KEY (`id_distributor`) REFERENCES `distributor` (`id_distributor`);

--
-- Constraints for table `detail_barang_keluar`
--
ALTER TABLE `detail_barang_keluar`
  ADD CONSTRAINT `detail_barang_keluar_ibfk_2` FOREIGN KEY (`kode_barang`) REFERENCES `barang` (`kode_barang`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `detail_barang_keluar_ibfk_3` FOREIGN KEY (`no_keluar`) REFERENCES `barang_keluar` (`no_keluar`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `detail_barang_masuk`
--
ALTER TABLE `detail_barang_masuk`
  ADD CONSTRAINT `detail_barang_masuk_ibfk_2` FOREIGN KEY (`kode_barang`) REFERENCES `barang` (`kode_barang`),
  ADD CONSTRAINT `detail_barang_masuk_ibfk_3` FOREIGN KEY (`no_masuk`) REFERENCES `barang_masuk` (`no_masuk`);

--
-- Constraints for table `detail_pemesanan`
--
ALTER TABLE `detail_pemesanan`
  ADD CONSTRAINT `detail_pemesanan_ibfk_1` FOREIGN KEY (`no_pesan`) REFERENCES `pemesanan` (`no_pesan`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `detail_pemesanan_ibfk_2` FOREIGN KEY (`kode_barang`) REFERENCES `barang` (`kode_barang`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `pemesanan`
--
ALTER TABLE `pemesanan`
  ADD CONSTRAINT `pemesanan_ibfk_1` FOREIGN KEY (`id_distributor`) REFERENCES `distributor` (`id_distributor`),
  ADD CONSTRAINT `pemesanan_ibfk_2` FOREIGN KEY (`id_pengguna`) REFERENCES `pengguna` (`id_pengguna`);

--
-- Constraints for table `sementara_barang_masuk`
--
ALTER TABLE `sementara_barang_masuk`
  ADD CONSTRAINT `sementara_barang_masuk_ibfk_1` FOREIGN KEY (`kode_barang`) REFERENCES `barang` (`kode_barang`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `sementara_keluar`
--
ALTER TABLE `sementara_keluar`
  ADD CONSTRAINT `sementara_keluar_ibfk_1` FOREIGN KEY (`kode_barang`) REFERENCES `barang` (`kode_barang`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `sementara_pesan`
--
ALTER TABLE `sementara_pesan`
  ADD CONSTRAINT `sementara_pesan_ibfk_1` FOREIGN KEY (`kode_barang`) REFERENCES `barang` (`kode_barang`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
