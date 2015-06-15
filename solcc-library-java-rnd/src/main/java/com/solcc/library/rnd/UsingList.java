package com.solcc.library.rnd;

import java.util.ArrayList;
import java.util.List;

import com.solcc.library.rnd.model.Person;

/*java.util.List is an interface. 
 * In order to use list we need to instantiate it 
 * using a class that is a kind of java.util.List*/
public class UsingList {

	public static void main(String[] args) {
		//First is to instantiate a list with a certain generic
		//ArrayList is a kind of List.
		List<String> listName = new ArrayList<String>();
		
		//How to use list?
		//Let's put something in the list in different ways
		
		//Making a String object named myName and adding it to the list 
		String myName = "My Name";
		listName.add(myName);
		
		//We can also do it directly since any string enclosed to " " is a String type
		listName.add("Your Name");
		
		//We can also get the values from the list by index.
		System.out.println(listName.get(0));
		System.out.println(listName.get(1));
		
		//We can also do some searching in our list
		System.out.print("Does the name 'My Name' in the list? ");
		if (listName.contains("My Name"))
			System.out.println("Yes!");
		else
			System.out.println("No!");
		
		System.out.print("Does the name 'Topo' in the list? ");
		if (listName.contains("Topo"))
			System.out.println("Yes!");
		else
			System.out.println("No!");
		
		/*You can find a lot of useful commands in list by simply typing the
		list variable name in our case is 'listName' then . to make 'listName.'
		all possible methods for List will appear, you can see what each
		 can do. 
		(Tip: If the auto-sugges does not appear press Ctrl + space multiple times)
		(Tip: You can also use that shortcut to auto complete)*/
		
		
		//With the List we can also do for looping much easier with this method
		System.out.println("My list of names: ");
		for(String variableName : listName) {
			System.out.println(" - " + variableName);
		}
		
		/*String variableName - this is a temporary variable where the content of the list
		will be placed.
		The for loop above iterates the contents of the list in order. 
		Passes that value into the temporary variable
		Just like an ordinary for loop, this for loop will continue until all the contents
		of the list has been traversed*/
		
		
		/*We can also use other objects on list
		 * Take note of the class inside the < > That is generics.
		 * We should explicitly definse what is the contents of the List we've
		 * made. In the examples above we used the String class/object. Now
		 * we will be using the Person class/object. Now we can say that we are
		 * making a list of Person*/
		List<Person> persons = new ArrayList<Person>();
		
		//The only object we can add to persons are Person object.
		//How is that?
		Person superHuman = new Person("Super", "man");
		persons.add(superHuman);
		
		//We can also do this
		persons.add(new Person("Voltes", " V"));
		
		//We can also do iterations via for loop
		for (Person person : persons) {
			System.out.println("My name is " + person.getFirstName() + person.getLastName());
		}
		
		//Assignment: try list for yourself :D
	}
}
