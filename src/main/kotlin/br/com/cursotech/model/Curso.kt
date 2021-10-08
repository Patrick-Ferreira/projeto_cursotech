package br.com.cursotech.model

import javax.persistence.*

@Entity
data class Curso (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @Column (nullable = false, length = 30)
    val nome: String,
    val descricao: String
        )