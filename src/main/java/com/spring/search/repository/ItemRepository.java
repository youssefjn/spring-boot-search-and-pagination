package com.spring.search.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestParam;
import com.spring.search.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

    @Query(value = "Select i from Item i where i.name like :keyword Or i.description like :keyword")
    Page<Item> findByKeyword(@RequestParam("keyword") String keyword, Sort sort, PageRequest pageRequest);

}
