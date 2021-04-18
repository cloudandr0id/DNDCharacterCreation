package classes.database_classes;

public class Subrace extends Race
{
   private int raceID;
   private String raceName;

   public Subraces()
   {
     raceID = 0;
     raceName = "";
   }

   public Subrace(int raceID, String raceName)
   {
     this.racesID = raceID;
     this.raceName = raceName;
   }

   public int getRaceID()
     {
       return this.raceID;
     }

   public void setRaceID(int id)
     {
       this.raceID = id;
     }

   public void setRaceName(String name)
     {
       this.raceName = name;
     }

   public String getRaceName()
     {
       return this.raceName;
     }
}
