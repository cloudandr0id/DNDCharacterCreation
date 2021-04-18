package classes.databaseClasses;

public class Level
{
	public int level;
	public int proficiency;

 	public Level()
	{
		level = 0;
		proficiency = 0;
	}

	public Level(int level, int proficiency)
	{
		this.level = level;
		this.proficiency = proficiency;
	}

	public void setProficiency(int val){
		this.proficiency = val;
	}
	public getProficiency()
}
