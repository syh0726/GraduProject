package afk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import afk.entity.Afk;

@Repository
public interface AfkRepository extends JpaRepository<Afk,Integer> {

}
