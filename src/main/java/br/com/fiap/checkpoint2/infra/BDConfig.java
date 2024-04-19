package br.com.fiap.checkpoint2.infra;

import br.com.fiap.checkpoint2.repository.mockup.ConsultaRepositoryMockup;
import br.com.fiap.checkpoint2.repository.mockup.PacienteRepositoryMockup;
import br.com.fiap.checkpoint2.repository.mockup.ProfissionalRepositoryMockup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BDConfig {

    @Autowired
    PacienteRepositoryMockup pacienteRepositoryMockup;

    @Autowired
    ProfissionalRepositoryMockup profissionalRepositoryMockup;

    @Autowired
    ConsultaRepositoryMockup consultaRepositoryMockup;


    @Bean
    public void preencheBanco() {
        pacienteRepositoryMockup.list();
        profissionalRepositoryMockup.list();
        consultaRepositoryMockup.list();
    }
}
