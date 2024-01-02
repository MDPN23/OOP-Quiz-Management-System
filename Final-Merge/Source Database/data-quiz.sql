-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 02, 2024 at 05:43 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `data-quiz`
--

-- --------------------------------------------------------

--
-- Table structure for table `data-admin`
--

CREATE TABLE `data-admin` (
  `usernameAdmin` varchar(32) NOT NULL,
  `passwordAdmin` varchar(32) DEFAULT NULL,
  `namaAdmin` varchar(255) DEFAULT NULL,
  `nipAdmin` varchar(32) DEFAULT NULL,
  `isLoggedIn` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data-admin`
--

INSERT INTO `data-admin` (`usernameAdmin`, `passwordAdmin`, `namaAdmin`, `nipAdmin`, `isLoggedIn`) VALUES
('admin1', 'admin1', 'admin mahasiswa', '999888', 1);

-- --------------------------------------------------------

--
-- Table structure for table `data-dosen`
--

CREATE TABLE `data-dosen` (
  `usernameDosen` varchar(32) NOT NULL,
  `passwordDosen` varchar(32) NOT NULL,
  `namaDosen` varchar(32) NOT NULL,
  `nipDosen` int(12) NOT NULL,
  `emailDosen` varchar(32) NOT NULL,
  `alamatDosen` varchar(32) NOT NULL,
  `tanggalLahirDosen` date NOT NULL,
  `genderDosen` varchar(12) NOT NULL,
  `telefon` int(16) NOT NULL,
  `isLoggedIn` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data-dosen`
--

INSERT INTO `data-dosen` (`usernameDosen`, `passwordDosen`, `namaDosen`, `nipDosen`, `emailDosen`, `alamatDosen`, `tanggalLahirDosen`, `genderDosen`, `telefon`, `isLoggedIn`) VALUES
('', '', 'pakdosen', 20202122, 'pakdosen@gmail.com', '', '1995-01-01', 'laki-laki', 877987676, 1),
('dosengeorge', 'dosen123', 'pak george', 202202123, 'georgedosen@gmail.com', 'Depok', '1985-01-02', 'Laki-laki', 898976543, 1),
('dosen1', 'dosen1', 'AHlil Tarigan', 20202125, 'ahlildosen@gmail.com', 'Sukabumi', '1999-02-20', 'Laki-Laki', 8976543, 1);

-- --------------------------------------------------------

--
-- Table structure for table `data-mahasiswa`
--

CREATE TABLE `data-mahasiswa` (
  `username` varchar(32) NOT NULL,
  `password` varchar(32) NOT NULL,
  `nama` varchar(32) NOT NULL,
  `nim` int(12) NOT NULL,
  `email` varchar(64) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `tanggal-lahir` varchar(24) NOT NULL,
  `gender` varchar(12) NOT NULL,
  `telefon` int(32) NOT NULL,
  `isLoggedIn` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data-mahasiswa`
--

INSERT INTO `data-mahasiswa` (`username`, `password`, `nama`, `nim`, `email`, `alamat`, `tanggal-lahir`, `gender`, `telefon`, `isLoggedIn`) VALUES
('', '', 'Fitri Awaliyah Muslim', 1303210067, 'zuokafer@gmail.com', 'subang', '18 Desember 2002', 'Perempuan', 819080808, 1),
('gegeganteng', 'gegeganteng', 'nares', 1303210123, 'nunu@gmail.com', 'cikarang', '23 Desember 2002', 'Laki-Laki', 898765, 1),
('ahlilganteng', 'ahlilganteng', 'Muhammad Ahlil Fikri', 1303210318, 'ahlil@gmail.com', 'sukabumi', '25 Desember 2002', 'Laki-Laki', 89765432, 1),
('username', 'password', 'nama', 1303213232, 'nareswara@gmail.com', 'alamat Mahasiswa', '23 Desember 2002', 'Laki-Laki', 8976543, 1),
('reswa', 'reswa', 'nares', 23456354, 'nunu@gmail.com', 'alamatMahasiswa', '23 Desember 2002', 'Laki-Laki', 898765, 1);

-- --------------------------------------------------------

--
-- Table structure for table `data-quiz`
--

CREATE TABLE `data-quiz` (
  `id` int(11) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `batasWaktu` int(255) NOT NULL,
  `waktuQuiz` date NOT NULL,
  `skor` int(255) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data-quiz`
--

INSERT INTO `data-quiz` (`id`, `nama`, `batasWaktu`, `waktuQuiz`, `skor`) VALUES
(1, 'agama', 5, '2023-12-15', 60),
(2, 'kewarganegaraan', 5, '2024-01-20', 40),
(3, 'sejarah', 10, '2024-01-13', 100);

-- --------------------------------------------------------

--
-- Table structure for table `data-soal`
--

CREATE TABLE `data-soal` (
  `id` int(11) NOT NULL,
  `pertanyaan` varchar(255) NOT NULL,
  `true` tinyint(1) NOT NULL DEFAULT 1,
  `false` tinyint(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data-soal`
--

INSERT INTO `data-soal` (`id`, `pertanyaan`, `true`, `false`) VALUES
(11, 'rukun islam ada 5', 1, 0),
(12, 'rukun iman ada 5', 1, 0),
(13, 'saat ini tahun 1445 hijriyah', 1, 0),
(14, 'maksimal jumlah istri bagi seorang laki-laki adalah 5', 1, 0),
(15, 'jumlah surat dalam al-quran adalah 114', 1, 0),
(16, 'Kewarganegaraan adalah status hukum seseorang sebagai anggota suatu negara.', 1, 0),
(17, ' Seseorang dapat memiliki lebih dari satu kewarganegaraan secara bersamaan.', 1, 0),
(18, 'Hak memilih dalam pemilihan umum adalah hak yang dimiliki oleh warga negara.', 1, 0),
(19, 'Kewarganegaraan dan residensi memiliki arti yang sama.', 1, 0),
(20, 'Pemerintah memiliki hak untuk mencabut kewarganegaraan seseorang dalam beberapa kasus.', 1, 0),
(21, 'Apakah benar hitler meninggal di Garut', 1, 0),
(22, 'Nama lengkap Benito Mussolini adalah Benito Amilcare Andrea Mussolini.', 1, 0),
(23, 'Nama lengkap Adolf Hitler adalah Adolf Hitler.', 1, 0),
(24, 'Kaisar Jepang selama Perang Dunia II (PD 2) adalah  ratu adil.', 1, 0),
(25, 'indonesia merdeka pada tanggal 17 agustus 2045', 1, 0);

-- --------------------------------------------------------

--
-- Table structure for table `relasi-quiz-soal`
--

CREATE TABLE `relasi-quiz-soal` (
  `id` int(11) NOT NULL,
  `soal` int(255) NOT NULL,
  `quiz` int(255) NOT NULL,
  `jawaban` tinyint(4) DEFAULT NULL,
  `kunci` tinyint(4) NOT NULL,
  `nomor` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `relasi-quiz-soal`
--

INSERT INTO `relasi-quiz-soal` (`id`, `soal`, `quiz`, `jawaban`, `kunci`, `nomor`) VALUES
(6, 11, 1, 1, 1, 1),
(7, 12, 1, 1, 0, 2),
(8, 13, 1, 1, 1, 3),
(9, 14, 1, 1, 0, 4),
(10, 15, 1, 1, 1, 5),
(11, 16, 2, 1, 1, 1),
(12, 17, 2, 0, 1, 2),
(13, 18, 2, 0, 1, 3),
(14, 19, 2, 0, 0, 4),
(15, 20, 2, 0, 1, 5),
(16, 21, 3, 1, 1, 1),
(17, 22, 3, 1, 1, 2),
(18, 23, 3, 1, 1, 3),
(19, 24, 3, 0, 0, 4),
(20, 25, 3, 0, 0, 5);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data-admin`
--
ALTER TABLE `data-admin`
  ADD PRIMARY KEY (`usernameAdmin`);

--
-- Indexes for table `data-quiz`
--
ALTER TABLE `data-quiz`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `data-soal`
--
ALTER TABLE `data-soal`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `relasi-quiz-soal`
--
ALTER TABLE `relasi-quiz-soal`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `data-quiz`
--
ALTER TABLE `data-quiz`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `data-soal`
--
ALTER TABLE `data-soal`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `relasi-quiz-soal`
--
ALTER TABLE `relasi-quiz-soal`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
