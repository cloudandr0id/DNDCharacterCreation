package classes.databaseClasses;

public class AbilityScore()
{
   private int[] Score;
   private int[] ScoreMod;
   private int Str;
   private int Dex;
   private int Con;
   private int Int;
   private int Wis;
   private int Cha;

   public AbilityScore()
   {
      this.Str = 0;
      this.Dex = 0;
      this.Con = 0;
      this.Int = 0;
      this.Wis = 0;
      this.Cha = 0;
      Score = null;
      ScoreMod = null;
   }

   public AbilityScore(int Str, int Dex, int Con, int Int, int Wis, int Cha)
   {
     this.Str = Str;
     this.Dex = Dex;
     this.Con = Con;
     this.Int = Int;
     this.Wis = Wis;
     this.Cha = Cha;
     Score = new int[this.Str, this.Dex, this.Con, this.Int, this.Wis, this.Cha];
     ScoreMod = new int[6];
   }

   public int[] calculateScore()
     {
       if(Score != null)
       {
         ScoreMod[0] = scoreToModifier(Score[0]);
         ScoreMod[1] = scoreToModifier(Score[1]);
         ScoreMod[2] = scoreToModifier(Score[2]);
         ScoreMod[3] = scoreToModifier(Score[3]);
         ScoreMod[4] = scoreToModifier(Score[4]);
         ScoreMod[5] = scoreToModifier(Score[5]);
       }
       System.out.println("Your Score is: " + Score);
       System.out.println();
       System.out.println("Your Modifiers are: " + ScoreMod);

       return Score;
     }

   public int scoreToModifier(int value)
     {
       if(value = 1)
       {
         return -5;
       }
       if(value  = 2 || value = 3)
       {
         return -4;
       }
       if(value  = 4 || value = 5)
       {
         return -3;
       }
       if(value  = 6 || value = 7)
       {
         return -2;
       }
       if(value  = 8 || value = 9)
       {
         return -1;
       }
       if(value = 10 || value = 11)
       {
         return 0;
       }
       if(value = 12 || value = 13)
       {
         return 1;
       }
       if(value = 14 || value = 15)
       {
         return 2;
       }
       if(value = 16 || value = 17)
       {
         return 3;
       }
       if(value = 18 || value = 19)
       {
         return 4;
       }
       if(value = 20 || value = 21)
       {
         return 5;
       }
       if(value = 22 || value = 23)
       {
         return 6;
       }
       if(value = 24 || value = 25)
       {
         return 7;
       }
       if(value = 26 || value = 27)
       {
         return 8;
       }
       if(value = 28 || value = 29)
       {
         return 9;
       }
       if(value = 30)
       {
         return 10;
       }
       return -100;
     }
}
