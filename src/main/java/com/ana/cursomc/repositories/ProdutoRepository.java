package com.ana.cursomc.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ana.cursomc.domain.Categoria;
import com.ana.cursomc.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

	//Usando JPQL
	@Transactional(readOnly=true)
	@Query("SELECT DISTINCT obj FROM Produto obj INNER JOIN obj.categorias cat WHERE obj.nome LIKE %:nome% AND cat IN :categorias")
	
	
	/**Usando palavras reservadas no nome
	 * Ao criar o nome do metodo usando palavras reservadas e colocando os nomes da variaveis
	 * o srping entende o que deve ser feito
	 * Referência: https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods
	 */
	Page<Produto> findDistinctByNomeContainingAndCategoriasIn(@Param("nome") String nome, @Param("categorias") List<Categoria> categorias, Pageable pageRequest);
	
}
