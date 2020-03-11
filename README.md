# Scrabble

Projet JAVA - Scrabble :

Vue :

Plateau 
Différents joueurs + leur jeu (jeu personnel visible, jeu des autres cachés)--------> NB DE JOUEURS ?
Fenêtre de points ?
Historique des mots joués + points obtenus



Structures données :

Plateau -> tableau ? 
jeu des joueurs -> tableau ? vecteur ? 
Mots possibles -> Dictionnaire (Hashtable)
Calcul des points + case spéciales à répertorier directement dans le tableau du plateau -> plateau est un tableau de couple (Char,Multiplicateur)
Alphabet des lettres jouables -> Couple (Char, int)



Méthodes :

proposer_mot
verifier_mot 
voir_mots_possibles (à la fin, bonus)
distribuer
piocher
calcul_des_points
changer_une_lettre


Classes :
Modele 
Vue
Controleur