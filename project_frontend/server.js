const express = require('express')
const logger = require('morgan')
const path = require('path')
const server = express()
server.use(express.urlencoded({'extended': true}))
server.use(logger('dev'))

function getStat() {
var strengthStat = document.getElementById('StrengthID').value;
var result = document.getElementById('result');

reult.textContent = 'Your Strength is: ' + strengthStat;
}



// Setup static page serving for all the pages in "public"
const publicServedFilesPath = path.join(__dirname, 'public')
server.use(express.static(publicServedFilesPath))


// The server uses port 80 by default unless you start it with the extra
// command line argument 'local' like this:
//       node server.js local
let port = 80
if (process.argv[2] === 'local') {
  port = 8080
}

server.listen(port, () => console.log('Ready on localhost!'))

server.get('/characterCreator/characterform', (req, res) =>{
  res.redirect ('/characterCreator')
})

server.post('/characterCreator/characterForm', (req, res) =>{
    res.send(`
        <!DOCTYPE html>
        <html lang="en" dir="ltr">
          <head>
            <link rel = "stylesheet" href = "/.css/dndstyle.css">
            <title>Character Sheet</title>
            <nav>
              <img id="logoimage" alt="DND CC Logo" src="/.buttons/logo.png">
              <a href="/">
                <img id="headerButton" alt="Home" src="/.buttons/HomeButton.png">
              </a>
              <a	href="/characters/">
                <img id="headerButton" alt="Characters" src="/.buttons/CharButton.png">
              </a>
              <a href= "/contact/">
                <img id="headerButton" alt="About/Contact" src="/.buttons/ContButton.png">
              </a>
              <a href="https://github.com/cloudandr0id/DNDCharacterCreation" target="_blank">
                <img id="headerButton" alt="Github" src="/.buttons/GHButton.png">
              </a>
              <a href="/account/">
                <img id="headerButton" alt="Account" src="/.buttons/AccButton.png">
              </a>
              <a href = "/login/">
                <img id="headerButton" alt="Login" src="/.buttons/LogButton.png">
              </a>
              <hr>
            </nav>
          </head>
          <body>
            <form id="charSheet">
              <div id="nameBox">
                <p>Name: NAME_HERE</p>
                <p>Race: RACE_HERE</p>
                <p>Level: LEVEL_HERE</p>
                <p>Strength: STR_STAT</p>
                <p>Dexterity: DEX_STAT</p>
                <p>Constitution: CON_STAT</p>
                <p>Wisdom: WIS_STAT</p>
                <p>Intelligence: INT_STAT</p>
                <p>Charisma: CHAR_STAT</p>
                <p>HP: HP_STAT</p>
              </div>
             </form>
          </body>
        </html>
        `)
    console.log('Form complete')
})
