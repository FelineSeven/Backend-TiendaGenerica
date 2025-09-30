/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uis.fabi.entornos.tallerbackend.servicio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uis.fabi.entornos.tallerbackend.modelo.Producto;
import uis.fabi.entornos.tallerbackend.repositorio.ProductoRepositorio;
import javax.transaction.Transactional;

import java.util.List;
import java.util.Optional;
/**
 *
 * @author FelineSeven
 */

@Service
@Transactional
public class ProductoServicio {
    
    @Autowired
    private ProductoRepositorio productoRepositorio;
    
    //Crear 
    public Producto crearProducto(Producto producto){
        return productoRepositorio.save(producto);
    }
    
    //Listar
    public List<Producto> listar(){
        return productoRepositorio.findAll();
        }
    
    //Buscar
    public Optional<Producto> buscarProducto(Integer id){
        return productoRepositorio.findById(id);
    }
    
    //Actualizar
    public Producto actualizarProducto(Integer id, Producto datosActualizados){
        Producto productoExistente = productoRepositorio.findById(id).orElseThrow(() -> new RuntimeException("No se encontró ningún producto con el ID: " + id));
        
        productoExistente.setNombre(datosActualizados.getNombre());
        productoExistente.setPrecioCompra(datosActualizados.getPrecioCompra());
        productoExistente.setPrecioVenta(datosActualizados.getPrecioVenta());
        productoExistente.setIvaCompra(datosActualizados.getIvaCompra());
        productoExistente.setIdProveedor(datosActualizados.getIdProveedor());
        
        return productoRepositorio.save(productoExistente);
    }
    
    //Eliminar
    public void eliminarProducto(Integer id){
        productoRepositorio.deleteById(id);
    }
}
