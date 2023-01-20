package com.fstt.followrs.repositories;

import com.fstt.followrs.entities.Follows;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface FollowsRepository extends JpaRepository<Follows , Integer> {
    @Transactional
    @Modifying
    @Query("delete from Follows f where f.userid = ?1 and f.followerid = ?2")
    void delleteFollowing(int userid, int followerid);
    long deleteByUseridAndFollowerid(int userid, int followerid);
    List<Follows> findByFollowerid(int followerid);
    List<Follows> findByUserid(int userid);

}
