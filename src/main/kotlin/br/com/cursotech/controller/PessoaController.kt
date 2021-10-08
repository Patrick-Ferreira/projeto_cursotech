package br.com.cursotech.controller

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/api/v1/pessoas")
class PessoaController {

    @Get
    fun nomeDaFuncao():String{
        return "Oi"
    }

}