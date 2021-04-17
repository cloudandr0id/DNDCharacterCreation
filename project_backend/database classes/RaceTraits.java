package database_classes;

public class RaceTraits extends Race
{
   private int raceSpeed;
   private int raceTrait;

   public void setSpeed(int speed)
     {
       raceSpeed = speed;
     }

   public void getSpeed()
     {
       return raceSpeed;
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