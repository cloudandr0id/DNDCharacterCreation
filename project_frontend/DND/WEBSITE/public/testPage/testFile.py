from Flask import flask, request

app = Flask(__name__)
@app.route('/testPage/', methods =["GET", "POST"])

def gfg():
    if request.method == "POST":
        strength = request.form.get("Strength")
        dexterity = request.form.get("Dexterity")

        return "Strength = " +strength+ " Dexterity = "+dexterity

    return render_template("form.html")

if __name__ == '__main__':
    app.run()
