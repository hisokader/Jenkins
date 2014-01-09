package com.jenkins.test;

public class MaClasse {
  public int multiply(int x, int y) {
	    // the following is just an example
    if (x > 999) {
      throw new IllegalArgumentException("X doit etre inferieur a 1000");
    }
    return x / y;
  }
}
