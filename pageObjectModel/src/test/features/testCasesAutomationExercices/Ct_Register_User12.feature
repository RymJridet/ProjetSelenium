@carte0
Feature: Ajout des produits dans la carte
  Je veux Ajouter des produits dans la carte
  
Background: 
   Given saisir url d automation exercice "https://automationexercise.com/"
   Then Verifier que Home page est visible et le couleur orange "rgba(255, 165, 0, 1)"
@carte1
  Scenario: Ajouter des produits comme utilisateur
    When  Cliquer sur boutton Products
    And   Survolez le premier produit 
    And   Cliquer sur Add to cart pour le premier produit 
    And   Cliquer sur boutton Continue Shopping
    And   Survolez le deuxième produit 
    And   Cliquer sur Add to cart le deuxième produit 
    And   Cliquer sur boutton View Cart 
    Then  Verifier que les deux produits sont ajoutés à la carte
    And   Verifier leur prix "Rs. 500", "Rs. 400"
    And   Verifier leur quantites "1"
    And   Verifier leur total prix "Rs. 500", "Rs. 400"

 