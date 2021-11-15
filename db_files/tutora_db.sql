-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 15, 2021 at 02:15 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.12

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
  `subject` int(11) NOT NULL,
  `exam_date` varchar(100) NOT NULL,
  `enquiry` varchar(255) NOT NULL,
  `studentID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `stu_registered`
--

CREATE TABLE `stu_registered` (
  `studentID` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `nic` varchar(15) DEFAULT NULL,
  `phone` int(50) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `address` int(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `exam_enquiries`
--
ALTER TABLE `exam_enquiries`
  ADD PRIMARY KEY (`enqID`),
  ADD KEY `studentID` (`studentID`);

--
-- Indexes for table `stu_registered`
--
ALTER TABLE `stu_registered`
  ADD PRIMARY KEY (`studentID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `stu_registered`
--
ALTER TABLE `stu_registered`
  MODIFY `studentID` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `exam_enquiries`
--
ALTER TABLE `exam_enquiries`
  ADD CONSTRAINT `exam_enquiries_ibfk_1` FOREIGN KEY (`studentID`) REFERENCES `stu_registered` (`studentID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
