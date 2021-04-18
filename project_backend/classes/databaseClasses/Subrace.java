
public class Subrace extends Race
{
   private int raceID;
   private String raceName;


   public Subrace(int raceID, String raceName)
   {
     this.raceID = raceID;
     this.raceName = raceName;
   }

   public Subrace()
   {
     this.raceID = 0;
     this.raceName = "";
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
