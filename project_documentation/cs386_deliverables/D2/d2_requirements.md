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
2. User B recieves the invitation/link to view character sheet from User A.  
3. User B can open the invitation link, and see User A's sheet.  

**Alternative Flow:**
1. User A sends a sheet to User B.  
2. User B clicks the link sent by User A, and can now view the sheet.  


## 7. User Stories  
As a D&D Player, I want to be able to see all the new options unlocked at
each level for my character, so that I don't miss out on fun new game
features.  
**Priority:** High  
**Estimated Implementation Time:** 5 hours  
**Notes:** Represents an excellent opportunity for adding a niche
feature not present in competition products. Will take time to implement,
but offers significant potential for increasing market value.  

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

## 8. Issue Tracker
![Trello Frontend/Website Page](https://github.com/cloudandr0id/DNDCharacterCreation/blob/main/project_documentation/cs386_deliverables/deliverable_media/website_frontend_trello.png?raw=true)

![Trello Backend/Software Page](https://github.com/cloudandr0id/DNDCharacterCreation/blob/main/project_documentation/cs386_deliverables/deliverable_media/software_backend_trello.png?raw=true)
