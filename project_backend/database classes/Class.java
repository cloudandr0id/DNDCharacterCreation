package database_classes;

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
       return classID;
     }

   public void setClassID(int id)
     {
       classID = id;
     }

   public void setClassName(String name)
     {
       className = name;
     }

   public String getClassName()
     {
       return className;
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
      return true;
    }
}
