# TP Qualité Logiciel

###Binôme:
	- Ivette Coulibaly
	- Siwar Adala
	

###2 Présentation globaledu projet
####2.1 Utilité du projet
Le projet est à propos d'une application de gestion de compétitions sportives. Une compétition (Competition) peut être soit une ligue (League), soit un tournoi (Tournament) ou bien un master (Master) qui est un mélange des deux derniers types de compétitions.
L'application qu'on a créé pour ce projet organise les matchs au sein des compétitions et donne les compétiteurs ordonnés selon leurs scores. 

###### Pour une ligue:
* Un compétiteur joue 2 fois avec les autres compétiteurs

		Exemple:
		Si on a 5 joueurs, on aura 20 matchs
	
* Il n'y a pas d'élimination de compétiteurs
	
###### Pour un tournoi:
* Une fois un compétiteur perd un match, il est éliminé du 	tournoi donc il ne peut plus continuer à jouer des matchs, 	mais il apparaît quand-même dans le ranking à la fin du 	tournoi
	
###### Pour un master:
* Les compétiteurs sont divisés aléatoirement en des poules 
* Chaque poule représente une ligue
* Après avoir finis toutes les ligues, des compétiteurs  	sélectionnés de chaque poule selon une méthoode de 	sélection que l'utilisateur choisit
* Ces compétiteurs sélectionnés joue un tournoi entre eux 	et les compétiteurs du tournoi sont affichés ordonnés selon 	leurs scores.


###### Comment lancer?
Pour lancer le projet il faut exécuter la classe MainV3

Concernant le lancement du logiciel, on se rend compte que ce n'est pas la maière optimale d'exécution. On aurait pu créer un fichier exécutable .exe qui lance le logiciel en cliquant dessus.

###### Entrées / Sorties :
* **Entrées**

	- Nombre et noms des compétiteurs
	- Le type de compétition
		- si c'est un master, on choisie la méthode de sélection 		des poules

* **Sorties**

	- La répartition des compétiteurs en poules (si c'est un master)
	- Le résultat de la compétition jouée


####2.2 Description du projet

##### Y-a-t-il un readme ?
Oui il y a un readme. Il est pertinent et à jour.

##### Y-a-t-il une documentation ?
Toutes les classes sont documentées, mais la documentation n'explique pas comment installer le logiciel

Le lancement du programme est détaillé dans le readme


#### 3 Historique du logiciel

##### 3.1 Analyse du git

* Nombre de contributeurs: 2 
* Ils ont contribué de façon équilibrée sur le projet et dans le temps.

* Le projet n'est plus actif depuis le 21 décembre.

* Il existe une seule branche pour ce projet qui est la branche "master"

* Oui il y eu des pull requests. A chaque fois que l'une de nous faisait des changements elle demandait l'autre s'il a pu faire pull et si les changements étaient valides.


#### 4 Architecture logicielle
##### 4.1 Utilisation de bibliothèques extérieures

* Bibliothèques extérieures utilisées:
	
	- java.Math
	- java.util
	- java.io
	- org.junit (pour es tests)

* Maven n'a pas été utilisé dans ce projet
* Après analyse des dépendances, on trouve qu'aucune dépendance n'est inutile
* On n'a pas utilisé de ORM ni de bibliothèques graphiques pour ce projet (on n'a pas trop bien compris la question)


##### 4.2 Organisation en paquetages
* Nombre de paquetages: 5

	- competition1
		- observer
		- strategy
		- partition
	- io
		
* Les paquetages observer, strategy et partition dependent du paquetage competition1.
* Paquetages en couche ???
* Cycles ???

* Dans le projet on a au plus 2 hierarchie de paquetage. 

	- Pour le paquetage competition1 , on a 3 couches filles
	- Pour le paquetage strategy , on a 4 couches filles
* le paquetage io est une hirarchie parallele au paquetage competition1. 
*Non, il n'y a pas de paquetage contenant un seul h


*D'apres l'analyse des noms des paquetages, les noms de paqueteages nous apprennent des choses sur les designs patterns utilisés.
Pas d'exixtence d'un lien avec une base de données car on a pas utilié de base de données.
De facon generale, le nom de paquetages nous renseigne sur le type de design utilisé.
Avec le paquetage observer, on sait que c'est un design observer et qu'il y'aura des observers.
Pareil pour pour le paquetage strategy.

#### 4.3 Répartition des classes dans les paquetages
* Le nomre minimum de classe par paquetage est: 1
  Le nombre maximum de classe par paquetage est: 13

Le nombre total de classes est: 25

	- ob: 3
	- stra: 6
	- par:2
	- comp:13
	- io: 1

La plupart des classes sont dans le paquetage competition1.
Oui, le paquetage io contient une classe.

La classe competition a 3 classes filles qui sont League, Tournament et Master. 
La classe strategy a 4 classes filles  qui sont StrategyFrist, StrategyFrist2, StrategyRandom et StrategyRepechage.

Dans le paquetage competition1, on a une faible cohesion , car il y a une grande variété d'action en les classes et les sous-paquetages.

Dans le paquetage competition1, on a un couplage élévé, car en changeant quelque chose de mageur dans une classe, on entrainera le changement dans les autres classes. 

### 5 Analyse approfondie
#### 5.1 Tests

* Le nombre de tests est: 23
* Le nombre de classes de tests est: 11

* On en deduit une mauvaise structuration des tests. Pas totalement fini.

La couvertures des tests: Siwar
LE pourcentage de code couvert par les tests: 















	