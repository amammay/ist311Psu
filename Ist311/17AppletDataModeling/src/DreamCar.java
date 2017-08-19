import java.awt.*;




/**
 * 
 */




/**
 * @author Alex Mammay
 * @Date
 * @Purpose
 * @Title
 */
public class DreamCar 
{
	
	//Aka make of car  
	String name;
	int xPos;
	int yPos;
	int condition;
	Image carImage;
	
	
	public DreamCar(String carName, Image photo)
	{
		name = carName;
		carImage = photo;
		xPos = 20;
		yPos = 20;
		condition = 20;
		
	}
	
	
	public void setName(String carName) 
	{
		name = carName;
	}

	
	public String getName() 
	{
		return name;
	}



	public void setLocation(int x, int y)
	{
		xPos = x;
		yPos = y;
	}

	public int getX()
	{
		return xPos;
	}
	
	public int getY()
	{
		return yPos;
	}
	
	public void setCondition(int carCondition)
	{
		condition = carCondition;
	}
	
	public int getCondition()
	{
		return condition;
	}

	public void setImage(Image photo) 
	{
		carImage = photo;
	}

	
	public Image getImage() 
	{
		return carImage;
	}
	
	

	
	public void driveUp()
	{
		
		yPos = yPos - 5;
	}

	
	public void driveDown()
	{
		
		yPos = yPos + 5;
	}
	
	public void driveLeft()
	{
		xPos = xPos -5;
	}
	
	public void driveRight()
	{
		xPos = xPos +5;
	}



	
}
