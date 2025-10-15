/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uis.fabi.entornos.tallerbackend.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uis.fabi.entornos.tallerbackend.modelo.TipoDocumento;
import uis.fabi.entornos.tallerbackend.repositorio.TipoDocumentoRepositorio;

import java.util.List;
/**
 *
 * @author FelineSeven
 */
@RestController
@RequestMapping("/api/tipodocumento")
@CrossOrigin(origins = "*")
public class TipoDocumentoControlador {
    @Autowired
    private TipoDocumentoRepositorio tipoDocumentoRepositorio;

    @GetMapping
    public List<TipoDocumento> listarTodos() {
        return tipoDocumentoRepositorio.findAll();
    }

    @PostMapping
    public TipoDocumento crear(@RequestBody TipoDocumento tipoDocumento) {
        return tipoDocumentoRepositorio.save(tipoDocumento);
    }
}
