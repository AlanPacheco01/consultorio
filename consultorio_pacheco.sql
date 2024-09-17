-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema consultorio_pacheco
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema consultorio_pacheco
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `consultorio_pacheco` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `consultorio_pacheco` ;

-- -----------------------------------------------------
-- Table `consultorio_pacheco`.`datos_consultorio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `consultorio_pacheco`.`datos_consultorio` (
  `edad` TINYINT NOT NULL,
  `hora_cita` BIGINT NOT NULL,
  `id_paciente` BIGINT NOT NULL AUTO_INCREMENT,
  `núm_ss_paciente` BIGINT NOT NULL,
  `teléfono_emergencia_paciente` BIGINT NOT NULL,
  `teléfono_paciente` BIGINT NOT NULL,
  `contacto_emergencia_paciente` VARCHAR(120) NOT NULL,
  `correo_paciente` VARCHAR(120) NOT NULL,
  `curp_paciente` VARCHAR(120) NOT NULL,
  `dirección_contacto` VARCHAR(120) NOT NULL,
  `engermedades_previas_paciente` VARCHAR(120) NOT NULL,
  `medicamentos_previos_paciente` VARCHAR(120) NOT NULL,
  `motivo_consulta` VARCHAR(120) NOT NULL,
  `nombre_doctor` VARCHAR(120) NOT NULL,
  `paciente` VARCHAR(120) NOT NULL,
  `parentesco_contacto` VARCHAR(120) NOT NULL,
  `tipo_sangre_paciente` VARCHAR(120) NOT NULL,
  `dirección_paciente` VARCHAR(200) NOT NULL,
  `alergias_paciente` VARCHAR(400) NOT NULL,
  PRIMARY KEY (`id_paciente`),
  UNIQUE INDEX `UKge4r5nmh28a3x3e4dli6o9vej` (`hora_cita` ASC) VISIBLE,
  UNIQUE INDEX `UK87rq82hteufd0gjsnpaivhm35` (`núm_ss_paciente` ASC) VISIBLE,
  UNIQUE INDEX `UKgr5ga4h56mawnlto6koawamuk` (`teléfono_emergencia_paciente` ASC) VISIBLE,
  UNIQUE INDEX `UKlf1ow1dlv2qdjvyoluheb7ble` (`teléfono_paciente` ASC) VISIBLE,
  UNIQUE INDEX `UKn8kpkm3ibyhfvxjae68adw6iu` (`correo_paciente` ASC) VISIBLE,
  UNIQUE INDEX `UKsgaqscswpvjde513jwc7c6akt` (`curp_paciente` ASC) VISIBLE)
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `consultorio_pacheco`.`diagnóstico_doctor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `consultorio_pacheco`.`diagnóstico_doctor` (
  `id_diagnóstico` BIGINT NOT NULL AUTO_INCREMENT,
  `diagnóstico` VARCHAR(600) NOT NULL,
  `dieta` VARCHAR(600) NOT NULL,
  `incapacidad` VARCHAR(600) NOT NULL,
  `medicamentos` VARCHAR(600) NOT NULL,
  PRIMARY KEY (`id_diagnóstico`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
