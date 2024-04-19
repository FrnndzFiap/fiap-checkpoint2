package br.com.fiap.checkpoint2.controller;

import br.com.fiap.checkpoint2.model.Consulta;
import br.com.fiap.checkpoint2.repository.ConsultaRepository;
import br.com.fiap.checkpoint2.repository.mockup.ConsultaRepositoryMockup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/consultas")
public class ConsultaController {

    @Autowired
    private ConsultaRepository consultaRepository;
    @Autowired
    private ConsultaRepositoryMockup consultaRepositoryMockup;

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public String lista(Model model) {
        List<Consulta> consultas = consultaRepository.findAll();
        model.addAttribute("consultas", consultas);
        return "consulta/lista.html";
    }

}
