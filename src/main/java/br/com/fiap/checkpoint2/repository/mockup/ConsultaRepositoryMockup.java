package br.com.fiap.checkpoint2.repository.mockup;

import br.com.fiap.checkpoint2.model.Consulta;
import br.com.fiap.checkpoint2.model.StatusConsulta;
import br.com.fiap.checkpoint2.repository.ConsultaRepository;
import br.com.fiap.checkpoint2.repository.PacienteRepository;
import br.com.fiap.checkpoint2.repository.ProfissionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ConsultaRepositoryMockup {

    @Autowired
    ConsultaRepository consultaRepository;
    @Autowired
    PacienteRepository pacienteRepository;
    @Autowired
    ProfissionalRepository profissionalRepository;


    public void list() {
        List<Consulta> result = new ArrayList<>();

        result.add(new Consulta(profissionalRepository.findById((long)1).get(), pacienteRepository.findById((long)1).get(), LocalDateTime.parse("2024-04-22T10:15:30"),
                StatusConsulta.AGENDADA, 2.00));
        result.add(new Consulta(profissionalRepository.findById((long)2).get(), pacienteRepository.findById((long)2).get(), LocalDateTime.parse("2024-04-28T10:15:30"),
                StatusConsulta.REALIZADA, 4.00));
        result.add(new Consulta(profissionalRepository.findById((long)3).get(), pacienteRepository.findById((long)3).get(), LocalDateTime.parse("2024-04-22T10:12:30"),
                StatusConsulta.CANCELADA, 6.00));

        consultaRepository.saveAll(result);
    }

}
