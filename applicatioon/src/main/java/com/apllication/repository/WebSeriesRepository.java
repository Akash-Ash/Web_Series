package com.apllication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apllication.model.WebseriesModel;

public interface WebSeriesRepository extends JpaRepository<WebseriesModel, String>{

	List<WebseriesModel> findByName(String name);

}
