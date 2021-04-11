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
              <a href="/guide/">
                <img id="headerButton" alt="Guide" src="/.buttons/GuideButton.png">
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
                <p>Name: ${req.body.Name}</p>
                <p>Race: ${req.body.Race}</p>
                <p>Level: ${req.body.Level}</p>
                <p>Strength: ${req.body.Strength}</p>
                <p>Dexterity: ${req.body.Dexterity}</p>
                <p>Constitution: ${req.body.Constitution}</p>
                <p>Wisdom: ${req.body.Wisdom}</p>
                <p>Intelligence: ${req.body.Intelligence}</p>
                <p>Charisma: ${req.body.Charisma}</p>
                <p>HP: ${req.body.HP}</p>
              </div>
             </form>
          </body>
        </html>
        `)
    console.log('Form complete')
})

server.post('/login/loginForm', (req, res) =>{
    res.send(`
        <!DOCTYPE html>
        <html lang="en" dir="ltr">
          <head>
            <link rel = "stylesheet" href = "/.css/dndstyle.css">
            <title>Profile</title>
            <nav>
              <img id="logoimage" alt="DND CC Logo" src="/.buttons/logo.png">

              <a href="/">
                <img id="headerButton" alt="Home" src="/.buttons/HomeButton.png">
              </a>

              <a	href="/characters/">
                <img id="headerButton" alt="Characters" src="/.buttons/CharButton.png">
              </a>

              <a href="/guide/">
                <img id="headerButton" alt="Guide" src="/.buttons/GuideButton.png">
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

            <h2>Welcome ${req.body.Email}!</h2>
            <h3>Account information:</h3>
            <p>Current email: ${req.body.Email}</p>
            <p>Current password: ${req.body.Password}</p>

            <hr>
            <h3>Change account information:</h3>
            <label for="newEmail">New email: </label>
            <input type="text" id="email" name="newEmail"><br>
            <input type="submit" value="change email" id="changePassword"><br>

            <label for="newPassword">New password: </label>
            <input type="text" id="password" name="newPassword"><br>
            <input type="submit" value="change password" id="changePassword"><br>

          </body>
        </html>
        `)
    console.log('Form complete')
})
