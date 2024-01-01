-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 01, 2024 at 04:25 PM
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
-- Table structure for table `data-dosen`
--

CREATE TABLE `data-dosen` (
  `namaDosen` varchar(32) NOT NULL,
  `nipDosen` int(12) NOT NULL,
  `emailDosen` varchar(32) NOT NULL,
  `tanggalLahirDosen` date NOT NULL,
  `genderDosen` varchar(12) NOT NULL,
  `telefon` int(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data-dosen`
--

INSERT INTO `data-dosen` (`namaDosen`, `nipDosen`, `emailDosen`, `tanggalLahirDosen`, `genderDosen`, `telefon`) VALUES
('pakdosen', 20202122, 'pakdosen@gmail.com', '1995-01-01', 'laki-laki', 877987676);

-- --------------------------------------------------------

--
-- Table structure for table `data-mahasiswa`
--

CREATE TABLE `data-mahasiswa` (
  `nama` varchar(32) NOT NULL,
  `nim` int(12) NOT NULL,
  `email` varchar(64) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `tanggal-lahir` varchar(24) NOT NULL,
  `gender` varchar(12) NOT NULL,
  `telefon` int(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data-mahasiswa`
--

INSERT INTO `data-mahasiswa` (`nama`, `nim`, `email`, `alamat`, `tanggal-lahir`, `gender`, `telefon`) VALUES
('Fitri Awaliyah Muslim', 1303210067, 'zuokafer@gmail.com', 'subang', '18 Desember 2002', 'Perempuan', 819080808);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
