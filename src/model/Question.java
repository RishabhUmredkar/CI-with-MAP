package model;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {

	private int id;
	private String name;
	private Map<String, String> answer;
	
	public Question() {
		super();
	}

	public Question(int id, String name, Map<String, String> answer) {
		super();
		this.id = id;
		this.name = name;
		this.answer = answer;
	}
	
	void displayInfo()
	{
		System.out.println("Answer Id :"+id);
		System.out.println("Qustion Name"+name);
		System.out.println("Answer are");
		
		Set<Entry<String, String>> set = answer.entrySet();
		Iterator<Entry<String, String>> itr = set.iterator();
		
		while (itr.hasNext()) {
			Entry<String, String> entry = itr.next();
			System.out.println("answer : "+entry.getKey()+" Posted by   "+entry.getValue());
			
			
		}
	}
	
}
