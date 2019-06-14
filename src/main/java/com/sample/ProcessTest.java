package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

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
        	
        	value v =new vall.value();
            
        	kSession.insert(v);
        	kSession.fireAllRules();
            // start a new process instance
            kSession.startProcess("sampletest");
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}
