package com.example.ac1_a2.services;

import java.util.List;

import com.example.ac1_a2.entidade.*;
import com.example.ac1_a2.repository.FuncionarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioServices {
    @Autowired
    private FuncionarioRepository repository;

    public List<Funcionario> getFuncionarios(){
        return repository.findAll();
    }

    public void insertFuncionario (Funcionario funcionario){
        repository.save(funcionario);
    }
}