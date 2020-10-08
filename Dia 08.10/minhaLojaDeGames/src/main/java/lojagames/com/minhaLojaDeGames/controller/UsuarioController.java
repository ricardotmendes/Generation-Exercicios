package lojagames.com.minhaLojaDeGames.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lojagames.com.minhaLojaDeGames.model.Usuario;

import lojagames.com.minhaLojaDeGames.repository.UsuarioRepository;



@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class UsuarioController {

	@Autowired
	private UsuarioRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> findAllUsuario(){
		return ResponseEntity.ok(repository.findAll());
	}

	@GetMapping("/id/{id}")
	public ResponseEntity<Usuario> findUsuarioByID(@PathVariable long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	
	/*
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Usuario>> findUsuarioByNome(@PathVariable String nome){
		return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));
	}
	
	@GetMapping("/email_login/{email_login}")
	public ResponseEntity<List<Usuario>> findUsuarioByEmail(@PathVariable String email_login){
		return ResponseEntity.ok(repository.findAllByEmailContainingIgnoreCase(email_login));
	}
	
	@GetMapping("/senha/{senha}")
	public ResponseEntity<List<Usuario>> findUsuarioBySenha(@PathVariable String senha){
		return ResponseEntity.ok(repository.findAllBySenhaContainingIgnoreCase(senha));
	}
	
	/*@GetMapping("/funcionario/{funcionario}")
	public ResponseEntity<List<Usuario>> findFuncionario(@PathVariable boolean funcionario){
		return ResponseEntity.ok(repository.findAllByFuncionarioContainingIgnoreCase(funcionario));
	} 
	*/
	
	
	
	@PostMapping
	public ResponseEntity<Usuario> postUsuario (@RequestBody Usuario usuario){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(repository.save(usuario));
	}

	@PutMapping
	public ResponseEntity<Usuario> putUsuario (@RequestBody Usuario usuario){
		return ResponseEntity.ok(repository.save(usuario));				
	}
	
	@DeleteMapping("/{id}")
	public void deleteUsuario(@PathVariable long id) {
		repository.deleteById(id);
	}
	
	
	
}
