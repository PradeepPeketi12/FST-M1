Feature: Basic Syntax

    Scenario: Testing Training Support homepage
      Given user is on TS homepage
      When user clicks on About us link
      Then about us link opens
      Then browser closes