package oop.lab.lab11.command.demo;

public class TestCommand {
    public static void main(String[] args){
        Computer computer = new Computer();
        Command shutdown = new ShutDownCommand(computer);
        Command restart = new RestartCommand(computer);

        Switch s = new Switch();
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
        String str = "restart";

        if(str.equals("shutdown")){
            s.storeAndExecute(shutdown);
        }else{
            s.storeAndExecute(restart);
        }
    }
}
