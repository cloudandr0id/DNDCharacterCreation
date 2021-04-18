

public class Race
{
   private int raceID;
   private String raceName;
   private int raceTrait;
   private int raceSpeed;

   public Race()
   {
     raceID = 0;
     raceName = "";
     raceTrait = 0;
     raceSpeed = 0;
   }

   public Race(int raceID, String raceName, int raceTrait, int raceSpeed)
   {
     this.raceID = raceID;
     this.raceName = raceName;
     this.raceTrait = raceTrait;
     this.raceSpeed = raceSpeed;
   }

   public int getRaceID()
     {
       return this.raceID;
     }

   public void setRaceID(int id)
     {
       this.raceID = id;
     }

   public void setSpeed(int speed)
     {
       this.raceSpeed = speed;
     }

   public int getSpeed()
     {
       return this.raceSpeed;
     }

   public void setRaceName(String name)
     {
       this.raceName = name;
     }

   public String getRaceName()
     {
       return this.raceName;
     }

   public void setRaceTrait(int trait)
     {
       this.raceTrait = trait;
     }

   public int getRaceTrait()
     {
       return this.raceTrait;
     }
}
