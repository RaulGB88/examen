package com.ad.examen.utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.LoggerFactory;

public class Utility {

	/**
	 * Init log.
	 */
	private static final org.slf4j.Logger loggerController = LoggerFactory.getLogger(Utility.class);
	
	/**
	 * Validar campo
	 * @param campo
	 * @param regex
	 * @return Boolean
	 */
	public static Boolean validarCampo(String campo, String regex) {
		
		boolean error = false;
		
		Pattern pt = Pattern.compile(regex);
		Matcher mt = pt.matcher(campo);
		if(mt.matches()){
			loggerController.info("INFO - Validado correctamente");
		}else if(!mt.matches()){
			loggerController.error("ERROR - Validación incorrecta");
			error = true;
		}
		return error;
	}

}
