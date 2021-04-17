package database_classes;

public class RaceTraits extends Race
{
   private int raceSpeed;
   private int raceTrait;

   public RaceTraits()
   {
     raceSpeed = 0;
     raceTrait = 0;
   }

   public RaceTraits(int raceSpeed, int raceTrait)
   {
     this.raceSpeed = raceSpeed;
     this.raceTrait = raceTrait;
   }

   public void setSpeed(int speed)
     {
       raceSpeed = speed;
     }

   public void getSpeed()
     {
       return raceSpeed;
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
