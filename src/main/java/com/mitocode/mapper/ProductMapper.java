package com.mitocode.mapper;

import com.mitocode.model.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ProductMapper {

    @Select("SELECT * FROM Product")
    List<Product> findAll();

    @Select("SELECT * FROM Product WHERE id = #{id}")
    Product findById(@Param("id") int id);

    @Delete("DELETE FROM Product WHERE id = #{id}")
    int deleteById(@Param("id") int id);

    @Insert("INSERT INTO Product(id, name, status) VALUES (#{id}, #{name}, #{status})")
    int save(Product item);

    @Update("UPDATE Product SET name=#{name}, status=#{status} WHERE id=#{id}")
    int update(Product item);
}
