package classes.databaseClasses;

public class ClassTraits extends Class
{
   private int[] classTrait;
   private int[] requiredLevel = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20];
   private String title;
   private String desc;

   public ClassTraits()
   {
     classTrait = 0;
     requiredLevel = null;
     tilte = "";
     desc = "";
   }

   public ClassTraits(ClassTraits classTrait, int[] requiredLevel, String title, String desc)
   {
     this.classTrait = classTrait;
     this.requiredLevel = requiredLevel;
     this.tilte = title;
     this.desc = desc;
   }


  ClassTraits classTrait(int level, String title, String desc)
     {
       classTrait[0] = level;
       classTrait[1] = title;
       classTrait[2] = desc;
     }
  public void setClassTrait(ClassTraits trait)
     {
       this.classtrait = trait;
     }

   public int getClassTrait()
     {
       return this.classTrait;
     }

   public boolean checkLevel()
     {
        if(super.level == 1)
          {
             title = sql.getTitle(0);
             desc = sql.getDesc(0);
          }

        classTrait(super.level, title, desc);
     }
}
