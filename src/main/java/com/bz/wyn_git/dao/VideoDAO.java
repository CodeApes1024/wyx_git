package com.bz.wyn_git.dao;

import com.bz.wyn_git.entity.Video;

import java.util.List;

public interface VideoDAO {
    List<Video> queryById(String id);

    List<Video> queryAll(String id);
}
