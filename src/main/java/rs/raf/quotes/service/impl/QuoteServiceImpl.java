package rs.raf.quotes.service.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import rs.raf.quotes.domain.QuoteDto;
import rs.raf.quotes.domain.Quotes;
import rs.raf.quotes.domain.ResponseWrapper;
import rs.raf.quotes.service.QuoteService;

@Service
public class QuoteServiceImpl implements QuoteService {

	@Override
	public QuoteDto getQuoteOfTheDay() throws JsonMappingException, JsonProcessingException, RestClientException {

		RestTemplate restTemplate = new RestTemplate();
		String url = "http://quotes.rest/qod.json";

		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
		
		
		ObjectMapper mapper = new ObjectMapper();
		
		JsonNode root = mapper.readTree(response.getBody());
		
		System.out.println(root.toString());
		
		ResponseWrapper responseWrapper = mapper.treeToValue(root, ResponseWrapper.class);
		
		QuoteDto qDto = new QuoteDto();
		
		Quotes q = responseWrapper.getContents().getQuotes()[0];
		qDto.setAuthor(q.getAuthor());
		qDto.setCategory(q.getCategory());
		qDto.setCopyright(responseWrapper.getContents().getCopyright());
		qDto.setLength(q.getLength());
		qDto.setQuote(q.getQuote());
		qDto.setTags(q.getTags());
		qDto.setTitle(q.getTitle());

		return qDto;
	}

}
