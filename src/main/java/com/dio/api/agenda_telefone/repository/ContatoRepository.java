package com.dio.api.agenda_telefone.repository;

import com.dio.api.agenda_telefone.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Long> {

}
