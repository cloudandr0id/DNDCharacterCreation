package classes.database_classes;

public class Class
{
   private int classID;
   private String className;
   private int classTrait;

   public Class()
   {
     classID = 0;
     className = "";
     classTrait = 0;
   }

   public Class(int classID, String className, int classTrait)
   {
     this.classID = classID;
     this.className = className;
     this.classTrait = classTrait;
   }

   public int getClassID()
     {
       return this.classID;
     }

   public void setClassID(int id)
     {
       this.classID = id;
     }

   public void setClassName(String name)
     {
       this.className = name;
     }

   public String getClassName()
     {
       return this.className;
     }

     public int getClassTrait()
       {
         return this.classTrait;
       }

     public void setClassTrait(int trait)
       {
         this.classTrait = trait;
       }

  public boolean checkLevel()
    {
      return true;
    }
}
