# Author : Gaspar Gonzalez
@Stories
Feature: Academy Choucair
    As a user , I want to lear how to automate in screamplay at the Choucair Academy with the automation course

    @scenario1
    Scenario: Search for a automation course

    Given Than Brandon wants to learn automation at the academy Choucair
    | strUser  | strPassword  |
    |TuUsuario | TuClave      |
    When he search for the course Recursos Automatizacion Bancolombia on the choucair academy platform
    |strCourse|
    |Metodologia Bancolombia|
    Then he finds the course called resources Recursos Automatizacion Bancolombia
    |strCourse|
    |Metodologia Bancolombia|