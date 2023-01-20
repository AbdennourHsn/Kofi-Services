package com.fstt.followrs.services;

import com.fstt.followrs.entities.Follows;
import com.fstt.followrs.repositories.FollowsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class FollowsImp implements FollowsService{
    @Autowired
    FollowsRepository followsRepository;


    @Override
    public void saveFollow(Follows follows) {
        followsRepository.save(follows);
    }

    @Override
    public List<Integer> userFollowrs(int user_id) {
        List<Integer> followrs = new ArrayList<>();
        for (Follows flw:  followsRepository.findByUserid(user_id)) {
            followrs.add(flw.getFollowerid());
        }
        return  followrs;
    }

    @Override
    public List<Integer> userFollowing(int user_id) {
        List<Integer> following = new ArrayList<>();
        for (Follows flw:  followsRepository.findByFollowerid(user_id)) {
            following.add(flw.getUserid());
        }
        return  following;
    }

    @Override
    public void removeFollow(int userId , int followrId) {
        //followsRepository.deleteByUseridAndFollowerid( userId , followrId);
        followsRepository.delleteFollowing(userId , followrId);
    }
}
