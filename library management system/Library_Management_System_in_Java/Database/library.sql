-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 25, 2022 at 07:58 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `library`
--

-- --------------------------------------------------------

--
-- Table structure for table `books`
--

CREATE TABLE `books` (
  `BookID` int(11) NOT NULL,
  `Subject` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `Title` varchar(80) CHARACTER SET utf8 DEFAULT NULL,
  `Author` varchar(100) CHARACTER SET utf8 DEFAULT NULL,
  `Publisher` varchar(80) CHARACTER SET utf8 DEFAULT NULL,
  `Copyright` int(11) DEFAULT NULL,
  `Edition` int(11) DEFAULT NULL,
  `Pages` int(11) DEFAULT NULL,
  `ISBN` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `NumberOfBooks` int(11) DEFAULT NULL,
  `NumberOfAvailbleBooks` int(11) DEFAULT NULL,
  `NumberOfBorrowedBooks` int(11) DEFAULT 0,
  `Library` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `Availble` bit(1) DEFAULT NULL,
  `ShelfNo` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `books`
--

INSERT INTO `books` (`BookID`, `Subject`, `Title`, `Author`, `Publisher`, `Copyright`, `Edition`, `Pages`, `ISBN`, `NumberOfBooks`, `NumberOfAvailbleBooks`, `NumberOfBorrowedBooks`, `Library`, `Availble`, `ShelfNo`) VALUES
(1, 'Java', 'Java : The Complete Reference', 'Herbert Schildt', 'Tata McGraw Hill', 2007, 7, 1023, '007063677X', 10, 10, 0, 'Main Library', b'1', 3),
(2, 'Networks', 'Computer Networks and Internets', 'Douglas E. Comer', 'Pearson Education', 2004, 4, 719, '8129703300', 5, 4, 1, 'NIELIT Library', b'1', 2),
(3, 'Compiler', 'Introduction to Automata Theory, Languages, Computation', 'John E. Hopcroft, Rajeev Motwani, Jeffrey D. Ullman', 'Pearson Education', 2001, 2, 521, '0201441241', 7, 7, 0, 'Main Library', b'1', 6),
(4, 'Java', 'JAVA Swing', 'Robert Eckstein,Marc Loy & Dave Wood', 'OREILLY', 1999, 1, 1227, '817366109X', 5, 5, 0, 'NIELIT Library', b'1', 4),
(5, 'Networking', 'Data Communications and Networking', 'Behrouz A. Forouzan', 'Tata McGraw Hill', 2006, 4, 1134, '0074634149', 15, 15, 0, 'Electronics Library', b'1', 2),
(6, 'Java', 'Java Concurrency in practice', 'Brian Goetz, David Holmes, Doug Lea, Tim Peierls,Joshua Bloch', 'Pearson Education', 2006, 1, 403, '9788131713396', 12, 12, 0, 'Main Library', b'1', 1),
(7, 'Security', 'Network Security Essentials : Applications and Standard', 'Willian Stallings', 'Pearson', 2011, 4, 417, '9788131761755', 11, 11, 0, 'Main', b'1', 2),
(8, 'Java', 'Swing : A Beginners Guide', 'Herbert Schildt', 'Tata McGraw Hill', 2007, 1, 590, '0070636486', 9, 9, 0, 'NIELIT Library', b'1', 1),
(9, 'Java', 'Java Network Programming', 'Elliotte Rusty Harold', 'OREILLY', 2005, 3, 735, '9788173663536', 10, 10, 0, 'Electronics', b'1', 4),
(10, 'Microprocessor', 'Microprocessors and Microcontrollers', 'B. Ram', 'Dhanpat Rai Publication', 2005, 6, 530, '9788189928605', 10, 10, 0, 'Electronics Library', b'1', 3),
(11, 'Automata', 'Automata Theory & Formal Languages', 'Adesh K. Pandey', 'Katson Books', 2004, 5, 358, '8189757148', 10, 10, 0, 'NIELIT Library', b'1', 2),
(12, 'Compiler', 'Compiler Design', 'Adesh K. Pandey', 'Katson Books', 2007, 2, 586, '8189757172', 10, 10, 0, 'NIELIT Library', b'1', 1);

-- --------------------------------------------------------

--
-- Table structure for table `borrow`
--

CREATE TABLE `borrow` (
  `BookId` int(11) NOT NULL,
  `MemberID` int(11) NOT NULL,
  `DayOfBorrowed` date NOT NULL,
  `DayOfReturn` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `borrow`
--

INSERT INTO `borrow` (`BookId`, `MemberID`, `DayOfBorrowed`, `DayOfReturn`) VALUES
(2, 2, '2022-05-12', '2022-05-17');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `Username` varchar(30) CHARACTER SET utf8 NOT NULL,
  `Password` varchar(30) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`Username`, `Password`) VALUES
('admin', '12345');

-- --------------------------------------------------------

--
-- Table structure for table `members`
--

CREATE TABLE `members` (
  `MemberID` int(11) NOT NULL,
  `RegNo` int(11) DEFAULT NULL,
  `Password` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `Name` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `EMail` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `Major` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `NumberOfBooks` int(11) DEFAULT 0,
  `ValidUpto` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `members`
--

INSERT INTO `members` (`MemberID`, `RegNo`, `Password`, `Name`, `EMail`, `Major`, `NumberOfBooks`, `ValidUpto`) VALUES
(1, 20104033, '12345', 'Md Arik Rayhan', 'mdarikrayhan@gmail.com', 'CSE', 0, '2024-05-31'),
(2, 20104027, '12345', 'Gourob Roy', 'gourobroychamok22@gmail.com', 'cse', 1, '2024-05-31'),
(3, 20104031, '12345', 'Bilkis Khatun', 'bilkis@gmail.com', 'cse', 0, '2024-05-31');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `books`
--
ALTER TABLE `books`
  ADD PRIMARY KEY (`BookID`);

--
-- Indexes for table `borrow`
--
ALTER TABLE `borrow`
  ADD PRIMARY KEY (`BookId`,`MemberID`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`Username`);

--
-- Indexes for table `members`
--
ALTER TABLE `members`
  ADD PRIMARY KEY (`MemberID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `books`
--
ALTER TABLE `books`
  MODIFY `BookID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `members`
--
ALTER TABLE `members`
  MODIFY `MemberID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
