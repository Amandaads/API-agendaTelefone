package controllers;

import model.Contato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import service.ContatoService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContatoController {
    private ContatoService service;

    @Autowired
    public ContatoController (ContatoService service){
        this.service = service;

    }



   // public ResponseEntity<Contato> addContato(@RequestBody Contato contato) {

      //  return ResponseEntity.status(HttpStatus.CREATED).body(service.addContato(contato));
//    @PostMapping
//        return ResponseEntity.ok(service.addContato(contato));
//    }
    //}

//    @PostMapping ResponseEntity<Contato> addContato(@RequestBody Contato contato) {
//
//        var contatoCriado = service.addContato(contato);
//        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
//                .path("/{id}")
//                .buildAndExpand(contatoCriado.getId())
//                .toUri();
//                return ResponseEntity.created(location).body(contatoCriado);
//    }

    @PostMapping
    public ResponseEntity<Contato> addContato(@RequestBody Contato contato){
        Contato contatoNovo = service.addContato(contato);
        return ResponseEntity.status(HttpStatus.CREATED).body(contatoNovo);
    }
    @GetMapping("{/id}")
    public ResponseEntity<Contato> findById(@PathVariable Long id){
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<Contato>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

}
