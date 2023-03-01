package com.iticket.controller;

import com.iticket.entity.Concierto;
import com.iticket.service.ConciertoService;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ConciertoController {

    @Autowired
    ConciertoService conciertoService;

    @GetMapping("/conciertoN")
    public String crearPersona(Model model) {
        List<Concierto> listaConciertos = conciertoService.verConcierto();
        model.addAttribute("concierto", new Concierto());//"persona"-> como lo leemos en el html //envia el objeto al html
        model.addAttribute("conciertos", listaConciertos);
        return "crear";
    }

    @GetMapping("/listaConciertos")
    public String index(Model model) {
        List<Concierto> listaConcierto = conciertoService.verConcierto();
        model.addAttribute("titulo", "Tabla Concierto");
        model.addAttribute("concierto", listaConcierto);
        return "listaConciertos";
    }

    @GetMapping("/delete/{id}")
    public String eliminar(Concierto concierto) {
        conciertoService.eliminarConcierto(concierto);
        return "redirect:/listaConciertos";
    }
    
    @PostMapping("/save")
    public String guardarConcierto(@ModelAttribute Concierto concierto){
        conciertoService.guardarConcierto(concierto);
        return "redirect:/";
    }
}
