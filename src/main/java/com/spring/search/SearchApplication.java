package com.spring.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.search.model.Item;
import com.spring.search.repository.ItemRepository;

@SpringBootApplication
public class SearchApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SearchApplication.class, args);
		ItemRepository itemRepository = ctx.getBean(ItemRepository.class);
		itemRepository.save(new Item("dfgsdg", "rrtyeyu", Double.parseDouble("45000"), Double.parseDouble("45000")));
		itemRepository.save(new Item("dfgdfg", "dfgxcbv", Double.parseDouble("60000"), Double.parseDouble("45000")));
		itemRepository.save(new Item("dfggf", "vxrg", Double.parseDouble("40000"), Double.parseDouble("45000")));
		itemRepository.save(new Item("hgbh", "azexc", Double.parseDouble("85000"), Double.parseDouble("45000")));
		itemRepository.save(new Item("ryuuo", "pomh", Double.parseDouble("600000"), Double.parseDouble("45000")));
		itemRepository.save(new Item("fgjhku", "nqzrd", Double.parseDouble("440000"), Double.parseDouble("45000")));
		itemRepository.save(new Item("xby", "cvtb", Double.parseDouble("50000"), Double.parseDouble("45000")));
		itemRepository.save(new Item("iopy", "yuluyl", Double.parseDouble("60000"), Double.parseDouble("45000")));
		itemRepository.save(new Item("vghi", "uhkii", Double.parseDouble("940000"), Double.parseDouble("45000")));
	}

}
