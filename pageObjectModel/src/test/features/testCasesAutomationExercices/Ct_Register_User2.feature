@connect
Feature: Connection comme utilisateur
  Je veux me connecter avec email et password valides

Background: 
    Given saisir url d automation exercice "https://automationexercise.com/"
    Then Verifier que Home page est visible et le couleur orange "rgba(255, 165, 0, 1)" 
    
  @connect1
  Scenario: Connection avec de données valides
   When Cliquer sur Signup / Login boutton
   Then Verifier que Login your account "Login to your account" est visible
   When Entrer correctement email address "riiimaa199200@gmail.com" et password "Jr22/11/1996"
   And  Cliquer sur boutton login "login" 
   Then Verifier que Logged in as Rima "Logged in as Rima" est visible
   When Cliquer sur Delete Account boutton
   Then Verifier que "ACCOUNT DELETED!" est visible 

