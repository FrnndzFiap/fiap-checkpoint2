package br.com.fiap.checkpoint2.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity(name = "consultas")
@Table(name = "consultas")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "profissionalId")
    private Profissional profissional;

    @ManyToOne
    @JoinColumn(name = "pacienteId")
    private Paciente paciente;

    private LocalDateTime dataConsulta;

    private StatusConsulta statusConsulta;

    private Double quantidadeHoras;

    private Double valorConsulta;


    public Consulta(Profissional profissional, Paciente paciente, LocalDateTime dataConsulta,StatusConsulta statusConsulta,Double quantidadeHoras) {
        this.profissional = profissional;
        this.paciente = paciente;
        this.dataConsulta = dataConsulta;
        this.statusConsulta = statusConsulta;
        this.quantidadeHoras = quantidadeHoras;
        this.valorConsulta = quantidadeHoras*profissional.getValorHora();
    }
}
