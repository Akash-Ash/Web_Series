package com.apllication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apllication.model.WebseriesModel;
import com.apllication.service.WebSeriesService;

@RestController
public class WebSeriesController {
	
	@Autowired
	WebSeriesService wss;
	
	@PostMapping("/addSeries")
	public void addSeries(@RequestBody WebseriesModel wsm)
	{
		wss.addWebSeries(wsm);
	}
	
	@GetMapping("/series")
	public List<WebseriesModel> getAllSeries()
	{
		return wss.allSeries();
	}
	
	@GetMapping("/series/id/{id}")
	public WebseriesModel getSeriesById(@PathVariable("id") String id)
	{
		return wss.seriesById(id);
	}
	
	@GetMapping("/series/name/{name}")
	public List<WebseriesModel> getSeriesByname(@PathVariable("name") String name)
	{
		return wss.seriesByName(name);
	}
	
	@PutMapping("/update")
	public void updateSeries(@RequestBody WebseriesModel wsm)
	{
		wss.addWebSeries(wsm);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteSeries(@PathVariable("id") String id)
	{
		return wss.delete(id);
	}
	
	
	

}
