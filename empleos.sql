-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 05-04-2018 a las 07:09:31
-- Versión del servidor: 10.1.26-MariaDB
-- Versión de PHP: 7.1.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `empleos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `carateristicas`
--

CREATE TABLE `carateristicas` (
  `idCarateristicas` int(11) NOT NULL,
  `descripcion` varchar(45) NOT NULL,
  `grado` varchar(45) NOT NULL,
  `padre` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `carateristicas`
--

INSERT INTO `carateristicas` (`idCarateristicas`, `descripcion`, `grado`, `padre`) VALUES
(1, 'Programador', 'Bachiller', 0),
(2, 'Analista', 'Licenciatura', 0),
(3, 'Bases de Datos', 'Licenciatura', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `carateristicasoferente`
--

CREATE TABLE `carateristicasoferente` (
  `id` int(11) NOT NULL,
  `Carateristicas_idCarateristicas` int(11) NOT NULL,
  `Oferente_idOferente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `carateristicaspuesto`
--

CREATE TABLE `carateristicaspuesto` (
  `id` int(11) NOT NULL,
  `Carateristicas_idCarateristicas` int(11) NOT NULL,
  `Puesto_idPuesto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `carateristicaspuesto`
--

INSERT INTO `carateristicaspuesto` (`id`, `Carateristicas_idCarateristicas`, `Puesto_idPuesto`) VALUES
(1, 1, 1),
(2, 1, 2),
(3, 3, 4),
(4, 2, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empresa`
--

CREATE TABLE `empresa` (
  `idEmpresa` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `lactitud` varchar(45) NOT NULL,
  `longitud` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `telefono` varchar(45) NOT NULL,
  `descripcion` varchar(45) NOT NULL,
  `Aprobada` varchar(45) NOT NULL,
  `Usuario_idUsuario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `empresa`
--

INSERT INTO `empresa` (`idEmpresa`, `nombre`, `lactitud`, `longitud`, `email`, `telefono`, `descripcion`, `Aprobada`, `Usuario_idUsuario`) VALUES
(2, 'Daniel', 'lactitud', 'longitud', 'email', 'telefono', 'descripcion', 'aprobada', 1),
(3, 'Daniel', '123', '123', 'daniel', '1234', 'yo soy quien soy ', 'si', 2),
(5, 'Daniel', 'asdfa', 'asdfa', 'sdfasd', 'asdfa', 'asdf', '1', 3),
(6, 'Ama', '123', '123', 'demc099@gmail.com', '1231', '12131', '1', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `oferente`
--

CREATE TABLE `oferente` (
  `idOferente` int(11) NOT NULL,
  `cedula` varchar(45) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `primerApellido` varchar(45) NOT NULL,
  `nacionalidad` varchar(45) NOT NULL,
  `telefono` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `lactitud` varchar(45) NOT NULL,
  `longitud` varchar(45) NOT NULL,
  `contratado` int(11) NOT NULL,
  `Usuario_idUsuario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='	';

--
-- Volcado de datos para la tabla `oferente`
--

INSERT INTO `oferente` (`idOferente`, `cedula`, `nombre`, `primerApellido`, `nacionalidad`, `telefono`, `email`, `lactitud`, `longitud`, `contratado`, `Usuario_idUsuario`) VALUES
(2, '11', 'Daniel', 'Mora', 'Costarricense', '83327258', 'nojoda', '123', '321', 1, 1),
(3, '11', 'Daniel', 'Mora', 'Costarricense', '83327258', 'nojoda', '123', '321', 1, 1),
(4, '1234', '1234', '1234', '1234', '1234', '1234', '1234', '1234', 9, 2),
(5, '30420700', 'Andres', 'Mora', 'Costa', '83838383', 'demc099@gmail.com', '123456789', '987654321', 1, 5),
(6, '114730950', 'Daniel ', 'Mora', 'Nicaraguense', '23123', 'demc099@gmail.com', '23423', '23423', 1, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `puesto`
--

CREATE TABLE `puesto` (
  `idPuesto` int(11) NOT NULL,
  `descripcion` varchar(45) NOT NULL,
  `sueldo` varchar(45) NOT NULL,
  `tipo` varchar(45) NOT NULL,
  `disponible` int(11) NOT NULL,
  `Empresa_idEmpresa` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `puesto`
--

INSERT INTO `puesto` (`idPuesto`, `descripcion`, `sueldo`, `tipo`, `disponible`, `Empresa_idEmpresa`) VALUES
(1, 'FullStack ', '1000000', 'desarrollador', 1, 3),
(2, 'Java Developer', '700000', 'Desarrollador', 1, 5),
(3, 'Analista de Sistemas', '1500000', 'Analista', 1, 3),
(4, 'Administrador de Bases de datos', '1750000', 'Bases de datos', 1, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `puestooferente`
--

CREATE TABLE `puestooferente` (
  `id` int(11) NOT NULL,
  `Puesto_idPuesto` int(11) NOT NULL,
  `Oferente_idOferente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `idUsuario` int(11) NOT NULL,
  `userName` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `tipo` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`idUsuario`, `userName`, `password`, `tipo`) VALUES
(1, 'Daniel', '12345', '1'),
(2, 'Maria', 'mariamora', '1'),
(3, 'Daniel', '123', '123'),
(5, 'gray', '12345', '1'),
(6, 'gray', '12345', '1'),
(7, 'Daniel', '123', '123'),
(8, 'Daniel', '123', '123'),
(9, 'Daniel', '123', '123'),
(10, 'demc099', 'mariamora', 'administrador'),
(11, 'amcmcmc', 'mimamamedicehola', '2'),
(12, 'asd', 'asdfasd', 'asdf');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `carateristicas`
--
ALTER TABLE `carateristicas`
  ADD PRIMARY KEY (`idCarateristicas`);

--
-- Indices de la tabla `carateristicasoferente`
--
ALTER TABLE `carateristicasoferente`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_Carateristicas_has_Oferente_Oferente1_idx` (`Oferente_idOferente`),
  ADD KEY `fk_Carateristicas_has_Oferente_Carateristicas1_idx` (`Carateristicas_idCarateristicas`);

--
-- Indices de la tabla `carateristicaspuesto`
--
ALTER TABLE `carateristicaspuesto`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_Carateristicas_has_Puesto_Puesto1_idx` (`Puesto_idPuesto`),
  ADD KEY `fk_Carateristicas_has_Puesto_Carateristicas1_idx` (`Carateristicas_idCarateristicas`);

--
-- Indices de la tabla `empresa`
--
ALTER TABLE `empresa`
  ADD PRIMARY KEY (`idEmpresa`),
  ADD KEY `fk_Empresa_Usuario_idx` (`Usuario_idUsuario`);

--
-- Indices de la tabla `oferente`
--
ALTER TABLE `oferente`
  ADD PRIMARY KEY (`idOferente`),
  ADD KEY `fk_Oferente_Usuario1_idx` (`Usuario_idUsuario`);

--
-- Indices de la tabla `puesto`
--
ALTER TABLE `puesto`
  ADD PRIMARY KEY (`idPuesto`),
  ADD KEY `fk_Puesto_Empresa1_idx` (`Empresa_idEmpresa`);

--
-- Indices de la tabla `puestooferente`
--
ALTER TABLE `puestooferente`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_Puesto_has_Oferente_Oferente1_idx` (`Oferente_idOferente`),
  ADD KEY `fk_Puesto_has_Oferente_Puesto1_idx` (`Puesto_idPuesto`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`idUsuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `carateristicas`
--
ALTER TABLE `carateristicas`
  MODIFY `idCarateristicas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `carateristicasoferente`
--
ALTER TABLE `carateristicasoferente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `carateristicaspuesto`
--
ALTER TABLE `carateristicaspuesto`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `empresa`
--
ALTER TABLE `empresa`
  MODIFY `idEmpresa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `oferente`
--
ALTER TABLE `oferente`
  MODIFY `idOferente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `puesto`
--
ALTER TABLE `puesto`
  MODIFY `idPuesto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `puestooferente`
--
ALTER TABLE `puestooferente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `idUsuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `carateristicasoferente`
--
ALTER TABLE `carateristicasoferente`
  ADD CONSTRAINT `fk_Carateristicas_has_Oferente_Carateristicas1` FOREIGN KEY (`Carateristicas_idCarateristicas`) REFERENCES `carateristicas` (`idCarateristicas`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Carateristicas_has_Oferente_Oferente1` FOREIGN KEY (`Oferente_idOferente`) REFERENCES `oferente` (`idOferente`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `carateristicaspuesto`
--
ALTER TABLE `carateristicaspuesto`
  ADD CONSTRAINT `fk_Carateristicas_has_Puesto_Carateristicas1` FOREIGN KEY (`Carateristicas_idCarateristicas`) REFERENCES `carateristicas` (`idCarateristicas`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Carateristicas_has_Puesto_Puesto1` FOREIGN KEY (`Puesto_idPuesto`) REFERENCES `puesto` (`idPuesto`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `empresa`
--
ALTER TABLE `empresa`
  ADD CONSTRAINT `fk_Empresa_Usuario` FOREIGN KEY (`Usuario_idUsuario`) REFERENCES `usuario` (`idUsuario`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `oferente`
--
ALTER TABLE `oferente`
  ADD CONSTRAINT `fk_Oferente_Usuario1` FOREIGN KEY (`Usuario_idUsuario`) REFERENCES `usuario` (`idUsuario`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `puesto`
--
ALTER TABLE `puesto`
  ADD CONSTRAINT `fk_Puesto_Empresa1` FOREIGN KEY (`Empresa_idEmpresa`) REFERENCES `empresa` (`idEmpresa`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `puestooferente`
--
ALTER TABLE `puestooferente`
  ADD CONSTRAINT `fk_Puesto_has_Oferente_Oferente1` FOREIGN KEY (`Oferente_idOferente`) REFERENCES `oferente` (`idOferente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Puesto_has_Oferente_Puesto1` FOREIGN KEY (`Puesto_idPuesto`) REFERENCES `puesto` (`idPuesto`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
