package br.com.uemerson.MosquittoPub;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class MosquittoPubMain 
{
	private static String mensagem = "Ola mundo!";
	private static String topico = "/home/uemerson";
	private static String porta = "1883";
	private static String host = "localhost";
	
    public static void main( String[] args )
    {
    	
    	System.out.println("Publicando mensagem...");
    	
		try {
			
			MqttClient client = new MqttClient("tcp://" + host + ":" + porta, MqttClient.generateClientId());
			client.connect();
			MqttMessage message = new MqttMessage();
			message.setPayload(mensagem.getBytes());
			client.publish(topico, message);
			client.disconnect();
			
			System.out.println("Mensagem publicada!");
			
		} catch (MqttException e) {
			System.out.println(e.getMessage());
		}
    	
    }
}
