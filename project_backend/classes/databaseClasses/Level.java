

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

	public int getProficiency()
	{
		return this.proficiency;
	}

	public void setLevel(int level){
		this.level = level;
	}

	public int getLevel()
	{
		return this.level;
	}

}
