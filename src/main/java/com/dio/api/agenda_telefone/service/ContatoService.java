package com.dio.api.agenda_telefone.service;

import com.dio.api.agenda_telefone.model.Contato;
import com.dio.api.agenda_telefone.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContatoService {
    private ContatoRepository repository;

    @Autowired
    public ContatoService(ContatoRepository repository){
        this.repository = repository;

    }

    public Contato addContato(Contato contato){
        return repository.save(contato);
    }

    public Contato findById(Long id){
        return repository.findById(id).get();
    }

    public List<Contato> findAll(){
        return repository.findAll();
    }


    //public Contato findByNome(String nome){
    // return repository.findByNome(nome).get()}

}
