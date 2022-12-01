package kodlama.io.devs.dataAccess.abstracts;

import kodlama.io.devs.entities.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LanguageRepository extends JpaRepository <Language,Integer>{

}
