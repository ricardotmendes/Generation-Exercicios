package generation.org.blogPessoal.repository;

import java.util.List;

import  generation.org.blogPessoal.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemaRepository extends JpaRepository<Tema, Long>{
	public List<Tema> findAllByDescricaoContainingIgnoreCase (String descricao);

}
