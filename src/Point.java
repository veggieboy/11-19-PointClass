public class Point
{
  int x;
  int y;
  
  public int getX()
  {
    return x;
  }
  public int getY()
  {
    return y;
  }
  public double distanceFromOrigin()
  {
    double h=Math.sqrt(x*x+y*y);
    return h;
  }
  public double distance(Point b)
  {
    b.x2 = b;
    b.y2 = b;
    b.x2=x2;
    b.y2=y2;
    double h=Math.sqrt((x2–x)*(x2-x) + (y2–y)*(y2-y));
    return h;
  }
  public String toString()
  {
    return("("+x+","+y+")");
  }
  public void setX (int xNew)
  {
    x=xNew;
  }
  public void setY (int yNew)
  {
    y=yNew;
  }
  public void setY (int dx, int dy)
  {
    x+=dx;
    x+=dy;
  }
}


