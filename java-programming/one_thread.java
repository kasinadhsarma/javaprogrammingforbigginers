public class one_thread {
    public static void main(String[] args) {
        simple_thread st = new simple_thread();
        st.run();
    }
}

class simple_thread extends Thread {
    public void run() {
        System.out.println(this.getName()+ " " + this.getId() + " Running");    }
}
