package br.com.fiap.checkpoint2.repository.mockup;

import br.com.fiap.checkpoint2.model.Paciente;
import br.com.fiap.checkpoint2.model.Profissional;
import br.com.fiap.checkpoint2.repository.PacienteRepository;
import br.com.fiap.checkpoint2.repository.ProfissionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProfissionalRepositoryMockup {

    @Autowired
    ProfissionalRepository profissionalRepository;

    public void list() {
        List<Profissional> result = new ArrayList<>();

        result.add(new Profissional("Roberto", "pé", 1000.00 ,LocalDateTime.now(), LocalDateTime.now()));
        result.add(new Profissional("Sérgio", "ombro", 2000.00,LocalDateTime.now(), LocalDateTime.now()));
        result.add(new Profissional("Isadora", "joelho", 5000.00 ,LocalDateTime.now(), LocalDateTime.now()));

        profissionalRepository.saveAll(result);
    }

}
