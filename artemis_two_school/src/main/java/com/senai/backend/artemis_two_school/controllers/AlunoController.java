package com.senai.backend.artemis_two_school.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.artemis_two_school.models.Aluno;

import com.senai.backend.artemis_two_school.services.AlunoService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
    @Autowired
    private AlunoService alunoService;

    @GetMapping("/contar-alunos")
    public Long contaralunos() {
        return alunoService.contarAluno();
    }

    @GetMapping("/buscar-aluno/(id)")
    public Aluno buscaraluno(@PathVariable Integer id) {
        return alunoService.buscarAluno(id);
    }

    @GetMapping("/listar-alunos/")
    public List<Aluno> listaralunos() {
        return alunoService.listarAlunos();
    }

    @DeleteMapping("/deletar-aluno/(id)")
    public String deletaraluno(@PathVariable Integer id) {
        if (alunoService.deletarAluno(id)) {
            return "Aluno deletado com sucesso";
        }
        return "Falha ao deletar o aluno";

    }

    @PostMapping("/salvar-aluno")
    public Aluno cadastraraluno(@RequestBody Aluno aluno) {
        return alunoService.cadastraraluno(aluno);
    }

    @PutMapping("/atualizar-aluno/(id)")

    public String atualizaraluno(@PathVariable Integer id, @RequestBody Aluno aluno) {
        if (alunoService.atualizarAluno(id, aluno) != null) {
            return "Aluno atualizado com sucesso";
        }
        return "Falha ao atualizar o aluno";
    }
}
