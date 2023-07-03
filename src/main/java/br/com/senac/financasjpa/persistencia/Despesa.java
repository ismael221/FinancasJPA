/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.financasjpa.persistencia;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
@Entity
public class Despesa {
       
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private int id;
      
      private String descricao;
      
      private double valor;
  
      private LocalDate data;
  
      /**getters e setter
        * @return s*/
      public int getId() {
          return id;
      }
  
      public void setId(int id) {
          this.id = id;
      }
  
      public String getDescricao() {
          return descricao;
      }
  
      public void setDescricao(String descricao) {
          this.descricao = descricao;
      }
  
      public double getValor() {
          return valor;
      }
  
      public void setValor(double valor) {
          this.valor = valor;
      }
      
      public LocalDate getData() {
          return data;
      }
  
      public void setData(LocalDate data) {
          this.data = data;
      }
}
