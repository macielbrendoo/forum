package br.com.curso.alura.forum.controller;

import br.com.curso.alura.forum.controller.dto.TopicoDto;
import br.com.curso.alura.forum.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TopicosController {

    @Autowired
    private TopicoRepository topicoRepository;

    @RequestMapping("/topicos")
    public List<TopicoDto> lista(String nomeCurso) {
        if(nomeCurso == null) {
            var topicos = topicoRepository.findAll();
            return TopicoDto.converter(topicos);
        } else {
            var topicos = topicoRepository.findByCursoNome(nomeCurso);
            return TopicoDto.converter(topicos);
        }
    }
}
