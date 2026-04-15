package com.senai.backend.artemis_two_school.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Table (name = "turma")
@Entity
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    @Column(name = "nome")
    private String nome;

    @OneToMany
    @JoinColumn(name = "id_turma")
    @Column(name = "alunos")
    private List alunos;
    public Turma(Long id, String nome, List alunos) {
        this.id = id;
        this.nome = nome;
        this.alunos = alunos;
    }
    public Turma() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List getAlunos() {
        return alunos;
    }
    public void setAlunos(List alunos) {
        this.alunos = alunos;
    }
    


}
/*Definir os atributos privados na classe Turma: id, nome e alunos (sendo alunos do tipo
List)
15. Definir as anotações da classe Turma e de seus atributos (conforme a aula passada)
16. Definir o construtor default (sem parâmetros) na classe Turma
17. Definir o construtor parametrizado na classe Turma
18. Definir os métodos getters e setters da classe Turma
19. Definir a anotação de relacionamento no atributo alunos da classe Turma (consultar no
repositório da aula passada a sintaxe para isso)
20. Realizar o envio das alterações para o GitHub (utilizando os comandos: git config, git
status, git add ., git commit e git push)
21. Enviar o link do repositório como resposta na atividade do Google Classroom */