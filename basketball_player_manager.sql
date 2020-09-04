-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 22, 2020 at 10:36 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `basketball player manager`
--

-- --------------------------------------------------------

--
-- Table structure for table `newuser`
--

CREATE TABLE `newuser` (
  `id` int(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `newuser`
--

INSERT INTO `newuser` (`id`, `username`, `password`) VALUES
(1, 'Ayush', 'd1c2dcfcbfd41ce1103a25475b64f7a5'),
(6, 'Ayush Kanchan', 'd1c2dcfcbfd41ce1103a25475b64f7a5'),
(7, 'Ayush222', 'd1c2dcfcbfd41ce1103a25475b64f7a5'),
(8, 'Ayush0412', 'd1c2dcfcbfd41ce1103a25475b64f7a5'),
(9, 'Ayushh', 'd1c2dcfcbfd41ce1103a25475b64f7a5'),
(10, 'Ayush2', 'd1c2dcfcbfd41ce1103a25475b64f7a5');

-- --------------------------------------------------------

--
-- Table structure for table `player`
--

CREATE TABLE `player` (
  `id` int(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `team` varchar(255) DEFAULT NULL,
  `position` varchar(255) NOT NULL,
  `height` varchar(255) NOT NULL,
  `weight` varchar(255) NOT NULL,
  `number` varchar(255) NOT NULL,
  `dob` date NOT NULL,
  `country` varchar(255) NOT NULL,
  `Salary` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `player`
--

INSERT INTO `player` (`id`, `name`, `team`, `position`, `height`, `weight`, `number`, `dob`, `country`, `Salary`) VALUES
(39, 'Kobe Bryant', 'Los Angeles A', 'Shooting Guard', '6\'6', '210 lbs', '24', '1978-08-23', 'USA', '32.5 mil'),
(40, 'LeBron James', 'Los Angeles A', 'Small Forward', '6\'9\"', '250 lbs', '23', '1984-12-30', 'USA', '35.2 mil'),
(41, 'Anthony Davis', 'Los Angeles A', 'Center', '6\'11\"', '221.8 lbs', '3', '1993-03-11', 'USA', '30 mil'),
(42, 'Dwyane Wade', 'Miami ', 'Shooting Guard', '6\'4', '210 lbs', '3', '1990-09-09', 'USA', '25.5 mil'),
(43, 'Kyrie Irving', 'Brooklyn ', 'Point Guard', '6\'4\"', '195 lbs', '11', '1992-03-23', 'USA', '30 mil'),
(44, 'Kevin Durant', 'Brooklyn ', 'Small Forward', '7\'0\"', '225 lbs', '7', '1988-09-29', 'USA', '32 mil'),
(45, 'James Harden', 'Houston ', 'Shooting Guard', '6\'5\"', '223 lbs', '13', '1989-08-26', 'USA', '37 mil'),
(46, 'Russell Westbrook', 'Houston ', 'Point Guard', '6\'3\"', '200 lbs', '0', '1988-11-12', 'USA', '38.5 mil'),
(47, 'Derrick Rose', NULL, 'Point Guard', '-', '-', '-', '1990-09-09', '-', '-'),
(48, 'Demar Derozan', 'San Antonio ', 'Shooting Guard', '-', '-', '-', '1990-09-09', '-', '-'),
(49, 'Kawhi Leonard', 'Los Angeles B', 'Small Forward', '-', '-', '-', '1990-09-09', '-', '-'),
(50, 'Paul George', 'Los Angeles B', 'Shooting Guard', '-', '-', '-', '1990-09-09', '-', '-'),
(51, 'Damian Lillard ', 'Portland ', 'Point Guard', '-', '-', '-', '1990-09-09', '-', '-'),
(53, 'Luka Doncic', 'Dallas  Maverics', 'Small Forward', '-', '-', '-', '1990-09-09', '-', '-'),
(54, 'Dirk Nowitzki', 'Dallas  Maverics', 'Power Forward', '-', '-', '-', '1990-09-09', '-', '-'),
(55, 'Michael Jordan', 'Chicago', 'Shooting Guard', '6\'8', '217 lbs', '23', '1963-02-17', 'USA', '33.1 mil'),
(56, 'Rizwan', 'Dayananda Sagar', 'Center', '-', '-', '-', '1990-12-12', '-', '30 million');

-- --------------------------------------------------------

--
-- Table structure for table `stats`
--

CREATE TABLE `stats` (
  `stat_id` int(255) NOT NULL,
  `playername` varchar(255) DEFAULT NULL,
  `fga` int(255) NOT NULL,
  `fgm` int(255) NOT NULL,
  `games_played` int(255) NOT NULL,
  `turnover` int(255) NOT NULL,
  `assist` int(255) NOT NULL,
  `rebound` int(255) NOT NULL,
  `block` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `stats`
--

INSERT INTO `stats` (`stat_id`, `playername`, `fga`, `fgm`, `games_played`, `turnover`, `assist`, `rebound`, `block`) VALUES
(21, 'Kobe Bryant', 1600, 1400, 23, 60, 245, 400, 340),
(22, 'LeBron James', 1000, 643, 23, 324, 322, 323, 400),
(23, 'Anthony Davis', 324, 122, 34, 23, 342, 654, 657),
(24, 'Dwyane Wade', 789, 85, 43, 21, 345, 234, 365),
(25, 'Kyrie Irving', 879, 212, 34, 34, 234, 143, 62),
(26, 'Kevin Durant', 1233, 678, 34, 54, 123, 546, 123),
(27, 'James Harden', 890, 345, 43, 65, 323, 123, 123),
(28, 'Russell Westbrook', 908, 456, 43, 43, 900, 456, 342),
(29, 'Derrick Rose', 870, 345, 23, 34, 546, 345, 234),
(30, NULL, 798, 324, 56, 34, 542, 735, 342),
(38, 'Michael Jordan', 500, 450, 23, 54, 234, 432, 234),
(39, 'Rizwan', 800, 750, 21, 234, 342, 2342, 435);

-- --------------------------------------------------------

--
-- Table structure for table `team`
--

CREATE TABLE `team` (
  `id` int(255) NOT NULL,
  `teamname` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `team`
--

INSERT INTO `team` (`id`, `teamname`) VALUES
(31, 'Atlanta '),
(32, 'Los Angeles A'),
(33, 'Miami '),
(34, 'Brooklyn '),
(35, 'Houston '),
(37, 'Toronto  '),
(38, 'San Antonio '),
(39, 'Dallas  Maverics'),
(40, 'Los Angeles B'),
(41, 'Portland '),
(43, 'Phoenix'),
(44, 'Chicago'),
(46, 'Dayananda Sagar');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `newuser`
--
ALTER TABLE `newuser`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `player`
--
ALTER TABLE `player`
  ADD PRIMARY KEY (`id`,`name`),
  ADD KEY `name` (`name`),
  ADD KEY `team` (`team`);

--
-- Indexes for table `stats`
--
ALTER TABLE `stats`
  ADD PRIMARY KEY (`stat_id`),
  ADD KEY `playername` (`playername`);

--
-- Indexes for table `team`
--
ALTER TABLE `team`
  ADD PRIMARY KEY (`id`,`teamname`),
  ADD KEY `team` (`teamname`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `newuser`
--
ALTER TABLE `newuser`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `player`
--
ALTER TABLE `player`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=57;

--
-- AUTO_INCREMENT for table `stats`
--
ALTER TABLE `stats`
  MODIFY `stat_id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=40;

--
-- AUTO_INCREMENT for table `team`
--
ALTER TABLE `team`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=47;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `player`
--
ALTER TABLE `player`
  ADD CONSTRAINT `player_ibfk_1` FOREIGN KEY (`team`) REFERENCES `team` (`teamname`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Constraints for table `stats`
--
ALTER TABLE `stats`
  ADD CONSTRAINT `stats_ibfk_1` FOREIGN KEY (`playername`) REFERENCES `player` (`name`) ON DELETE SET NULL ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
