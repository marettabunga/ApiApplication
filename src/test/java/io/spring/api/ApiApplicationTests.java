package io.spring.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import io.spring.api.models.Region;
import io.spring.api.services.RegionService;


@SpringBootTest
class ApiApplicationTests {
	private RegionService rService;

	@Autowired
	public ApiApplicationTests(RegionService rService) {
		this.rService = rService;
	}
	
	@Test
	void getall() {
		List<Region> r = new ArrayList<Region>();
		r = rService.get();
		Assertions.assertThat(r).isNotNull();
	}

	@Test
	void getbyid(){
		Region r = new Region();

		r = rService.get(1);

		Assertions.assertThat(r).isNotNull();
	}

	@Test
	void Insert(){
		//Arrange
		Region region = new Region();
		
		region.setName("IT Finance");
		
		//Act
		Boolean result = rService.save(region);

		//Assert
		Assertions.assertThat(result).isEqualTo(true);
	}

	@Test
	void Update(){
		Region r = new Region();
		Integer id = 1;
		//act
		Boolean result = rService.save(r);

		Assertions.assertThat(result).isEqualTo(true);
	}

	@Test
	void Delete(){
		Integer r = 8; 

		Boolean result = rService.delete(r);

		Assertions.assertThat(result).isEqualTo(true);

	}

}
