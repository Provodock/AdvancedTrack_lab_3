package org.example.pryklady;

public class Povidomlennya {
  private int id;
  private String text;
  private String date;

  public Povidomlennya() {}

  public int getId() { return id; }
  public void setId(int id) { this.id = id; }

  public String getText() { return text; }
  public void setText(String text) { this.text = text; }

  public String getDate() { return date; }
  public void setDate(String date) { this.date = date; }
}