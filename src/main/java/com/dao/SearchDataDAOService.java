package com.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * Created by baeonejune on 15. 4. 29..
 */
@Repository
public class SearchDataDAOService implements SearchDataDAO {
    @Autowired
    private SqlSession sqlSession;

    @Override
    public ArrayList<SearchData> getAllSearchData() {
        SearchDataMapper searchDataMapper = sqlSession.getMapper(SearchDataMapper.class);
        ArrayList<SearchData> result = searchDataMapper.getSearchDataAll();
        return result;
    }
}
