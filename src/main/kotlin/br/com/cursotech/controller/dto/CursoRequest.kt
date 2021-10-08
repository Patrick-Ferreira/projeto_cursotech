package br.com.cursotech.controller.dto

import javax.validation.constraints.Max
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size


class CursoRequest (
    @field: [NotBlank Max (30)]
    val  nome: String,
    val descricao: String
        )