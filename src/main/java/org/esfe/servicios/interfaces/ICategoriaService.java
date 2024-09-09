package org.esfe.servicios.interfaces;

import org.esfe.dtos.categoria.*;
import org.springframework.data.domain.*;

import java.util.*;

public interface ICategoriaService {
    List<CategoriaSalida> obtenerTodos();

    Page<CategoriaSalida> obtenerTodosPaginados(Pageable pageable);

    CategoriaSalida obtenerPorId(Integer id);

    CategoriaSalida crear(CategoriaGuardar categoriaGuardar);

    CategoriaSalida editar(CategoriaModificar categoriaModificar);

    void eliminarPorId(Integer id);
}
