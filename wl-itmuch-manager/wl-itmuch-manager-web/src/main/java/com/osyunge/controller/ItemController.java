package com.osyunge.controller;

import com.osyunge.pojo.TbItem;
import com.osyunge.service.impl.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ItemController {
    @Autowired
    private ItemService itemService;
    @RequestMapping("/item/{itemId}")
    @ResponseBody
    private TbItem getItemById(@PathVariable Long itemId){
        TbItem item=itemService.getTbitemById(itemId);
        return item;
    }
}
