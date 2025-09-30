/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uis.fabi.entornos.tallerbackend.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import uis.fabi.entornos.tallerbackend.modelo.Proveedor;

/**
 *
 * @author Portatil
 */


public interface ProveedorRepositorio extends JpaRepository<Proveedor, Long>{
    
    
}
