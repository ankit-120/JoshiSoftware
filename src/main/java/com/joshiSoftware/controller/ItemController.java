package com.joshiSoftware.controller;

import com.joshiSoftware.dto.ItemDto;
import com.joshiSoftware.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/joshiSoftware/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping("/")
    public ResponseEntity<ItemDto> addItem(@RequestBody ItemDto itemDto){
        ItemDto item = this.itemService.createItem(itemDto);
        return new ResponseEntity<>(item, HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<List<ItemDto>> getItem(){
        List<ItemDto> item = this.itemService.getAllItem();
        return new ResponseEntity<>(item,HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ItemDto> getItemById(@PathVariable int id){
        ItemDto itemById = this.itemService.getItemById(id);
        return new ResponseEntity<>(itemById,HttpStatus.OK);
    }
}
