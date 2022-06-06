package com.mycompany.menu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Keyin {

  public static void printPrompt(String prompt) {
    System.out.print(prompt + " ");
    System.out.flush();
  }

  public static void inputFlush() {
    int dummy;
    int bAvail;
    try {
      while ((System.in.available()) != 0)
        dummy = System.in.read();
    } catch (java.io.IOException e) {
      System.out.println("Entrada inválida!");
    }
  }
  public static String inString() {
    int aChar;
    String s = "";
    boolean finished = false;

    while (!finished) {
      try {
        aChar = System.in.read();
        if (aChar < 0 || (char) aChar == '\n')
          finished = true;
        else if ((char) aChar != '\r')
          s = s + (char) aChar; // Enter into string
      }

      catch (java.io.IOException e) {
        System.out.println("Entrada Inválida!");
        finished = true;
      }
    }
    return s;
  }

  public static int inInt(String prompt) {
    while (true) {
      inputFlush();
      printPrompt(prompt);
      try {
        return Integer.valueOf(inString().trim()).intValue();
      }
      catch (NumberFormatException e) {
        System.out.println("Entrada inválida!. Escolha um número!");
      }
    }
  }
  public static String inStr(String prompt) {
      while (true) {
          inputFlush();
          printPrompt(prompt);
          String r = inString();
          if (r.trim().length() > 0) {
              return r;
          } else {
              System.out.println("Entrada inválida! Digite algo!");
          }
      }
  }
  public static Date inDate(String prompt, String format) {
      while (true) {
          inputFlush();
          printPrompt(prompt);
          String r = inString().trim();
        SimpleDateFormat fmt = new SimpleDateFormat(format);
        try {
            return fmt.parse(r);
        } catch (ParseException ex) {
            System.out.println("Formato de data inválida! A data deve seguir o seguinte formato dd/MM/yyyy");
        }          
      }
  }
}
