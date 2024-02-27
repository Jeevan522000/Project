package one_to_many;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Branch 
{
 @Id
 private int id;
 private String name;
 private int pincode;
 @ManyToOne
 private Hospital hospital;
 
public int getId() 
{
	return id;
}
public void setId(int id) 
{
	this.id = id;
}
public String getName() 
{
	return name;
}
public void setName(String name) 
{
	this.name = name;
}
public int getPincode() 
{
	return pincode;
}
public void setPincode(int pincode) 
{
	this.pincode = pincode;
}
 
 
}
