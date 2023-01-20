package com.fstt.followrs.services;

import com.fstt.followrs.entities.Follows;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface FollowsService {
    public void saveFollow(Follows follows);
    public List<Integer> userFollowrs(int id);
    public  List<Integer> userFollowing(int id);

    public void removeFollow(int userId , int followrId);
}
