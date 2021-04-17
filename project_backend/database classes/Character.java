package database_classes;

public class Character{
	public String name;
	public Race race;
	public SubRace subRace;
	public AbilityScore abilityScore;
	public Class class
	public Subclass subclass
	public Background background;
	public Level level;

	// constructor
	public Character(String name, Race race, SubRace subRace,
	AbilityScore abilityScore, Class class, Subclass subClass,
	Background background, Level level;)
	{
		this.name = name;
		this.race = race;
		this.subRace = subRace;
		this.abilityScore = abilityScore;
		this.class = class;
		this.subClass = subClass;
		this.background = background;
		this.level = level;
	}

	public int calculateScore(){
		return abilityScore.calculateScore()
	}

	public string getEmail()
	{
		return email;
	}

	public void setEmail(String userEmail)
	{
		this.email = userEmail;
	}

}
