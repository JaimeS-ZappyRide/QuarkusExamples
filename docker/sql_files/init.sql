Create DATABASE IF NOT EXISTS `pge_backend`;
use pge_backend;
CREATE TABLE IF NOT EXISTS  `pge_evc_feedback_messages` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `uuid` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `client_ip` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `current_path` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `goal` text COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `goal_achieved` tinyint(1) DEFAULT NULL,
  `would_recommend` tinyint(1) DEFAULT NULL,
  `suggestions` text COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=293 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
Create DATABASE IF NOT EXISTS `duquesne_backend`;
use duquesne_backend;
CREATE TABLE IF NOT EXISTS `duquesne_evc_feedback_messages` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `uuid` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `client_ip` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `current_path` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `goal` text COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `goal_achieved` tinyint(1) DEFAULT NULL,
  `would_recommend` tinyint(1) DEFAULT NULL,
  `suggestions` text COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci