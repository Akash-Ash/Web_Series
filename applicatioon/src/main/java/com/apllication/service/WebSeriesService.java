package com.apllication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apllication.model.WebseriesModel;
import com.apllication.repository.WebSeriesRepository;

@Service
public class WebSeriesService {

	@Autowired
	WebSeriesRepository wsr;
	
	public void addWebSeries(WebseriesModel wsm) {
		wsr.save(wsm);
		
	}

	public List<WebseriesModel> allSeries() {
		
		return wsr.findAll();
	}

	public WebseriesModel seriesById(String id) {
		// TODO Auto-generated method stub
		return wsr.findById(id).get();
	}

	public List<WebseriesModel> seriesByName(String name) {
		// TODO Auto-generated method stub
		return wsr.findByName(name);
	}

	public void update(WebseriesModel wsm) {
		// TODO Auto-generated method stub
		
	}

	public String delete(String id) {
		try
		{
			wsr.deleteById(id);
			return "Series Removed! "+id;
		}
		catch(Exception e)
		{
			return "";
		}
	}
	
	

}
