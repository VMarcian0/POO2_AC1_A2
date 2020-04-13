package com.example.ac1_a2.controle;


import com.example.ac1_a2.entidade.Funcionario;
import com.example.ac1_a2.services.FuncionarioServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * FuncionarioController
 */

@Controller 
public class FuncionarioController {

    @Autowired
    private FuncionarioServices service;

    //retorna todos os funcionarios cadastrados
    @GetMapping("/funcionarios")
    public ModelAndView getFuncionarios()
    {
        ModelAndView mv = new ModelAndView("funcionarios");
        mv.addObject("Funcionarios", service.getFuncionarios());
        return mv;
    }

    //tenta adicionar um funcionario e atualiza a lista de funcionarios cadastrados 
    @PostMapping("/salvar")
    public String funcionarioAddForm(@ModelAttribute Funcionario Funcionario)
    {
        service.insertFuncionario(Funcionario);
        return "redirect:/funcionarios"; //executa uma nova requesição "/funcionarios"
    }

}