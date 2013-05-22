-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jun 10, 2011 at 07:30 PM
-- Server version: 5.5.8
-- PHP Version: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `c3`
--

-- --------------------------------------------------------

--
-- Table structure for table `actors`
--

CREATE TABLE IF NOT EXISTS `actors` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `main_id` int(11) NOT NULL,
  `first_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(40) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `date_of_birth` date DEFAULT NULL,
  `weight` varchar(40) DEFAULT NULL,
  `height` varchar(40) DEFAULT NULL,
  `gender` tinyint(4) DEFAULT NULL,
  `race` varchar(40) DEFAULT NULL,
  `blood _type` varchar(40) DEFAULT NULL,
  `title` varchar(40) DEFAULT NULL,
  `is_pregnant` tinyint(1) DEFAULT NULL,
  `telephone` varchar(40) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `active` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `login_actors` (`main_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `actors`
--

INSERT INTO `actors` (`ID`, `main_id`, `first_name`, `last_name`, `email`, `date_of_birth`, `weight`, `height`, `gender`, `race`, `blood _type`, `title`, `is_pregnant`, `telephone`, `address`, `active`) VALUES
(1, 1, 'Marty', 'Griffin', 'mgrif002@ucr.edu', '2011-05-09', '150', '6''', 1, 'White', 'O+', 'Mr.', 0, '949-874-1452', NULL, 1);

-- --------------------------------------------------------

--
-- Table structure for table `allergys`
--

CREATE TABLE IF NOT EXISTS `allergys` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `PID` int(11) DEFAULT NULL,
  `date_diagnosed` date DEFAULT NULL,
  `diagnosed_by` int(11) DEFAULT NULL,
  `allergen_type` varchar(40) DEFAULT NULL,
  `allergen_type_type` varchar(40) DEFAULT NULL,
  `allergen_type_value` varchar(40) DEFAULT NULL,
  `allergen_type_abbrev` varchar(40) DEFAULT NULL,
  `allergen_name` varchar(100) DEFAULT NULL,
  `allergen_name_type` varchar(40) DEFAULT NULL,
  `allergen_name_value` varchar(40) DEFAULT NULL,
  `allergen_name_abbrev` varchar(40) DEFAULT NULL,
  `reaction` varchar(200) DEFAULT NULL,
  `specifics` varchar(200) DEFAULT NULL,
  `notes_id` int(11) DEFAULT NULL,
  `is_current` tinyint(1) DEFAULT NULL,
  `active` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `actors_allergys` (`PID`),
  KEY `notes_allergys` (`notes_id`),
  KEY `physician_allergys` (`diagnosed_by`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 COMMENT='stores informatiuon pertaining to a patients allergies' AUTO_INCREMENT=22 ;

--
-- Dumping data for table `allergys`
--

INSERT INTO `allergys` (`ID`, `PID`, `date_diagnosed`, `diagnosed_by`, `allergen_type`, `allergen_type_type`, `allergen_type_value`, `allergen_type_abbrev`, `allergen_name`, `allergen_name_type`, `allergen_name_value`, `allergen_name_abbrev`, `reaction`, `specifics`, `notes_id`, `is_current`, `active`) VALUES
(13, 1, '2011-05-26', NULL, 'fghfgh', NULL, NULL, NULL, 'fghfgh', NULL, NULL, NULL, NULL, NULL, NULL, 1, 0),
(14, 1, '2011-05-30', NULL, 'stuff', NULL, NULL, NULL, 'candy', NULL, NULL, NULL, NULL, NULL, NULL, 1, 0),
(15, 1, '2011-05-30', NULL, 'sdfsdf', NULL, NULL, NULL, 'pew pew', NULL, NULL, NULL, NULL, NULL, NULL, 1, 0),
(16, 1, '2011-02-07', NULL, 'birds', NULL, NULL, NULL, 'ka ka', NULL, NULL, NULL, NULL, NULL, NULL, 1, 0),
(17, 1, '2011-05-29', NULL, 'sadasd', NULL, NULL, NULL, 'asdsad', NULL, NULL, NULL, NULL, NULL, NULL, 1, 0),
(18, 1, '2011-05-29', NULL, 'sdfsdf', NULL, NULL, NULL, 'mewo', NULL, NULL, NULL, NULL, NULL, NULL, 1, 0),
(19, 1, '2011-05-30', NULL, 'asdasd', NULL, NULL, NULL, 'asdasd', NULL, NULL, NULL, NULL, NULL, NULL, 0, 0),
(20, 1, '1991-05-25', NULL, 'Antibiotic', NULL, NULL, NULL, 'Penclilin', NULL, NULL, NULL, NULL, NULL, NULL, 1, 0),
(21, 1, '2011-05-30', NULL, 'plant', NULL, NULL, NULL, 'Trees', NULL, NULL, NULL, NULL, NULL, NULL, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `coding_system`
--

CREATE TABLE IF NOT EXISTS `coding_system` (
  `ID` int(11) NOT NULL,
  `short_name` varchar(40) DEFAULT NULL,
  `description` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `coding_system`
--


-- --------------------------------------------------------

--
-- Table structure for table `coding_systems_value`
--

CREATE TABLE IF NOT EXISTS `coding_systems_value` (
  `ID` int(11) NOT NULL,
  `name` varchar(40) NOT NULL,
  `code` int(11) DEFAULT NULL,
  `abbreviation` varchar(40) DEFAULT NULL,
  `physician_value` varchar(40) DEFAULT NULL,
  `consumer_value` varchar(40) DEFAULT NULL,
  `umls_code` varchar(40) DEFAULT NULL,
  `additional_fields` varchar(40) DEFAULT NULL,
  `system_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `coding_system_coding_systems_value` (`system_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `coding_systems_value`
--


-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE IF NOT EXISTS `department` (
  `ID` int(11) NOT NULL,
  `hospital_id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `phone` varchar(40) DEFAULT NULL,
  `fax` varchar(40) DEFAULT NULL,
  `notes_id` int(11) DEFAULT NULL,
  `active` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `hospital_department` (`hospital_id`),
  KEY `notes_department` (`notes_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `department`
--


-- --------------------------------------------------------

--
-- Table structure for table `dicom`
--

CREATE TABLE IF NOT EXISTS `dicom` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `PID` int(11) DEFAULT NULL,
  `file_location` varchar(200) DEFAULT NULL,
  `hospital_id` int(11) DEFAULT NULL,
  `notes_id` int(11) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `size` int(11) DEFAULT NULL,
  `manufacturer` varchar(100) DEFAULT NULL,
  `modality_id` int(11) DEFAULT NULL,
  `body_part_examined` varchar(100) DEFAULT NULL,
  `plate_type` varchar(100) DEFAULT NULL,
  `phosphor_type` varchar(100) DEFAULT NULL,
  `is_current` tinyint(1) DEFAULT NULL,
  `active` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `actors_dicom` (`PID`),
  KEY `notes_dicom` (`notes_id`),
  KEY `hospital_dicom` (`hospital_id`),
  KEY `modality_dicom` (`modality_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Dumping data for table `dicom`
--

INSERT INTO `dicom` (`ID`, `PID`, `file_location`, `hospital_id`, `notes_id`, `name`, `size`, `manufacturer`, `modality_id`, `body_part_examined`, `plate_type`, `phosphor_type`, `is_current`, `active`) VALUES
(6, 1, 'E:\\Documents and Settings\\mgrif002\\Desktop\\data\\upload_122950e8_130328ac95f__7ffe_00000001.jpg', NULL, NULL, 'Test file2', NULL, NULL, NULL, NULL, NULL, NULL, 1, 1),
(7, 1, 'E:\\Documents and Settings\\mgrif002\\Desktop\\data\\upload_122950e8_130328ac95f__7ffd_00000001.jpg', NULL, NULL, 'Test file3', NULL, NULL, NULL, NULL, NULL, NULL, 1, 1),
(8, 1, 'E:\\Documents and Settings\\mgrif002\\Desktop\\data\\upload_122950e8_130328ac95f__7ffd_00000005.jpg', NULL, NULL, 'Test file2', NULL, NULL, NULL, NULL, NULL, NULL, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `files`
--

CREATE TABLE IF NOT EXISTS `files` (
  `ID` int(11) NOT NULL,
  `PID` int(11) NOT NULL,
  `location` varchar(200) DEFAULT NULL,
  `notes_id` int(11) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `size` int(11) DEFAULT NULL,
  `is_current` tinyint(1) DEFAULT NULL,
  `active` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `actors_files` (`PID`),
  KEY `notes_files` (`notes_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `files`
--


-- --------------------------------------------------------

--
-- Table structure for table `hospital`
--

CREATE TABLE IF NOT EXISTS `hospital` (
  `ID` int(11) NOT NULL,
  `PID` int(11) NOT NULL,
  `hospital_name` varchar(100) DEFAULT NULL,
  `institution_name` varchar(100) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `phone` varchar(40) DEFAULT NULL,
  `notes_id` int(11) DEFAULT NULL,
  `fax` varchar(40) DEFAULT NULL,
  `is_current` tinyint(1) DEFAULT NULL,
  `active` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `actors_hospital` (`PID`),
  KEY `notes_hospital` (`notes_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Stores alternate ids a patient can have, usually given from a hospital';

--
-- Dumping data for table `hospital`
--


-- --------------------------------------------------------

--
-- Table structure for table `immunization`
--

CREATE TABLE IF NOT EXISTS `immunization` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `PID` int(11) DEFAULT NULL,
  `date_administered` date DEFAULT NULL,
  `administered_by` int(11) DEFAULT NULL,
  `vaccine_type` varchar(100) DEFAULT NULL,
  `vaccine_value` varchar(40) DEFAULT NULL,
  `vaccine_manufacturer` varchar(100) DEFAULT NULL,
  `vaccine_lot` varchar(40) DEFAULT NULL,
  `vaccine_expiration` date DEFAULT NULL,
  `sequence` int(11) DEFAULT NULL,
  `anatomic_surface` varchar(100) DEFAULT NULL,
  `anatomic_surface_value` varchar(40) DEFAULT NULL,
  `anatomic_surface_abbrev` varchar(40) DEFAULT NULL,
  `adverse_event` varchar(40) DEFAULT NULL,
  `notes_id` int(11) DEFAULT NULL,
  `is_current` tinyint(1) DEFAULT NULL,
  `active` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `actors_immunization` (`PID`),
  KEY `notes_immunization` (`notes_id`),
  KEY `physician_immunization` (`administered_by`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Dumping data for table `immunization`
--

INSERT INTO `immunization` (`ID`, `PID`, `date_administered`, `administered_by`, `vaccine_type`, `vaccine_value`, `vaccine_manufacturer`, `vaccine_lot`, `vaccine_expiration`, `sequence`, `anatomic_surface`, `anatomic_surface_value`, `anatomic_surface_abbrev`, `adverse_event`, `notes_id`, `is_current`, `active`) VALUES
(5, 1, '2011-05-02', NULL, 'test', NULL, 'me', NULL, '2011-05-30', NULL, NULL, NULL, NULL, NULL, NULL, 1, 0),
(6, 1, '2011-05-02', NULL, 'test', NULL, 'me', NULL, '2011-05-30', NULL, NULL, NULL, NULL, NULL, NULL, 1, 0),
(7, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, 0),
(8, 1, '2011-06-13', NULL, 'flu', NULL, 'me', NULL, '2013-01-04', NULL, NULL, NULL, NULL, NULL, NULL, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `insurance`
--

CREATE TABLE IF NOT EXISTS `insurance` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `PID` int(11) NOT NULL,
  `company_name` varchar(100) DEFAULT NULL,
  `type_id` int(11) DEFAULT NULL,
  `plan_name` varchar(100) DEFAULT NULL,
  `plan_id` varchar(100) DEFAULT NULL,
  `group_number` varchar(100) DEFAULT NULL,
  `member_id` varchar(100) DEFAULT NULL,
  `policy_id` varchar(100) DEFAULT NULL,
  `phone` varchar(40) DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  `fax` varchar(40) DEFAULT NULL,
  `notes_id` int(11) DEFAULT NULL,
  `is_current` tinyint(1) DEFAULT NULL,
  `active` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `notes_insurance` (`notes_id`),
  KEY `actors_insurance` (`PID`),
  KEY `insurance_type_insurance` (`type_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `insurance`
--

INSERT INTO `insurance` (`ID`, `PID`, `company_name`, `type_id`, `plan_name`, `plan_id`, `group_number`, `member_id`, `policy_id`, `phone`, `start_date`, `end_date`, `fax`, `notes_id`, `is_current`, `active`) VALUES
(1, 1, 'Blue Cross', NULL, 'stuff', '234234', '234234-3234', '234234', '234234', '9498889116', '2011-06-27', '2011-06-30', NULL, NULL, 1, 0),
(2, 1, 'aids', NULL, 'sdfsdf', '8234723', '88778', '8787', '8787', '8787', '2011-06-27', '2011-06-28', NULL, NULL, 1, 0),
(3, 1, 'BLue Cross', NULL, 'health', '23423h-dfgdfg', 'jdfdfgdfg--rtyrty', '2345345', '345345q', 'dfdfhfghq', '2011-06-27', '2011-06-30', NULL, NULL, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `insurance_type`
--

CREATE TABLE IF NOT EXISTS `insurance_type` (
  `ID` int(11) NOT NULL,
  `name` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `insurance_type`
--


-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE IF NOT EXISTS `login` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'primary patient ID',
  `username` varchar(40) NOT NULL,
  `password` varchar(40) NOT NULL,
  `email` varchar(50) NOT NULL,
  `questions` varchar(100) DEFAULT NULL,
  `answer` varchar(50) DEFAULT NULL,
  `active` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 COMMENT='stores basic patient data' AUTO_INCREMENT=3 ;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`ID`, `username`, `password`, `email`, `questions`, `answer`, `active`) VALUES
(1, 'marty', 'password', 'mgrif002@ucr.ed', 'sdfsdf', 'dgdfg', 1),
(2, 'joe', 'password', 'joe@joe.com', 'What is the name of your first pet?', 'rocco', 1);

-- --------------------------------------------------------

--
-- Table structure for table `measurement`
--

CREATE TABLE IF NOT EXISTS `measurement` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `PID` int(11) DEFAULT NULL,
  `type` varchar(100) DEFAULT NULL,
  `value` varchar(40) DEFAULT NULL,
  `unit` varchar(40) DEFAULT NULL,
  `datetime` date DEFAULT NULL,
  `notes_id` int(11) DEFAULT NULL,
  `is_current` tinyint(1) DEFAULT NULL,
  `active` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `actors_measurement` (`PID`),
  KEY `notes_measurement` (`notes_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `measurement`
--

INSERT INTO `measurement` (`ID`, `PID`, `type`, `value`, `unit`, `datetime`, `notes_id`, `is_current`, `active`) VALUES
(4, 1, 'fgh', 'fgh', 'fgh', '2011-06-22', NULL, 1, 0),
(5, 1, 'afasf', 'asfasf', 'safasf', '2011-06-06', NULL, 1, 0),
(6, 1, 'Height', '5'' 11''', 'feet/inches', '2011-06-23', NULL, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `medication`
--

CREATE TABLE IF NOT EXISTS `medication` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `PID` int(11) DEFAULT NULL,
  `date_started` date DEFAULT NULL,
  `date_stopped` date DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `name_type` varchar(40) DEFAULT NULL,
  `name_value` varchar(40) DEFAULT NULL,
  `name_abbrev` varchar(40) DEFAULT NULL,
  `brand_name` varchar(100) DEFAULT NULL,
  `brand_name_type` varchar(40) DEFAULT NULL,
  `brand_name_value` varchar(40) DEFAULT NULL,
  `brand_name_abbrev` varchar(40) DEFAULT NULL,
  `dose_textvalue` varchar(40) DEFAULT NULL,
  `dose_value` varchar(40) DEFAULT NULL,
  `dose_unit` varchar(40) DEFAULT NULL,
  `dose_unit_type` varchar(40) DEFAULT NULL,
  `dose_unit_value` varchar(40) DEFAULT NULL,
  `dose_unit_type_abbrev` varchar(40) DEFAULT NULL,
  `route` varchar(40) DEFAULT NULL,
  `route_type` varchar(40) DEFAULT NULL,
  `route_value` varchar(40) DEFAULT NULL,
  `route_abbrev` varchar(40) DEFAULT NULL,
  `strength_textvalue` varchar(40) DEFAULT NULL,
  `strength_value` varchar(40) DEFAULT NULL,
  `strength_unit` varchar(40) DEFAULT NULL,
  `strength_unit_type` varchar(40) DEFAULT NULL,
  `strength_unit_value` varchar(40) DEFAULT NULL,
  `strength_unit_abbrev` varchar(40) DEFAULT NULL,
  `frequency` varchar(40) DEFAULT NULL,
  `frequency_type` varchar(40) DEFAULT NULL,
  `frequency_value` varchar(40) DEFAULT NULL,
  `frequency_abbrev` varchar(40) DEFAULT NULL,
  `prescribed_by_name` int(11) DEFAULT NULL,
  `prescribed_by_institution` int(11) DEFAULT NULL,
  `prescribed_on` date DEFAULT NULL,
  `prescribed_stop_on` date DEFAULT NULL,
  `dispense_as_written` tinyint(4) DEFAULT NULL,
  `prescription_duration` varchar(40) DEFAULT NULL,
  `prescription_refill_info` varchar(40) DEFAULT NULL,
  `notes_id` int(11) DEFAULT NULL,
  `is_current` tinyint(1) DEFAULT NULL,
  `active` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `actors_medication` (`PID`),
  KEY `notes_medication` (`notes_id`),
  KEY `physician_medication` (`prescribed_by_name`),
  KEY `hospital_medication` (`prescribed_by_institution`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `medication`
--

INSERT INTO `medication` (`ID`, `PID`, `date_started`, `date_stopped`, `name`, `name_type`, `name_value`, `name_abbrev`, `brand_name`, `brand_name_type`, `brand_name_value`, `brand_name_abbrev`, `dose_textvalue`, `dose_value`, `dose_unit`, `dose_unit_type`, `dose_unit_value`, `dose_unit_type_abbrev`, `route`, `route_type`, `route_value`, `route_abbrev`, `strength_textvalue`, `strength_value`, `strength_unit`, `strength_unit_type`, `strength_unit_value`, `strength_unit_abbrev`, `frequency`, `frequency_type`, `frequency_value`, `frequency_abbrev`, `prescribed_by_name`, `prescribed_by_institution`, `prescribed_on`, `prescribed_stop_on`, `dispense_as_written`, `prescription_duration`, `prescription_refill_info`, `notes_id`, `is_current`, `active`) VALUES
(1, 1, '2011-05-02', '2011-05-02', 'cxvxcv', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'cvbcvb', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, 1),
(2, 1, '2011-05-02', '2011-05-09', 'testing', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'asdasd', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, 1),
(3, 1, '2011-05-11', '2011-05-23', 'sdfsdfsdf', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'sdfsdf', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, 1),
(4, 1, '2011-05-02', '2011-05-02', 'etertert', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '1 1/2', NULL, NULL, NULL, NULL, NULL, 'To mucus membrane', NULL, NULL, NULL, 'sadsad', NULL, NULL, NULL, NULL, NULL, '2 times per day', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, 0),
(5, 1, '2011-05-02', '2011-05-10', 'asdasd', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '1 1/2', NULL, NULL, NULL, NULL, NULL, 'mouth', NULL, NULL, NULL, 'asdasd', NULL, NULL, NULL, NULL, NULL, '2 times per day', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, 0),
(6, 1, '2011-05-02', '2011-05-01', 'asdsad', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '1 1/2', NULL, NULL, NULL, NULL, NULL, 'mouth', NULL, NULL, NULL, 'asdsad', NULL, NULL, NULL, NULL, NULL, '1 time per day', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, 0),
(7, 1, '2011-05-03', '2011-05-15', 'sadasd', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '1', NULL, NULL, NULL, NULL, NULL, 'To mucus membrane', NULL, NULL, NULL, 'asdasd', NULL, NULL, NULL, NULL, NULL, '1 time per day', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, 1),
(8, 1, '2011-05-03', '2011-05-01', 'sadasd', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '1 1/2', NULL, NULL, NULL, NULL, NULL, 'To mucus membrane', NULL, NULL, NULL, 'asd', NULL, NULL, NULL, NULL, NULL, 'every 6 hours', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, 0),
(9, 1, '2011-05-02', '2011-05-09', 'rtertert', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '1', NULL, NULL, NULL, NULL, NULL, 'mouth', NULL, NULL, NULL, 'sadsad', NULL, NULL, NULL, NULL, NULL, '1 time per day', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, 0),
(10, 1, '2011-05-16', NULL, 'Pills', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '1 1/2', NULL, NULL, NULL, NULL, NULL, 'mouth', NULL, NULL, NULL, '80 mg', NULL, NULL, NULL, NULL, NULL, 'every 6 hours', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `modality`
--

CREATE TABLE IF NOT EXISTS `modality` (
  `ID` int(11) NOT NULL,
  `symbol` varchar(40) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `modality`
--


-- --------------------------------------------------------

--
-- Table structure for table `notes`
--

CREATE TABLE IF NOT EXISTS `notes` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `note` varchar(400) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `active` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `notes`
--


-- --------------------------------------------------------

--
-- Table structure for table `physician`
--

CREATE TABLE IF NOT EXISTS `physician` (
  `ID` int(11) NOT NULL,
  `PID` int(11) NOT NULL,
  `first_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `phone` varchar(40) DEFAULT NULL,
  `office_address` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  `primary_specialty` varchar(100) DEFAULT NULL,
  `secondary_specialty` varchar(100) DEFAULT NULL,
  `clinic_name` varchar(100) DEFAULT NULL,
  `is_primary` tinyint(1) DEFAULT NULL,
  `fax` varchar(40) DEFAULT NULL,
  `notes_id` int(11) DEFAULT NULL,
  `hospital_id` int(11) DEFAULT NULL,
  `active` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `actors_physician` (`PID`),
  KEY `notes_physician` (`notes_id`),
  KEY `hospital_physician` (`hospital_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `physician`
--

INSERT INTO `physician` (`ID`, `PID`, `first_name`, `last_name`, `phone`, `office_address`, `email`, `start_date`, `end_date`, `primary_specialty`, `secondary_specialty`, `clinic_name`, `is_primary`, `fax`, `notes_id`, `hospital_id`, `active`) VALUES
(1, 1, 'Joe', 'Schmo', '21321334324', '2121341234', 'sdfsdf@sdfsdf.com', '2011-05-01', NULL, 'allergies', NULL, 'Hostpital', 1, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `problem`
--

CREATE TABLE IF NOT EXISTS `problem` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `PID` int(11) DEFAULT NULL,
  `date_onset` date DEFAULT NULL,
  `date_resolution` date DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `name_type` varchar(40) DEFAULT NULL,
  `name_value` varchar(40) DEFAULT NULL,
  `name_abbrev` varchar(40) DEFAULT NULL,
  `diagnosed_by` int(11) DEFAULT NULL,
  `notes_id` int(11) DEFAULT NULL,
  `is_current` tinyint(1) DEFAULT NULL,
  `active` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `actors_problem` (`PID`),
  KEY `notes_problem` (`notes_id`),
  KEY `physician_problem` (`diagnosed_by`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

--
-- Dumping data for table `problem`
--

INSERT INTO `problem` (`ID`, `PID`, `date_onset`, `date_resolution`, `name`, `name_type`, `name_value`, `name_abbrev`, `diagnosed_by`, `notes_id`, `is_current`, `active`) VALUES
(1, 1, '2011-05-10', '2011-05-31', 'test', NULL, NULL, NULL, NULL, NULL, 1, 1),
(2, 1, '2011-05-02', '2011-05-02', 'pew pew', NULL, NULL, NULL, NULL, NULL, 1, 0),
(3, 1, '2011-05-09', '2011-05-18', 'ka ka', NULL, NULL, NULL, NULL, NULL, 1, 0),
(4, 1, '2011-05-02', NULL, 'pew pew', NULL, NULL, NULL, NULL, NULL, 1, 0),
(5, 1, '2011-05-02', '2011-05-09', 'pew pew 2', NULL, NULL, NULL, NULL, NULL, 1, 0),
(6, 1, '2011-05-17', NULL, 'pew pew 3', NULL, NULL, NULL, NULL, NULL, 1, 0),
(7, 1, '2011-05-03', '2011-05-30', 'pew pew', NULL, NULL, NULL, NULL, NULL, 0, 1),
(8, 1, '2011-05-30', '2011-08-11', 'stuff', NULL, NULL, NULL, NULL, NULL, 1, 1),
(9, 1, '2011-06-07', '2011-06-07', 'test', NULL, NULL, NULL, NULL, NULL, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `procedures`
--

CREATE TABLE IF NOT EXISTS `procedures` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `PID` int(11) DEFAULT NULL,
  `date_performed` date DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `name_type` varchar(40) DEFAULT NULL,
  `name_value` varchar(40) DEFAULT NULL,
  `name_abbrev` varchar(40) DEFAULT NULL,
  `location` varchar(50) DEFAULT NULL,
  `provider_name` int(11) DEFAULT NULL,
  `provider_institution` int(11) DEFAULT NULL,
  `notes_id` int(11) DEFAULT NULL,
  `is_current` tinyint(1) DEFAULT NULL,
  `active` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `actors_procedures` (`PID`),
  KEY `notes_procedures` (`notes_id`),
  KEY `hospital_procedures` (`provider_institution`),
  KEY `physician_procedures` (`provider_name`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `procedures`
--

INSERT INTO `procedures` (`ID`, `PID`, `date_performed`, `name`, `name_type`, `name_value`, `name_abbrev`, `location`, `provider_name`, `provider_institution`, `notes_id`, `is_current`, `active`) VALUES
(1, 1, '2011-06-14', 'Test', NULL, NULL, NULL, 'that one place', NULL, NULL, NULL, 1, 0),
(2, 1, '2011-06-20', 'dfgdfg', NULL, NULL, NULL, 'dfgdfgdfg', NULL, NULL, NULL, 1, 0),
(3, 1, '2011-06-18', 'asdasd', NULL, NULL, NULL, 'sdasd', NULL, NULL, NULL, 1, 0),
(4, 1, '2011-06-07', 'Test', NULL, NULL, NULL, 'test', NULL, NULL, NULL, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `results`
--

CREATE TABLE IF NOT EXISTS `results` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `PID` int(11) DEFAULT NULL,
  `date_performed` date DEFAULT NULL,
  `test_name` varchar(50) DEFAULT NULL,
  `result` varchar(50) DEFAULT NULL,
  `units` varchar(40) DEFAULT NULL,
  `notes_id` int(11) DEFAULT NULL,
  `is_current` tinyint(1) DEFAULT NULL,
  `active` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `actors_results` (`PID`),
  KEY `notes_results` (`notes_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `results`
--

INSERT INTO `results` (`ID`, `PID`, `date_performed`, `test_name`, `result`, `units`, `notes_id`, `is_current`, `active`) VALUES
(1, 1, '2011-06-28', 'dfgdfgdfgdfgdfg', 'fgdfg', 'dfgdfg', NULL, 1, 0),
(2, 1, '2011-06-28', 'sdfsdf', 'sdfsdfsd', 'sdfsdf', NULL, 1, 0),
(3, 1, '2011-06-27', 'test3', 'stuff', 'units', NULL, 1, 1),
(4, 1, '2011-06-27', NULL, NULL, NULL, NULL, 1, 0);

-- --------------------------------------------------------

--
-- Table structure for table `simple_clinical_note`
--

CREATE TABLE IF NOT EXISTS `simple_clinical_note` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `PID` int(11) DEFAULT NULL,
  `date_of_visit` date DEFAULT NULL,
  `visit_type` varchar(50) DEFAULT NULL,
  `visit_location` varchar(50) DEFAULT NULL,
  `specialty` varchar(50) DEFAULT NULL,
  `specialty_value` varchar(50) DEFAULT NULL,
  `provider_institution` int(11) DEFAULT NULL,
  `chief_complaint` varchar(40) DEFAULT NULL,
  `content` varchar(40) DEFAULT NULL,
  `notes_id` int(11) DEFAULT NULL,
  `provider_id` int(11) DEFAULT NULL,
  `is_current` tinyint(1) DEFAULT NULL,
  `active` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `actors_simple_clinical_note` (`PID`),
  KEY `notes_simple_clinical_note` (`notes_id`),
  KEY `physician_simple_clinical_note` (`provider_id`),
  KEY `hospital_simple_clinical_note` (`provider_institution`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `simple_clinical_note`
--

INSERT INTO `simple_clinical_note` (`ID`, `PID`, `date_of_visit`, `visit_type`, `visit_location`, `specialty`, `specialty_value`, `provider_institution`, `chief_complaint`, `content`, `notes_id`, `provider_id`, `is_current`, `active`) VALUES
(1, 1, '2011-06-28', 'xcvxc', 'vxcvxcv', 'xcvxcv', NULL, NULL, 'xcvxcv', 'xcvxcv', NULL, NULL, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `vitals`
--

CREATE TABLE IF NOT EXISTS `vitals` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `PID` int(11) DEFAULT NULL,
  `date_measured` date DEFAULT NULL,
  `name` varchar(40) DEFAULT NULL,
  `name_type` varchar(40) DEFAULT NULL,
  `value` double DEFAULT NULL,
  `unit` varchar(40) DEFAULT NULL,
  `unit_type` varchar(40) DEFAULT NULL,
  `site` varchar(50) DEFAULT NULL,
  `position` varchar(50) DEFAULT NULL,
  `notes_id` int(11) DEFAULT NULL,
  `is_current` tinyint(1) DEFAULT NULL,
  `active` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `actors_vitals` (`PID`),
  KEY `notes_vitals` (`notes_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `vitals`
--


--
-- Constraints for dumped tables
--

--
-- Constraints for table `actors`
--
ALTER TABLE `actors`
  ADD CONSTRAINT `login_actors` FOREIGN KEY (`main_id`) REFERENCES `login` (`ID`);

--
-- Constraints for table `allergys`
--
ALTER TABLE `allergys`
  ADD CONSTRAINT `actors_allergys` FOREIGN KEY (`PID`) REFERENCES `actors` (`ID`),
  ADD CONSTRAINT `notes_allergys` FOREIGN KEY (`notes_id`) REFERENCES `notes` (`ID`),
  ADD CONSTRAINT `physician_allergys` FOREIGN KEY (`diagnosed_by`) REFERENCES `physician` (`ID`);

--
-- Constraints for table `coding_systems_value`
--
ALTER TABLE `coding_systems_value`
  ADD CONSTRAINT `coding_system_coding_systems_value` FOREIGN KEY (`system_id`) REFERENCES `coding_system` (`ID`);

--
-- Constraints for table `department`
--
ALTER TABLE `department`
  ADD CONSTRAINT `hospital_department` FOREIGN KEY (`hospital_id`) REFERENCES `hospital` (`ID`),
  ADD CONSTRAINT `notes_department` FOREIGN KEY (`notes_id`) REFERENCES `notes` (`ID`);

--
-- Constraints for table `dicom`
--
ALTER TABLE `dicom`
  ADD CONSTRAINT `actors_dicom` FOREIGN KEY (`PID`) REFERENCES `actors` (`ID`),
  ADD CONSTRAINT `hospital_dicom` FOREIGN KEY (`hospital_id`) REFERENCES `hospital` (`ID`),
  ADD CONSTRAINT `modality_dicom` FOREIGN KEY (`modality_id`) REFERENCES `modality` (`ID`),
  ADD CONSTRAINT `notes_dicom` FOREIGN KEY (`notes_id`) REFERENCES `notes` (`ID`);

--
-- Constraints for table `files`
--
ALTER TABLE `files`
  ADD CONSTRAINT `actors_files` FOREIGN KEY (`PID`) REFERENCES `actors` (`ID`),
  ADD CONSTRAINT `notes_files` FOREIGN KEY (`notes_id`) REFERENCES `notes` (`ID`);

--
-- Constraints for table `hospital`
--
ALTER TABLE `hospital`
  ADD CONSTRAINT `actors_hospital` FOREIGN KEY (`PID`) REFERENCES `actors` (`ID`),
  ADD CONSTRAINT `notes_hospital` FOREIGN KEY (`notes_id`) REFERENCES `notes` (`ID`);

--
-- Constraints for table `immunization`
--
ALTER TABLE `immunization`
  ADD CONSTRAINT `actors_immunization` FOREIGN KEY (`PID`) REFERENCES `actors` (`ID`),
  ADD CONSTRAINT `notes_immunization` FOREIGN KEY (`notes_id`) REFERENCES `notes` (`ID`),
  ADD CONSTRAINT `physician_immunization` FOREIGN KEY (`administered_by`) REFERENCES `physician` (`ID`);

--
-- Constraints for table `insurance`
--
ALTER TABLE `insurance`
  ADD CONSTRAINT `actors_insurance` FOREIGN KEY (`PID`) REFERENCES `actors` (`ID`),
  ADD CONSTRAINT `insurance_type_insurance` FOREIGN KEY (`type_id`) REFERENCES `insurance_type` (`ID`),
  ADD CONSTRAINT `notes_insurance` FOREIGN KEY (`notes_id`) REFERENCES `notes` (`ID`);

--
-- Constraints for table `measurement`
--
ALTER TABLE `measurement`
  ADD CONSTRAINT `actors_measurement` FOREIGN KEY (`PID`) REFERENCES `actors` (`ID`),
  ADD CONSTRAINT `notes_measurement` FOREIGN KEY (`notes_id`) REFERENCES `notes` (`ID`);

--
-- Constraints for table `medication`
--
ALTER TABLE `medication`
  ADD CONSTRAINT `actors_medication` FOREIGN KEY (`PID`) REFERENCES `actors` (`ID`),
  ADD CONSTRAINT `hospital_medication` FOREIGN KEY (`prescribed_by_institution`) REFERENCES `hospital` (`ID`),
  ADD CONSTRAINT `notes_medication` FOREIGN KEY (`notes_id`) REFERENCES `notes` (`ID`),
  ADD CONSTRAINT `physician_medication` FOREIGN KEY (`prescribed_by_name`) REFERENCES `physician` (`ID`);

--
-- Constraints for table `physician`
--
ALTER TABLE `physician`
  ADD CONSTRAINT `actors_physician` FOREIGN KEY (`PID`) REFERENCES `actors` (`ID`),
  ADD CONSTRAINT `hospital_physician` FOREIGN KEY (`hospital_id`) REFERENCES `hospital` (`ID`),
  ADD CONSTRAINT `notes_physician` FOREIGN KEY (`notes_id`) REFERENCES `notes` (`ID`);

--
-- Constraints for table `problem`
--
ALTER TABLE `problem`
  ADD CONSTRAINT `actors_problem` FOREIGN KEY (`PID`) REFERENCES `actors` (`ID`),
  ADD CONSTRAINT `notes_problem` FOREIGN KEY (`notes_id`) REFERENCES `notes` (`ID`),
  ADD CONSTRAINT `physician_problem` FOREIGN KEY (`diagnosed_by`) REFERENCES `physician` (`ID`);

--
-- Constraints for table `procedures`
--
ALTER TABLE `procedures`
  ADD CONSTRAINT `actors_procedures` FOREIGN KEY (`PID`) REFERENCES `actors` (`ID`),
  ADD CONSTRAINT `hospital_procedures` FOREIGN KEY (`provider_institution`) REFERENCES `hospital` (`ID`),
  ADD CONSTRAINT `notes_procedures` FOREIGN KEY (`notes_id`) REFERENCES `notes` (`ID`),
  ADD CONSTRAINT `physician_procedures` FOREIGN KEY (`provider_name`) REFERENCES `physician` (`ID`);

--
-- Constraints for table `results`
--
ALTER TABLE `results`
  ADD CONSTRAINT `actors_results` FOREIGN KEY (`PID`) REFERENCES `actors` (`ID`),
  ADD CONSTRAINT `notes_results` FOREIGN KEY (`notes_id`) REFERENCES `notes` (`ID`);

--
-- Constraints for table `simple_clinical_note`
--
ALTER TABLE `simple_clinical_note`
  ADD CONSTRAINT `actors_simple_clinical_note` FOREIGN KEY (`PID`) REFERENCES `actors` (`ID`),
  ADD CONSTRAINT `hospital_simple_clinical_note` FOREIGN KEY (`provider_institution`) REFERENCES `hospital` (`ID`),
  ADD CONSTRAINT `notes_simple_clinical_note` FOREIGN KEY (`notes_id`) REFERENCES `notes` (`ID`),
  ADD CONSTRAINT `physician_simple_clinical_note` FOREIGN KEY (`provider_id`) REFERENCES `physician` (`ID`);

--
-- Constraints for table `vitals`
--
ALTER TABLE `vitals`
  ADD CONSTRAINT `actors_vitals` FOREIGN KEY (`PID`) REFERENCES `actors` (`ID`),
  ADD CONSTRAINT `notes_vitals` FOREIGN KEY (`notes_id`) REFERENCES `notes` (`ID`);
