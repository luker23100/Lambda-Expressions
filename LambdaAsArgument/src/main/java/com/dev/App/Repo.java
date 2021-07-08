package com.dev.App;

import java.util.HashSet;
import java.util.Set;

public class Repo {
	private HashSet<House> houses = new HashSet<>();
	
	public void add(House house) {
		houses.add(house);
	}
	
	public Set<House> find(Criteria criteria) {
		Set<House> temp = new HashSet<>();
		for(House h : houses)
			if(criteria.matches(h))
				temp.add(h);
		return temp;
	}
}
