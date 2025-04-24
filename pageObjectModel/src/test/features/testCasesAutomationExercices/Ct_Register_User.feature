@Register
Feature: creation compte
  je veux creer un compte utilisateur

@RegisterUser
  Scenario: creation compte utilisateur
    Given saisir url d automation exercice "https://automationexercise.com/"
    Then Verifier que Home page est visible et le couleur orange "rgba(255, 165, 0, 1)" 
    When Cliquer sur Signup / Login boutton
    Then Verifier que New User Signup "New User Signup!" est visible
    When Entrer Name "Rima" and email address "riiimaa199200@gmail.com"
    And Cliquer Signup boutton
    Then Verifier que ENTER ACCOUNT INFORMATION "ENTER ACCOUNT INFORMATION" est visible
    When Remplir de details: Title "Mr",Name "Rima",  email address "riiimaa199200@gmail.com", Password "Jr22/11/1996", Date of birth : date = "22", month = "November", year = "1996"
    And Select checkbox Sign up for our newsletter! and Select checkbox Receive special offers from our partners!
    And Remplir de details: First name "Rym", Last name "Jridet", Company "Tech Solutions Inc.", Address "123 Rue Sainte-Catherine Ouest", Address2 "Bureau 500", Country "Canada", State "Québec", City "Montréal", Zipcode "H3B 1A7", Mobile Number "+1 514-555-1234"
    And Cliquer sur Create Account boutton
    Then Verifier que "ACCOUNT CREATED!" est visible
    When Cliquer sur Continue button 
    Then Verifier que Logged in as Rima "Logged in as Rima" est visible
    #When Cliquer sur Delete Account boutton
    #Then Verifier que "ACCOUNT DELETED!" est visible 
    #When Cliquer sur Continue button
    