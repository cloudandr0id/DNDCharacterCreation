# Project Requirements  
**Group 01 – “[D&D Character Creator]”**  
**Date and location:** February 13th, 2021 (Virtual)  
**Group Members:** Hannah Trenary, Jon Nation, Ari Jaramillo, Grace Hsieh, Skyler Hanson, Richard McCormick  


## 1. Positioning  
### 1.1 Problem Statement  
The problem of complicated and inefficient character sheets affects D&D players,
gamers, college students, and role players, the impact of which is less time
spent playing Dungeons and Dragons, and more time spent managing and keeping
track of complex information.  


### 1.2 Product Position Statement  
For D&D players and Gamers who have multiple Dungeons and Dragons character
sheets, D&D Character Creator is a planning and organization site that allows
players to easily keep track of, manage, view, and change their characters.
Unlike D&D Beyond, our product provides exceptional functionality and simplicity
to players who are looking to spend less time keeping track of their sheet,
and more time playing the game.  

### 1.3 Value Proposition and Consumer Segment  
**Value Proposition:**  
D&D Character Creator is an easy to use character creation sheet that allows
D&D players and role players to more efficiently organize their character sheets,
without an overly-busy UI and restricted features commonly found in other
similar products.  

**Consumer Segment:**  
For D&D Players, Role Players, Gamers, and College Students frustrated with
the complexity of managing multiple complex character sheets.  

## 2. Stakeholders
**Users:** D&D Players of all experience levels, Tabletop gamers, role players, College students  
**Competitors:** DND Beyond and Roll20  
**Developers:** Hannah Trenary, Ari Jaramillo, Grace Hsieh, Skyler Hanson, Jonathan Nation, Richard McCormick  

## 3. Functional Requirements
  -  Personalization: Featuring both computer-generated recommendations and
fillable inputs for character creation and leveling.
  - Access to Information: Providing relevant details for character aspects.
  -  Ease of Use: Simple design that compartmentalizes and clarifies each part
of the character sheet.
  -  Continuity: User accounts that allow users to save and retrieve their
  information.

## 4. Non-Functional Requirements
  - Operability
  - Reliability
  - Usability
  - Availability

## 5. MVP
**MVP:** Our MVP will include a simple user interface which will allow users to create characters,
while providing them with some recommendations for popular character builds. Dice rolls can be made
through a Random Number Generator, or by manually inputting a rolled value. Once characters are created,
they can be saved to a server.

**Feature to Validate:** The main feature we will be validating is the character creator itself.
We will validate that by creating test characters using both methods of stat generation, by randomly
generating some numbers and manually inputting others. Additionally, we will validate the ability
to save and retrieve a character sheet by sending our test characters to the server and retrieving them.
## 6. Use Cases
### 6.1 Use Case Diagram

![Use case diagram](https://raw.githubusercontent.com/cloudandr0id/DNDCharacterCreation/main/project_documentation/cs386_deliverables/deliverable_media/D2UseCases.JPG)

### 6.2 Use Case Description and Interface Sketch
**Use Case:** View Shared Character  
**Actor:** User  
**Description:** Open a character sheet which has been shared by another user.
**Preconditions:** User must have been shared an existing character sheet created by another user.  
**Post-Conditions:** Character sheets, shared and created by another user, will be open and available for viewing.  
**Main Flow:**
1. User A creates a character sheet, and shares it with User B.  
2. User B receives the invitation/link to view character sheet from User A.  
3. User B can open the invitation link, and see User A's sheet.  
**Alternative Flow(s):**
1. User A sends a sheet to User B.  
      1. User B clicks the link sent by User A, and can now view the sheet.  

**Use Case:** Edit DND Character
**Actor:** User
**Description:** Edit the data of a character sheet
**Preconditions:** A completed character sheet and account must already exist.
**Post-Conditions:** The character sheet GUI will feature the updated information.
**Main Flow:**
1. User selects the option to edit their character sheet.
2. User goes through and edits whatever values they wish.
3. User submits the changes by saving.
**Alternative Flow(s):**
1. User exits before saving
      1. The system disregards all changes and keeps original values
2. User types an invalid input
      1. The system does not save the changes
      2. The system notifies the user of the error
      3. User fixes the error and resubmits
      
![Edit DND Character](https://github.com/cloudandr0id/DNDCharacterCreation/blob/main/project_documentation/cs386_deliverables/deliverable_media/Edit%20User%20Interface.png?raw=true)

**User Case:** Modify Account Information
**Actor:** Admin
**Description:** Modify a user’s account to what they want to be changed.
**Precondition:** User has made an account and contacted admin for modifying their account.
**Postcondition:** Admin modifies account to what the user wants to modify.
**Main Flow:**
1. User makes account and makes a mistake in their account making.
2. User contacts admin to help them modify their account.
3. Admin goes into the system and modifies account to what the User has asked them to fix.

**Alternative Flow:**
1. User makes account and makes no mistake in their account making.
2. User doesn’t need to contact admin and is happy!

**User Case:** Share Character Sheet
**Actor:** User
**Description:** Create a way to export or share a character sheet.
**Preconditions:** A character sheet has been created by a user and saved.
**Postconditions:** A different user can view the sheet.
**Main Flow:**
1. User prompts the program to save the sheet.
2. Server creates a link or string that is capible of saving the data in the sheet.
3. User is prompted to email or save the link to manually share.

**Alternative Flow:**
1. The sheet is blank and will not create the link.
2. The sheet is incomplete and based on how much is missing it will not create a link.

**Use Case:** View list of all accounts

  **Actor:** Admin  

  **Description:** Admin views a list containing information for all account.

  **Preconditions:** Admin needs to be logged into accounts.

  **Post-Conditions:** Admin would have viewed a list of all accounts.   

  **Main Flow:**
  1. Admin logs onto account.    
  2. Admin can look at list of all accounts   

**Use Case:** Delete an account

**Actor:** User

**Description:** The user deletes their account and their characters are subsequently deleted.

**Preconditions:** The user has an account and is currently logged into it.

**Post-Conditions:** The account and any characters created by that account are deleted.

**Main Flow:**
1. User selects the “delete account” option
2. The user is asked to confirm the account deletion
3. Any characters connected to the account are deleted from the server
4. The account and any related information is deleted from the server

**Alternative Flow:**
1. The user does not confirm the account deletion and no change is made.

## 7. User Stories  
As a D&D Player, I want to be able to see all the new options unlocked at
each level for my character, so that I don't miss out on fun new game
features.  
**Priority:** High  
**Estimated Implementation Time:** 5 hours  
**Notes:** Represents an excellent opportunity for adding a niche
feature not present in competition products. Will take time to implement,
but offers significant potential for increasing market value.  

As a beginner D&D player, I want suggestions to be given based on the
choices that I have already made so my characters are well built.
**Priority:** Medium
**Estimated Implementation time:** 4 Hours
**Notes:** Would try to guess what kind of build a player is making based
 off of race and class, and show popular choices for that build.

As a D&D player, I want to be able to share my characters with multiple
people at once so that I do not need to carry multiple copies of my
character sheet or take time introducing my character to every other player.
**Priority:** Low
**Estimated Implementation time:** 2 Hours
**Notes:** This is largely optional as guides can be found online but would consolidate the information.

As a D&D Player, I want the software product to have the character sheet,
the character creation process, and the character leveling process to be as
simple and direct as possible.
**Priority:** High
**Estimated Implementation Time:** 8 hours
**Notes:** Depending on potential customer input, reformatting, adding, or
removing sections of the default character sheet may be necessary to achieving
greater readability.

As a role player, I want to manage all of my stats and rolls automatically,
so that I can spent as much time playing and as little time managing numbers
as possible.  
**Priority:** Medium  
**Estimated Implementation Time:** 3 hours  
**Notes:** A somewhat mundane but necessary feature that will help
retain standing among competition, as well as to give ease of access to commonly
used features.  

As a D&D Player, I want to have access to all relevant information about my
character's aspects so that I can better understand my character's stats and
abilities.
**Priority:** Medium
**Estimated Implementation Time:** 4 hours
**Notes:** Allows users access to the description and modifiers for classes,
subclasses, racial abilities, enchanted items, and other objects or
characteristics.

As a college student, I want to be able to share my character easily so that my
friends and dungeon master can see my character and the progress I've made.   
**Priority:** Low   
**Estimated Implementation Time:** 1.5 hours  
**Notes:** A cool feature that allows players to show off their characters to
friends and Dungeon Masters not implemented by competitors.   

As a college student, I want to be able to roll dice digitally so that I can
enjoy rolling dice but save money.    
**Priority:** Low   
**Estimated Implementation Time:** 2 hours  
**Notes:** An interesting feature that would allow more people to play the game
if they can't afford buying dice.   

As an admin, I want to update the character sheet content so that my future
users get the character sheet that would most benefit them.
**Priority:** High
**Estimated Implementation Time:**  4 hours
**Notes:** A user interface that has input field that allows users to put their stats,
HP, and/or spells in the place they want them in the corresponded place in the character sheet.

As a D&D Player I want to create an account so that I can store all my
characters I create into a safe place so that I do not lose them in a pile of papers.
**Priority:** Medium
**Estimated Implementation Time:**  2 hours
**Notes:** Account system that allows players to store their character sheets
and bring those stored character sheets the next time I log into the website.

As a D&D Player, I want to be able to update my stats on the sheet quickly during games.
**Priority:** High
**Estimated Implementation Time:** 2 hours
**Notes:** The user interface will allow the user to manipulate information
that will save to the cloud for further use.

As an admin, I want to see a list or a count of all created character sheets to know how much
server space I have left and see how popular the program is.
**Priority:** Medium
**Estimated Implementation Time:** 1.5 hours
**Notes:** Account system that will allow admin to view and possibly manipulate the data of character
sheets created on all instances of the program as long as they are successfully saved to the cloud.

## 8. Issue Tracker
![Trello Frontend/Website Page](https://github.com/cloudandr0id/DNDCharacterCreation/blob/main/project_documentation/cs386_deliverables/deliverable_media/website_frontend_trello.png?raw=true)

![Trello Backend/Software Page](https://github.com/cloudandr0id/DNDCharacterCreation/blob/main/project_documentation/cs386_deliverables/deliverable_media/software_backend_trello.png?raw=true)
