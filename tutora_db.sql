-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 21, 2021 at 05:05 AM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 8.0.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tutora_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `exam_enquiries`
--

CREATE TABLE `exam_enquiries` (
  `enqID` int(11) NOT NULL,
  `subject` varchar(25) NOT NULL,
  `exam_date` varchar(100) NOT NULL,
  `enquiry` varchar(255) NOT NULL,
  `id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `exam_enquiries`
--

INSERT INTO `exam_enquiries` (`enqID`, `subject`, `exam_date`, `enquiry`, `id`) VALUES
(1, 'bbb', 'ccc', 'ddd', 12345678),
(2, 'yyy', '11/12', 'xzcxzcxzcxzcxzXss', 12345678);

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `nic` varchar(15) DEFAULT NULL,
  `phone` int(50) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`id`, `name`, `nic`, `phone`, `age`, `email`, `gender`, `address`, `created_at`) VALUES
(12345678, 'Anoj', '123456798', 3213213, 23, 'test@test.lk', 'Male', '567, Somewhere, Nowhere.', '2021-11-19 06:09:53'),
(12345679, 'A Nadeeka', '352440147', 112563345, 26, 'jasdlasd@gmail.com', 'male', 'kas lma s\n asd\n as \nad', '2021-11-20 22:49:36'),
(12345680, 'Nadeeka', '011255366', 112292356, 22, 'gsdfsd@gmail.com', 'female', '35/1 As \n sada\n asd', '2021-11-20 22:52:20');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `role` varchar(100) NOT NULL COMMENT 'admin , user',
  `created_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `exam_enquiries`
--
ALTER TABLE `exam_enquiries`
  ADD PRIMARY KEY (`enqID`),
  ADD UNIQUE KEY `enqID` (`enqID`),
  ADD KEY `id` (`id`);

--
-- Indexes for table `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `exam_enquiries`
--
ALTER TABLE `exam_enquiries`
  MODIFY `enqID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `students`
--
ALTER TABLE `students`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12345681;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `exam_enquiries`
--
ALTER TABLE `exam_enquiries`
  ADD CONSTRAINT `exam_enquiries_ibfk_1` FOREIGN KEY (`id`) REFERENCES `students` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
