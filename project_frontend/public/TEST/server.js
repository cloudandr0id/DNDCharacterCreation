const express = require('express')
const logger = require('morgan')
const path = require('path')
const server = express()
server.use(express.urlencoded({'extended': true}))
server.use(logger('dev'))

// Routes
server.get('/', (req, res) => {
  res.send(`Your number is: ${Math.floor(Math.random() * 100) + 1}`)
})

server.get('/TEST/madLibForm', (req, res) =>{
	res.redirect ('/index.html')
})

server.post('/TEST/madLibForm', (req, res) =>{
	res.send(`
		<!DOCTYPE html>
		<html>
			<head>
				<link rel="stylesheet" type="text/css" href="/css/madLibCss.css">
			</head>
			<body>
				<p class = fin>
					It was a ${req.body.ADJ1}, cold November day. 
					I woke up to the ${req.body.ADJ2} smell of ${req.body.ANIMAL} roasting in the ${req.body.ROOM} downstairs.
					I ${req.body.VERB1} down the stairs to see if I could help ${req.body.VERB2} the dinner.
					My mom said, <q>See if ${req.body.NAME} needs a fresh ${req.body.NOUN1}.</q>
					So I carried a tray of glasses full of ${req.body.LIQUID} into the ${req.body.VERB3} room.
					When I got there, I couldn't believe my ${req.body.BODY}!
					There were ${req.body.NOUN2} ${req.body.VERB4} on the ${req.body.NOUN3}!
				</p>
				<p> Happy Thanksgiving! </p>
			</body>
		</html>
		`)
	console.log('Form complete')
})

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
