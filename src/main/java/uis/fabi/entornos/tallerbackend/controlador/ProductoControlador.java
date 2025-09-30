/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uis.fabi.entornos.tallerbackend.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uis.fabi.entornos.tallerbackend.modelo.Producto;
import uis.fabi.entornos.tallerbackend.servicio.ProductoServicio;

import java.util.List;
import java.util.Optional;
/**
 *
 * @author FelineSeven
 */
@RestController
@RequestMapping("/api/productos")
public class ProductoControlador {
    
    @Autowired
    private ProductoServicio productoServicio;
    
    //Crear
    @PostMapping()
    public ResponseEntity<Producto> crearProducto(@RequestBody Producto producto){
        Producto nuevoProducto = productoServicio.crearProducto(producto);
                return ResponseEntity.ok(nuevoProducto);     
    }
    
    //Listar
    @GetMapping()
    public ResponseEntity<List<Producto>> listarProductos(){
        List<Producto> productos = productoServicio.listar();
        return ResponseEntity.ok(productos);
    }
    
    //Buscar
    @GetMapping("/{id}")
    public ResponseEntity<Producto> buscarProducto(@PathVariable Integer id){
        Optional<Producto> producto = productoServicio.buscarProducto(id);
        return producto.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
    
    //Actualizar
    @PutMapping("/{id}")
    public ResponseEntity<Producto> actualizarProducto(@PathVariable Integer id, @RequestBody Producto datosActualizados){
        try{
            Producto productoActualizado = productoServicio.actualizarProducto(id, datosActualizados);
            return ResponseEntity.ok(productoActualizado);
        }
        catch(RuntimeException e){
            return ResponseEntity.notFound().build(); 
        }
    }
    
    //Eliminar
    @DeleteMapping("/{id}")
    public ResponseEntity<Producto> eliminarProducto(@PathVariable Integer id){
        productoServicio.eliminarProducto(id);
        return ResponseEntity.noContent().build();
    }
}
