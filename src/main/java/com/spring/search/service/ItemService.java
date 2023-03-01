package com.spring.search.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.spring.search.model.Item;
import com.spring.search.repository.ItemRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ItemService {
    private final ItemRepository itemRepository;

    public Page<Item> getByKeyword(String keyword, PageRequest pageRequest) {
        return itemRepository.findByKeyword(keyword, Sort.by("description").descending(), pageRequest);

    }
}
