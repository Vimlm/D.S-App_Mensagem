package br.edu.up.model;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Anotacao {
  private String texto;
  private Date data = new Date();

  public Anotacao() {
  }

  public Anotacao(String texto, Date data) {
    this.texto = texto;
    this.data = data;
  }

  public Anotacao(String texto) {
    this.texto = texto;
  }

  public String getTexto() {
    return texto;
  }

  public void setTexto(String texto) {
    this.texto = texto;
  }

  public Date getData() {
    return data;
  }

  public void setData(Date data) {
    this.data = data;
  }

  SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

  //get data formatada
  public String getDataFormatada() {
    return dateFormat.format(data);
  }
}