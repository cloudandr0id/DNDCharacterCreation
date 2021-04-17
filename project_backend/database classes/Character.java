package database_classes;

public class Character{
	public String name;
	public Race race;
	public SubRace subRace;
	public AbilityScore abilityScore;
	public Class charClass
	public Subclass subclass
	public Background background;
	public Level level;

	// constructor
	public Character(String name, Race race, SubRace subRace,
	AbilityScore abilityScore, Class charClass, Subclass subclass,
	Background background, Level level;)
	{
		this.name = name;
		this.race = race;
		this.subRace = subRace;
		this.abilityScore = abilityScore;
		this.charClass = charClass;
		this.subclass = subclass;
		this.background = background;
		this.level = level;
	}

	public int calculateScore(){
		return abilityScore.calculateScore()
	}

	public string getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Race getRace()
	{
		return this.race;
	}

	public void setRace(Race race)
	{
		this.race = race;
	}

	public SubRace getSubRace()
	{
		return this.subRace;
	}

	public void setSubRace(SubRace subRace)
	{
		this.subRace = subRace;
	}

	public AbilityScore getAbilityScore()
	{
		return this.abilityScore;
	}

	public void setAbilityScore(AbilityScore abilityScore)
	{
		this.abilityScore = abilityScore;
	}

	public Class getClass()
	{
		return this.charClass;
	}

	public void setClass(Class charClass)
	{
		this.charClass = charClass;
	}

	public Subclass getSubclass()
	{
		return this.subclass;
	}

	public void setSubclass(Subclass subclass)
	{
		this.subclass = subclass;
	}

	public Background getBackground()
	{
		return this.background;
	}

	public void setBackground(Background background)
	{
		this.background = background;
	}

	public Level getLevel()
	{
		return this.level;
	}

	public void setLevel(Level level)
	{
		this.level = level;
	}

}
