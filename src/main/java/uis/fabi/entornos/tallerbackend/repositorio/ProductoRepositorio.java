/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package uis.fabi.entornos.tallerbackend.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import uis.fabi.entornos.tallerbackend.modelo.Producto;

/**
 *
 * @author Portatil
 */
public interface ProductoRepositorio extends JpaRepository<Producto, Integer> {
    
}
