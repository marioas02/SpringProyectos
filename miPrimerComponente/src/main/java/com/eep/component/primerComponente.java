package com.eep.component;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component("ejemploComponente")
public class primerComponente {

	private static final Log LOG = LogFactory.getLog(primerComponente.class);

	public void msg() {
		LOG.error("Pues ya estaría");
	}
}
