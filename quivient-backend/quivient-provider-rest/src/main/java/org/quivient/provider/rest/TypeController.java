package org.quivient.provider.rest;

import org.quivient.business.ITypeService;
import org.quivient.business.model.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * SalarieController : Class controller permettant d'envoyer des salariés en
 * json dans les urls définis.
 */
@RestController
@RequestMapping(value = "/api/private")
public class TypeController {

	// URL
	public static final String URL_TYPE_BY_ID = "/types/{id}";

	@Autowired
	private ITypeService typeService;

	/**
	 * Méthode qui envoie en json le salarie demandé à l'url spécifiée.
	 *
	 * @param codeIdent
	 *            le codeIdent du salarie demandé
	 * @return salarie en json demandé
	 */
	@RequestMapping(value = URL_TYPE_BY_ID, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Type> type(

	@PathVariable(value = "id") Integer id) {

		Type type = null;

		// On recupere le type
		type = typeService.getTypeById(id);

		return new ResponseEntity<Type>(type, HttpStatus.OK);
	}
	
}