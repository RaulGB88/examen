package com.ad.examen.utility;

public class Constants {

	public static String REGEX_NOMBRES = "^(?=.{3,15}$)[A-ZÁÉÍÓÚ][a-zñáéíóú]+(?: [A-ZÁÉÍÓÚ][a-zñáéíóú]+)?$";
	public static String REGEX_NIF = "((([X-Z])|([LM])){1}([-]?)((\\d){7})([-]?)([A-Z]{1}))|((\\d{8})([-]?)([A-Z]))";
	public static String REGEX_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"; 
	public static String REGEX_CLAVE_SEGURIDAD = "^\\d{4}|\\d{6}$";
	public static String REGEX_CODIGOPOSTAL = "^[0-9]{5}";
	public static String REGEX_BANCO = "^[0-9]{4}";
	public static String REGEX_DC = "^[0-9]{2}";
	public static String REGEX_CUENTA = "^[0-9]{10}";
	public static String REGEX_NUMEROS = "^[0-9]";
	public static String REGEX_TELEFONO = "^[0-9]{9,15}";
	public static String REGEX_FECHA= "^(?:0?[1-9]|1[1-2])([\\-/.])(3[01]|[12][0-9]|0?[1-9])\\1\\d{4}$";
	
}
