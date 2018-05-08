package Monopoly.gamePieces;

public class Builder {
  public Deed lookup(int space) {
    String name = "";
    int cost = 0;
    int mortgage = 0;
    int houseCost = 0;
    int basic = 0;
    int one = 0;
    int two = 0;
    int three = 0;
    int four = 0;
    int hotel = 0;

    switch (space) {
      case 1: 
        name = "Mediterranean Avenue";
        basic = 2;
        one = 10;
        two = 30;
        three = 90;
        four = 160;
        hotel = 250;
      
      case 3:
        if (name.equals("")) {
          name = "Baltic Avenue";
          basic = 4;
          one = 20;
          two = 60;
          three = 180;
          four = 320;
          hotel = 450;
        }
        cost = 60;
        mortgage = 30;
        houseCost = 50;
        break;

      case 6:
        name = "Oriental Avenue";

      case 8:
        if (name.equals("")) {
          name = "Connecticut Avenue";
        }
        cost = 100;
        mortgage = 50;
        basic = 5;
        one = 30;
        two = 90;
        three = 270;
        four = 400;
        hotel = 550;
        
      case 9:
        if (name.equals("")) {
          name = "Vermont Avenue";
          cost = 120;
          mortgage = 60;
          basic = 8;
          one = 40;
          two = 100;
          three = 300;
          four = 450;
          hotel = 600;
        }
        houseCost = 50;
        break;

      case 11:
        name = "St. Charles Place";

      case 12:
        if (name.equals("")) {
          name = "States Avenue";
        }
        cost = 140;
        mortgage = 70;
        basic = 10;
        one = 50;
        two = 150;
        three = 450;
        four = 625;
        hotel = 750;

      case 14:
        if (name.equals("")) {
          name = "Virginia Avenue";
          cost = 160;
          mortgage = 80;
          basic = 12;
          one = 60;
          two = 180;
          three = 500;
          four = 700;
          hotel = 900;
        }
        houseCost = 100;
        break;

      case 16:
        name = "St. James Place";
    
      case 18:
        if (name.equals("")) {
          name = "Tennessee Avenue";
        }
        cost = 180;
        mortgage = 90;
        basic = 14;
        one = 70;
        two = 200;
        three = 550;
        four = 750;
        hotel = 950;

      case 19:
        if (name.equals("")) {
          name = "New York Avenue";
          cost = 200;
          mortgage = 100;
          basic = 16;
          one = 80;
          two = 220;
          three = 600;
          four = 800;
          hotel = 1000;
        }
        houseCost = 100;
        break;

      case 21:
        name = "Kentucky Avenue";
    
      case 23:
        if (name.equals("")) {
          name = "Indiana Avenue";
        }
        cost = 220;
        mortgage = 110;
        basic = 18;
        one = 90;
        two = 250;
        three = 700;
        four = 875;
        hotel = 1050;

      case 24:
        if (name.equals("")) {
          name = "Illinois Avenue";
          cost = 240;
          mortgage = 120;
          basic = 20;
          one = 100;
          two = 300;
          three = 750;
          four = 925;
          hotel = 110;
        }
        houseCost = 150;
        break;

      case 26:
        name = "Atlantic Avenue";
    
      case 27:
        if (name.equals("")) {
          name = "Ventor Avenue";
        }
        cost = 260;
        mortgage = 130;
        basic = 22;
        one = 110;
        two = 330;
        three = 800;
        four = 975;
        hotel = 1150;

      case 29:
        if (name.equals("")) {
          name = "Marvin Gardens";
          cost = 280;
          mortgage = 140;
          basic = 24;
          one = 120;
          two = 360;
          three = 850;
          four = 1025;
          hotel = 1200;
        }
        houseCost = 150;
        break;

      case 31:
        name = "Pacific Avenue";
    
      case 32:
        if (name.equals("")) {
          name = "North Carolina Avenue";
        }
        cost = 300;
        mortgage = 150;
        basic = 26;
        one = 130;
        two = 390;
        three = 900;
        four = 1100;
        hotel = 1275;

      case 34:
        if (name.equals("")) {
          name = "Pennsylvania Avenue";
          cost = 320;
          mortgage = 160;
          basic = 28;
          one = 150;
          two = 450;
          three = 1000;
          four = 1200;
          hotel = 1400;
        }

      case 37:
        if (name.equals("")) {
          name = "Park Place";
          cost = 350;
          mortgage = 175;
          basic = 35;
          one = 175;
          two = 500;
          three = 1100;
          four = 1300;
          hotel = 1500;
        }
      case 39:
        if (name.equals("")) {
          name = "Boardwalk";
          cost = 400;
          mortgage = 200;
          basic = 50;
          one = 200;
          two = 600;
          three = 1400;
          four = 1700;
          hotel = 2000;
        }
        houseCost = 200;
        break; 
      default:
        name = "special";
        cost = 0;
        mortgage = 0;
        basic = 0;
        one = 0;
        two = 0;
        three = 0;
        four = 0;
        hotel = 0;
        houseCost = 0;
    }

    return (new Deed(name, cost, mortgage, houseCost, basic, one, two, three, four, hotel));
  }
}
