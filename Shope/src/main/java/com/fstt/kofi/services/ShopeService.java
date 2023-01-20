package com.fstt.kofi.services;

import com.fstt.kofi.entities.ShopeItem;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public interface ShopeService {
    public void saveItem(ShopeItem item);
    public Optional<ShopeItem> getbyId(int id);
    public void deleteItem(int id);
    public void updateItemTitle(Long id , String title);
    public void updateItemPrice(Long id , Double price);
    public void updateItemDescription(Long id , String title);
    public void updateItemSolded(Long id , String title);
    public void updateItemlefted(Long id , String title);
    public List<ShopeItem> getPublisherItems(int id);


}
