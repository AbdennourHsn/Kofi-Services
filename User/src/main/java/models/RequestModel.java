package models;
import lombok.Data;

@Data
public class RequestModel {
	private String token;
	public RequestModel(String token) {
		this.token=token;
	}
	public String getData() {
		return token;
	}
	public void setData(String data) {
		this.token = data;
	}
}
