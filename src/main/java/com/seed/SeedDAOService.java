package com.seed;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * Created by baeonejune on 15. 4. 30..
 */
@Repository
public class SeedDAOService implements SeedDAO {

    @Autowired
    private SqlSession sqlSession;

    @Override
    public ArrayList<Seed> getAllSeedData() {
        SeedMapper seedMapper = sqlSession.getMapper(SeedMapper.class);
        return seedMapper.getSeedDataAll();
    }
}
