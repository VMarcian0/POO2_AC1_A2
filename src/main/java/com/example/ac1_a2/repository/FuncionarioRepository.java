package com.example.ac1_a2.repository;

import com.example.ac1_a2.entidade.Funcionario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository <Funcionario, Integer>{
    
}