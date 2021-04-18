# 1. Introduction
The DND Character Constructor is an online utility for the game Dungeons and Dragons, designed to accommodate user-created characters in a simplistic website. Users create an account and have access to a character creation program that automates complicated calculations and offers an easily accessible database of character races, classes, and other necessary details.

# 2. Verification
## 2.1. Unit test
  ### 2.1.1
    We used JUnit for all our unit tests and the mock unit test used Mockito as well.

  ### 2.1.2
  [Link to the unit tests](https://github.com/cloudandr0id/DNDCharacterCreation/tree/main/project_backend/tests/unitTests)

  ### 2.1.3
  We created a mock object to test the functionality of the Account class.

  [Class being tested](https://github.com/cloudandr0id/DNDCharacterCreation/blob/main/project_backend/database%20classes/Account.java)

  [Test](https://github.com/cloudandr0id/DNDCharacterCreation/blob/main/project_backend/tests/unitTests/AccountMockTest.java)

  ### 2.1.4
  ![Mock object test passing](https://github.com/cloudandr0id/DNDCharacterCreation/blob/main/project_documentation/cs386_deliverables/D7/MockUnitTest.JPG?raw=true)

## 2.2. Integration test
  ### 2.2.1
    We used JUnit and Mockito for our integration tests.
    
  ### 2.2.2
  [Link to the integration tests](https://github.com/cloudandr0id/DNDCharacterCreation/tree/main/project_backend/tests/integrationTests)
  
  ### 2.2.3
  ![character integration tests](https://user-images.githubusercontent.com/57876679/115136805-07a57100-9fd7-11eb-9938-5ecc4249726f.png)

  
  The test(s) above is [character integration tests.](https://github.com/cloudandr0id/DNDCharacterCreation/blob/main/project_backend/tests/integrationTests/CharacterIntegrationTests.java)
  
  In this example, the Character class is being tested with several other classes it has to take in. We are making sure that the classes are imported correctly into the main Character class so just Character needs to be called instead of a bunch of other classes.
  
  ### 2.2.4
  ![Character Integration Test](https://raw.githubusercontent.com/cloudandr0id/DNDCharacterCreation/main/project_documentation/cs386_deliverables/D7/IntegrationTest.JPG)
  
  
## 2.3. Acceptance
  ### 2.3.1
  ### 2.3.2
  ### 2.3.3
  ### 2.3.4

# 3. Validation
  ## Script:  
  Task to give:  
    Answer any questions that might pertain to the website  
    Check other pages to make sure its all up  
    Check if there is any typos or grammatical errors in the pages of the website  
    Test make different characters  
    Give feedback on to the developers (if any)  

  Data to be collected:  
    Answers to questions about the website/character creator  
    Feedback from the user evaluation (If any)  
    Results of the character creation  

  Questions to be asked:  
    How do you feel about the interface of the website?  
    If there was anything that you wanted the developers to add/improve on this website, what would you like to add/improve on?  
    From your perspective, can you go over the part of the website that you liked the most and why?  
    If the website was completed with new features that you may or may not have mentioned, would you recommend this website to your friends?  
    Was this website easy to use and provided all the information you needed to making characters?  

  ## Results:
  User 1 - Ryan

  - How do you feel about the interface of the website?

    *"The website has a very simple interface that makes it easy to understand."*
  - If there was anything that you wanted the developers to add/improve on this website, what would you like to add/improve on?

    *"The link to the youtube video on the home page confused me. It made me think that the links in the guide section were more YouTube videos. The character sheet is simple but the stats could be closer together. A guide on how to make a character would be nice."*
  - From your perspective, can you go over the part of the website that you liked the most and why?

    *"The character creator was my favorite part of the website. It is nice, simple, and looks clean with that DND feel to it."*
  - If the website was completed with new features that you may or may not have mentioned, would you recommend this website to your friends?

    *"I would share the website with others but recommend is too strong of a word when I haven't used it much."*
  - Was this website easy to use and provided all the information you needed to making characters?

    *"The website was very easy to use since the layout was so simple. However, it did not really explain how to make a character too well."*

  User 2 - Joe

  - How do you feel about the interface of the website?

    *"I appreciate that the site has a straightforward, simplistic style, but I wish it had more engagement (images, formatting, etc). It makes more sense to have the welcome when you're logged in on the home page rather than the account page and be able to see the current account that's logged in without having to go to the account page. "*
  - If there was anything that you wanted the developers to add/improve on this website, what would you like to add/improve on?

    *"I wish there was more customization in the character creation process. I also wish that the guide and character creation process were easier to read, especially since I'm new. If the relevant information was immediately and easily accessible when I input my race or class, that would be useful."*
  - From your perspective, can you go over the part of the website that you liked the most and why?

    *"I appreciate that there's a guide. It's really helpful to have that information available without digging through other websites or books."*
  - If the website was completed with new features that you may or may not have mentioned, would you recommend this website to your friends?

    *"To complete newbies, I would. To more experienced players, however, I don't think I would."*
  - Was this website easy to use and provided all the information you needed to making characters?

    *"The layout is straightforward and easy to use, therefore, I would agree."*

  User 3 - Gabe
  
  - How do you feel about the interface of the website?

    *"I feel that the interface could use some more detail, but what is there makes sense, and I don't feel like I need to be taught how to use it. "*
  - If there was anything that you wanted the developers to add/improve on this website, what would you like to add/improve on?

    *"It would be nice if there was a way for me to easily share the characters I have created with other people, so that I don't have to save a screenshot if I want to send a character to a friend. "*
  - From your perspective, can you go over the part of the website that you liked the most and why?

    *"I liked how easy it was to create a character, as it did not require me to first make an account or anything like that. "*
  - If the website was completed with new features that you may or may not have mentioned, would you recommend this website to your friends?

    *"I think I would recommend this, though I could see some people preferring to keep using pencil and paper to keep track of their characters. "*
  - Was this website easy to use and provided all the information you needed to making characters?

    *"Yes, I do think it was easy to use, and provided enough information without me feeling like I was being condescended to. "*

  ## Reflections:
   Despite the various issues that inhibited frontend development, we (as the team) are satisfied with the overall quality of the website. We succeeded with our goal of making our site simplistic and easy to navigate, featuring a header that allowed straightforward navigation. Had we figured out our tools and the website configurations earlier, the major change would have been a lot more built-in dynamic pages. The users seemed to have glossed over the account/login options and went straight to making a character. While immediately understanding what the form was asking, they expressed disappointment in the lack of options, especially the more experienced users. Even though our final product was relatively basic, our value proposition is fulfilled.
