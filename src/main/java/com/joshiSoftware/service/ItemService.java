package com.joshiSoftware.service;

import com.joshiSoftware.dto.ItemDto;

import java.util.List;

public interface ItemService {

    //create item
    ItemDto createItem(ItemDto itemDto);

    //get item
    List<ItemDto> getAllItem();

    //get item by id
    ItemDto getItemById(int id);

}
