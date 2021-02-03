# Projet1 : Competitions Sportives

## Auteur

COULIBALY Ivette

ADALA Siwar

## Description du projet

#### Version1

    Ce projet consistait à implementer des compétitions sportives ( Ligue ou Tournoi) permettant d' organiser des matchs et de les jouer entre compétiteurs. 
    Chacun des types de ces compétitions a des caractériques qui lui sont propres.

    Pour la ligue, les competiteurs jouent en matchs aller/retour et à l'issue des matchs, le vainqueur sera le competiteur ayant eu le plus grand nombre de victoires.

    Pour le tournoi, apres chaque match, le perdant est directement eliminé de la competition et les gagnants du match participeront au tour prochain jusqu'à ce qu'il ne reste qu'un seul competiteur qui sera declaré Vainqueur de la competition.

#### Version2

    La version 2 de ce projet consitait à rajouter à la premiere version, un autre type de competiton Master affronter  les  comp ́etiteurs  en  deux  phases.
    La competition commence par une phase de poules à l’issue de laquelle certains competiteurs sont selectionnés pour disputer la phase finale du tournoi.  Les poules sont organisées sour forme de League tandis que la phase finale se déroule sous la forme d’un tournoi à ́elimination directe.

#### Version3

    La version 3 de ce projet consistait  à rendre les competions si populaire que les medias et les parieurs s'y interesseraient. 
    Des journalistes peuvent donc assister aux competitions et diffuser les résultats des matchs.
    Les bookmakers, quant à eux, font évoluer les cotes des compétiteurs en fonction des résultats des matchs de la compétition.
    L'evolution des cotes se fait en fonction des victoires (diminution de la cote) et des defaites( augmentation de la cote).
    Lorsqu’unjournaliste ou un bookmaker vient assister `a une comp ́etition, il assiste `a tous les matchs de cette dernière.

## Objectifs atteints

  - Creation des compétition de types League et Tournament héritant de la classe Competition 
  - Creation d'une classe Competitor qui cree un compétiteur caractérisée par son nom
  - Creation d'une classe Match qui joue un match entr 2 competiteurs et defini le gagnant et le perdant
  - Tests
  - Execution du MainV1 -- la première version
  - Execution du MainV2 -- la deuxième version
  - Execution du MainV3 -- la troixième version


### Exemples d'exécution

  ````bash 
  
    ---------------------------BEGINNING OF THE COMPETITION---------------------------
    Enter a number between 0 and 2 NB: (0 ==> League Competition ; 1 ==> Tournament Competition ; 2 ==> Master Competition) 

    2
    Give numbers of competitors: (The number must be a multiple of 2)
    8
    Enter 8 names of competitors: 
    Juch
    Bouba
    Eliot
    Mamadou
    Junior
    Ken
    August        
    Chinois
    Choose a strategy: first ==> FIRST ; first two ==> FIRSTTWO ; random ==> RANDOM ; last ==> LAST
    RANDOM
    
    The results of the competition: 
    -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
        Pool 1
    The results of the competition: 
    Juch vs Eliot --> Juch wins!
    Notifications
    Victoire de Juch face à Eliot
    Victoire de Juch (cote 1 ) face à Eliot (cote 1 ). La cote de Juch passe à 1, celle de Eliot à 2.
    Juch vs Junior --> Juch wins!
    Notifications
    Victoire de Juch face à Junior
    Victoire de Juch (cote 1 ) face à Junior (cote 1 ). La cote de Juch passe à 1, celle de Junior à 2.
    Juch vs August --> August wins!
    Notifications
    Victoire de August face à Juch
    Victoire de August (cote 1 ) face à Juch (cote 1 ). La cote de August passe à 1, celle de Juch à 2.
    Eliot vs Juch --> Eliot wins!
    Notifications
    Victoire de Eliot face à Juch
    Victoire de Eliot (cote 2 ) face à Juch (cote 2 ). La cote de Eliot passe à 1, celle de Juch à 3.
    Eliot vs Junior --> Eliot wins!
    Notifications
    Victoire de Eliot face à Junior
    Victoire de Eliot (cote 1 ) face à Junior (cote 2 ). La cote de Eliot passe à 1, celle de Junior à 3.
    Eliot vs August --> August wins!
    Notifications
    Victoire de August face à Eliot
    Victoire de August (cote 1 ) face à Eliot (cote 1 ). La cote de August passe à 1, celle de Eliot à 2.
    Junior vs Juch --> Junior wins!
    Notifications
    Victoire de Junior face à Juch
    Victoire de Junior (cote 3 ) face à Juch (cote 3 ). La cote de Junior passe à 2, celle de Juch à 4.
    Junior vs Eliot --> Junior wins!
    Notifications
    Victoire de Junior face à Eliot
    Victoire de Junior (cote 2 ) face à Eliot (cote 2 ). La cote de Junior passe à 1, celle de Eliot à 3.
    Junior vs August --> August wins!
    Notifications
    Victoire de August face à Junior
    Victoire de August (cote 1 ) face à Junior (cote 1 ). La cote de August passe à 1, celle de Junior à 2.
    August vs Juch --> August wins!
    Notifications
    Victoire de August face à Juch
    Victoire de August (cote 1 ) face à Juch (cote 4 ). La cote de August passe à 1, celle de Juch à 5.
    August vs Eliot --> Eliot wins!
    Notifications
    Victoire de Eliot face à August
    Victoire de Eliot (cote 3 ) face à August (cote 1 ). La cote de Eliot passe à 2, celle de August à 2.
    August vs Junior --> Junior wins!
    Notifications
    Victoire de Junior face à August
    Victoire de Junior (cote 2 ) face à August (cote 2 ). La cote de Junior passe à 1, celle de August à 3.
    
    August - 4
    Eliot - 3
    Junior - 3
    Juch - 2

    August
    Eliot
    Junior
    Juch
    -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
    -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
        Pool 2
    The results of the competition: 
    Bouba vs Mamadou --> Mamadou wins!
    Notifications
    Victoire de Mamadou face à Bouba
    Victoire de Mamadou (cote 1 ) face à Bouba (cote 1 ). La cote de Mamadou passe à 1, celle de Bouba à 2.
    Bouba vs Ken --> Bouba wins!
    Notifications
    Victoire de Bouba face à Ken
    Victoire de Bouba (cote 2 ) face à Ken (cote 1 ). La cote de Bouba passe à 1, celle de Ken à 2.
    Bouba vs Chinois --> Chinois wins!
    Notifications
    Victoire de Chinois face à Bouba
    Victoire de Chinois (cote 1 ) face à Bouba (cote 1 ). La cote de Chinois passe à 1, celle de Bouba à 2.
    Mamadou vs Bouba --> Mamadou wins!
    Notifications
    Victoire de Mamadou face à Bouba
    Victoire de Mamadou (cote 1 ) face à Bouba (cote 2 ). La cote de Mamadou passe à 1, celle de Bouba à 3.
    Mamadou vs Ken --> Ken wins!
    Notifications
    Victoire de Ken face à Mamadou
    Victoire de Ken (cote 2 ) face à Mamadou (cote 1 ). La cote de Ken passe à 1, celle de Mamadou à 2.
    Mamadou vs Chinois --> Chinois wins!
    Notifications
    Victoire de Chinois face à Mamadou
    Victoire de Chinois (cote 1 ) face à Mamadou (cote 2 ). La cote de Chinois passe à 1, celle de Mamadou à 3.
    Ken vs Bouba --> Ken wins!
    Notifications
    Victoire de Ken face à Bouba
    Victoire de Ken (cote 1 ) face à Bouba (cote 3 ). La cote de Ken passe à 1, celle de Bouba à 4.
    Ken vs Mamadou --> Ken wins!
    Notifications
    Victoire de Ken face à Mamadou
    Victoire de Ken (cote 1 ) face à Mamadou (cote 3 ). La cote de Ken passe à 1, celle de Mamadou à 4.
    Ken vs Chinois --> Ken wins!
    Notifications
    Victoire de Ken face à Chinois
    Victoire de Ken (cote 1 ) face à Chinois (cote 1 ). La cote de Ken passe à 1, celle de Chinois à 2.
    Chinois vs Bouba --> Bouba wins!
    Notifications
    Victoire de Bouba face à Chinois
    Victoire de Bouba (cote 4 ) face à Chinois (cote 2 ). La cote de Bouba passe à 3, celle de Chinois à 3.
    Chinois vs Mamadou --> Mamadou wins!
    Notifications
    Victoire de Mamadou face à Chinois
    Victoire de Mamadou (cote 4 ) face à Chinois (cote 3 ). La cote de Mamadou passe à 3, celle de Chinois à 4.
    Chinois vs Ken --> Ken wins!
    Notifications
    Victoire de Ken face à Chinois
    Victoire de Ken (cote 1 ) face à Chinois (cote 4 ). La cote de Ken passe à 1, celle de Chinois à 5.
    
    Ken - 5
    Mamadou - 3
    Bouba - 2
    Chinois - 2

    Ken
    Mamadou
    Bouba
    Chinois
    -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
    Un element choisi par hasard est ajoute :Eliot - 3
    Un element choisi par hasard est ajoute :Mamadou - 3
    selectioned [Eliot - 3, Mamadou - 3]
    Eliot
    Mamadou
        Final Tournament   
    The results of the competition: 
    Obsever size in tournement => 2
    Eliot vs Mamadou --> Mamadou wins!
    Notifications 
    Victoire de Mamadou face à Eliot
    Victoire de Mamadou (cote 3 ) face à Eliot (cote 2 ). La cote de Mamadou passe à 2, celle de Eliot à 3.
    
    Mamadou - 4
    Eliot - 3

  ```

     
    
### Objectifs non atteints

    
## Comment générer la documentation ?

Pour générer la documentation du projet, placez vous dans le dossier source contenant le projet (adala-coulibaly-coo-projet/projet1) et exécutez les commandes suivantes:

    make doc

## Comment compiler les classes du projet ?

Pour compiler les classes du projet, placez vous dans le dossier source contenant le projet (adala-coulibaly-coo-projet/projet1) et exécutez les commandes suivantes:

Pour toutes les classes en meme temps :
    Les classes: Competition, Competitor, Match, League, Tornament, Master, Observable, Observer, Journalist, Gambler, MainV1, MainV2, MainV3

      make run
             

## Comment compiler puis exécuter les tests ?

Pour compiler et exécuter les tests du projet, placez vous dans le dossier source contenant le projet (adala-coulibaly-coo-projet/projet1) et executez les commandes suivantes:

Pour toutes les classes de test en même temps :

      make TestAll

Pour Competitor:

	 make TestCompetitor

Pour Match:

    make TestMatch

Pour Competition:

    make TestCompetition
    
Pour League:

    make TestLeague

Pour Tournament:

    make TestTournament
    
Pour Master:

    make TestMaster


## Comment crééer le jar ex�cutable ?
Pour creer le jar exécutable , placez vous dans le dossier source contenant le projet (adala-coulibaly-coo-projet/projet1) et exécutez les commandes suivantes:

    make jarGame

  puis

    make Execute

    L'execution du jar ne se passe pas bien car le main ne fonctionne pas.

## Comment tester l'exécution du programme ?

Pour tester l'exécution du programme, placez vous dans le dossier source contenant le projet (adala-coulibaly-coo-projet/projet1) et exécutez la commande suivante (en vous assurant d'avoir fait "make compile" avant ) :
	
Pour la version1:

    make mainV1
    
Pour la version2:

    make mainV2

Pour la version3:

    make mainV3

puis rentrez les instructions qui vous sauront demander .


## Comment supprimer tous les fichiers créés lors de la compilation ?

Pour supprimer tous les fichiers .class , les fichiers .class des tests , les fichiers lors de la génération de la documentation, le jar créé, clean le terminal , placez vous dans le dossier source contenant le projet (adala-coulibaly-coo-projet/projet1) et exécutez la commande suivante:

    make clean
