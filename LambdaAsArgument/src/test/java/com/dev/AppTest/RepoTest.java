package com.dev.AppTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.dev.App.Criteria;
import com.dev.App.House;
import com.dev.App.Repo;

public class RepoTest {
	static Repo repo = new Repo();
	
	@BeforeAll
	static void fillRepo() {
		repo.add(new House(5000, 50, 5));
		repo.add(new House(3214, 21, 3));
		repo.add(new House(2423, 65, 9));
		repo.add(new House(8532, 32, 3));
		repo.add(new House(1111, 11, 1));
	}
	
	@Test
	void returnPriceRangesTest() {
		//given
		int from = 3000;
		int to = 5000;
		
		//when
		int expectedHouses = 2;
		
		//then
		assertEquals(expectedHouses, repo.find(house -> house.getPrice() >= from && house.getPrice() <= to).size());
	}
	
	@Test
	void returnSizeRangesTest() {
		//given
		int from = 10;
		int to = 50;
		
		//when
		int expectedHouses = 4;
		Criteria sizeRanges = house -> house.getSize() >= from && house.getSize() <= to;
		
		//then
		assertEquals(expectedHouses, repo.find(sizeRanges).size());
	}
	
	@Test
	void returnHousesWithSpecificRoomNumberTest() {
		//given
		int numberOfRooms = 9;
		
		//when
		int expectedHouses = 1;
		
		//then
		assertEquals(expectedHouses, repo.find(house -> house.getNumberOfRooms() == numberOfRooms).size());
	}
}
