public class Circle {
  private double radius;
  private double area;
  private double circumference;
  private String label;
  

  public Circle(double r)
  {
     radius = r;
     area = Math.PI * radius * radius;
     circumference = 2.0 * Math.PI * radius;
  }
  
  public Circle(double r, String l)
  {
  	 label = l;
     radius = r;
     area = Math.PI * radius * radius;
     circumference = 2.0 * Math.PI * radius;
  }
  
   public double getArea()
   {
      return area;
   }

   public double getRadius()
   {
      return radius;
   }

   public double getCircumference()
   {
      return circumference;
   }
   
    public String getLabel()
   {
      return label;
   }
   
}