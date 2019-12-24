package rs.raf.quotes.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import rs.raf.quotes.domain.QuoteDto;
import rs.raf.quotes.service.QuoteService;

@RestController
@RequestMapping(value = "/quotes")
public class QuotesApi {
	
	private QuoteService quoteService;

	public QuotesApi(QuoteService quoteService) {
		super();
		this.quoteService = quoteService;
	}
	
	@RequestMapping(value = "/getQuote", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody QuoteDto getQuote() throws JsonMappingException, JsonProcessingException {
		return quoteService.getQuoteOfTheDay();
	}

}
