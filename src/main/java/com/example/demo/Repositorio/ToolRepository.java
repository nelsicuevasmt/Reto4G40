/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Repositorio;

import com.example.demo.Interface.ToolInterface;
import com.example.demo.Modelo.Tool;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author casa2023
 */

@Repository /*anotación para declarar la clase como un repositorio*/

public class ToolRepository {
     @Autowired /*sirve para poder traer métodos de otras clases o interfaces*/
    private ToolInterface extencionesCrud;
    
    public List <Tool> getAll(){
        return (List<Tool>) extencionesCrud.findAll();
    }
    
    public Optional <Tool> getTool(int id){
        return extencionesCrud.findById(id);
    }
    
    public Tool save (Tool tool) {
        return extencionesCrud.save(tool);
    }
    
     public void delete(Tool tool){  /*este métod se utiliza para ingresar con ese id y borrrar*/
        extencionesCrud.delete(tool);
     }
}
