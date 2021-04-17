package database_classes;

public class Character{
	public String charName;
	public Race charRace;
	public SubRace charSubRace;
	public AbilityScore charAbilityScore;
	public Class charClass
	public Subclass charSubclass
	public Background charBG;
	public Level charLevel;

	// constructor
	public Character(String charName, Race charRace, SubRace charSubRace,
	AbilityScore charAbilityScore, Class charClass, Subclass charSubclass,
	Background charBG, Level charLevel;)
	{
		this.charName = charName;
		this.charRace = charRace;
		this.charSubRace = charSubRace;
		this.charAbilityScore = charAbilityScore;
		this.charClass = charClass;
		this.charSubclass = charSubclass;
		this.charBG = charBG;
		this.charLevel = charLevel;
	}

	public int calculateScore(){
		return charAbilityScore.calculateScore()
	}
}
