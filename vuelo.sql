-- phpMyAdmin SQL Dump
-- version 4.6.6
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 25-09-2018 a las 19:28:14
-- Versión del servidor: 5.7.17-log
-- Versión de PHP: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `vuelo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_aerolineas`
--

CREATE TABLE `tbl_aerolineas` (
  `id_aerolinea` int(11) NOT NULL,
  `tipo_avion` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tbl_aerolineas`
--

INSERT INTO `tbl_aerolineas` (`id_aerolinea`, `tipo_avion`) VALUES
(1, 'Qantas'),
(2, 'American Airlines'),
(3, 'Cape Air'),
(4, 'United Airlines'),
(5, 'Metrojet');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_asiento`
--

CREATE TABLE `tbl_asiento` (
  `id_asiento` int(11) NOT NULL,
  `numero` char(20) DEFAULT NULL,
  `disponibilidad` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_clientes`
--

CREATE TABLE `tbl_clientes` (
  `id_usuarios` int(11) NOT NULL,
  `n_pasaporte` int(11) DEFAULT NULL,
  `tarj_cred` char(20) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_compra`
--

CREATE TABLE `tbl_compra` (
  `id_compra` int(11) NOT NULL,
  `id_cliente` int(11) DEFAULT NULL,
  `id_vuelo` int(11) DEFAULT NULL,
  `id_asiento` int(11) DEFAULT NULL,
  `precio` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_pais`
--

CREATE TABLE `tbl_pais` (
  `id_pais` int(11) NOT NULL,
  `ciudad_origen` varchar(255) DEFAULT NULL,
  `ciudad_destino` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_vuelo`
--

CREATE TABLE `tbl_vuelo` (
  `id_vuelo` int(11) NOT NULL,
  `id_aerolinea` int(11) DEFAULT NULL,
  `ciudad_origen` varchar(255) DEFAULT NULL,
  `ciudad_destino` varchar(255) DEFAULT NULL,
  `fecha_salida` datetime DEFAULT NULL,
  `fecha_llegada` datetime DEFAULT NULL,
  `id_asiento` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tbl_aerolineas`
--
ALTER TABLE `tbl_aerolineas`
  ADD PRIMARY KEY (`id_aerolinea`);

--
-- Indices de la tabla `tbl_asiento`
--
ALTER TABLE `tbl_asiento`
  ADD PRIMARY KEY (`id_asiento`);

--
-- Indices de la tabla `tbl_clientes`
--
ALTER TABLE `tbl_clientes`
  ADD PRIMARY KEY (`id_usuarios`);

--
-- Indices de la tabla `tbl_compra`
--
ALTER TABLE `tbl_compra`
  ADD PRIMARY KEY (`id_compra`),
  ADD KEY `FK_tbl_compra_tbl_vuelo_id_aerolinea` (`id_vuelo`),
  ADD KEY `FK_tbl_compra_tbl_asiento_id_asiento` (`id_asiento`),
  ADD KEY `FK_tbl_compra_tbl_clientes_id_usuarios` (`id_cliente`);

--
-- Indices de la tabla `tbl_pais`
--
ALTER TABLE `tbl_pais`
  ADD PRIMARY KEY (`id_pais`);

--
-- Indices de la tabla `tbl_vuelo`
--
ALTER TABLE `tbl_vuelo`
  ADD PRIMARY KEY (`id_vuelo`),
  ADD KEY `FK_tbl_vuelo_tbl_aerolineas_id_aerolinea` (`id_aerolinea`),
  ADD KEY `FK_tbl_vuelo_tbl_compra_id_asiento` (`id_asiento`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tbl_aerolineas`
--
ALTER TABLE `tbl_aerolineas`
  MODIFY `id_aerolinea` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT de la tabla `tbl_asiento`
--
ALTER TABLE `tbl_asiento`
  MODIFY `id_asiento` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `tbl_clientes`
--
ALTER TABLE `tbl_clientes`
  MODIFY `id_usuarios` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `tbl_compra`
--
ALTER TABLE `tbl_compra`
  MODIFY `id_compra` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `tbl_pais`
--
ALTER TABLE `tbl_pais`
  MODIFY `id_pais` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `tbl_vuelo`
--
ALTER TABLE `tbl_vuelo`
  MODIFY `id_vuelo` int(11) NOT NULL AUTO_INCREMENT;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `tbl_compra`
--
ALTER TABLE `tbl_compra`
  ADD CONSTRAINT `FK_tbl_compra_tbl_clientes_id_usuarios` FOREIGN KEY (`id_cliente`) REFERENCES `tbl_clientes` (`id_usuarios`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_tbl_compra_tbl_vuelo_id_aerolinea` FOREIGN KEY (`id_vuelo`) REFERENCES `tbl_vuelo` (`id_aerolinea`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `tbl_vuelo`
--
ALTER TABLE `tbl_vuelo`
  ADD CONSTRAINT `FK_tbl_vuelo_tbl_aerolineas_id_aerolinea` FOREIGN KEY (`id_aerolinea`) REFERENCES `tbl_aerolineas` (`id_aerolinea`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_tbl_vuelo_tbl_asiento_id_asiento` FOREIGN KEY (`id_asiento`) REFERENCES `tbl_asiento` (`id_asiento`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_tbl_vuelo_tbl_compra_id_asiento` FOREIGN KEY (`id_asiento`) REFERENCES `tbl_compra` (`id_asiento`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
