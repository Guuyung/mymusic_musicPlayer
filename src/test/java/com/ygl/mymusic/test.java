package com.ygl.mymusic;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ygl.mymusic.entity.Songs;
import com.ygl.mymusic.entity.Type;
import com.ygl.mymusic.mapper.LikesongsMapper;
import com.ygl.mymusic.service.ISongsService;
import com.ygl.mymusic.service.ITypeService;
import com.ygl.mymusic.service.IUsersService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.util.*;
import java.util.stream.Collectors;

@SpringBootTest
public class test {
    @Autowired
    IUsersService iUsersService;
    @Autowired
    ISongsService iSongsService;
    @Autowired
    ITypeService iTypeService;

    @Autowired
    LikesongsMapper likesongsMapper;
    @Test
    public void f()
    {

        iSongsService.
                update(new Songs("cg","unkonw"),new QueryWrapper<Songs>().eq("id",9));
    }



}