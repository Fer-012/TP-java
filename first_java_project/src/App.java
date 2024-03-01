public class App {
    public static void main(String[] args) throws Exception {
        Personne p = new Personne();
        p.setAge(27);
        p.setName("ferdaous");
        System.out.println("my age is "+ p.getAge() +" and my name is "+ p.getName());
    }
}

/**
 * per
 */
class Personne {
    public int age;
    public String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age +2 ;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

      
  
}
