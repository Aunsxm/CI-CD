/* 암기사항
 * - table vs entity vs ~ repository = 1 : 1 : 1
 */
package edu.fisa.ce;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface PeopleRepository extends CrudRepository<People,Long>{
	// select * from people where name =? and age=?
	List<People> findByPeopleNameAndAge(String peopleName, int age);
}
