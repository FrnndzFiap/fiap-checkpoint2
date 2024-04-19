package br.com.fiap.checkpoint2.controller;

import br.com.fiap.checkpoint2.model.Paciente;
import br.com.fiap.checkpoint2.model.Profissional;
import br.com.fiap.checkpoint2.repository.PacienteRepository;
import br.com.fiap.checkpoint2.repository.ProfissionalRepository;
import br.com.fiap.checkpoint2.repository.mockup.PacienteRepositoryMockup;
import br.com.fiap.checkpoint2.repository.mockup.ProfissionalRepositoryMockup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/profissionais")
public class ProfissionalController {

    @Autowired
    private ProfissionalRepository profissionalRepository;
    @Autowired
    private ProfissionalRepositoryMockup profissionalRepositoryMockup;

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public String lista(Model model) {
        List<Profissional> profissionais = profissionalRepository.findAll();
        model.addAttribute("profissionais", profissionais);
        return "profissional/lista.html";
    }

}
