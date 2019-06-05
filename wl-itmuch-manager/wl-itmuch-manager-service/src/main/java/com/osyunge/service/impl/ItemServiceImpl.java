package com.osyunge.service.impl;

import com.osyunge.dao.TbItemMapper;
import com.osyunge.pojo.TbItem;
import com.osyunge.pojo.TbItemExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TbItemMapper tbItemMapper;

    @Override
    public TbItem getTbitemById(Long itemid) {
        TbItemExample tbItemExample=new TbItemExample();
        //创建查询条件
        TbItemExample.Criteria criteria=tbItemExample.createCriteria();
        criteria.andIdEqualTo(itemid);
        List<TbItem> list=tbItemMapper.selectByExample(tbItemExample);
        //判断list中是否为空
        TbItem item=null;
        if (list!=null&&list.size()>0){
            item=list.get(0);
        }
        return item;
    }
}
