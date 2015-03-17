package bl.manager;

import persistance.data.generic.Speaker;
import persistance.factory.Factory;

public class SpeakerManager {

	private Factory factory;
	private Speaker speaker;
	
	public SpeakerManager(){
    	factory = Factory.getInstance();
	}
	
	public String handleSubscribe(String login, String job) {
		speaker = factory.makeSpeaker();
		
		speaker.setJob(job);

		return speaker.save(login);
	}
}