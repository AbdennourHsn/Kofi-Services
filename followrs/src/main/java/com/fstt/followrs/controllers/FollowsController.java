package com.fstt.followrs.controllers;

import com.fstt.followrs.entities.Follows;
import com.fstt.followrs.repositories.FollowsRepository;
import com.fstt.followrs.services.FollowsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/follows")
public class FollowsController {

    @Autowired
    FollowsService followsService;


    @PostMapping("/add/{userId}/{followrId}")
    public String addFollowr(@PathVariable("userId") int userId , @PathVariable("followrId") int followrId){

        followsService.saveFollow(new Follows(userId , followrId));

        return "saved";
    }

    @PostMapping("/remove/{userId}/{followrId}")
    public String deleyeFollowr(@PathVariable("userId") int userId , @PathVariable("followrId") int followrId){

        followsService.removeFollow(followrId , userId);
        return "deleted";
    }

    @GetMapping("/followres/{userId}")
    public List<Integer> getFollowres(@PathVariable("userId") int userId ){
        return followsService.userFollowrs(userId);
    }

    @GetMapping("/following/{userId}")
    public List<Integer> getFollowing(@PathVariable("userId") int userId ){
        return followsService.userFollowing(userId);
    }


}
