public class DigitalCamera 
{
  private String cameraBrand;
  private int cameraResolution;
  private int cameraPrice;
  
  public DigitalCamera(String brand, int resolution)
  {
    cameraBrand = brand;
    if (cameraResolution > 10)
      cameraResolution = 10;
    else 
      cameraResolution = resolution;
    if (cameraResolution < 6)
      cameraPrice = 99;
    else 
      cameraPrice = 129;
  }  
  public void displayDigitalCamera() 
  {
    System.out.println("Camera brand: " + cameraBrand
      + "\nResolution is " + cameraResolution 
      + "\nPrice $" + cameraPrice);
  }
}  
  