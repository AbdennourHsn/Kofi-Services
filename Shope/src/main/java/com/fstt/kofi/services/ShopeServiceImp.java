package com.fstt.kofi.services;

import com.fstt.kofi.entities.ShopeItem;
import com.fstt.kofi.repositories.ShopeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ShopeServiceImp implements  ShopeService{
    @Autowired
    ShopeRepository shopeRepository ;

    @Override
    public void saveItem(ShopeItem item) {
        shopeRepository.save(item);
    }

    @Override
    public Optional<ShopeItem> getbyId(int id) {
        return shopeRepository.findById(id);
    }

    @Override
    public void deleteItem(int id) {
        shopeRepository.deleteById(id);
    }

    @Override
    public void updateItemTitle(Long id, String title) {
        shopeRepository.updateItemTitle(title , id);
    }

    @Override
    public void updateItemPrice(Long id, Double price) {
        shopeRepository.updatePriceById(price , id);
    }

    @Override
    public void updateItemDescription(Long id, String title) {

    }

    @Override
    public void updateItemSolded(Long id, String title) {

    }

    @Override
    public void updateItemlefted(Long id, String title) {

    }

    @Override
    public List<ShopeItem> getPublisherItems(int id) {
        return shopeRepository.findByPublisherid(id);
    }


}
