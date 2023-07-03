/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.com.senac.financasjpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
public class FinancasJPA {

    public static void main(String[] args) {
       
    EntityManagerFactory fabricaEntidade = Persistence.createEntityManagerFactory("Financas-PU");
    EntityManager manager = fabricaEntidade.createEntityManager();         
    /* Inserido  o obejeto no banco
    Despesa gasto = new Despesa();
    gasto.setDescricao("Primeira Despesa");
    gasto.setValor(10.50);
    gasto.setData(LocalDate.of(2022,5,30));
    
    manager.getTransaction().begin();
    manager.persist(gasto);
    manager.getTransaction().commit();    

    manager.close();
    fabricaEntidade.close();    */
    
    /* Recuperando o objeto no banco
     Despesa gasto = manager.find(Despesa.class, 1);
        System.out.println(gasto.getDescricao());
        manager.close();
      fabricaEntidade.close();*/
    
    
    /* Atualizando a despesa no banco
    Despesa gasto = manager.find(Despesa.class, 1);
    manager.getTransaction().begin();
    gasto.setDescricao("Despesa atualizada");
    manager.getTransaction().commit();
    
    manager.close();
    fabricaEntidade.close();*/
    
    /*Removendo objeto
     Despesa gasto = manager.find(Despesa.class, 1);
    manager.getTransaction().begin();
    manager.remove(gasto);
    manager.getTransaction().commit();    
    manager.close();
    fabricaEntidade.close();
    */
    
    
    }
}
