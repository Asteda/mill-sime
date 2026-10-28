package fr.ippon.mill.cereals;

public class cereals {
  private int id;
  private CerealType type;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public CerealType getType() {
    return type;
  }

  public void setType(CerealType type) {
    this.type = type;
  }

  public enum CerealType {
    Ble,
    Avoine,
      Orge,
    Houblon
    }
}
