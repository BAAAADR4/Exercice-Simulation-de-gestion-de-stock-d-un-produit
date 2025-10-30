# Exercice-Simulation-de-gestion-de-stock-d-un-produit
Question 1
-On stocke (Quantité de produits reçue) 
type est variable
son rôle est de savoir combien de produits reçu  au stock par jour
-On stocke (Quantité de produits vendue) 
type variable
son rôle est de savoir combien de produits sont vendus par jour
-On stocke (Le stock actuel )
type variable
son rôle est de savoir combien il  reste dans le stock par jour
-On stocke (ATTENTION)
type chaine de caractère
son rôle est de donner un message d'alert
-On stocke (Erreur)
type chaine de caractère
son rôle est de donner un message d'erreur
-on stocke (jour)
type variable
son rôle c'est de savoir le nombre de jour
-On stocke (Quel est le stock initial)
type variable
son rôle est de savoir combien il ya dans le stock initial
Question 2
-Pour le message d'erreur et attention on va utiliser la structure conditionnelle 
son rôle est d'imposer une condition
Ce structure de condition est adapté à ce rôle car il va imposer deux  conditions , la première est si le stock est inférieur ou égal au seuil d’alerte, il affiche un message d’alerte
et la deuxième est si le stock devient négatif, il affiche un message d’erreur.
Question 3
Algorithme :  Simulation de gestion de stock d’un produit
Variables
 le stock initial , le seuil d'alerte , jours doit durer la simulation , produits reçue , produits vendue , Le stock actuel , jour : entier
 ERREUR , ATTENTION : chaine de caractères
Début
Affichier ("Quel est le stock initial ?")
lire "le stock initial"
affichier ("Quel est  le seuil d'alerte ?)
lire "le seuil d'alert"
affichier ("Combien de jours doit durer la simulation ?") 
lire "le nombre de jours"

si (le stock <= seuil d'alert )
   affichier("ATTENTION : le stock est sous le seuil d'alerte !")
else (le stock < 0)
    affichier("ERREUR : le stock est négatif. Simulation arrêtée.")
    
affichier("Jour 1")
affichier("------")
affichier("Quantité de produits reçue ?")
lire(Quantité de produits reçue)
affichier("Quantité de produits vendue ?")
lire(Quantité de produits vendue)
affichier("Le stock actuel est de : ")
lire(Le stock actuel)

affichier("Jour 2")
affichier("------")
affichier("Quantité de produits reçue ?")
lire(Quantité de produits reçue)
affichier("Quantité de produits vendue ?")
lire(Quantité de produits vendue)
affichier("Le stock actuel est de : ")
lire(Le stock actuel)

affichier("Jour 3")
affichier("------")
affichier("Quantité de produits reçue ?")
lire(Quantité de produits reçue)
affichier("Quantité de produits vendue ?")
lire(Quantité de produits vendue)
affichier("Le stock actuel est de : ")
lire(Le stock actuel)


   

