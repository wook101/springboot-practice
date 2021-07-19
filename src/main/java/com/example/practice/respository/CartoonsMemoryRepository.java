package com.example.practice.respository;

import com.example.practice.model.Cartoon;
import com.example.practice.model.CartoonsSearch;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CartoonsMemoryRepository {

    private NamedParameterJdbcTemplate jdbc;
    private RowMapper<Cartoon> rowMapper = BeanPropertyRowMapper.newInstance(Cartoon.class);

    public CartoonsMemoryRepository(DataSource dataSource){
        this.jdbc = new NamedParameterJdbcTemplate(dataSource);
    }

    public List<Cartoon> selectAll(CartoonsSearch cartoonsSearch){
        Map<String,String> param = new HashMap<>();
        param.put("date",cartoonsSearch.getDate());
        param.put("genre",cartoonsSearch.getGenre());
        param.put("finished",cartoonsSearch.getFinished());
        return jdbc.query("select * from cartoons where substr(createAt,0,10)=:date AND genre like :genre AND finished=:finished",param, rowMapper);
    }


}
