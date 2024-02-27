package one_To_One;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person
{
  @Id
  private int id;
  private String name;
  private int age;
  @OneToOne
  private Pan p;
  
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
public int getAge() 
{
	return age;
}
public void setAge(int age) 
{
	this.age = age;
}
public Pan getP() 
{
	return p;
}
public void setP(Pan p)
{
	this.p = p;
}
  
  
}
