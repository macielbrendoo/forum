package br.com.curso.alura.forum.controller;

import br.com.curso.alura.forum.controller.dto.TopicoDto;
import br.com.curso.alura.forum.model.Curso;
import br.com.curso.alura.forum.model.Topico;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @RequestMapping("/topicos")
    public List<TopicoDto> lista() {
        var topic = new Topico("Dúvida", "Dúvida com Spring", new Curso("Spring", "Programação"));
        return TopicoDto.converter(Arrays.asList(topic, topic, topic));
    }
}
