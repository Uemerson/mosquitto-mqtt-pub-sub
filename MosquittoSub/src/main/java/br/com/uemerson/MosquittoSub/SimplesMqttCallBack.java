package br.com.uemerson.MosquittoSub;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class SimplesMqttCallBack implements MqttCallback{
	public void connectionLost(Throwable throwable) {
	    System.out.println("Conexão ao MQTT broker perdida!");
	}
	
	public void messageArrived(String s, MqttMessage mqttMessage) throws Exception {
	    //System.out.println("Mensagem recebida:\n\t"+ new String(mqttMessage.getPayload()) );
		System.out.println(new String(mqttMessage.getPayload()));
	}
	
  	public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {}
}
