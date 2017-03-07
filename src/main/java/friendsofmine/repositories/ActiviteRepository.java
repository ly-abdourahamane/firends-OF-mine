package friendsofmine.repositories;

import friendsofmine.domain.Activite;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by 21207221 on 06/03/2017.
 */
public interface ActiviteRepository extends PagingAndSortingRepository<Activite,Long> {

}
