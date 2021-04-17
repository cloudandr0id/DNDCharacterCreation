package database_classes;

public class Race
{
   private int raceID;   
   private String raceName;
   private int raceTrait;
   private int raceSpeed;

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

   public int setTrait(int trait)
     {
       raceTrait = trait;
     }

   public int getTrait()
     {
       return raceTrait;
     }
}