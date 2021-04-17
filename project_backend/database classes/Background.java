package database_classes;

public class Background
{
  public int backgroundID;
  public String title;
  public String description;

  public Background()
  {
    backgroundID = 0;
    title = "";
    description = "";
  }

  public Background(int backgroundID, String title, String description)
  {
    this.backgroundID = backgroundID;
    this.title = title;
    this.description = description;
  }
}
