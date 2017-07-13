package basic;

import java.util.ArrayList;  
import java.util.Arrays;  
import java.util.Collections;  
import java.util.Comparator;  
import java.util.Scanner;  
  
public class Main1015ccc {  
  public static void main(String[] args) {  
    char[] ids = new char[10];  
    ArrayList<Student> al1 = new ArrayList<Student>();  
    ArrayList<Student> al2 = new ArrayList<Student>();  
    ArrayList<Student> al3 = new ArrayList<Student>();  
    ArrayList<Student> al4 = new ArrayList<Student>();  
  
    Scanner cin = new Scanner(System.in);  
    int n = cin.nextInt();  
    int l = cin.nextInt();  
    int h = cin.nextInt();  
    for (int i = 0; i < n; i++) {  
      Student s = new Student();  
      s.setID(cin.next());  
      s.setDe(cin.nextInt());  
      s.setCai(cin.nextInt());  
  
      if (s.getDe() >= l && s.getCai() >= l) {  
        if (s.getDe() >= h && s.getCai() >= h) {  
          al1.add(s);  
        } else if (s.getDe() >= h && s.getCai() < h) {  
          al2.add(s);  
        } else if (s.getDe() < h && s.getCai() < h && s.getDe() >= s.getCai()) {  
          al3.add(s);  
        } else {  
          al4.add(s);  
        }  
      }  
    }  
      
    Collections.sort(al1, new Sort());  
    Collections.sort(al2, new Sort());  
    Collections.sort(al3, new Sort());  
    Collections.sort(al4, new Sort());  
      
    System.out.println(al1.size() + al2.size() + al3.size() + al4.size());  
    for (Student student : al1) {  
      System.out.println(student.getID() + " " + student.getDe() + " "  
          + student.getCai());  
    }  
    for (Student student : al2) {  
      System.out.println(student.getID() + " " + student.getDe() + " "  
          + student.getCai());  
    }  
    for (Student student : al3) {  
      System.out.println(student.getID() + " " + student.getDe() + " "  
          + student.getCai());  
    }  
    for (Student student : al4) {  
      System.out.println(student.getID() + " " + student.getDe() + " "  
          + student.getCai());  
    }  
  }  
}  
  
class Sort implements Comparator {  
  public int compare(Object o1, Object o2) {  
    Student s1 = (Student) o1;  
    Student s2 = (Student) o2;  
    if ((s1.getCai() + s1.getDe()) != (s2.getCai() + s2.getDe())) {  
      return s2.getCai() + s2.getDe() - s1.getCai() - s1.getDe();  
    } else if (s1.getDe() != s2.getDe()) {  
      return s2.getDe() - s1.getDe();  
    } else {  
      return s1.getID().compareTo(s2.getID());  
    }  
  }  
}  
  
class Student {  
  private String ID;  
  
  public String getID() {  
    return ID;  
  }  
  
  public void setID(String iD) {  
    ID = iD;  
  }  
  
  public int getDe() {  
    return De;  
  }  
  
  public void setDe(int de) {  
    De = de;  
  }  
  
  public int getCai() {  
    return Cai;  
  }  
  
  public void setCai(int cai) {  
    Cai = cai;  
  }  
  
  private int De;  
  private int Cai;  
}
