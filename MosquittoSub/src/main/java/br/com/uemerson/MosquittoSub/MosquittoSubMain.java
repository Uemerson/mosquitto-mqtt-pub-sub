package br.com.uemerson.MosquittoSub;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;

public class MosquittoSubMain{
	private static String porta = "1883";
	private static String host = "localhost";
	private static String topico = "/home/uemerson";
	
    public static void main( String[] args )
    {
    	
		try {
			
			MqttClient client = new MqttClient("tcp://" + host + ":" + porta, MqttClient.generateClientId());
	    	client.setCallback( new SimplesMqttCallBack());
	    	client.connect();
	    	client.subscribe(topico);
	    	
		} catch (MqttException e) {
			System.out.println(e.getMessage());
		}
    }

}
