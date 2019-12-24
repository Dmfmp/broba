package rs.raf.quotes.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import rs.raf.quotes.domain.QuoteDto;

public interface QuoteService {

	public QuoteDto getQuoteOfTheDay() throws JsonMappingException, JsonProcessingException;
	
}
