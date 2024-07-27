#Author: SalmaDag
Feature: Ajout Panier
Scenario: Steps verif Panier
Given utilisateur est sur la page de produit
When utilisateur clique sur le bouton ajouter au panier puis clique sur le panier
Then le produit est dans le panier et contient le nom de "Mi Temperature and Humidity Monitor Pro"
