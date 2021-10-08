package br.com.cursotech.controller

import br.com.cursotech.controller.dto.CursoRequest
import br.com.cursotech.model.Curso
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import java.util.*

@Controller("/api/v1/curso")
class CursoController {

    @Post
    fun salvar (@Body curso: CursoRequest) = curso
}