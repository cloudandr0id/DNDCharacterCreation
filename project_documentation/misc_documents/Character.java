public class Character{
	public String charName;
	public Race charRace;
	public SubRace charSubRace;
	public AbilityScore charAbilityScore;
	public Class charClass
	public Subclass charSubclass
	public Background charBG;
	public Level charLevel;

	public int calculateScore(){
		return charAbilityScore.calculateScore()
	}
}