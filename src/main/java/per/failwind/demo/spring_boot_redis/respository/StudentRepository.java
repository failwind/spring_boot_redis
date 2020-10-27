package per.failwind.demo.spring_boot_redis.respository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import per.failwind.demo.spring_boot_redis.db.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, String> {}
