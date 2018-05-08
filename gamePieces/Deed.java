package Monopoly.gamePieces;

class Deed {
  String Name;
  int Cost;
  int HouseCost;
  int[] rent;
  boolean Owned;
  int Owner;
  int Houses;

  int Mortgage;

  int getRent(int noOfHouses) { return rent[noOfHouses];}

  int getCost() { return Cost;}

  int getHouseCost() {return HouseCost;}

  int getMortgage() {return Mortgage;}

  String getName() {return Name;}

  int getOwner() {return Owner;}

  void setOwned() {Owned = true;}

  void setHouses(int value) {Houses = value;}

  int getHouses() {return Houses;}

  Deed(String name, int cost, int mortgage, int houseCost, int basic, int one, int two, int three, int four, int hotel) {
    rent = new int[6];

    rent[0] = basic;
    rent[1] = one;
    rent[2] = two;
    rent[3] = three;
    rent[4] = four;
    rent[5] = hotel;
   
    Name = name;

    Cost = cost;

    Mortgage = mortgage;

    HouseCost = houseCost;

    Owner = -1;


    Owned = false;
  }
}
