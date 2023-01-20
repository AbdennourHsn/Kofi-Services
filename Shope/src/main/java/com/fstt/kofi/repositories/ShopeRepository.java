package com.fstt.kofi.repositories;

import com.fstt.kofi.entities.ShopeItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ShopeRepository extends JpaRepository<ShopeItem, Integer> {
    ShopeItem findByPublisheridAndTitle(int publisherid, String title);
    List<ShopeItem> findByPublisherid(int publisherid);



    @Transactional
    @Modifying
    @Query("update ShopeItem s set s.price = ?1 where s.id = ?2")
    void updatePriceById(Double price, Long id);

    @Transactional
    @Modifying
    @Query("update ShopeItem s set s.title = ?1 where s.id = ?2")
    int updateItemTitle(String title, Long id);


}
