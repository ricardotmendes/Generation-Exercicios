package lojagames.com.minhaLojaDeGames.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import lojagames.com.minhaLojaDeGames.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	
	
	/*public List <Usuario> findAllByNomeContainingIgnoreCase(String nome);
	
	public List <Usuario> findAllByLoginContainingIgnoreCase (String email_login);
	
	public List <Usuario> findAllBySenhaContainingIgnoreCase (String senha);
	
	public List <Usuario> findAllByFuncionarioContainingIgnoreCase (boolean funcionario);
	*/
	
	
	
}
