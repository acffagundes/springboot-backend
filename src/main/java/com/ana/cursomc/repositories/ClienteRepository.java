package com.ana.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ana.cursomc.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

	//JpaRepository<Produto, Integer> -> <Objeto, tipo identificador(id)>
	
	@Transactional(readOnly=true)
	Cliente findByEmail(String email);
	
}
