package rs.raf.quotes.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseWrapper {

	private Contents contents;

	private Success success;
	
	public Contents getContents() {
		return contents;
	}

	public void setContents(Contents contents) {
		this.contents = contents;
	}

	public Success getSuccess() {
		return success;
	}

	public void setSuccess(Success success) {
		this.success = success;
	}

	@Override
	public String toString() {
		return "ResponseWrapper [contents=" + contents + ", success=" + success + "]";
	}
}
