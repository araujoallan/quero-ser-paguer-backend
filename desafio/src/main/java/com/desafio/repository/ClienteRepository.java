package com.desafio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.desafio.model.Cliente;

@RepositoryRestResource(collectionResourceRel = "cliente", path = "clientes")
public interface ClienteRepository extends PagingAndSortingRepository<Cliente, Integer> {

	 /**
     * Método que retorna uma lista de clientes nome passado como parâmetro.
     *  
     * @param nome
     * @return lista de clientes
     */
    List<Cliente> findByNome(@Param("nome") String nome);
     
    
    /**
     * Método que retorna o cliente id passado como parâmetro.
     * 
     * @param id
     * @return cliente do id passado como parâmetro.
     */  
    @Query("SELECT c.nome FROM Cliente c where c.id = :id") 
    Cliente findNomeById(@Param("id") int id);
     

}
