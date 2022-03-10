class garbage{
        public void finalize(){
             System.out.println("Garbage collection performed");
        }
public static void main(String[] args){
        Garb obj1=new Garb();
        Garb obj2=new Garb();
        Garb obj3=new Garb();
        Garb obj4=new Garb();
        System.gc();
        System.out.println("Object Destroyed");
        }
} 

