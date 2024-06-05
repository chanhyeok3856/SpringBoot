package min.boot.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import min.boot.jpa.entity.Dept;

public interface DeptRepository extends JpaRepository<Dept, Integer>{
}
