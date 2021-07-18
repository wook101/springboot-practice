package com.example.practice.respository;

import com.example.practice.model.CartoonsSearch;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class CartoonsMemoryRepository {

    private NamedParameterJdbcTemplate jdbc;
    private RowMapper<CartoonsSearch> rowMapper = BeanPropertyRowMapper.newInstance(CartoonsSearch.class);

    public CartoonsMemoryRepository(DataSource dataSource){
        this.jdbc = new NamedParameterJdbcTemplate(dataSource);
    }

}
