package com.mdmilkShakes.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;
import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;

import java.util.Objects;

import com.mdmilkShakes.models.Id_sequence;

@Service
public class SequenceService {

	@Autowired
	private static MongoOperations mongoOperations;
	
	
	public static int getSequence(String sequenceName) {
		
		Query query= new Query(Criteria.where("_id").is(sequenceName));
		
		Update update =new Update().inc("sequence", 1);
		
		Id_sequence id_sequence= mongoOperations.findAndModify(
				query, update, options().returnNew(true).upsert(true),Id_sequence.class);
		return !Objects.isNull(id_sequence)?id_sequence.getSequence():1;
	}


	
}
