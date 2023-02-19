package Gun36._06_Interface;

public class Square extends Rectangle {

 

    public double area(int edge){

     return super.area(edge,edge);
 }

 public double perimetre(int edge) {

     return super.perimetre(edge, edge);
 }

}
