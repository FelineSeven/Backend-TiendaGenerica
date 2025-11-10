/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package uis.fabi.entornos.tallerbackend.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uis.fabi.entornos.tallerbackend.modelo.TipoDocumento;
/**
 *
 * @author Portatil
 */
@Repository
public interface TipoDocumentoRepositorio extends JpaRepository<TipoDocumento, Long> {
    
}
