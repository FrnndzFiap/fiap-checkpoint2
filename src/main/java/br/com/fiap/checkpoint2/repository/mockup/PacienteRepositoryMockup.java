package br.com.fiap.checkpoint2.repository.mockup;

import br.com.fiap.checkpoint2.model.Paciente;
import br.com.fiap.checkpoint2.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class PacienteRepositoryMockup {

    @Autowired
    PacienteRepository pacienteRepository;

    public void list() {
        List<Paciente> result = new ArrayList<>();

        result.add(new Paciente("João", "rua 1", "bairro", "joao@gmail.com", "111", LocalDate.parse("2000-06-06"), LocalDateTime.now(), LocalDateTime.now()));
        result.add(new Paciente("Maria", "rua 2", "bairro", "maria@gmail.com", "222", LocalDate.parse("2000-07-07"), LocalDateTime.now(), LocalDateTime.now()));
        result.add(new Paciente("Carlos", "rua 3", "bairro", "carlos@gmail.com", "333", LocalDate.parse("2000-07-07"), LocalDateTime.now(), LocalDateTime.now()));

        pacienteRepository.saveAll(result);
    }



}
