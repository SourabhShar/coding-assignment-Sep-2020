/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sourabh;

/**
 *
 * @author Alok Computers
 */
public class Item {
    
  String name;
  int price;

  public Item(String name, int price) {
    this.name = name;
    this.price = price;
  }

  public String toString() { 
      return this.name + ": " + this.price;
  }
}
    

