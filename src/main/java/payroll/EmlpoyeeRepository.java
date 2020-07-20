package payroll;

import org.springframework.data.jpa.repository.JpaRepository;

interface EmlpoyeeRepository extends JpaRepository<Employee, Long> {

}
