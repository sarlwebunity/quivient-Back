package org.quivient.dao.repository;

import org.quivient.dao.entity.TypeEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Accès aux données Type.
 *
 * @author freboul
 */
public interface ITypeRepository extends PagingAndSortingRepository<TypeEntity, Integer> {
	
	/**
	 * Methode qui recherche un type par rapport à son id
	 *
	 * @param id
	 *            id du type recherché
	 * @return typeEntity - le type recherché
	 */
	@Override
	TypeEntity findOne(Integer id);
}
