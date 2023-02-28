package com.iticket.service;

import com.iticket.entity.Concierto;
import com.iticket.repository.ConciertoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ConciertoService {
    
    @Autowired
    private ConciertoRepository conciertoRepository;
    
    public void guardarConcierto(Concierto concierto){
        conciertoRepository.save(concierto);
    }
    
    public List<Concierto> verConcierto(){
       return (List<Concierto>)conciertoRepository.findAll();
        
    }
    
    public void eliminarConcierto(Concierto concierto){
        conciertoRepository.delete(concierto);
    }
}
