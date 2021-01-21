package objori;

class person {
    public int age;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class exampleObjOri {
    public static void main(String[] args) {
        person person1 = new person();//new一个新对象
        person1.age = 20;//age是person1的属性
        person1.setName("louis");//调用方法
        System.out.println("第一个人信息:姓名-"+person1.getName()+" "+"年龄-"+person1.age);

    }
}
