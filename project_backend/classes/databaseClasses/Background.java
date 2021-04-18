

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

  public int getBackgroundID ()
  {
      return this.backgroundID;
  }

  public void setBackgroundID(int backgroundID)
  {
      this.backgroundID = backgroundID;
  }

  public String getTitle ()
  {
      return this.title;
  }

  public void setTitle(String title)
  {
      this.title = title;
  }

  public String getDescription ()
  {
      return this.description;
  }

  public void setDescription(String description)
  {
      this.description = description;
  }

}
