package com.sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {
        	String fileUrl = DroolsTest.class.getResource("/json/req.json").getFile();
        	FileReader fr = new FileReader(new File(fileUrl));
        	BufferedReader br = new BufferedReader(fr);
        	String line = null;
        	StringBuilder sb = new StringBuilder();
        	while ((line = br.readLine()) != null) {
        		sb.append(line);
        	}
        	JsonObject jsonObj = new JsonParser().parse(sb.toString()).getAsJsonObject();
        	ProposalInitiation pi = new Gson().fromJson(jsonObj, ProposalInitiation.class);
        	
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

            // go !
            Message message = new Message();
            message.setMessage("Hello World");
            message.setStatus(Message.HELLO);
            kSession.insert(message);
            kSession.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public static class Message {

        public static final int HELLO = 0;
        public static final int GOODBYE = 1;

        private String message;

        private int status;

        public String getMessage() {
            return this.message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public int getStatus() {
            return this.status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

    }

}
