package com.fstt.kofi.controllers;

import com.fstt.kofi.entities.ShopeItem;
import com.fstt.kofi.services.ShopeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/shope")
public class ShopeController {

    @Autowired
    ShopeService shopeService;

    @PostMapping("/save")
    public String createShopeItem(@RequestBody ShopeItem item){
        shopeService.saveItem(item);
        return  "saved";
    }

    @GetMapping("/get/{id}")
    public Optional<ShopeItem> getShopeItem(@PathVariable("id") int id){
        return shopeService.getbyId(id);
    }

    @GetMapping("/get/publisher/{id}")
    public List<ShopeItem> getPublisher_Items(@PathVariable("id") int id){
        List<ShopeItem> items = shopeService.getPublisherItems(id);
        for (ShopeItem item: items
        ) {
            System.out.println(item);
        }

        return  items;

    }

}
