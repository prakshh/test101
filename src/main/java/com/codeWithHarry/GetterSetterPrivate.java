package com.codeWithHarry;

class MyEmployee {
    private int id;
    private String name;

    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }

}
public class GetterSetterPrivate {
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
        harry.setId(1001);
        harry.setName("Harry Potter");
        System.out.println("my id is : " + harry.getId());
        System.out.println("my name is : " + harry.getName());
    }
}
