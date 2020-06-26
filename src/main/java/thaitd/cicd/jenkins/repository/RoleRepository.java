package thaitd.cicd.jenkins.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import thaitd.cicd.jenkins.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
