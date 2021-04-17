package database_classes;

public class Subrace extends Race
{
   private int raceID;   
   private String raceName;

   public int getRaceID()
     {
       return raceID;
     }

   public void setRaceID(int id)
     {
       raceID = id;
     }

   public void setRaceName(String name)
     {
       raceName = name;
     }

   public String getRaceName()
     {
       return raceName;
     }
}