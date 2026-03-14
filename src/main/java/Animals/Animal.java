package Animals;

abstract public class Animal implements Eat, java.io.Serializable{
    private static final long serialVersionUID = 1L;

    private String nameOfAnimal;

    //property representing the weight
    private int weight;

    //property representing the height
    private int height;

    //property representing the age
    private int age;

    public Animal(String name){
        this.nameOfAnimal = name;
        this.weight = 200;
        this.height = 2;
        this.age = 5;
    }

    public String getNameOfAnimal(){
        return nameOfAnimal;
    }

    public void setNameOfAnimal(String nameOfAnimal){
        this.nameOfAnimal = nameOfAnimal;
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    @Override
    public void eatingFood(){
        System.out.println("The animal: " + nameOfAnimal + " is eating.");
    }





}

