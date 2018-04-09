package com.kyj.demo.mapper;

import java.util.List;

import com.kyj.demo.datasources.DataSourceNames;
import com.kyj.demo.datasources.annotation.DataSource;
import com.kyj.demo.entity.UserEntity;


public interface UserMapper {
	
	@DataSource(name = DataSourceNames.SECOND)
	List<UserEntity> getAll();
	
	UserEntity getOne(Long id);

	void insert(UserEntity user);

	void update(UserEntity user);

	void delete(Long id);

}