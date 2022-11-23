package model;

public class Player {

  String name;
  PlayerType type;

  public Player(String name, PlayerType type) {
    this.name = name;
    this.type = type;
  }

  public PlayerType getType() {
    return type;
  }

  public void setType(PlayerType type) {
    this.type = type;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String toString() {
    return this.name;
  }
}
