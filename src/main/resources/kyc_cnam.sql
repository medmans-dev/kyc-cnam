CREATE TABLE `historique_card_person_seq` (
	`next_val` BIGINT(20) NULL DEFAULT NULL
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
;

CREATE TABLE `card_person` (
	`personal_number` VARCHAR(255) NOT NULL COLLATE 'latin1_swedish_ci',
	`card_number` VARCHAR(255) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	`date_of_birth` DATE NULL DEFAULT NULL,
	`datetime` DATETIME NULL DEFAULT NULL,
	`expiry_date` DATE NULL DEFAULT NULL,
	`father_first_name` VARCHAR(255) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	`first_name` VARCHAR(255) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	`last_name` VARCHAR(255) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	`card_option` VARCHAR(255) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	`place_of_birth` VARCHAR(255) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	`sex` VARCHAR(255) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	PRIMARY KEY (`personal_number`) USING BTREE
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
;

CREATE TABLE `historique_card_person` (
	`id` BIGINT(20) NOT NULL,
	`card_number` VARCHAR(255) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	`date_of_birth` DATE NULL DEFAULT NULL,
	`datetime` DATETIME NULL DEFAULT NULL,
	`entry_date` DATETIME NULL DEFAULT NULL,
	`expiry_date` DATE NULL DEFAULT NULL,
	`father_first_name` VARCHAR(255) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	`first_name` VARCHAR(255) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	`last_name` VARCHAR(255) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	`card_option` VARCHAR(255) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	`personal_number` VARCHAR(10) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	`place_of_birth` VARCHAR(255) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	`sex` VARCHAR(255) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	PRIMARY KEY (`id`) USING BTREE
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
;

CREATE TABLE `personne` (
	`nni` VARCHAR(255) NOT NULL COLLATE 'latin1_swedish_ci',
	`date_naissance` VARCHAR(255) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	`etat` VARCHAR(255) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	`lieu_naissance` VARCHAR(255) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	`matricule_cnam` VARCHAR(255) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	`nom` VARCHAR(255) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	`pere_prenom` VARCHAR(255) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	`photo` VARCHAR(255) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	`photo_array` TINYBLOB NULL DEFAULT NULL,
	`prenom` VARCHAR(255) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	`sexe` VARCHAR(255) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	`statut` VARCHAR(255) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	`telephone` VARCHAR(255) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	`pere_nni` VARCHAR(255) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	PRIMARY KEY (`nni`) USING BTREE,
	INDEX `FK6c9eryl02h0che2qcn5726ixf` (`pere_nni`) USING BTREE
)
COLLATE='latin1_swedish_ci'
ENGINE=MyISAM
;
