
package database_classes;

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
       return raceID;
     }

   public void setRaceID(int id)
     {
       raceID = id;
     }

   public void setSpeed(int speed)
     {
       raceSpeed = speed;
     }

   public void getSpeed()
     {
       return raceSpeed;
     }

   public void setRaceName(String name)
     {
       raceName = name;
     }

   public String getRaceName()
     {
       return raceName;
     }

   public int setRaceTrait(int trait)
     {
       raceTrait = trait;
     }

   public int getRaceTrait()
     {
       return raceTrait;
     }
}
