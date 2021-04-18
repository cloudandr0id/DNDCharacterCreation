package classes.database_classes;

public class Subclass extends Class
{
   private int classID;
   private String className;

   public Subclass()
   {
     classID = 0;
     className = "";
   }

   public Subclass(int classID, String className)
   {
     this.classID = classID;
     this.className = className;
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
}
