package com.example.onlinehealthconsultancy.onlinehealthconsultancy.service;

import java.util.List;

import com.example.onlinehealthconsultancy.onlinehealthconsultancy.entity.Consultancy;

public interface ConsultancyService {
	
	public void addConsultancy(Consultancy consultancy);
	public void deleteConsultancy(Consultancy consultancy);
	public List<Consultancy> getAllConsultancy();
	public Consultancy updateConsultancy(Consultancy consultancy);
	public Consultancy getConsultancy(Integer id);
}
                                                