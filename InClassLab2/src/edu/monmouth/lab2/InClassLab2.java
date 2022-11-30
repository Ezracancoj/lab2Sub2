package edu.monmouth.lab2;

import java.util.ArrayList;
import java.util.List;

public class InClassLab2 {
	

	public static void main(String[] args) {
		final int SIZE = 3;
		Student stu = new Student("Andy", 2001, 1348,"CS");
		Professor pro = new Professor("Gomez", 1976, 74949);
		Person per = new Person("Heavenly", 2000);
		
		//1. Print each instance’s complete set of attributes.
		System.out.println(stu.toString());
		System.out.println(pro.toString());
		System.out.println(per.toString());
		
		System.out.println();
		
		
		//2. Create an array that can house 3 Person object references.  
		Person[] people = new Person[SIZE];
		
		//3.Using the 3 objects created, fill the array.
		people[0] = per;
		people[1] = stu;
		people[2] = pro;
		
		//4. Using a looping construct, iterate through the array printing each 
		//object’s complete set of attributes
		int i = 0;
		while(i < SIZE){
			System.out.println(people[i].toString());
			i++;
		}
		
		System.out.println();
		
		
		//5. Using a second looping construct, iterate through the array printing 
		//each object’s name and yearOfBirth attributes only.
		for(int j = 0; j < SIZE; j++){
			int index = people[j].toString().indexOf("]") + 1;
			for(int x =0;x < index; x++) {
				if(x == index) {
					break;
					
				}
				else {
				System.out.print(people[j].toString().charAt(x));
				}
			}
				
			i++;
			System.out.println();
		}
		
		System.out.println();
		
		
		
		//6. Create an ArrayList that can house Person objects.
		List<Object> peoplelist = new ArrayList<Object>();
		
		//7. Add the 3 objects to the ArrayList
		peoplelist.add(stu);
		peoplelist.add(per);
		peoplelist.add(pro);
		
		//Using a looping construct, iterate through the array printing each 
		//object’s complete set of attributes.
		i = 0;
		while(i < SIZE){
			System.out.println(peoplelist.get(i).toString());
			i++;

	}

}
}