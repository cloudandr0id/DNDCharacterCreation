package classes.database_classes;

public class LevelDict
{
	public int[] keys;
	public int[] values;

	public LevelDict()
	{
		keys = null;
		values = null;
	}

	public LevelDict(int[] keys, int[] values)
	{
		this.keys = keys;
		this.values = values;
	}

	public void setProficiency(int val){
		proficiency = val;
	}
}
