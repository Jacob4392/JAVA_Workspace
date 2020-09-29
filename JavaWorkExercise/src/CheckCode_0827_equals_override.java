public class CheckCode_0827_equals_override {

}

class Member{
    public String name;
    public int age;

    
    public Member(String name , int age){

        this.name = name;
        this.age = age;
    }

    @Override

    public boolean equals(Object obj){

        System.out.println("CALL");

        if(obj instanceof Member){

            Member member = (Member)obj;

            return member.name.equals(name) && (member.age == age);

        }else{

            return false;
        }
    }

    

    @Override
    public int hashCode(){
        return name.hashCode() + age;
    }
}