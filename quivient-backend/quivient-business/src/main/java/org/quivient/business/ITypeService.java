package org.quivient.business;

import org.quivient.business.model.Type;

public interface ITypeService {

	/**
	 * Méthode qui récupère un type ayant l'identidiant passé en paramètre
	 * @param id identifiant du type à récupérer	
	 * @return l'objet type désiré
	 */
	Type getTypeById(Integer id);
}
