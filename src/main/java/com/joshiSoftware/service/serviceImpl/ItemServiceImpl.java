package com.joshiSoftware.service.serviceImpl;

import com.joshiSoftware.dto.ItemDto;
import com.joshiSoftware.entity.Item;
import com.joshiSoftware.exception.ResourceNotFoundException;
import com.joshiSoftware.repo.ItemRepo;
import com.joshiSoftware.service.ItemService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepo itemRepo;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ItemDto createItem(ItemDto itemDto) {
        Item item = this.modelMapper.map(itemDto, Item.class);
        Item save = this.itemRepo.save(item);
        return this.modelMapper.map(save,ItemDto.class);
    }

    @Override
    public List<ItemDto> getAllItem() {
        List<Item> all = this.itemRepo.findAll();
        return all.stream().map((item)->this.modelMapper.map(item,ItemDto.class)).collect(Collectors.toList());
    }

    @Override
    public ItemDto getItemById(int id) {
        Item item = this.itemRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Customer", "Id", id));
        return this.modelMapper.map(item,ItemDto.class);
    }
}
