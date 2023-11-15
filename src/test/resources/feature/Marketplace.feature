@Test2
Feature: Login Market

  Scenario Outline: Market Login
    Given Login Application Url
    When click on Demo Project
    When click catalog project
    When Switch to Democart
    When I am Enter Username
    When I am Enter Password
    When I am click login
    When I am close the button
    When I am Catalog button
    When I am Enter catageries
    When I click Plus button
    When I am click on General
    When I am Enter Product
    When I am Enter the all Description
    When I am "<SearchThemes>" ExtensionTheme
    When I am "<DataModified>" modified

    Examples: 
      | SearchThemes | DataModified |
      | Facebook     | DateAdded    |
      | PayPal       | Rating       |
      | Google       | Price        |
