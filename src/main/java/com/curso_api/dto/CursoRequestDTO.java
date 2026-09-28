package com.curso_api.dto;

public record CursoRequestDTO(

        String nome,
        String descricao,
        Integer cargaHoraria,
        Long instrutorId
) {
}
