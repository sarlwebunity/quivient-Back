package org.quivient.business.impl;

import javax.annotation.Resource;

import org.quivient.business.ITypeService;
import org.quivient.business.model.Type;
import org.quivient.dao.entity.TypeEntity;
import org.quivient.dao.repository.ITypeRepository;
import org.springframework.stereotype.Service;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

@Service
public class TypeServiceImpl implements ITypeService{

	@Resource
	private ITypeRepository typeRepository;
	
	private Mapper mapper = new DozerBeanMapper();
	
	@Override
	public Type getTypeById(Integer id) {
		
		TypeEntity typeEntity = typeRepository.findOne(id);
		Type type = mapper.map(typeEntity, Type.class);
		
		return type;
		
	}

	
}
