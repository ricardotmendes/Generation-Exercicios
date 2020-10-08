package lojagames.com.minhaLojaDeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import lojagames.com.minhaLojaDeGames.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	public List <Categoria> findAllByTipoContainingIgnoreCase (String tipo);
	
	public List <Categoria> findAllByMarcaContainingIgnoreCase (String marca);
	
	public List <Categoria> findAllByDescricaoContainingIgnoreCase (String descricao);
	
}
