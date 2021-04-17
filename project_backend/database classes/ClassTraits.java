package database_classes;

public class ClassTraits extends Class
{
   private ClassTraits[] classTrait;
   private int[] requriedLevel = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20];
   private String title;
   private String desc;

   public ClassTraits()
   {
     classTrait = 0;
     requriedLevel = null;
     tilte = "";
     desc = "";
   }

   public ClassTraits(ClassTraits classTrait, int[] requriedLevel, String title, String desc)
   {
     this.classTrait = classTrait;
     this.requriedLevel = requriedLevel;
     this.tilte = title;
     this.desc = desc;
   }


  ClassTraits classTrait(int level, String title, String desc)
     {
       classTrait[0] = level;
       classTrait[1] = title;
       classTrait[2] = desc;
     }
  public int setClassTrait(int trait)
     {
       classtrait = trait;
     }

   public int getClassTrait()
     {
       return classTrait;
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
