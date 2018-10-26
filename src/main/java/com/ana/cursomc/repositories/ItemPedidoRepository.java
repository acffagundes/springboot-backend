package com.ana.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ana.cursomc.domain.ItemPedido;;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {

	//JpaRepository<Produto, Integer> -> <Objeto, tipo identificador(id)>
	
}
