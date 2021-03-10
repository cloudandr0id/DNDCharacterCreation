from flask import Flask, request, render_template, url_for

# Flask constructor
app = Flask(__name__)

# A decorator used to tell the application
# which URL is associated function
@app.route('/', methods =["GET", "POST"])
def gfg():
    if request.method == "POST":
       # getting input with name = fname in HTML form
       if "fname" in request.form:
           first_name = request.form["fname"]
       # getting input with name = lname in HTML form
       if "lname" in request.form:
           last_name = request.form["lname"]

       if first_name and last_name:
           print("Your name is "+first_name + last_name)

    return render_template("form.html")
