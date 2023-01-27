Feature: Test Web form page functions
  @SmokeTest
  Scenario Outline: Enter text and submit
    Given user enter "<text>"
    When user clicks submit button
    Then page has "<title>" and "<Message>" is displayed

    @submitbutton_function
    Examples:
      | text  | Message   | title |
      | user1 | Received! | Web form - target page |
      | user2 | Received! | Web form - target page |
      |       | Received! | Web form - target page |


  Scenario: Validate the date picker pop out
    Given User click on the date picker
    When Date picker pop up is displayed
    Then current date in text box