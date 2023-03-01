package com.spring.search.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.spring.search.model.Item;
import com.spring.search.service.ItemService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;

    @RequestMapping(path = { "/", "/search" })
    public String search(Model model, @RequestParam(defaultValue = "") String keyword,
            @RequestParam(name = "page", defaultValue = "0") int page,
            @RequestParam(name = "size", defaultValue = "5") int size) {

        Page<Item> list = itemService.getByKeyword("%" + keyword + "%", PageRequest.of(page, size));
        int[] pages = new int[list.getTotalPages()];
        model.addAttribute("list", list);
        model.addAttribute("keyword", keyword);
        model.addAttribute("pages", pages);
        model.addAttribute("pageCourante", page);
        return "items";

    }

}
