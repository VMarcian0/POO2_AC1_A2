package com.example.ac1_a2.entidade;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Funcionario implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    //
    // Preciso alterar o métodod da chave primária:
    // Mudar para ser um número de registro geral
    // Validação de CPF é muito complexa
    //
    // <>atributos<>
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int registro;
    private int cpf;
    // cpf is primaty key

    public Funcionario(int registro, int cpf, String nome, String cargo, String departamento, Float salario) {
        this.registro = registro;
        this.cpf = cpf;
        this.nome = nome;
        this.cargo = cargo;
        this.departamento = departamento;
        this.salario = salario;
    }

    public int getRegistro() {
        return this.registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public Funcionario registro(int registro) {
        this.registro = registro;
        return this;
    }
    private String nome;
    private String cargo;
    private String departamento;
    private Float salario;
    // <\>atributos<\>

    public Funcionario() {
    }

    public int getCpf() {
        return this.cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Float getSalario() {
        return this.salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public Funcionario cpf(int cpf) {
        this.cpf = cpf;
        return this;
    }

    public Funcionario nome(String nome) {
        this.nome = nome;
        return this;
    }

    public Funcionario cargo(String cargo) {
        this.cargo = cargo;
        return this;
    }

    public Funcionario departamento(String departamento) {
        this.departamento = departamento;
        return this;
    }

    public Funcionario salario(Float salario) {
        this.salario = salario;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Funcionario)) {
            return false;
        }
        Funcionario funcionario = (Funcionario) o;
        return cpf == funcionario.cpf && Objects.equals(nome, funcionario.nome) && Objects.equals(cargo, funcionario.cargo) && Objects.equals(departamento, funcionario.departamento) && Objects.equals(salario, funcionario.salario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf, nome, cargo, departamento, salario);
    }

    @Override
    public String toString() {
        return "{" +
            " cpf='" + getCpf() + "'" +
            ", nome='" + getNome() + "'" +
            ", cargo='" + getCargo() + "'" +
            ", departamento='" + getDepartamento() + "'" +
            ", salario='" + getSalario() + "'" +
            "}";
    }

}