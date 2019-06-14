package com.sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.apache.poi.util.IOUtils;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sample.vall.value;

/**
 * This is a sample file to launch a process.
 */
public class ProcessTest {

    public static final void main(String[] args) {
        try {
        	
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");
        	
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
        	
        	kSession.insert(pi);
        	kSession.fireAllRules();
            // start a new process instance
            kSession.startProcess("sampletest");
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}
