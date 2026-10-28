package fr.ippon.mill.cereals;

import fr.ippon.mill.farmer.domain.Farmer;

import java.time.LocalDate;
import java.util.Date;

public class planification {
  private int id;
  private Farmer creator;
  private float quantity;
  private LocalDate date_livraison;
  private cereals cereals;


  public planification(Farmer creator, float quantity, LocalDate date_livraison, cereals cereals) {
    this.creator = creator;
    this.quantity = quantity;
    this.date_livraison = date_livraison;
    this.cereals = cereals;
  }

  public int getId() {
    return id;
  }

  public Farmer getCreator() {
    return creator;
  }

  public float getQuantity() {
    return quantity;
  }

  public LocalDate getDate_livraison() {
    return date_livraison;
  }

  public cereals getCereals() {
    return cereals;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setQuantity(float quantity) {

    this.quantity = quantity;
  }

  public void setDate_livraison(LocalDate date_livraison) {
    this.date_livraison = date_livraison;
  }

  public void setCereals(cereals cereals) {
    this.cereals = cereals;
  }
}
