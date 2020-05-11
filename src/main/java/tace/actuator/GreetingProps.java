package tace.actuator;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "greeting")
@Component
public class GreetingProps {
	private String meessage;

	public String getMeessage() {
		return meessage;
	}

	public void setMeessage(String meessage) {
		this.meessage = meessage;
	}
}
