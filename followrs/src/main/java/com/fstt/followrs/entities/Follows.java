package com.fstt.followrs.entities;

import jakarta.persistence.*;

@Table(name = "follows")
@Entity
public class Follows {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private int userid;
    @Column(nullable = false )
    private  int followerid;

    public Follows() {
    }

    public Follows( int userid, int followerid) {

        this.userid = userid;
        this.followerid = followerid;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getFollowerid() {
        return followerid;
    }

    public void setFollowerid(int followerid) {
        this.followerid = followerid;
    }

    @Override
    public String toString() {
        return "follows{" +
                "id=" + id +
                ", userid=" + userid +
                ", followerid=" + followerid +
                '}';
    }
}
