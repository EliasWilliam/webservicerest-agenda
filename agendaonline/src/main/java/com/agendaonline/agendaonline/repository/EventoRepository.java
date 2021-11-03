package com.agendaonline.agendaonline.repository;

import com.agendaonline.agendaonline.models.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, String> {
}
