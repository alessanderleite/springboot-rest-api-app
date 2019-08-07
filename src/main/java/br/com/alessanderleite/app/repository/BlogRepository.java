package br.com.alessanderleite.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alessanderleite.app.model.Blog;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer> {
	
	List<Blog> findByTitleContainingOrContentContaining(String text, String textAgain);
}
