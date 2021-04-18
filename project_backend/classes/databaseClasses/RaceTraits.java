package classes.database_classes;

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
       this.raceSpeed = speed;
     }

   public void getSpeed()
     {
       return this.raceSpeed;
     }

   public int setRaceTrait(int trait)
     {
       this.raceTrait = trait;
     }

   public int getRaceTrait()
     {
       return this.raceTrait;
     }
}
