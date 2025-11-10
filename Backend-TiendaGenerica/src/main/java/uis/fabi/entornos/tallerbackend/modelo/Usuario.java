/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uis.fabi.entornos.tallerbackend.modelo;

import javax.persistence.*;
/**
 *
 * @author FelineSeven
 */
@Entity
@Table(name="usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name="idTipoDocumento", referencedColumnName="id")
    private TipoDocumento tipoDocumento;
    
    @Column(name="numeroDocumento")
    private String numeroDocumento;
    
    @Column(name="email")
    private String email;
    
    @Column(name="nombre")
    private String nombre;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String nombreUsuario;

    //Getters y Stters
    public Long getId() { 
        return id; 
    }
    public void setId(Long id) {
        this.id = id; 
    }

    public TipoDocumento getTipoDocumento() { 
        return tipoDocumento; 
    }
    public void setTipoDocumento(TipoDocumento tipoDocumento) { 
        this.tipoDocumento = tipoDocumento; 
    }

    public String getNumeroDocumento() { 
        return numeroDocumento; 
    }
    public void setNumeroDocumento(String numeroDocumento) { 
        this.numeroDocumento = numeroDocumento; 
    }

    public String getEmail() { 
        return email; 
    }
    public void setEmail(String email) { 
        this.email = email; 
    }

    public String getNombre() { 
        return nombre; 
    }
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }

    public String getPassword() { 
        return password; 
    }
    public void setPassword(String password) { 
        this.password = password; 
    }

    public String getNombreUsuario() { 
        return nombreUsuario; 
    }
    public void setNombreUsuario(String nombreUsuario) { 
        this.nombreUsuario = nombreUsuario; 
    }
}
