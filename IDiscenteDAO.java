package br.com.testecrud.dao;

//metodos que seram realizados nas operaçoes do CRUD

import br.com.testecrud.model.Discente;

import java.util.List;
import java.util.Optional;

public interface IDiscenteDAO {
    Discente save(Discente discente);
    Discente update(Discente discente);
    void delete(Long matricula);
    List<Discente> findAll();
    Optional<Discente> findBymatricula(Long matricula);

}
