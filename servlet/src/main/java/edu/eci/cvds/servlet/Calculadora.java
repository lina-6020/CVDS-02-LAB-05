package edu.eci.cvds.servlet;
import edu.eci.cvds.servlet.model.Todo;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.swing.JOptionPane;

import java.lang.Math;
import java.util.ArrayList;

import static java.lang.Math.sqrt;

@ManagedBean(name="Calculadora")
@ApplicationScoped
public class Calculadora{
	private int longitud;
	private double varianza;
	private double estandar;
	private double modo;
	private double simbolo;
	private ArrayList<Double> numeros;
	
	
	public void calcular(String list) {
		try {
			numeros=new ArrayList<Double>();
			String [] lista=list.split(";");
			for (String cadena: lista) {
				double caracter = Double.parseDouble(cadena);
				numeros.add(caracter);
			}
		calcularTodo();
		}
	catch (Exception e) {
		reiniciar();
	}
	}
	public void reiniciar() {
		numeros=new ArrayList<Double>();
		numeros.add(0.0);
		calcularTodo();
	}
	public ArrayList<Double> getList(){
		return numeros;
	}
	public double getModo(){
		return modo;
	}
		
	public void setModo(Double modo) {
		this.modo=modo;
	}
	public double getSimbolo() {
		return simbolo;
	}
	public void setSimbolo(double simbolo) {
		this.simbolo=simbolo;
	}
	public double getVarianza() {
		return varianza;
	}
	public void setVarianza(double varianza) {
		this.varianza=varianza;
	}
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud=longitud;
	}
	public double getEstandar() {
		return estandar;
	}
	public void setEstandar(double estandar) {
		this.estandar=estandar;
	}
	
	private void calcularTodo() {
		setNumeros(numeros);
		calcularSimbolo(numeros);
		cacularModo(numeros);
		calcularVarianza(numeros);
		CalcularDesviacionEstandar(numeros);
	}
	private void setNumeros(ArrayList<Double> lista) {
		this.numeros=numeros;
		setLongitud(numeros.size());
		
		
	}
	private void CalcularDesviacionEstandar(ArrayList<Double> lista) {
		double varianzaACalcular=calcularVarianza(lista);
		estandar=Math.sqrt(varianzaACalcular);
		
	}
	private double calcularVarianza(ArrayList<Double> lista) {
		double estoy=0;
		varianza=0;
		for(Double numero:lista) {
			double potencia=simbolo-numero;
			estoy=estoy+Math.pow(potencia,2f);
		}
		varianza=estoy/(longitud-1);
		return varianza;
	}
	private void calcularSimbolo(ArrayList<Double> lista) {
		simbolo=0;
		for (Double numero:lista) {
			simbolo =simbolo+numero;
		}
		simbolo=simbolo/longitud;
	}
	private void cacularModo(ArrayList<Double> lista) {
		int tiempos=-1,contador;
		modo=0;
		for (int i=0;i<longitud;i++) {
			double estoy=numeros.get(i);
			contador=0;
			for(int j=i;j<longitud;j++) {
				if (lista.get(j)==estoy){
					contador=contador + 1;
				}
		}
		if (tiempos<contador) {
			modo=estoy;
			tiempos=contador;
		}
	  }
	}
	
}
