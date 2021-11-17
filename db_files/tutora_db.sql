-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 17, 2021 at 03:57 PM
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
  `subject` varchar(25) NOT NULL,
  `exam_date` varchar(100) NOT NULL,
  `enquiry` varchar(255) NOT NULL,
  `studentID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `exam_enquiries`
--

INSERT INTO `exam_enquiries` (`enqID`, `subject`, `exam_date`, `enquiry`, `studentID`) VALUES
(1, 'bbb', 'ccc', 'ddd', 12345678),
(3, 'zzz', 'yyy', 'xxx', 12345678),
(4, 'xzc', 'xzc', 'zxc', 12345678);

-- --------------------------------------------------------

--
-- Table structure for table `registered_students`
--

CREATE TABLE `registered_students` (
  `studentID` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `nic` varchar(15) DEFAULT NULL,
  `phone` int(50) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `registered_students`
--

INSERT INTO `registered_students` (`studentID`, `name`, `nic`, `phone`, `age`, `email`, `gender`, `address`) VALUES
(12345678, 'Anoj', '123456798', 3213213, 23, 'test@test.lk', 'Male', '567, Somewhere, Nowhere.');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `exam_enquiries`
--
ALTER TABLE `exam_enquiries`
  ADD PRIMARY KEY (`enqID`),
  ADD UNIQUE KEY `enqID` (`enqID`),
  ADD KEY `studentID` (`studentID`);

--
-- Indexes for table `registered_students`
--
ALTER TABLE `registered_students`
  ADD PRIMARY KEY (`studentID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `exam_enquiries`
--
ALTER TABLE `exam_enquiries`
  MODIFY `enqID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `registered_students`
--
ALTER TABLE `registered_students`
  MODIFY `studentID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12345679;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `exam_enquiries`
--
ALTER TABLE `exam_enquiries`
  ADD CONSTRAINT `exam_enquiries_ibfk_1` FOREIGN KEY (`studentID`) REFERENCES `registered_students` (`studentID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
