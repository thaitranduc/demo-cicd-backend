package thaitd.cicd.jenkins.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import thaitd.cicd.jenkins.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

}
